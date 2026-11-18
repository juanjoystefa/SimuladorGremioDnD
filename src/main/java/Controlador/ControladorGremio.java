/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modelo.Aventurero;
import Modelo.Clerigo;
import Modelo.GestorPersistencia;
import Modelo.Guerrero;
import Modelo.Mago;
import Modelo.Monje;
import Vista.VistaGremio;

/**
 *
 * @author Usuario
 */

public class ControladorGremio {

    private final ArrayList<Aventurero> gremio;
    private final VistaGremio vista;
    private final GestorPersistencia persistencia;

    public ControladorGremio(VistaGremio vista, GestorPersistencia persistencia) {
        this.gremio = new ArrayList<>();
        this.vista = vista;
        this.persistencia = persistencia;
        inicializarEventos();
        actualizarCampoEspecial();
    }

    private void inicializarEventos() {
        vista.getCmbClase().addActionListener(e -> actualizarCampoEspecial());
        vista.getBtnRegistrar().addActionListener(e -> registrarAventurero());
        vista.getBtnListar().addActionListener(e -> mostrarListaGremio());
        vista.getBtnSimularCombate().addActionListener(e -> simularCombate());
        vista.getBtnReporte().addActionListener(e -> mostrarReporteEstadistico());
        vista.getBtnSalir().addActionListener(e -> System.exit(0));
    }

    private void actualizarCampoEspecial() {
        String claseSeleccionada = (String) vista.getCmbClase().getSelectedItem();
        boolean esGuerrero = "Guerrero".equals(claseSeleccionada);

        vista.getChkArmaduraPesada().setVisible(esGuerrero);
        vista.getTxtEspecial().setVisible(!esGuerrero);

        if (esGuerrero) {
            vista.getLblEspecial().setText("¿Usa Armadura Pesada?:");
        } else if ("Mago".equals(claseSeleccionada)) {
            vista.getLblEspecial().setText("Espacios de Conjuro (entero):");
        } else if ("Clérigo".equals(claseSeleccionada)) {
            vista.getLblEspecial().setText("Dios Venerado (texto):");
        } else if ("Monje".equals(claseSeleccionada)) {
            vista.getLblEspecial().setText("Puntos de Ki (entero):");
        }
    }

    // RF1 + RF4 + Manejo defensivo (Bonificación)
    public void registrarAventurero() {
        try {
            String clase = (String) vista.getCmbClase().getSelectedItem();
            String nombre = vista.getTxtNombre().getText();
            int nivel = Integer.parseInt(vista.getTxtNivel().getText().trim());
            int pv = Integer.parseInt(vista.getTxtPuntosVida().getText().trim());

            Aventurero nuevo;

            switch (clase) {
                case "Guerrero":
                    boolean armadura = vista.getChkArmaduraPesada().isSelected();
                    nuevo = new Guerrero(nombre, nivel, pv, armadura);
                    break;
                case "Mago":
                    int conjuros = Integer.parseInt(vista.getTxtEspecial().getText().trim());
                    nuevo = new Mago(nombre, nivel, pv, conjuros);
                    break;
                case "Clérigo":
                    String dios = vista.getTxtEspecial().getText();
                    nuevo = new Clerigo(nombre, nivel, pv, dios);
                    break;
                case "Monje":
                    int ki = Integer.parseInt(vista.getTxtEspecial().getText().trim());
                    nuevo = new Monje(nombre, nivel, pv, ki);
                    break;
                default:
                    throw new IllegalArgumentException("Clase no soportada.");
            }

            gremio.add(nuevo);
            persistencia.guardarLinea("REGISTRO -> " + nuevo.toString());
            vista.limpiarCampos();
            mostrarListaGremio();
            vista.mostrarMensaje("Aventurero registrado con éxito.", "Registro", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            vista.mostrarMensaje(
                    "Error de formato: Nivel, Puntos de Vida y atributos numéricos deben ser números enteros.",
                    "Error de Validación", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            vista.mostrarMensaje(ex.getMessage(), "Datos Inválidos", JOptionPane.WARNING_MESSAGE);
        }
    }

    // RF2 - Reporte 1: Visualización del Gremio
    public void mostrarListaGremio() {
        if (gremio.isEmpty()) {
            vista.getTxtAreaSalida().setText("El gremio aún no tiene aventureros registrados.");
            return;
        }
        StringBuilder sb = new StringBuilder("=== AVENTUREROS DEL GREMIO ===\n");
        for (Aventurero a : gremio) {
            sb.append("- ").append(a.toString()).append("\n");
        }
        vista.getTxtAreaSalida().setText(sb.toString());
    }

    // RF3 + RF4 - Polimorfismo en acción
    public void simularCombate() {
        if (gremio.isEmpty()) {
            vista.mostrarMensaje("Registra al menos un aventurero antes de simular el combate.",
                    "Gremio Vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }
        StringBuilder sb = new StringBuilder("=== SIMULACIÓN DE COMBATE ===\n");
        persistencia.guardarLinea("--- INICIO SIMULACIÓN DE COMBATE ---");

        for (Aventurero a : gremio) {
            // Llamada polimórfica: Java ejecuta el @Override correspondiente a cada subclase
            String accion = a.ejecutarAccionCombate();
            sb.append(accion).append("\n");
            persistencia.guardarLinea("COMBATE -> " + accion);
        }

        vista.getTxtAreaSalida().setText(sb.toString());
    }

    // Reporte 2: Estadísticas del gremio (cumple requisito de 2 reportes sobre la colección)
    public void mostrarReporteEstadistico() {
        if (gremio.isEmpty()) {
            vista.getTxtAreaSalida().setText("No hay datos suficientes para generar el reporte.");
            return;
        }
        int totalPv = 0;
        double sumaNiveles = 0;
        Aventurero masFuerte = gremio.get(0);

        for (Aventurero a : gremio) {
            totalPv += a.getPuntosVida();
            sumaNiveles += a.getNivel();
            if (a.getNivel() > masFuerte.getNivel()) {
                masFuerte = a;
            }
        }
        double promedioNivel = sumaNiveles / gremio.size();

        String reporte = String.format(
                "=== REPORTE ESTADÍSTICO DEL GREMIO ===\n"
                + "Total de héroes: %d\n"
                + "Nivel promedio: %.2f\n"
                + "Puntos de vida acumulados: %d\n"
                + "Héroe de mayor nivel: %s (Nivel %d, Bonificador +%d)\n",
                gremio.size(), promedioNivel, totalPv,
                masFuerte.getNombre(), masFuerte.getNivel(), masFuerte.calcularBonificadorCompetencia()
        );
        vista.getTxtAreaSalida().setText(reporte);
    }
}
