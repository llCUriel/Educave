package paquete;

import Sonido.Sonido;
import clasesImagen.Imagen;
import clasesImagen.ImagenFondo;
import classVO.UsuarioVO;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import reloj.Reloj;

public class Principal extends javax.swing.JFrame {

    private Dimension desktopSize;
    private Dimension FrameSize;
    private Practica pra;
    private Reloj reloj;
    private Ayudante sug;
    private Credito cred;
    private Ranking ran;
    private Bibliografia bib;
    private AjusteCuenta ajust;
    private UnidadDeAprendizaje mat;
    private UsuarioVO user;
    private Imagen img;
    private miHiloBarra barr;
    private Login log;
    private Sonido sound;
    private String materia;

    protected void finalize() {
        log = null;
        desktopSize = null;
        FrameSize = null;
        reloj = null;
        System.gc();
    }

    public Principal(Login log, Sonido sound, Dimension desktopSize, Dimension FrameSize, Practica pra, Reloj reloj, Ayudante sug, Credito cred, Ranking ran, Bibliografia bib, AjusteCuenta ajust, UnidadDeAprendizaje matdisc, UsuarioVO user) {
        this.log = log;
        this.sound = sound;
        this.desktopSize = desktopSize;
        this.FrameSize = FrameSize;
        this.pra = pra;
        this.reloj = reloj;
        this.sug = sug;
        this.cred = cred;
        this.ran = ran;
        this.bib = bib;
        this.ajust = ajust;
        this.mat = matdisc;
        this.user = user;
    }

    public Principal() {
        initComponents();
        img = new Imagen();
        sound = new Sonido();
        mat = new UnidadDeAprendizaje();
        reloj = new Reloj();
        log = new Login();
        sug = new Ayudante();
        cred = new Credito();
        ran = new Ranking();
        pra = new Practica();
        desktopSize = escritorio.getSize();
        FrameSize = log.getSize();
        bib = new Bibliografia();
        inicializarComponentes();
        setIconImage(new ImageIcon(getClass().getResource("logo2.png")).getImage());
    }

    public void inicializarComponentes() {
        this.setLocationRelativeTo(null);
        log.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        escritorio.add(log);
        log.show();
        BarraMenu.setVisible(false);
        escritorio.setBorder(new ImagenFondo("../imagenes/orig_665033_2.jpg"));
        panelDeDatos.setVisible(false);
        hora.setText(reloj.getformatoHora());
        panelProgreso.setVisible(false);
        sound = new Sonido();
        ajust = new AjusteCuenta(user);
    }

    public void setMenu() {
        BarraMenu.setVisible(true);
    }

