package paquete;

import JFileChooser.FileChooser;
import Sonido.Sonido;
import java.io.IOException;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Bibliografia extends javax.swing.JInternalFrame {
    
    private Sonido sound;
    private boolean sesionActiva;
    private FileChooser fil;
    private miHiloBarra barr;
    
    public boolean getsesionActiva() {
        return sesionActiva;
    }
    
    public Bibliografia() {
        initComponents();
        barr = new miHiloBarra(Principal.jp_progress);
        fil = new FileChooser();
        sound = new Sonido();
        inicializarComponentes();
    }
    
    public void emitirMouseEncima() {
        sound.emitirSonido("src/archivosAudio/over.wav");
    }
    
    public void abrirPDF(String liga) {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "src\\pdf\\" + liga);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new org.edisoncor.gui.panel.Panel();
        buttonMetroICM1 = new com.icm.components.metro.ButtonMetroICM();
        jLabel1 = new javax.swing.JLabel();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        linkMetroICM1 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM2 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM3 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM4 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM5 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM6 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM7 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM8 = new com.icm.components.metro.LinkMetroICM();

        setMaximumSize(new java.awt.Dimension(590, 504));
        setMinimumSize(new java.awt.Dimension(590, 504));
        setPreferredSize(new java.awt.Dimension(590, 504));
        setRequestFocusEnabled(false);

        buttonMetroICM1.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM1.setText("Regresar");
        buttonMetroICM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bibliografía.png"))); // NOI18N

        labelMetroICM3.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM3.setText("Bibliografia.");

        linkMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder_full.png"))); // NOI18N
        linkMetroICM1.setText("Leithold Louis – El Cálculo (7ed ).");
        linkMetroICM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkMetroICM1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM1MouseEntered(evt);
            }
        });

        linkMetroICM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder_full.png"))); // NOI18N
        linkMetroICM2.setText("Calculo de una Variable Stewart 6ta edicion");
        linkMetroICM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkMetroICM2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM2MouseEntered(evt);
            }
        });

        linkMetroICM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder_full.png"))); // NOI18N
        linkMetroICM3.setText("Calculo Diferencial e Integral   Frank Ayres, Jr Serie Schaum");
        linkMetroICM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkMetroICM3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM3MouseEntered(evt);
            }
        });

        linkMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder_full.png"))); // NOI18N
        linkMetroICM4.setText("Spivak, Michael. Calculus. Cálculo Infinitesimal. Segunda edición.");
        linkMetroICM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkMetroICM4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM4MouseEntered(evt);
            }
        });

        linkMetroICM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder_full.png"))); // NOI18N
        linkMetroICM5.setText("Leithold Louis – El Cálculo (7ed ).");
        linkMetroICM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM5MouseEntered(evt);
            }
        });

        linkMetroICM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder_full.png"))); // NOI18N
        linkMetroICM6.setText("Leithold Louis – El Cálculo (7ed ).");
        linkMetroICM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM6MouseEntered(evt);
            }
        });

        linkMetroICM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder_full.png"))); // NOI18N
        linkMetroICM7.setText("Leithold Louis – El Cálculo (7ed ).");
        linkMetroICM7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM7MouseEntered(evt);
            }
        });

        linkMetroICM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder_full.png"))); // NOI18N
        linkMetroICM8.setText("Leithold Louis – El Cálculo (7ed ).");
        linkMetroICM8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM8MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(linkMetroICM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(linkMetroICM4, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                                .addComponent(linkMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(linkMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(linkMetroICM5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkMetroICM6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkMetroICM7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(linkMetroICM8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(linkMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkMetroICM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkMetroICM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkMetroICM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
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

    private void linkMetroICM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM1MouseClicked
        abrirPDF("leithold-louis-el-calculos-7ed-1380-pag.pdf");
    }//GEN-LAST:event_linkMetroICM1MouseClicked

    private void linkMetroICM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM1MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM1MouseEntered

    private void linkMetroICM2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM2MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM2MouseEntered

    private void linkMetroICM4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM4MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM4MouseEntered

    private void linkMetroICM3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM3MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM3MouseEntered

    private void linkMetroICM5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM5MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM5MouseEntered

    private void linkMetroICM6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM6MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM6MouseEntered

    private void linkMetroICM7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM7MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM7MouseEntered

    private void linkMetroICM8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM8MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM8MouseEntered

    private void linkMetroICM2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM2MouseClicked
        abrirPDF("12990045.pdf");
    }//GEN-LAST:event_linkMetroICM2MouseClicked

    private void linkMetroICM4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM4MouseClicked
        abrirPDF("spivak.pdf");
    }//GEN-LAST:event_linkMetroICM4MouseClicked

    private void linkMetroICM3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM3MouseClicked
        abrirPDF("calculo_ayres.pdf");
    }//GEN-LAST:event_linkMetroICM3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private javax.swing.JLabel jLabel1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.LinkMetroICM linkMetroICM1;
    private com.icm.components.metro.LinkMetroICM linkMetroICM2;
    private com.icm.components.metro.LinkMetroICM linkMetroICM3;
    private com.icm.components.metro.LinkMetroICM linkMetroICM4;
    private com.icm.components.metro.LinkMetroICM linkMetroICM5;
    private com.icm.components.metro.LinkMetroICM linkMetroICM6;
    private com.icm.components.metro.LinkMetroICM linkMetroICM7;
    private com.icm.components.metro.LinkMetroICM linkMetroICM8;
    private org.edisoncor.gui.panel.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
