package paquete;

import JFileChooser.FileChooser;
import MD5.Hash;
import Sonido.Sonido;
import clasesImagen.Imagen;
import classDAO.UsuarioDAO;
import classVO.UsuarioVO;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import static paquete.Principal.BarraMenu;
import static paquete.Principal.escritorio;
import static paquete.Principal.jp_progress;
import static paquete.Principal.panelDeDatos;
import static paquete.Principal.panelProgreso;

public class VentanaRecuperar extends javax.swing.JInternalFrame {

    private Sonido sound;
    private FileChooser fil;
    private UsuarioVO user;
    private Imagen img;
    private UsuarioDAO userdao;
    private UsuarioVO nm;
    private OptionPane pane;
    private Login log;
    private Hash hs;
    private int bandera;
    private boolean sesionActiva;

    public VentanaRecuperar(UsuarioVO user) {
        initComponents();
        hs = new Hash();
        this.user = user;
        nm = new UsuarioVO();
        userdao = new UsuarioDAO();
        fil = new FileChooser();
        sound = new Sonido();
        img = new Imagen();
        logUsuario.setEnabled(false);
        pane = new OptionPane();
        log = new Login();
        bandera = 0;
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        this.setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        if (user != null) {
            logUsuario.setText(user.getNick());
            //     imagenPerfil.setSize(117, 142);
            //     imagenPerfil.setIcon(img.escalarImagen(imagenPerfil, user.getImagen()));
        }

    }

    public void emitirMouseEncima() {
        sound.emitirSonido("src/archivosAudio/over.wav");
    }

    public void iniciarSesion() {
        sesionActiva = true;
        Principal.BarraMenu.setVisible(sesionActiva);
        Principal.panelDeDatos.setVisible(sesionActiva);
        Principal.panelProgreso.setVisible(sesionActiva);
        this.hide();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        buttonMetroICM2 = new com.icm.components.metro.ButtonMetroICM();
        logPassC = new com.icm.components.metro.PasswordFieldMetroICM();
        labelMetroICM9 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM4 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM8 = new com.icm.components.metro.LabelMetroICM();
        logPass = new com.icm.components.metro.PasswordFieldMetroICM();
        logUsuario = new com.icm.components.metro.LabelMetroICM();

        setMaximumSize(new java.awt.Dimension(590, 504));
        setMinimumSize(new java.awt.Dimension(590, 504));
        setPreferredSize(new java.awt.Dimension(590, 504));
        setRequestFocusEnabled(false);

        panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N

        labelMetroICM2.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM2.setText("Recuperar contraseña.");

        buttonMetroICM2.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        buttonMetroICM2.setText("Aceptar");
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

        logPassC.setForeground(new java.awt.Color(0, 0, 0));
        logPassC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        logPassC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logPassCActionPerformed(evt);
            }
        });

        labelMetroICM9.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM9.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/lock.png"))); // NOI18N
        labelMetroICM9.setText("Repita su contraseña:");

        labelMetroICM4.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM4.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/user.png"))); // NOI18N
        labelMetroICM4.setText("Usuario:");

        labelMetroICM8.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM8.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/lock.png"))); // NOI18N
        labelMetroICM8.setText("Contraseña:");

        logPass.setForeground(new java.awt.Color(0, 0, 0));
        logPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        logPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logPassActionPerformed(evt);
            }
        });

        logUsuario.setForeground(new java.awt.Color(255, 255, 255));
        logUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logUsuario.setText("-");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logPassC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addComponent(logPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logPassC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(buttonMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMetroICM2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM2MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM2MouseEntered

    private void buttonMetroICM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM2ActionPerformed
        if (logPass.getText().equals(logPassC.getText()) && !logUsuario.getText().equals("") && !logPass.getText().equals("") && !logPassC.getText().equals("")) {
            if (logPass.getText().equals(logPassC.getText())) {
                user.setRuta("src/imagenes/ALUMNO1.jpg");
                user.setContrasena(new Hash().encriptarTextoMD5(logPass.getText()));
                userdao.actualizarUsuario(user);
                sound.emitirSonido("src/archivosAudio/Boton.wav");
                pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Aviso.", "Cambios guardados.");
                bandera = 1;
                abrirFrameInterno(log, escritorio, user);
                this.hide();
            } else {
                pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Error.", "Las contraseñas deben de coincidir, por favor.");
            }
        } else {
            pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Error.", "Es necesario completar todos los campos, por favor.");
        }

    }//GEN-LAST:event_buttonMetroICM2ActionPerformed

    private void logPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logPassActionPerformed

    private void logPassCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logPassCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logPassCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM2;
    private javax.swing.JLabel jLabel1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM4;
    private com.icm.components.metro.LabelMetroICM labelMetroICM8;
    private com.icm.components.metro.LabelMetroICM labelMetroICM9;
    private com.icm.components.metro.PasswordFieldMetroICM logPass;
    private com.icm.components.metro.PasswordFieldMetroICM logPassC;
    private com.icm.components.metro.LabelMetroICM logUsuario;
    private org.edisoncor.gui.panel.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
