package paquete;

import Sonido.Sonido;
import clasesImagen.Imagen;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import static paquete.Principal.BarraMenu;
import static paquete.Principal.escritorio;
import static paquete.Principal.jp_progress;
import static paquete.Principal.panelDeDatos;
import static paquete.Principal.panelProgreso;

public class UnidadDeAprendizaje extends javax.swing.JInternalFrame {

    private Sonido sound;
    private Imagen img;
    private boolean sesionActiva;

    public boolean getsesionActiva() {
        return sesionActiva;
    }

    public UnidadDeAprendizaje() {
        initComponents();
        img = new Imagen();
        sound = new Sonido();
        inicializarComponentes();
    }

    public void inicializarImagen(String imga) {
        desc.setSize(1076, 427);
        String liga = "";
        if (imga.equalsIgnoreCase("Calculo")) {
            liga = "calculo.png";
        } else if (imga.equalsIgnoreCase("matdisc")) {
            liga = "matedisc.png";
        } else if (imga.equalsIgnoreCase("lineal")) {
            liga = "algebralineal.png";
        } else if (imga.equalsIgnoreCase("ecuaciones")) {
            liga = "ecdif.png";
        } else if (imga.equalsIgnoreCase("vectorial")) {
            liga = "analisisvect.png";
        }

        img.mostrarImagen(desc, "src/imagenes/" + liga);
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

    public void abrirFrameInterno(JInternalFrame m, JDesktopPane escritorio) {
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize;
        jp_progress.repaint();
        BarraMenu.setVisible(false);
        panelDeDatos.setVisible(false);
        panelProgreso.setVisible(false);
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
        desc = new javax.swing.JLabel();
        buttonMetroICM2 = new com.icm.components.metro.ButtonMetroICM();

        setMaximumSize(new java.awt.Dimension(1100, 520));
        setMinimumSize(new java.awt.Dimension(1100, 520));
        setPreferredSize(new java.awt.Dimension(1100, 520));
        setRequestFocusEnabled(false);

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

        desc.setBackground(new java.awt.Color(255, 255, 255));
        desc.setBorder(null);
        desc.setOpaque(true);

        buttonMetroICM2.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/add_page.png"))); // NOI18N
        buttonMetroICM2.setText("Ver temario.");
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

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 816, Short.MAX_VALUE)
                        .addComponent(buttonMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
    }//GEN-LAST:event_buttonMetroICM1ActionPerformed

    private void buttonMetroICM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM1MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM1MouseEntered

    private void buttonMetroICM2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM2MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM2MouseEntered

    private void buttonMetroICM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM2ActionPerformed
        abrirFrameInterno(new VentanaAprendizaje(), escritorio);
        this.hide();
    }//GEN-LAST:event_buttonMetroICM2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM2;
    private javax.swing.JLabel desc;
    private org.edisoncor.gui.panel.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
