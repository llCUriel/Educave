package paquete;

import Aplicacion.*;
import Sonido.Sonido;
import clasesImagen.Imagen;
import classDAO.UsuarioDAO;
import classVO.UsuarioVO;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Ranking extends javax.swing.JInternalFrame {

    private Sonido sound;
    private boolean sesionActiva;
    private UsuarioDAO usDao;
    private Imagen img;
    private int numeroDePart;

    public boolean getsesionActiva() {
        return sesionActiva;
    }

    public Ranking() {
        initComponents();
        numeroDePart = 0;
        img = new Imagen();
        usDao = new UsuarioDAO();
        sound = new Sonido();
        inicializarComponentes();
        buscaGeneral();
    }

    public void buscaGeneral() {
        jtb.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel modelo = new DefaultTableModel();
        jtb.setFont(new Font("Serif", Font.BOLD, 30));
        modelo.addColumn("N.");
        modelo.addColumn("Imagen.");
        modelo.addColumn("Usuario.");
        modelo.addColumn("Progreso.");
        jtb.setModel(modelo);
        Object[] arrUsuarios = new Object[4];
        ArrayList<UsuarioVO> arrayUsuario = usDao.getListUsuario();
        Comparator<UsuarioVO> comparador = Collections.reverseOrder();
        Collections.sort(arrayUsuario, comparador);
        for (UsuarioVO user : arrayUsuario) {
            numeroDePart++;
            arrUsuarios[0] = numeroDePart;
            arrUsuarios[1] = new JLabel(img.escalarImagen(68, 68, user.getImagen()));
            arrUsuarios[2] = user.getNick();
            arrUsuarios[3] = user.getProgresoEnEducueva() + " % ";
            modelo.addRow(arrUsuarios);
        }
        jtb.setRowHeight(68);
        jtb.getColumnModel().getColumn(0).setPreferredWidth(15);
        jtb.getColumnModel().getColumn(1).setPreferredWidth(15);
        jtb.getColumnModel().getColumn(2).setPreferredWidth(435);
        jtb.getColumnModel().getColumn(2).setPreferredWidth(435);
        jtb.setModel(modelo);
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

    public void emitirMouseEncima() {
        sound.emitirSonido("src/archivosAudio/over.wav");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel4 = new org.edisoncor.gui.panel.Panel();
        buttonMetroICM1 = new com.icm.components.metro.ButtonMetroICM();
        jLabel1 = new javax.swing.JLabel();
        labelMetroICM2 = new com.icm.components.metro.LabelMetroICM();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb = new com.icm.components.metro.TableMetroICM();

        setMaximumSize(new java.awt.Dimension(1000, 604));
        setMinimumSize(new java.awt.Dimension(1000, 604));
        setPreferredSize(new java.awt.Dimension(1000, 604));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cup.png"))); // NOI18N

        labelMetroICM2.setForeground(new java.awt.Color(255, 255, 255));
        labelMetroICM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMetroICM2.setText("Ranking.");

        jtb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtb);

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelMetroICM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(434, 434, 434))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(459, 459, 459))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetroICM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonMetroICM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void buttonMetroICM1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMetroICM1MouseEntered
        emitirMouseEncima();
    }//GEN-LAST:event_buttonMetroICM1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.icm.components.metro.ButtonMetroICM buttonMetroICM1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.icm.components.metro.TableMetroICM jtb;
    private com.icm.components.metro.LabelMetroICM labelMetroICM2;
    private org.edisoncor.gui.panel.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
