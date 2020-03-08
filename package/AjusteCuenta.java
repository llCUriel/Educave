package paquete;

import JFileChooser.FileChooser;
import MD5.Hash;
import Sonido.Sonido;
import clasesImagen.Imagen;
import classDAO.UsuarioDAO;
import classVO.UsuarioVO;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import static paquete.Principal.escritorio;

public class AjusteCuenta extends javax.swing.JInternalFrame {

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

    public AjusteCuenta(UsuarioVO user) {
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
            logEmail.setText(user.getCorreoElectronico());
            logAPaterno.setText(user.getApaterno());
            logAMaterno.setText(user.getAmaterno());
            imagenPerfil.setSize(117, 142);
            imagenPerfil.setIcon(img.escalarImagen(imagenPerfil, user.getImagen()));
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new org.edisoncor.gui.panel.Panel();
        buttonMetroICM1 = new com.icm.components.metro.ButtonMetroICM();
        jLabel1 = new javax.swing.JLabel();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        buttonMetroICM2 = new com.icm.components.metro.ButtonMetroICM();
        logAPaterno = new com.icm.components.metro.TextFieldMetroICM();
        logPassC = new com.icm.components.metro.PasswordFieldMetroICM();
        labelMetroICM9 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM4 = new com.icm.components.metro.LabelMetroICM();
        logAMaterno = new com.icm.components.metro.TextFieldMetroICM();
        labelMetroICM12 = new com.icm.components.metro.LabelMetroICM();
        logEmail = new com.icm.components.metro.TextFieldMetroICM();
        labelMetroICM13 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM8 = new com.icm.components.metro.LabelMetroICM();
        logPass = new com.icm.components.metro.PasswordFieldMetroICM();
        labelMetroICM7 = new com.icm.components.metro.LabelMetroICM();
        imagenPerfil = new javax.swing.JLabel();
        labelMetroICM10 = new com.icm.components.metro.LabelMetroICM();
        buttonMetroICM3 = new com.icm.components.metro.ButtonMetroICM();
        logUsuario = new com.icm.components.metro.LabelMetroICM();
        buttonMetroICM4 = new com.icm.components.metro.ButtonMetroICM();

        setMaximumSize(new java.awt.Dimension(590, 504));
        setMinimumSize(new java.awt.Dimension(590, 504));
        setPreferredSize(new java.awt.Dimension(590, 504));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N

        labelMetroICM2.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM2.setText("Ajustes de cuenta.");

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

        logAPaterno.setForeground(new java.awt.Color(0, 0, 0));
        logAPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        logPassC.setForeground(new java.awt.Color(0, 0, 0));
        logPassC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        logAMaterno.setForeground(new java.awt.Color(0, 0, 0));
        logAMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelMetroICM12.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM12.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/protection.png"))); // NOI18N
        labelMetroICM12.setText("Apellido paterno.");

        logEmail.setForeground(new java.awt.Color(0, 0, 0));
        logEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelMetroICM13.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM13.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/protection.png"))); // NOI18N
        labelMetroICM13.setText("Apellido materno.");

        labelMetroICM8.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM8.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/lock.png"))); // NOI18N
        labelMetroICM8.setText("Contraseña:");

        logPass.setForeground(new java.awt.Color(0, 0, 0));
        logPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelMetroICM7.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM7.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/mail.png"))); // NOI18N
        labelMetroICM7.setText("Correo electrónico:");

        imagenPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        imagenPerfil.setMaximumSize(new java.awt.Dimension(117, 142));
        imagenPerfil.setMinimumSize(new java.awt.Dimension(117, 142));

        labelMetroICM10.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM10.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/user.png"))); // NOI18N
        labelMetroICM10.setText("Fotografia.");

        buttonMetroICM3.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/attachment.png"))); // NOI18N
        buttonMetroICM3.setText("Cargar fotografia.");
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

        logUsuario.setForeground(new java.awt.Color(255, 255, 255));
        logUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logUsuario.setText("-");

        buttonMetroICM4.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/delete.png"))); // NOI18N
        buttonMetroICM4.setText("Eliminar cuenta.");
        buttonMetroICM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelMetroICM2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelMetroICM12, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logPass, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelMetroICM8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(logUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelMetroICM9, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetroICM7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetroICM13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logAMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logPassC, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetroICM10, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(imagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 67, Short.MAX_VALUE)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonMetroICM3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(buttonMetroICM4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logPassC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelMetroICM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(imagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(buttonMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
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
        if (bandera == 1) {
            SplashScreen.princ.iniciarSesion(nm);
        } else {
            SplashScreen.princ.iniciarSesion(user);
        }

        this.hide();
    }//GEN-LAST:event_buttonMetroICM1ActionPerformed

    private void buttonMetroICM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM1MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM1MouseEntered

    private void buttonMetroICM2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM2MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM2MouseEntered

    private void buttonMetroICM3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM3MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM3MouseEntered

    private void buttonMetroICM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM3ActionPerformed
        fil.mostrarImagen(imagenPerfil);
    }//GEN-LAST:event_buttonMetroICM3ActionPerformed

    private void buttonMetroICM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM2ActionPerformed
        if (logPass.getText().equals(logPassC.getText()) && !logUsuario.getText().equals("") && !logEmail.getText().equals("") && !logAPaterno.getText().equals("") && !logAMaterno.getText().equals("") && !logPass.getText().equals("") && !logPassC.getText().equals("") && imagenPerfil.getIcon() != null) {
            if (logPass.getText().equals(logPassC.getText())) {
                nm = new UsuarioVO();
                nm.setId_Usuario(user.getId_Usuario());
                nm.setNick(logUsuario.getText());
                nm.setCorreoElectronico(logEmail.getText());
                nm.setApaterno(logAPaterno.getText());
                nm.setAmaterno(logAMaterno.getText());
                nm.setContrasena(hs.encriptarTextoMD5(logPass.getText()));
                nm.setRuta(fil.getRuta());
                nm.setImagen(img.convertirLigaAImagen(fil.getRuta()));
                nm.setProgresoEnEducueva((int) user.getProgresoEnEducueva());
                userdao.actualizarUsuario(nm);
                sound.emitirSonido("src/archivosAudio/Boton.wav");
                pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Aviso.", "Cambios guardados.");
                bandera = 1;
            } else {
                pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Error.", "Las contraseñas deben de coincidir, por favor.");
            }
        } else {
            pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Error.", "Es necesario completar todos los campos, por favor.");
        }

    }//GEN-LAST:event_buttonMetroICM2ActionPerformed

    private void buttonMetroICM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM4ActionPerformed
        userdao.eliminarUsuario(user.getNick());
        SplashScreen.princ.abrirFrameInterno(log, escritorio);
        sound.emitirSonido("src/archivosAudio/cerrarSesion.wav");
        pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Aviso.", "Cuenta: " + user.getNick() + " eliminada.");
        this.hide();
    }//GEN-LAST:event_buttonMetroICM4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM2;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM3;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM4;
    private javax.swing.JLabel imagenPerfil;
    private javax.swing.JLabel jLabel1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM10;
    private com.icm.components.metro.LabelMetroICM labelMetroICM12;
    private com.icm.components.metro.LabelMetroICM labelMetroICM13;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM4;
    private com.icm.components.metro.LabelMetroICM labelMetroICM7;
    private com.icm.components.metro.LabelMetroICM labelMetroICM8;
    private com.icm.components.metro.LabelMetroICM labelMetroICM9;
    private com.icm.components.metro.TextFieldMetroICM logAMaterno;
    private com.icm.components.metro.TextFieldMetroICM logAPaterno;
    private com.icm.components.metro.TextFieldMetroICM logEmail;
    private com.icm.components.metro.PasswordFieldMetroICM logPass;
    private com.icm.components.metro.PasswordFieldMetroICM logPassC;
    private com.icm.components.metro.LabelMetroICM logUsuario;
    private org.edisoncor.gui.panel.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
