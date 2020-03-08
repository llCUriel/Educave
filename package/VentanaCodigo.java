package paquete;

import Sonido.Sonido;
import classDAO.UsuarioDAO;
import classVO.UsuarioVO;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import static paquete.Principal.BarraMenu;
import static paquete.Principal.jp_progress;
import static paquete.Principal.panelDeDatos;
import static paquete.Principal.panelProgreso;

public class VentanaCodigo extends javax.swing.JInternalFrame {

    private Sonido sound;
    private UsuarioDAO userDao;
    private miHiloBarra barr;
    private String codigo;
    private UsuarioVO user;
    private boolean sesionActiva;
    private OptionPane pane;

    public boolean getsesionActiva() {
        return sesionActiva;
    }

    public UsuarioDAO getUserDao() {
        return userDao;
    }

    public VentanaCodigo(String codigo, UsuarioVO user) {
        initComponents();
        this.user = user;
        this.codigo = codigo;
        sound = new Sonido();
        inicializarComponentes();
        pane = new OptionPane();
    }

    public VentanaCodigo() {
        initComponents();
        sound = new Sonido();
        inicializarComponentes();
    }

    public void abrirFrameInterno(JInternalFrame m, JDesktopPane escritorio, UsuarioVO user) {
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize;
        jp_progress.repaint();
        BarraMenu.setVisible(false);
        panelDeDatos.setVisible(false);
        panelProgreso.setVisible(false);
        m = (JInternalFrame) crearObjeto(m, user);
        FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        escritorio.add(m);
        m.show();
    }

    public Object crearObjeto(JInternalFrame m, UsuarioVO user) {
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
        } else if (m instanceof VentanaRecuperar) {
            m = new VentanaRecuperar(user);
        }
        return m;
    }

    public void inicializarComponentes() {
        this.setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public void iniciarSesion() {
        sesionActiva = true;
        barr.start();
        sound.emitirSonido("src/archivosAudio/ini_sesion.wav");
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

        panel5 = new org.edisoncor.gui.panel.Panel();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        buttonMetroICM1 = new com.icm.components.metro.ButtonMetroICM();
        jLabel1 = new javax.swing.JLabel();
        codigoTF = new com.icm.components.metro.PasswordFieldMetroICM();

        panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        labelMetroICM1.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/info.png"))); // NOI18N
        labelMetroICM1.setText("Código.");

        buttonMetroICM1.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/24x24/accept.png"))); // NOI18N
        buttonMetroICM1.setText("Enviar.");
        buttonMetroICM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buzon.png"))); // NOI18N

        codigoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                        .addGap(143, 143, 143))))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(codigoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMetroICM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM1ActionPerformed
        if (codigo.equals(codigoTF.getText())) {
            abrirFrameInterno(new VentanaRecuperar(user), Principal.escritorio, user);
            this.hide();
        } else {
            pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Error.", "Código erróneo.");
        }
    }//GEN-LAST:event_buttonMetroICM1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private com.icm.components.metro.PasswordFieldMetroICM codigoTF;
    private javax.swing.JLabel jLabel1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private org.edisoncor.gui.panel.Panel panel5;
    // End of variables declaration//GEN-END:variables
}
