package paquete;

import Sonido.Sonido;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Ayudante extends javax.swing.JInternalFrame {

    private Sonido sound;
    private boolean sesionActiva;
    private Correo correo;

    public boolean getsesionActiva() {
        return sesionActiva;
    }

    public Ayudante() {
        initComponents();
        sound = new Sonido();
        correo = new Correo();
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        this.setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public void iniciarSesion() {
        sesionActiva = true;
        Principal.BarraMenu.setVisible(sesionActiva);
        Principal.panelDeDatos.setVisible(sesionActiva);
        Principal.panelProgreso.setVisible(sesionActiva);
        this.hide();
    }

    public void emitirMouseEncima() {
        sound.emitirSonido("src/archivosAudio/over.wav");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sugerencia = new javax.swing.JTextArea();
        buttonMetroICM1 = new com.icm.components.metro.ButtonMetroICM();
        buttonMetroICM2 = new com.icm.components.metro.ButtonMetroICM();
        jLabel1 = new javax.swing.JLabel();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        asunto = new com.icm.components.metro.ComboboxMetroICM();

        setMaximumSize(new java.awt.Dimension(590, 504));
        setMinimumSize(new java.awt.Dimension(590, 504));
        setPreferredSize(new java.awt.Dimension(590, 504));
        setRequestFocusEnabled(false);

        sugerencia.setColumns(20);
        sugerencia.setRows(5);
        jScrollPane1.setViewportView(sugerencia);

        buttonMetroICM1.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM1.setText("Regresar");
        buttonMetroICM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMetroICM1MouseEntered(evt);
            }
        });
        buttonMetroICM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM1ActionPerformed(evt);
            }
        });

        buttonMetroICM2.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM2.setText("Enviar sugerencia.");
        buttonMetroICM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMetroICM2MouseEntered(evt);
            }
        });
        buttonMetroICM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buzon.png"))); // NOI18N

        labelMetroICM1.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM1.setText("Sugerencia:");

        labelMetroICM2.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM2.setText("Categoria:");

        asunto.setForeground(new java.awt.Color(0, 0, 0));
        asunto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sugerencia.", "Felicitación.", "Consulta.", "Queja.", "Ayuda." }));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                                .addComponent(buttonMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(labelMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMetroICM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM1ActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_buttonMetroICM1ActionPerformed

    private void buttonMetroICM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM1MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM1MouseEntered

    private void buttonMetroICM2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM2MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM2MouseEntered

    private void buttonMetroICM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM2ActionPerformed
        correo.setMensage(sugerencia.getText());
        correo.setSubject(" - " + asunto.getSelectedItem().toString());
        correo.SendMail();
        sugerencia.setText("");
        asunto.setSelectedIndex(0);
    }//GEN-LAST:event_buttonMetroICM2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ComboboxMetroICM asunto;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private org.edisoncor.gui.panel.Panel panel4;
    private javax.swing.JTextArea sugerencia;
    // End of variables declaration//GEN-END:variables
}
