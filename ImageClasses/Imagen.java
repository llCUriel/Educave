package clasesImagen;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagen {

    private String linkDeImagen;
    private JLabel dondeImprimir;
    private Image ImagenSeleccionada;
    private ImageIcon ImagenEscalada;

    public Imagen(String linkDeImagen, JLabel dondeImprimir) {
        this.linkDeImagen = linkDeImagen;
        this.dondeImprimir = dondeImprimir;
    }

    public Imagen() {
        linkDeImagen = "";
        dondeImprimir = null;
    }

    protected void finalize() {
        linkDeImagen = null;
        dondeImprimir = null;
        ImagenSeleccionada = null;
        ImagenEscalada = null;
        System.gc();
    }

    public String toString() {
        return "Imagen{linkDeImagen=" + linkDeImagen + ", dondeImprimir=" + dondeImprimir + ", ImagenSeleccionada=" + ImagenSeleccionada + ", ImagenEscalada=" + ImagenEscalada + '}';
    }

    public Image retornarValor(String linkDeImagen) {
        ImagenSeleccionada = Toolkit.getDefaultToolkit().getImage(linkDeImagen).getScaledInstance(dondeImprimir.getWidth(), dondeImprimir.getHeight(), 0);
        return ImagenSeleccionada;
    }

    public void mostrarImagen() {
        ImagenSeleccionada = Toolkit.getDefaultToolkit().getImage(linkDeImagen).getScaledInstance(dondeImprimir.getWidth(), dondeImprimir.getHeight(), 0);
        ImagenEscalada = new ImageIcon(ImagenSeleccionada);
        dondeImprimir.setIcon(ImagenEscalada);
    }

    public Image convertirLigaAImagen(String link) {
        return Toolkit.getDefaultToolkit().getImage(link);
    }

    public javax.swing.Icon escalarImagen(JLabel dondeImprimir, Image imagenSeleccionada) {
        imagenSeleccionada = imagenSeleccionada.getScaledInstance(dondeImprimir.getWidth(), dondeImprimir.getHeight(), 0);
        return new ImageIcon(imagenSeleccionada);
    }

    public void mostrarImagen(JLabel dondeImprimir, String linkDeImagen) {
        ImagenSeleccionada = Toolkit.getDefaultToolkit().getImage(linkDeImagen).getScaledInstance(dondeImprimir.getWidth(), dondeImprimir.getHeight(), 0);
        ImagenEscalada = new ImageIcon(ImagenSeleccionada);
        dondeImprimir.setIcon(ImagenEscalada);
    }

    public javax.swing.Icon escalarImagen(int x, int y, Image imagenSeleccionada) {
        imagenSeleccionada = imagenSeleccionada.getScaledInstance(x, y, 0);
        return new ImageIcon(imagenSeleccionada);
    }

    public Image getImagenSeleccionada() {
        return ImagenSeleccionada;
    }

    public void setImagenSeleccionada(Image ImagenSeleccionada) {
        this.ImagenSeleccionada = ImagenSeleccionada;
    }
}
