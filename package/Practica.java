package paquete;

import Sonido.Sonido;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Practica extends javax.swing.JInternalFrame {

    private Sonido sound;
    private boolean sesionActiva;
    private int progreso;
    private tiempoMaximo hilo;
    private int contadorDePreguntas;

    public boolean getsesionActiva() {
        return sesionActiva;
    }

    public Practica() {
        initComponents();
        hilo = new tiempoMaximo();
        hilo.start();
        progreso = 100;
        sound = new Sonido();
        inicializarComponentes();
        UIManager.put("ProgressBar.background", Color.BLUE);

    }

    public void inicializarComponentes() {
        this.setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        pregunta.setText(Integer.toString(contadorDePreguntas));

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

    public class tiempoMaximo extends Thread {

        public void run() {
            while (true) {
                try {
                    tiempo.setText(Integer.toString(progreso));
                    progreso--;
                    ProgressBar.setValue(progreso);
                    Thread.sleep(300);
                    if (progreso < 0) {
                        progreso = 100;
                        pregunta.setText(String.valueOf(contadorDePreguntas));
                        contadorDePreguntas++;
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new org.edisoncor.gui.panel.Panel();
        buttonMetroICM2 = new com.icm.components.metro.ButtonMetroICM();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        buttonMetroICM3 = new com.icm.components.metro.ButtonMetroICM();
        pregunta = new com.icm.components.metro.LabelMetroICM();
        ProgressBar = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        opcA = new com.icm.components.metro.RadioButtonMetroICM();
        opcC = new com.icm.components.metro.RadioButtonMetroICM();
        opcD = new com.icm.components.metro.RadioButtonMetroICM();
        opcB = new com.icm.components.metro.RadioButtonMetroICM();
        buttonMetroICM4 = new com.icm.components.metro.ButtonMetroICM();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        tiempo = new com.icm.components.metro.LabelMetroICM();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 520));
        setMinimumSize(new java.awt.Dimension(1100, 520));
        setPreferredSize(new java.awt.Dimension(1100, 520));
        setRequestFocusEnabled(false);

        buttonMetroICM2.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/refresh.png"))); // NOI18N
        buttonMetroICM2.setText("Siguiente.");
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

        labelMetroICM2.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/attachment.png"))); // NOI18N
        labelMetroICM2.setText("Práctica.");

        buttonMetroICM3.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/delete.png"))); // NOI18N
        buttonMetroICM3.setText("Salir");
        buttonMetroICM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMetroICM3MouseEntered(evt);
            }
        });
        buttonMetroICM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM3ActionPerformed(evt);
            }
        });

        pregunta.setForeground(new java.awt.Color(255, 255, 255));
        pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/tag_blue.png"))); // NOI18N
        pregunta.setText("Pregunta.");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 4));

        opcA.setText("A)");
        opcA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAActionPerformed(evt);
            }
        });

        opcC.setText("C)");
        opcC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcCActionPerformed(evt);
            }
        });

        opcD.setText("D)");
        opcD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcDActionPerformed(evt);
            }
        });

        opcB.setText("B)");
        opcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(opcC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcD, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonMetroICM4.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/info.png"))); // NOI18N
        buttonMetroICM4.setText("Ayuda.");
        buttonMetroICM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMetroICM4MouseEntered(evt);
            }
        });

        labelMetroICM1.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/clock.png"))); // NOI18N
        labelMetroICM1.setText("Tiempo restante.");

        labelMetroICM3.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/attachment.png"))); // NOI18N
        labelMetroICM3.setText("Imagen.");

        tiempo.setForeground(new java.awt.Color(255, 255, 255));
        tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiempo.setText("-");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pencil-152713_960_720.png"))); // NOI18N

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(728, 728, 728))
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pregunta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(labelMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(buttonMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMetroICM2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM2MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM2MouseEntered

    private void buttonMetroICM3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM3MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM3MouseEntered

    private void buttonMetroICM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM3ActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_buttonMetroICM3ActionPerformed

    private void opcAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAActionPerformed
        opcA.setSelected(true);
        opcB.setSelected(false);
        opcC.setSelected(false);
        opcD.setSelected(false);
    }//GEN-LAST:event_opcAActionPerformed

    private void opcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcBActionPerformed
        opcA.setSelected(false);
        opcB.setSelected(true);
        opcC.setSelected(false);
        opcD.setSelected(false);
    }//GEN-LAST:event_opcBActionPerformed

    private void opcCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcCActionPerformed
        opcA.setSelected(false);
        opcB.setSelected(false);
        opcC.setSelected(true);
        opcD.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_opcCActionPerformed

    private void opcDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcDActionPerformed
        opcA.setSelected(false);
        opcB.setSelected(false);
        opcC.setSelected(false);
        opcD.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_opcDActionPerformed

    private void buttonMetroICM4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM4MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM4MouseEntered

    private void buttonMetroICM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM2ActionPerformed
        contadorDePreguntas++;
        pregunta.setText(Integer.toString(contadorDePreguntas));
        progreso = 100;

    }//GEN-LAST:event_buttonMetroICM2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM2;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM3;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.RadioButtonMetroICM opcA;
    private com.icm.components.metro.RadioButtonMetroICM opcB;
    private com.icm.components.metro.RadioButtonMetroICM opcC;
    private com.icm.components.metro.RadioButtonMetroICM opcD;
    private org.edisoncor.gui.panel.Panel panel4;
    private com.icm.components.metro.LabelMetroICM pregunta;
    private com.icm.components.metro.LabelMetroICM tiempo;
    // End of variables declaration//GEN-END:variables
}