    public void abrirFrameInterno(JInternalFrame m, JDesktopPane escritorio) {
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
        } else if (m instanceof AjusteCuenta) {
            m = new AjusteCuenta(user);
        } else if (m instanceof Practica) {
            m = new Practica();
        } else if (m instanceof UnidadDeAprendizaje) {
            m = new UnidadDeAprendizaje();
            UnidadDeAprendizaje j = (UnidadDeAprendizaje) m;
            j.inicializarImagen(materia);
        } else if (m instanceof Examen) {
            m = new Examen();
        } else if (m instanceof MiResultado) {
            m = new MiResultado();
        } else if (m instanceof Medalla) {
            m = new Medalla();
        }
        return m;
    }

    public void emitirMouseEncima() {
        sound.emitirSonido("src/archivosAudio/over.wav");
    }

    public Principal getPrincipal() {
        return this;
    }

    public void iniciarSesion(UsuarioVO user) {
        this.user = new UsuarioVO();
        this.user = user;
        barr = new miHiloBarra(jp_progress);
        barr.setProgreso((int) user.getProgresoEnEducueva());
        barr.start();
        fotografia.setIcon(img.escalarImagen(fotografia, user.getImagen()));
        infUsuario.setText(user.getNick());
        BarraMenu.setVisible(true);
        panelDeDatos.setVisible(true);
        panelProgreso.setVisible(true);
        mensajeCordial.setText("¿Qué gustas aprender el día de hoy," + " " + user.getNick() + "?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        panelProgreso = new org.edisoncor.gui.panel.Panel();
        hora = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM13 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM14 = new com.icm.components.metro.LabelMetroICM();
        mensajeCordial = new com.icm.components.metro.LabelMetroICM();
        linkMetroICM1 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM2 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM3 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM4 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM5 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM6 = new com.icm.components.metro.LinkMetroICM();
        linkMetroICM7 = new com.icm.components.metro.LinkMetroICM();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelMetroICM16 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM17 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM18 = new com.icm.components.metro.LabelMetroICM();
        jLabel4 = new javax.swing.JLabel();
        panelDeDatos = new org.edisoncor.gui.panel.Panel();
        jp_progress = new paquete.PanelDeCirculoDeProgreso();
        labelMetroICM1 = new com.icm.components.metro.LabelMetroICM();
        fotografia = new javax.swing.JLabel();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM3 = new com.icm.components.metro.LabelMetroICM();
        infUsuario = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM5 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM6 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM7 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM8 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM9 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM10 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM11 = new com.icm.components.metro.LabelMetroICM();
        labelMetroICM12 = new com.icm.components.metro.LabelMetroICM();
        BarraMenu = new javax.swing.JMenuBar();
        miCuenta = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();
        opcUA = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        opcBibl = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        opcEjemp = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        opcExam = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        opcPrac = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        opcMisResul = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        opcRank = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        opcCred = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        opcSug = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        opcMed = new javax.swing.JMenu();
        jMenuItem40 = new javax.swing.JMenuItem();
        opcJueg = new javax.swing.JMenu();
        jMenuItem41 = new javax.swing.JMenuItem();
        salirOpc = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProgreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        panelProgreso.setPreferredSize(new java.awt.Dimension(346, 100));

        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("hora");

        labelMetroICM13.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/clock.png"))); // NOI18N
        labelMetroICM13.setText("Hora :");

        labelMetroICM14.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM14.setText("¡Binvenenido a la EDUCUEVA!");

        mensajeCordial.setForeground(new java.awt.Color(255, 255, 255));
        mensajeCordial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeCordial.setText("¿Qué gustas aprender el día de hoy, John Titor?");

        linkMetroICM1.setForeground(new java.awt.Color(102, 102, 255));
        linkMetroICM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        linkMetroICM1.setText("Derivada de un producto.");
        linkMetroICM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkMetroICM1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM1MouseEntered(evt);
            }
        });

        linkMetroICM2.setForeground(new java.awt.Color(102, 102, 255));
        linkMetroICM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        linkMetroICM2.setText("Máximos y minimos.");
        linkMetroICM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM2MouseEntered(evt);
            }
        });

        linkMetroICM3.setForeground(new java.awt.Color(102, 102, 255));
        linkMetroICM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        linkMetroICM3.setText("Integración por partes.");
        linkMetroICM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM3MouseEntered(evt);
            }
        });

        linkMetroICM4.setForeground(new java.awt.Color(102, 102, 255));
        linkMetroICM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        linkMetroICM4.setText("Área bajo la curva.");
        linkMetroICM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM4MouseEntered(evt);
            }
        });

        linkMetroICM5.setForeground(new java.awt.Color(102, 102, 255));
        linkMetroICM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        linkMetroICM5.setText("Derivada de un cociente.");
        linkMetroICM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM5MouseEntered(evt);
            }
        });

        linkMetroICM6.setForeground(new java.awt.Color(102, 102, 255));
        linkMetroICM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        linkMetroICM6.setText("Integrales impropias.");
        linkMetroICM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM6MouseEntered(evt);
            }
        });

        linkMetroICM7.setForeground(new java.awt.Color(102, 102, 255));
        linkMetroICM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/accept.png"))); // NOI18N
        linkMetroICM7.setText("Más.");
        linkMetroICM7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkMetroICM7MouseEntered(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/favorite.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/favorite.png"))); // NOI18N

        labelMetroICM16.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM16.setText("Última medalla conseguida.");

        labelMetroICM17.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM17.setText("Velocidad cercana a la de la luz");

        labelMetroICM18.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM18.setText("Responde rápida y correctamente 42 problemas.");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cohete_circulo.png"))); // NOI18N

        javax.swing.GroupLayout panelProgresoLayout = new javax.swing.GroupLayout(panelProgreso);
        panelProgreso.setLayout(panelProgresoLayout);
        panelProgresoLayout.setHorizontalGroup(
            panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProgresoLayout.createSequentialGroup()
                .addGroup(panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProgresoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProgresoLayout.createSequentialGroup()
                                .addComponent(labelMetroICM13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(linkMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkMetroICM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkMetroICM4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkMetroICM5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkMetroICM6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linkMetroICM7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mensajeCordial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetroICM16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetroICM17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelMetroICM18, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))
                    .addGroup(panelProgresoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMetroICM14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProgresoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        panelProgresoLayout.setVerticalGroup(
            panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProgresoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelMetroICM14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addComponent(mensajeCordial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(linkMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkMetroICM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkMetroICM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkMetroICM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelMetroICM16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMetroICM17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMetroICM13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelDeDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        jp_progress.setBackground(null);

        javax.swing.GroupLayout jp_progressLayout = new javax.swing.GroupLayout(jp_progress);
        jp_progress.setLayout(jp_progressLayout);
        jp_progressLayout.setHorizontalGroup(
            jp_progressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jp_progressLayout.setVerticalGroup(
            jp_progressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        labelMetroICM1.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM1.setText("Progreso en el mundo de las matemáticas.");

        fotografia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.jpg"))); // NOI18N
        fotografia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        labelMetroICM2.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM2.setText("Fotografia.");

        labelMetroICM3.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/user.png"))); // NOI18N
        labelMetroICM3.setText("Usuario:");

        infUsuario.setForeground(new java.awt.Color(255, 255, 255));
        infUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infUsuario.setText("John Titor");

        labelMetroICM5.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM5.setText("128");

        labelMetroICM6.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/tag_green.png"))); // NOI18N
        labelMetroICM6.setText("Número de ejercicios realizados.");

        labelMetroICM7.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM7.setText("120");

        labelMetroICM8.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/tag_green.png"))); // NOI18N
        labelMetroICM8.setText("Número de ejercicios resueltos correctamente.");

        labelMetroICM9.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM9.setText("6");

        labelMetroICM10.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/tag_green.png"))); // NOI18N
        labelMetroICM10.setText("Número de exámenes aprobados.");

        labelMetroICM11.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/chart.png"))); // NOI18N
        labelMetroICM11.setText("Ranking mundial.");

        labelMetroICM12.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM12.setText("5/100");

        javax.swing.GroupLayout panelDeDatosLayout = new javax.swing.GroupLayout(panelDeDatos);
        panelDeDatos.setLayout(panelDeDatosLayout);
        panelDeDatosLayout.setHorizontalGroup(
            panelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_progress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDeDatosLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(panelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fotografia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(panelDeDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetroICM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMetroICM12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDeDatosLayout.setVerticalGroup(
            panelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(fotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jp_progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMetroICM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMetroICM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMetroICM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMetroICM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMetroICM11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        escritorio.setLayer(panelProgreso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(panelDeDatos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(panelDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(586, 586, 586)
                .addComponent(panelProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addComponent(panelDeDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BarraMenu.setBackground(new java.awt.Color(255, 255, 255));
        BarraMenu.setForeground(new java.awt.Color(0, 0, 0));
        BarraMenu.setOpaque(true);

        miCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/users.png"))); // NOI18N
        miCuenta.setText("Mi cuenta.");
        miCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miCuentaMouseExited(evt);
            }
        });

        jMenuItem38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/process.png"))); // NOI18N
        jMenuItem38.setText("Ajustes.");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        miCuenta.add(jMenuItem38);

        BarraMenu.add(miCuenta);

        opcUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/text_page.png"))); // NOI18N
        opcUA.setText("Unidades de aprendizaje.");
        opcUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcUAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcUAMouseExited(evt);
            }
        });

        jMenuItem33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem33.setText("Cálculo diferencial e integral.");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        opcUA.add(jMenuItem33);

        jMenuItem34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem34.setText("Matemáticas discretas.");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        opcUA.add(jMenuItem34);

        jMenuItem35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem35.setText("Álgebra lineal.");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        opcUA.add(jMenuItem35);

        jMenuItem36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem36.setText("Ecuaciones diferenciales.");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        opcUA.add(jMenuItem36);

        jMenuItem37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem37.setText("Análisis vectorial.");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        opcUA.add(jMenuItem37);

        BarraMenu.add(opcUA);

        opcBibl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/text_page.png"))); // NOI18N
        opcBibl.setText("Bibliografia.");
        opcBibl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcBiblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcBiblMouseExited(evt);
            }
        });

        jMenuItem28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem28.setText("Cálculo diferencial e integral.");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        opcBibl.add(jMenuItem28);

        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem29.setText("Matemáticas discretas.");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        opcBibl.add(jMenuItem29);

        jMenuItem30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem30.setText("Álgebra lineal.");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        opcBibl.add(jMenuItem30);

        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem31.setText("Ecuaciones diferenciales.");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        opcBibl.add(jMenuItem31);

        jMenuItem32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem32.setText("Análisis vectorial.");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        opcBibl.add(jMenuItem32);

        BarraMenu.add(opcBibl);

        opcEjemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/text_page.png"))); // NOI18N
        opcEjemp.setText("Ejemplos resueltos.");
        opcEjemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcEjempMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcEjempMouseExited(evt);
            }
        });

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem23.setText("Cálculo diferencial e integral.");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        opcEjemp.add(jMenuItem23);

        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem24.setText("Matemáticas discretas.");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        opcEjemp.add(jMenuItem24);

        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem25.setText("Álgebra lineal.");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        opcEjemp.add(jMenuItem25);

        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem26.setText("Ecuaciones diferenciales.");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        opcEjemp.add(jMenuItem26);

        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem27.setText("Análisis vectorial.");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        opcEjemp.add(jMenuItem27);

        BarraMenu.add(opcEjemp);

        opcExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/page_process.png"))); // NOI18N
        opcExam.setText("Exámenes.");
        opcExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcExamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcExamMouseExited(evt);
            }
        });

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem16.setText("Cálculo diferencial e integral.");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        opcExam.add(jMenuItem16);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem19.setText("Matemáticas discretas.");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        opcExam.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem20.setText("Álgebra lineal.");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        opcExam.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem21.setText("Ecuaciones diferenciales.");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        opcExam.add(jMenuItem21);

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem22.setText("Análisis vectorial.");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        opcExam.add(jMenuItem22);

        BarraMenu.add(opcExam);

        opcPrac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/process.png"))); // NOI18N
        opcPrac.setText("Práctica.");
        opcPrac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcPracMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcPracMouseExited(evt);
            }
        });

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem7.setText("Cálculo diferencial e integral.");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        opcPrac.add(jMenuItem7);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem10.setText("Matemáticas discretas.");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        opcPrac.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem11.setText("Álgebra lineal.");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        opcPrac.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem12.setText("Ecuaciones diferenciales.");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        opcPrac.add(jMenuItem12);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/folder.png"))); // NOI18N
        jMenuItem13.setText("Análisis vectorial.");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        opcPrac.add(jMenuItem13);

        BarraMenu.add(opcPrac);

        opcMisResul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/chart.png"))); // NOI18N
        opcMisResul.setText("Mis resultados.");
        opcMisResul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcMisResulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcMisResulMouseExited(evt);
            }
        });

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/favorite.png"))); // NOI18N
        jMenuItem8.setText("Por materia.");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        opcMisResul.add(jMenuItem8);

        BarraMenu.add(opcMisResul);

        opcRank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/chart.png"))); // NOI18N
        opcRank.setText("Ranking");
        opcRank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcRankMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcRankMouseExited(evt);
            }
        });

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/favorite.png"))); // NOI18N
        jMenuItem9.setText("Ranking Mundial.");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        opcRank.add(jMenuItem9);

        BarraMenu.add(opcRank);

        opcCred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/info.png"))); // NOI18N
        opcCred.setText("Créditos.");
        opcCred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcCredMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcCredMouseExited(evt);
            }
        });

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/info.png"))); // NOI18N
        jMenuItem14.setText("Créditos.");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        opcCred.add(jMenuItem14);

        BarraMenu.add(opcCred);

        opcSug.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/comment.png"))); // NOI18N
        opcSug.setText("Ayuda.");
        opcSug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcSugMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcSugMouseExited(evt);
            }
        });

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/mail.png"))); // NOI18N
        jMenuItem15.setText("Enviar ayudante..");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        opcSug.add(jMenuItem15);

        BarraMenu.add(opcSug);

        opcMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/favorite.png"))); // NOI18N
        opcMed.setText("Medallas");
        opcMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcMedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcMedMouseExited(evt);
            }
        });

        jMenuItem40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/mail.png"))); // NOI18N
        jMenuItem40.setText("Mis medallas.");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        opcMed.add(jMenuItem40);

        BarraMenu.add(opcMed);

        opcJueg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/favorite.png"))); // NOI18N
        opcJueg.setText("Juegos");
        opcJueg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcJuegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcJuegMouseExited(evt);
            }
        });

        jMenuItem41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/mail.png"))); // NOI18N
        jMenuItem41.setText("Juegos.");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        opcJueg.add(jMenuItem41);

        BarraMenu.add(opcJueg);

        salirOpc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/lock.png"))); // NOI18N
        salirOpc.setText("Salir.");
        salirOpc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirOpcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirOpcMouseExited(evt);
            }
        });

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/back.png"))); // NOI18N
        jMenuItem17.setText("Cerrar sesión.");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        salirOpc.add(jMenuItem17);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/16x16/delete.png"))); // NOI18N
        jMenuItem18.setText("Salir. de la aplicación.");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        salirOpc.add(jMenuItem18);

        BarraMenu.add(salirOpc);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        abrirFrameInterno(pra, escritorio);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        abrirFrameInterno(new MiResultado(), escritorio);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        abrirFrameInterno(ran, escritorio);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        abrirFrameInterno(cred, escritorio);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        abrirFrameInterno(sug, escritorio);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        abrirFrameInterno(log, escritorio);
        sound.emitirSonido("src/archivosAudio/cerrarSesion.wav");
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        sound.emitirSonido("src/archivosAudio/cerrarSesion.wav");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        abrirFrameInterno(pra, escritorio);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        abrirFrameInterno(pra, escritorio);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        abrirFrameInterno(pra, escritorio);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        abrirFrameInterno(pra, escritorio);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        abrirFrameInterno(new Examen(), escritorio);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        abrirFrameInterno(new Examen(), escritorio);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        abrirFrameInterno(new Examen(), escritorio);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        abrirFrameInterno(new Examen(), escritorio);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        abrirFrameInterno(new Examen(), escritorio);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed

    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed

    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed

    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed

    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed

    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        abrirFrameInterno(bib, escritorio
        );
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        abrirFrameInterno(bib, escritorio);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        abrirFrameInterno(bib, escritorio);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        abrirFrameInterno(bib, escritorio);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        abrirFrameInterno(bib, escritorio);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        materia = "calculo";
        abrirFrameInterno(mat, escritorio);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        materia = "matdisc";
        abrirFrameInterno(mat, escritorio);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        materia = "lineal";
        abrirFrameInterno(mat, escritorio);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        materia = "ecuaciones";
        abrirFrameInterno(mat, escritorio);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        materia = "vectorial";
        abrirFrameInterno(mat, escritorio);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        abrirFrameInterno(ajust, escritorio);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void linkMetroICM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM1MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM1MouseEntered

    private void linkMetroICM2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM2MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM2MouseEntered

    private void linkMetroICM3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM3MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM3MouseEntered

    private void linkMetroICM4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM4MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM4MouseEntered

    private void linkMetroICM5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM5MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM5MouseEntered

    private void linkMetroICM6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM6MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM6MouseEntered

    private void linkMetroICM7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM7MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_linkMetroICM7MouseEntered

    private void miCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miCuentaMouseEntered
        emitirMouseEncima();
        miCuenta.setForeground(Color.BLUE);
    }//GEN-LAST:event_miCuentaMouseEntered

    private void opcUAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcUAMouseEntered
        opcUA.setForeground(Color.BLUE);
        emitirMouseEncima();
    }//GEN-LAST:event_opcUAMouseEntered

    private void opcBiblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcBiblMouseEntered
        opcBibl.setForeground(Color.BLUE);
        emitirMouseEncima();
    }//GEN-LAST:event_opcBiblMouseEntered

    private void opcEjempMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcEjempMouseEntered
        opcEjemp.setForeground(Color.BLUE);
        emitirMouseEncima();
    }//GEN-LAST:event_opcEjempMouseEntered

    private void opcExamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcExamMouseEntered
        emitirMouseEncima();
        opcExam.setForeground(Color.BLUE);
    }//GEN-LAST:event_opcExamMouseEntered

    private void opcPracMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcPracMouseEntered
        emitirMouseEncima();
        opcPrac.setForeground(Color.BLUE);
    }//GEN-LAST:event_opcPracMouseEntered

    private void opcMisResulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcMisResulMouseEntered
        opcMisResul.setForeground(Color.BLUE);
        emitirMouseEncima();
    }//GEN-LAST:event_opcMisResulMouseEntered

    private void opcRankMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcRankMouseEntered
        opcRank.setForeground(Color.BLUE);
        emitirMouseEncima();
    }//GEN-LAST:event_opcRankMouseEntered

    private void opcCredMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcCredMouseEntered
        emitirMouseEncima();
        opcCred.setForeground(Color.BLUE);
    }//GEN-LAST:event_opcCredMouseEntered

    private void opcSugMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcSugMouseEntered
        opcSug.setForeground(Color.BLUE);
        emitirMouseEncima();
    }//GEN-LAST:event_opcSugMouseEntered

    private void salirOpcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirOpcMouseEntered
        emitirMouseEncima();
        salirOpc.setForeground(Color.BLUE);
    }//GEN-LAST:event_salirOpcMouseEntered

    private void miCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miCuentaMouseExited
        miCuenta.setForeground(Color.BLACK);
    }//GEN-LAST:event_miCuentaMouseExited

    private void salirOpcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirOpcMouseExited
        salirOpc.setForeground(Color.BLACK);
    }//GEN-LAST:event_salirOpcMouseExited

    private void opcSugMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcSugMouseExited
        opcSug.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcSugMouseExited

    private void opcCredMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcCredMouseExited
        opcCred.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcCredMouseExited

    private void opcRankMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcRankMouseExited
        opcRank.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcRankMouseExited

    private void opcMisResulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcMisResulMouseExited
        opcMisResul.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcMisResulMouseExited

    private void opcPracMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcPracMouseExited
        opcPrac.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcPracMouseExited

    private void opcExamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcExamMouseExited
        opcExam.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcExamMouseExited

    private void opcEjempMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcEjempMouseExited
        opcEjemp.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcEjempMouseExited

    private void opcBiblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcBiblMouseExited
        opcBibl.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcBiblMouseExited

    private void opcUAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcUAMouseExited
        opcUA.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcUAMouseExited

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        abrirFrameInterno(new Medalla(), escritorio);
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void opcMedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcMedMouseEntered
        emitirMouseEncima();
        opcMed.setForeground(Color.BLUE);
    }//GEN-LAST:event_opcMedMouseEntered

    private void opcMedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcMedMouseExited
        opcMed.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcMedMouseExited

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed

    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void opcJuegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcJuegMouseEntered
        emitirMouseEncima();
        opcJueg.setForeground(Color.BLUE);
    }//GEN-LAST:event_opcJuegMouseEntered

    private void opcJuegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcJuegMouseExited
        opcJueg.setForeground(Color.BLACK);
    }//GEN-LAST:event_opcJuegMouseExited

    private void linkMetroICM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkMetroICM1MouseClicked
        abrirFrameInterno(new VentanaAprendizaje(), escritorio);
    }//GEN-LAST:event_linkMetroICM1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuBar BarraMenu;
    public static javax.swing.JDesktopPane escritorio;
    public static javax.swing.JLabel fotografia;
    public static com.icm.components.metro.LabelMetroICM hora;
    public static com.icm.components.metro.LabelMetroICM infUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static paquete.PanelDeCirculoDeProgreso jp_progress;
    private com.icm.components.metro.LabelMetroICM labelMetroICM1;
    private com.icm.components.metro.LabelMetroICM labelMetroICM10;
    private com.icm.components.metro.LabelMetroICM labelMetroICM11;
    private com.icm.components.metro.LabelMetroICM labelMetroICM12;
    private com.icm.components.metro.LabelMetroICM labelMetroICM13;
    private com.icm.components.metro.LabelMetroICM labelMetroICM14;
    private com.icm.components.metro.LabelMetroICM labelMetroICM16;
    private com.icm.components.metro.LabelMetroICM labelMetroICM17;
    private com.icm.components.metro.LabelMetroICM labelMetroICM18;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private com.icm.components.metro.LabelMetroICM labelMetroICM3;
    private com.icm.components.metro.LabelMetroICM labelMetroICM5;
    private com.icm.components.metro.LabelMetroICM labelMetroICM6;
    private com.icm.components.metro.LabelMetroICM labelMetroICM7;
    private com.icm.components.metro.LabelMetroICM labelMetroICM8;
    private com.icm.components.metro.LabelMetroICM labelMetroICM9;
    private com.icm.components.metro.LinkMetroICM linkMetroICM1;
    private com.icm.components.metro.LinkMetroICM linkMetroICM2;
    private com.icm.components.metro.LinkMetroICM linkMetroICM3;
    private com.icm.components.metro.LinkMetroICM linkMetroICM4;
    private com.icm.components.metro.LinkMetroICM linkMetroICM5;
    private com.icm.components.metro.LinkMetroICM linkMetroICM6;
    private com.icm.components.metro.LinkMetroICM linkMetroICM7;
    public static com.icm.components.metro.LabelMetroICM mensajeCordial;
    private javax.swing.JMenu miCuenta;
    private javax.swing.JMenu opcBibl;
    private javax.swing.JMenu opcCred;
    private javax.swing.JMenu opcEjemp;
    private javax.swing.JMenu opcExam;
    private javax.swing.JMenu opcJueg;
    private javax.swing.JMenu opcMed;
    private javax.swing.JMenu opcMisResul;
    private javax.swing.JMenu opcPrac;
    private javax.swing.JMenu opcRank;
    private javax.swing.JMenu opcSug;
    private javax.swing.JMenu opcUA;
    public static org.edisoncor.gui.panel.Panel panelDeDatos;
    public static org.edisoncor.gui.panel.Panel panelProgreso;
    private javax.swing.JMenu salirOpc;
    // End of variables declaration//GEN-END:variables
}
