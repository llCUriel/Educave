package paquete;

import JFileChooser.FileChooser;
import Sonido.Sonido;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Credito extends javax.swing.JInternalFrame {

    private Sonido sound;
    private boolean sesionActiva;
    private FileChooser fil;
    private miHiloBarra barr;

    public boolean getsesionActiva() {
        return sesionActiva;
    }

    public Credito() {
        initComponents();
        barr = new miHiloBarra(Principal.jp_progress);
        fil = new FileChooser();
        sound = new Sonido();
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        this.setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public void iniciarSesion() {
        sesionActiva = true;
        barr.start();
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
        buttonMetroICM1 = new com.icm.components.metro.ButtonMetroICM();
        jLabel1 = new javax.swing.JLabel();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM4 = new com.icm.components.metro.LabelMetroICM();

        setMaximumSize(new java.awt.Dimension(590, 504));
        setMinimumSize(new java.awt.Dimension(590, 504));
        setPreferredSize(new java.awt.Dimension(590, 504));
        setRequestFocusEnabled(false);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoescom.png"))); // NOI18N

        labelMetroICM3.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM3.setText("Créditos:");

        labelMetroICM4.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        labelMetroICM4.setText("Hernández Castellanos César Uriel.");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private javax.swing.JLabel jLabel1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.LabelMetroICM labelMetroICM4;
    private org.edisoncor.gui.panel.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
