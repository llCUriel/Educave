package paquete;

import JFileChooser.FileChooser;
import MD5.Codigo;
import MD5.Hash;
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

public class Login extends javax.swing.JInternalFrame {

    private Hash hs;
    private Sonido sound;
    private FileChooser fil;
    private UsuarioDAO userDao;
    private OptionPane pane;
    private Correo cor;
    private miHiloBarra barr;
    private Codigo cd;
    private VentanaCodigo rcs;
    private UsuarioVO user;
    private boolean sesionActiva;

    public boolean getsesionActiva() {
        return sesionActiva;
    }

    public UsuarioDAO getUserDao() {
        return userDao;
    }

    public Login() {
        initComponents();
        rcs = new VentanaCodigo();
        cd = new Codigo();
        hs = new Hash();
        userDao = new UsuarioDAO();
        pane = new OptionPane();
        mensaje.setVisible(false);
        fil = new FileChooser();
        sound = new Sonido();
        inicializarComponentes();
    }

    public void limpiarCampos() {
        logUsuario.setText("");
        logEmail.setText("");
        logAPaterno.setText("");
        logAMaterno.setText("");
        logPass.setText("");
        logPassC.setText("");
        imagenPerfil.setIcon(null);
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

    public void abrirFrameInterno(JInternalFrame m, JDesktopPane escritorio, String codigo, UsuarioVO user) {
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize;
        jp_progress.repaint();
        BarraMenu.setVisible(false);
        panelDeDatos.setVisible(false);
        panelProgreso.setVisible(false);
        m = (JInternalFrame) crearObjeto(m, codigo, user);
        FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        escritorio.add(m);
        m.show();
    }

    public Object crearObjeto(JInternalFrame m, String codigo, UsuarioVO user) {
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
        } else if (m instanceof VentanaCodigo) {
            m = new VentanaCodigo(codigo, user);
        }
        return m;
    }

