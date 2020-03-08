package paquete;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer {

    private JLabel lbl;

    public Render() {
        lbl = new JLabel();
    }

    protected void finalize() {
        lbl = null;
        System.gc();
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setHorizontalAlignment(SwingConstants.CENTER);
        if (value instanceof JLabel) {
            lbl = (JLabel) value;
            return lbl;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

}
