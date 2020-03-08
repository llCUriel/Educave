package paquete;

import Sonido.Sonido;
import clasesImagen.Imagen;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.edisoncor.gui.util.Avatar;

public class VentanaAprendizaje extends javax.swing.JInternalFrame {

    private Sonido sound;
    private boolean sesionActiva;
    private Imagen img;
    private VentanaVideo vd;
    private String liga;

    public boolean getsesionActiva() {
        return sesionActiva;
    }

    public VentanaAprendizaje() {
        initComponents();
        img = new Imagen();
        sound = new Sonido();
        inicializarComponentes();
        llenarMenu();
    }

    public void inicializarComponentes() {
        this.setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public void llenarMenu() {
        List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Menu1", loadImage("/img/unnamed.png")));
        avatars.add(new Avatar("Menu2", loadImage("/img/unnamed.png")));
        avatars.add(new Avatar("Menu3", loadImage("/img/unnamed.png")));
        avatars.add(new Avatar("Menu4", loadImage("/img/unnamed.png")));
        avatars.add(new Avatar("Menu5", loadImage("/img/unnamed.png")));
        avatars.add(new Avatar("Menu6", loadImage("/img/unnamed.png")));
        avatars.add(new Avatar("Menu7", loadImage("/img/unnamed.png")));

        menu.setAvatars(avatars);
    }

    public static Image loadImage(String fileName) {
        try {
            return ImageIO.read(VentanaAprendizaje.class.getResource(fileName));
        } catch (Exception e) {
            return null;
        }
    }

    protected void finalize() {
        vd = null;
        System.gc();
    }

    public void llamarMenu() {
        String liga = "";
        if (vd != null) {
            vd.cerrarVideo();
        }

        if (menu.getSelectedtitulo().equals("Menu1")) {
            liga = "src/videos/calculo/2.mp4";
        } else if (menu.getSelectedtitulo().equals("Menu2")) {
            liga = "src/videos/calculo/1.mp4";
        } else {
            liga = "src/videos/as.mp4";
        }
        vd = new VentanaVideo(liga);

        abrirFrameInterno(vd, esc);

    }

    public void iniciarSesion() {
        sesionActiva = true;
        Principal.BarraMenu.setVisible(sesionActiva);
        Principal.panelDeDatos.setVisible(sesionActiva);
        Principal.panelProgreso.setVisible(sesionActiva);
        this.hide();
    }

    public void abrirFrameInterno(JInternalFrame m, JDesktopPane escritorio) {
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize;
        m = (JInternalFrame) crearObjeto(m);
        FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        escritorio.add(m);
        m.show();
    }

    public Object crearObjeto(JInternalFrame m) {
        if (m instanceof Ayudante) {
            m = new Ayudante();
        } else if (m instanceof Login) {
            m = new Login();
        } else if (m instanceof Credito) {
            m = new Credito();
        } else if (m instanceof Ranking) {
            m = new Ranking();
        } else if (m instanceof Bibliografia) {
            m = new Bibliografia();
        } else if (m instanceof Practica) {
            m = new Practica();
        }
        return m;
    }

    public void emitirMouseEncima() {
        sound.emitirSonido("src/archivosAudio/over.wav");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new org.edisoncor.gui.panel.Panel();
        buttonMetroICM1 = new com.icm.components.metro.ButtonMetroICM();
        menu = new org.edisoncor.gui.panel.PanelAvatarChooser();
        buttonIpod1 = new org.edisoncor.gui.button.ButtonIpod();
        jPanel1 = new javax.swing.JPanel();
        esc = new javax.swing.JDesktopPane();
        buttonIcon1 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon2 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon3 = new org.edisoncor.gui.button.ButtonIcon();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();

        setMaximumSize(new java.awt.Dimension(1100, 520));
        setMinimumSize(new java.awt.Dimension(1100, 520));
        setPreferredSize(new java.awt.Dimension(1100, 520));
        setRequestFocusEnabled(false);

        panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        buttonMetroICM1.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/back.png"))); // NOI18N
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

        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        buttonIpod1.setText("-");
        buttonIpod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIpod1ActionPerformed(evt);
            }
        });
        menu.add(buttonIpod1, new java.awt.GridBagConstraints());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        esc.setBorder(null);
        esc.setMaximumSize(new java.awt.Dimension(663, 376));
        esc.setMinimumSize(new java.awt.Dimension(663, 376));

        javax.swing.GroupLayout escLayout = new javax.swing.GroupLayout(esc);
        esc.setLayout(escLayout);
        escLayout.setHorizontalGroup(
            escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escLayout.setVerticalGroup(
            escLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(esc, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(esc, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-circle-pause-icon-1.png"))); // NOI18N
        buttonIcon1.setText("buttonIcon1");
        buttonIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon1ActionPerformed(evt);
            }
        });

        buttonIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        buttonIcon2.setText("buttonIcon1");
        buttonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon2ActionPerformed(evt);
            }
        });

        buttonIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stop-button-md.png"))); // NOI18N
        buttonIcon3.setText("buttonIcon1");
        buttonIcon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon3ActionPerformed(evt);
            }
        });

        labelMetric1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetric1.setText("labelMetric1");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(464, 464, 464)
                .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMetroICM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM1ActionPerformed
        iniciarSesion();
        vd.cerrarVideo();
        vd.hide();
    }//GEN-LAST:event_buttonMetroICM1ActionPerformed

    private void buttonMetroICM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM1MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM1MouseEntered

    private void buttonIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon1ActionPerformed
        try {
            vd.pausarVideo();
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_buttonIcon1ActionPerformed

    private void buttonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon2ActionPerformed
        try {
            vd.reanudarVideo();
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_buttonIcon2ActionPerformed

    private void buttonIcon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon3ActionPerformed
        try {
            vd.pararVideo();
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_buttonIcon3ActionPerformed

    private void buttonIpod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIpod1ActionPerformed
        llamarMenu();
    }//GEN-LAST:event_buttonIpod1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon buttonIcon1;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon2;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon3;
    private org.edisoncor.gui.button.ButtonIpod buttonIpod1;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private javax.swing.JDesktopPane esc;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.PanelAvatarChooser menu;
    private org.edisoncor.gui.panel.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
