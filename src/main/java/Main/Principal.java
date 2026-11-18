/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Main;
import Controlador.ControladorGremio;
import javax.swing.SwingUtilities;
import Modelo.GestorPersistencia;
import Vista.VistaGremio;

/**
 *
 * @author Usuario
 */

public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VistaGremio vista = new VistaGremio();
            GestorPersistencia persistencia = new GestorPersistencia();
            new ControladorGremio(vista, persistencia);
            vista.setVisible(true);
        });
    }
}
