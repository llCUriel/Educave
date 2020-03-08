package clasesImagen;

import javax.swing.JLabel;
import javax.swing.JTable;

public class imgTabla extends sun.swing.table.DefaultTableCellHeaderRenderer {

    public imgTabla() {
    }

    public java.awt.Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        if ((o instanceof JLabel)) {
            JLabel lbl = (JLabel) o;
            return lbl;
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
    }
}