    public void emitirMouseEncima() {
        sound.emitirSonido("src/archivosAudio/over.wav");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneHeader1 = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
        panel1 = new org.edisoncor.gui.panel.Panel();
        imagenUsuario = new javax.swing.JLabel();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        usuarioTF = new com.icm.components.metro.TextFieldMetroICM();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        contraseniaTF = new com.icm.components.metro.PasswordFieldMetroICM();
        buttonMetroICM1 = new com.icm.components.metro.ButtonMetroICM();
        mensaje = new javax.swing.JLabel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        panel4 = new org.edisoncor.gui.panel.Panel();
        buttonMetroICM5 = new com.icm.components.metro.ButtonMetroICM();
        labelMetroICM12 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM4 = new com.icm.components.metro.LabelMetroICM();
        logUsuario = new com.icm.components.metro.TextFieldMetroICM();
        labelMetroICM7 = new com.icm.components.metro.LabelMetroICM();
        logEmail = new com.icm.components.metro.TextFieldMetroICM();
        labelMetroICM8 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM9 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM10 = new com.icm.components.metro.LabelMetroICM();
        imagenPerfil = new javax.swing.JLabel();
        buttonMetroICM6 = new com.icm.components.metro.ButtonMetroICM();
        logPassC = new com.icm.components.metro.PasswordFieldMetroICM();
        logPass = new com.icm.components.metro.PasswordFieldMetroICM();
        labelMetroICM13 = new com.icm.components.metro.LabelMetroICM();
        logAPaterno = new com.icm.components.metro.TextFieldMetroICM();
        logAMaterno = new com.icm.components.metro.TextFieldMetroICM();
        labelMetroICM14 = new com.icm.components.metro.LabelMetroICM();
        buttonMetroICM7 = new com.icm.components.metro.ButtonMetroICM();
        panel3 = new org.edisoncor.gui.panel.Panel();
        labelMetroICM11 = new com.icm.components.metro.LabelMetroICM();
        correo = new com.icm.components.metro.TextFieldMetroICM();
        buttonMetroICM4 = new com.icm.components.metro.ButtonMetroICM();
        jLabel1 = new javax.swing.JLabel();

        tabbedPaneHeader1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        panel1.setBorder(null);

        imagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N
        imagenUsuario.setMaximumSize(new java.awt.Dimension(144, 116));
        imagenUsuario.setMinimumSize(new java.awt.Dimension(144, 116));
        imagenUsuario.setPreferredSize(new java.awt.Dimension(144, 116));

        labelMetroICM1.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM1.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/user.png"))); // NOI18N
        labelMetroICM1.setText("Usuario");

        usuarioTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelMetroICM2.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM2.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/lock.png"))); // NOI18N
        labelMetroICM2.setText("Contraseña");

        contraseniaTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonMetroICM1.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        buttonMetroICM1.setText("Ingresar");
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

        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/delete.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addComponent(imagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47))
                        .addComponent(contraseniaTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuarioTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                .addGap(141, 141, 141))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(imagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseniaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(mensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPaneHeader1.addTab("Iniciar sesión.", panel1);

        panel2.setBorder(null);

        labelMetroICM3.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM3.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM3.setText("Crear cuenta.");

        buttonMetroICM5.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/attachment.png"))); // NOI18N
        buttonMetroICM5.setText("Cargar fotografia.");
        buttonMetroICM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMetroICM5MouseEntered(evt);
            }
        });
        buttonMetroICM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM5ActionPerformed(evt);
            }
        });

        labelMetroICM12.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM12.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/info.png"))); // NOI18N
        labelMetroICM12.setText("Crear cuenta.");

        labelMetroICM4.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM4.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/user.png"))); // NOI18N
        labelMetroICM4.setText("Usuario:");

        logUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelMetroICM7.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM7.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/mail.png"))); // NOI18N
        labelMetroICM7.setText("Correo electrónico:");

        logEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelMetroICM8.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM8.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/lock.png"))); // NOI18N
        labelMetroICM8.setText("Contraseña:");

        labelMetroICM9.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM9.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/lock.png"))); // NOI18N
        labelMetroICM9.setText("Repita su contraseña:");

        labelMetroICM10.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM10.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/user.png"))); // NOI18N
        labelMetroICM10.setText("Fotografia.");

        imagenPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        buttonMetroICM6.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        buttonMetroICM6.setText("Completar registro.");
        buttonMetroICM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMetroICM6MouseEntered(evt);
            }
        });
        buttonMetroICM6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM6ActionPerformed(evt);
            }
        });

        logPassC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        logPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelMetroICM13.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM13.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/protection.png"))); // NOI18N
        labelMetroICM13.setText("Apellido paterno.");

        logAPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        logAMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelMetroICM14.setBackground(new java.awt.Color(255, 255, 255));
        labelMetroICM14.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/protection.png"))); // NOI18N
        labelMetroICM14.setText("Apellido materno.");

        buttonMetroICM7.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/promotion.png"))); // NOI18N
        buttonMetroICM7.setText("Limpiar campos.");
        buttonMetroICM7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelMetroICM13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logPass, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(logUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logAPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetroICM8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetroICM4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetroICM9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelMetroICM14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(logEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logAMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logPassC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(imagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonMetroICM5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelMetroICM10, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(buttonMetroICM6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetroICM12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetroICM12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(labelMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetroICM13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetroICM14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(labelMetroICM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonMetroICM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(buttonMetroICM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(478, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabbedPaneHeader1.addTab("Obtener una cuenta.", panel2);

        panel3.setBorder(null);

        labelMetroICM11.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/mail.png"))); // NOI18N
        labelMetroICM11.setText("Correo electrónico:");

        correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonMetroICM4.setForeground(new java.awt.Color(0, 0, 0));
        buttonMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/unlock.png"))); // NOI18N
        buttonMetroICM4.setText("Recuperar contraseña.");
        buttonMetroICM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMetroICM4MouseEntered(evt);
            }
        });
        buttonMetroICM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMetroICM4ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abcd.png"))); // NOI18N

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetroICM11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(222, 222, 222))))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMetroICM11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(buttonMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        tabbedPaneHeader1.addTab("Contraseña olvidada.", panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMetroICM5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM5MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM5MouseEntered

    private void buttonMetroICM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM5ActionPerformed
        fil.mostrarImagen(imagenPerfil);
    }//GEN-LAST:event_buttonMetroICM5ActionPerformed

    private void buttonMetroICM6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM6MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM6MouseEntered

    private void buttonMetroICM6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM6ActionPerformed
        UsuarioVO user = new UsuarioVO();
        userDao = new UsuarioDAO();
        if (logPass.getText().equals(logPassC.getText()) && !logUsuario.getText().equals("") && !logEmail.getText().equals("") && !logAPaterno.getText().equals("") && !logAMaterno.getText().equals("") && !logPass.getText().equals("") && !logPassC.getText().equals("") && imagenPerfil.getIcon() != null) {
            if (logPass.getText().equals(logPassC.getText())) {
                // fotografia = img.retornarValor(fil.getRua());
                user.setNick(logUsuario.getText());
                user.setCorreoElectronico(logEmail.getText());
                user.setApaterno(logAPaterno.getText());
                user.setAmaterno(logAMaterno.getText());
                user.setContrasena(hs.encriptarTextoMD5(logPass.getText()));
                System.out.println(fil.getRuta());
                user.setRuta(fil.getRuta());
                user.setProgresoEnEducueva(0);
                pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Error.", userDao.registrarUsuario(user));
                limpiarCampos();
            } else {
                pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Error.", "Las contraseñas deben de coincidir, por favor.");
            }
        } else {
            pane.enviarMensaje("src/imagenes/logopane.png", 255, 255, 255, "Error.", "Es necesario completar todos los campos, por favor.");
        }
    }//GEN-LAST:event_buttonMetroICM6ActionPerformed

    private void buttonMetroICM7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM7ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_buttonMetroICM7ActionPerformed

    private void buttonMetroICM4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM4MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM4MouseEntered

    private void buttonMetroICM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM4ActionPerformed

        String codigo = cd.getCadenaAlfanumAleatoria(10);
        userDao = new UsuarioDAO();
        user = userDao.buscarUsuarioPorCorreo(correo.getText());
        abrirFrameInterno(rcs, Principal.escritorio, codigo, user);
        cor = new Correo("\n Aqui tienes tu código : " + user.getNick() + "\n\n Código : " + codigo + "\n\n ¡Sigue aprendiendo!", "Educueva: recuperación de contraseña.", user.getCorreoElectronico());
        cor.SendMail();
        correo.setText("");
        this.hide();

    }//GEN-LAST:event_buttonMetroICM4ActionPerformed

    private void buttonMetroICM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM1MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM1MouseEntered

    private void buttonMetroICM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMetroICM1ActionPerformed
        userDao = new UsuarioDAO();
        UsuarioVO user = userDao.buscarUsuarioPorNick(usuarioTF.getText());
        //System.out.println(user.toString());

        if (usuarioTF.getText().equals(user.getNick()) && hs.encriptarTextoMD5(contraseniaTF.getText()).equals(user.getContrasena())) {
            sound.emitirSonido("src/archivosAudio/ini_sesion.wav");
            this.hide();
            SplashScreen.princ.iniciarSesion(user);
        } else {
            sound.emitirSonido("src/archivosAudio/error.wav");
            mensaje.setVisible(true);
            mensaje.setText("Datos erróneos.");
        }
    }//GEN-LAST:event_buttonMetroICM1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM4;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM5;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM6;
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM7;
    private com.icm.components.metro.PasswordFieldMetroICM contraseniaTF;
    private com.icm.components.metro.TextFieldMetroICM correo;
    private javax.swing.JLabel imagenPerfil;
    private javax.swing.JLabel imagenUsuario;
    private javax.swing.JLabel jLabel1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM10;
    private com.icm.components.metro.LabelMetroICM labelMetroICM11;
    private com.icm.components.metro.LabelMetroICM labelMetroICM12;
    private com.icm.components.metro.LabelMetroICM labelMetroICM13;
    private com.icm.components.metro.LabelMetroICM labelMetroICM14;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.LabelMetroICM labelMetroICM4;
    private com.icm.components.metro.LabelMetroICM labelMetroICM7;
    private com.icm.components.metro.LabelMetroICM labelMetroICM8;
    private com.icm.components.metro.LabelMetroICM labelMetroICM9;
    private com.icm.components.metro.TextFieldMetroICM logAMaterno;
    private com.icm.components.metro.TextFieldMetroICM logAPaterno;
    private com.icm.components.metro.TextFieldMetroICM logEmail;
    private com.icm.components.metro.PasswordFieldMetroICM logPass;
    private com.icm.components.metro.PasswordFieldMetroICM logPassC;
    private com.icm.components.metro.TextFieldMetroICM logUsuario;
    private javax.swing.JLabel mensaje;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.panel.Panel panel4;
    private org.edisoncor.gui.tabbedPane.TabbedPaneHeader tabbedPaneHeader1;
    private com.icm.components.metro.TextFieldMetroICM usuarioTF;
    // End of variables declaration//GEN-END:variables
}
