package paquete;

import javax.swing.GroupLayout;

public class SplashScreen extends javax.swing.JFrame implements Runnable {

    private Thread tiempo;
    public static Principal princ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.icm.components.metro.ProgressBarHorizontalMetroICM progressBarHorizontalMetroICM1;

    public SplashScreen() {
        initComponents();
        tiempo = null;
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("logo2.png")).getImage());
        setLocationRelativeTo(null);
        tiempo = new Thread(this);
        tiempo.start();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        progressBarHorizontalMetroICM1 = new com.icm.components.metro.ProgressBarHorizontalMetroICM();

        setDefaultCloseOperation(3);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.png")));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36));
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("C a r g a n d o ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cargando.gif")));

        progressBarHorizontalMetroICM1.setBackground(new java.awt.Color(255, 255, 255));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progressBarHorizontalMetroICM1, -2, 0, 32767))
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING));

        jPanel1Layout.setVerticalGroup(jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2, -1, -1, 32767)
                                                .addComponent(jLabel3, -1, -1, 32767))
                                        .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(progressBarHorizontalMetroICM1, -2, -1, -2)
                                        .addGap(20, 20, 20)))));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, -2, -1, -2));

        layout.setVerticalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, 32767)
                        .addComponent(jPanel1, -2, -1, -2)));

        pack();
    }

    public void run() {
        while (tiempo != null) {
            try {
                Thread.sleep(10000L);
                dispose();
                princ = new Principal();
                princ.setVisible(true);
                tiempo.stop();
                Thread.sleep(5000L);
            } catch (InterruptedException ex) {
            }
        }
        tiempo = null;
    }
}
