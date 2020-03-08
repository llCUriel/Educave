package paquete;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class PanelDeCirculoDeProgreso extends JPanel {

    private Graphics2D g2;
    private Arc2D.Float arc;
    private Ellipse2D elipse;
    private FontMetrics ft;
    private Rectangle2D r;
    private int progress = 0, x = 0, y = 0;
    private Color color;

    public void updateProgress(int progress_value) {
        progress = progress_value;
    }
    
    

    private void finalze() {
        g2 = null;
        arc = null;
        elipse = null;
        ft = null;
        r = null;
        System.gc();
    }

    public PanelDeCirculoDeProgreso() {
        arc = new Arc2D.Float(Arc2D.PIE);
        color = Color.BLUE;
    }

    public Image punt(String LINK) {
        Image ImagenSeleccionada2;
        ImagenSeleccionada2 = Toolkit.getDefaultToolkit().getImage(LINK);
        return ImagenSeleccionada2;

    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(punt("src/imagenes/fondo.png"), 0, 0, this);
        g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.translate(this.getWidth() / 2, this.getHeight() / 2);
        g2.rotate(Math.toRadians(270));
        elipse = new Ellipse2D.Float(0, 0, 50, 50);
        arc.setFrameFromCenter(new Point(0, 0), new Point(60, 60));
        elipse.setFrameFromCenter(new Point(0, 0), new Point(50, 50));
        arc.setAngleStart(1);
        arc.setAngleExtent(-progress * 3.6);
        g2.setColor(color);
        g2.draw(arc);
        g2.fill(arc);
        g2.setColor(Color.WHITE);
        g2.draw(elipse);
        g2.fill(elipse);
        g2.setColor(Color.BLACK);
        g2.rotate(Math.toRadians(90));
        g2.setFont(new Font("Verdana", Font.PLAIN, 20));
        ft = g2.getFontMetrics();
        r = ft.getStringBounds(progress + " % ", g);
        x = (0 - (int) r.getWidth()) / 2;
        y = (0 - (int) r.getHeight()) / 2 + ft.getAscent();
        g2.drawString(progress + "%", x + 10, y);
    }

}
