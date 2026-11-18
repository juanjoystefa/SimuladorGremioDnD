package Vista;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VistaGremio extends javax.swing.JFrame {

    public VistaGremio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistro = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNivel = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();
        lblPuntosVida = new javax.swing.JLabel();
        txtPuntosVida = new javax.swing.JTextField();
        lblClase = new javax.swing.JLabel();
        cmbClase = new javax.swing.JComboBox<>();
        lblEspecial = new javax.swing.JLabel();
        txtEspecial = new javax.swing.JTextField();
        chkArmaduraPesada = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        jPanelSalida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSalida = new javax.swing.JTextArea();
        btnListar = new javax.swing.JButton();
        btnSimularCombate = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wizards of the Coast - Gremio D&D 5e");

        jPanelRegistro.setBackground(new java.awt.Color(240, 244, 248));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Aventurero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(30, 41, 59))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(15, 23, 42));
        lblTitulo.setText("Datos del Héroe (D&D 5ª Edición)");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblNivel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNivel.setText("Nivel (1-20):");

        lblPuntosVida.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPuntosVida.setText("Puntos de Vida:");

        lblClase.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblClase.setText("Clase:");

        cmbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guerrero", "Mago", "Clérigo", "Monje" }));

        lblEspecial.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblEspecial.setText("¿Usa Armadura Pesada?:");

        chkArmaduraPesada.setText("Sí, equipa armadura pesada");

        btnRegistrar.setBackground(new java.awt.Color(37, 99, 235));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Agregar Aventurero");

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblNivel)
                            .addComponent(lblPuntosVida)
                            .addComponent(lblEspecial))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtNivel)
                            .addComponent(txtPuntosVida)
                            .addComponent(txtEspecial)
                            .addComponent(chkArmaduraPesada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblClase)
                            .addComponent(cmbClase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivel)
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntosVida)
                    .addComponent(txtPuntosVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecial)
                    .addComponent(txtEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkArmaduraPesada)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelSalida.setBackground(new java.awt.Color(240, 244, 248));
        jPanelSalida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial del Gremio y Simulación de Combate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(30, 41, 59))); // NOI18N

        txtAreaSalida.setEditable(false);
        txtAreaSalida.setColumns(20);
        txtAreaSalida.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtAreaSalida.setRows(5);
        jScrollPane1.setViewportView(txtAreaSalida);

        btnListar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListar.setText("Ver Gremio");

        btnSimularCombate.setBackground(new java.awt.Color(220, 38, 38));
        btnSimularCombate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimularCombate.setForeground(new java.awt.Color(255, 255, 255));
        btnSimularCombate.setText("Simular Combate");

        btnReporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReporte.setText("Reporte Estadístico");

        javax.swing.GroupLayout jPanelSalidaLayout = new javax.swing.GroupLayout(jPanelSalida);
        jPanelSalida.setLayout(jPanelSalidaLayout);
        jPanelSalidaLayout.setHorizontalGroup(
            jPanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalidaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelSalidaLayout.createSequentialGroup()
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnSimularCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanelSalidaLayout.setVerticalGroup(
            jPanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimularCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Getters para que el Controlador enlace los eventos y lea datos (Patrón MVC)
    public JComboBox<String> getCmbClase() { return cmbClase; }
    public JTextField getTxtNombre() { return txtNombre; }
    public JTextField getTxtNivel() { return txtNivel; }
    public JTextField getTxtPuntosVida() { return txtPuntosVida; }
    public JLabel getLblEspecial() { return lblEspecial; }
    public JTextField getTxtEspecial() { return txtEspecial; }
    public JCheckBox getChkArmaduraPesada() { return chkArmaduraPesada; }
    public JTextArea getTxtAreaSalida() { return txtAreaSalida; }

    public JButton getBtnRegistrar() { return btnRegistrar; }
    public JButton getBtnListar() { return btnListar; }
    public JButton getBtnSimularCombate() { return btnSimularCombate; }
    public JButton getBtnReporte() { return btnReporte; }
    public JButton getBtnSalir() { return btnSalir; }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtNivel.setText("");
        txtPuntosVida.setText("");
        txtEspecial.setText("");
        chkArmaduraPesada.setSelected(false);
        txtNombre.requestFocus();
    }

    public void mostrarMensaje(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, tipo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSimularCombate;
    private javax.swing.JCheckBox chkArmaduraPesada;
    private javax.swing.JComboBox<String> cmbClase;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClase;
    private javax.swing.JLabel lblEspecial;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuntosVida;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaSalida;
    private javax.swing.JTextField txtEspecial;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuntosVida;
    // End of variables declaration//GEN-END:variables
}