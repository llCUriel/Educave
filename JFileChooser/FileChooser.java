package JFileChooser;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class FileChooser {

    private JFileChooser ventanaImagen;
    private int opcion;
    private String rutaImagen;
    private Image ImagenSeleccionada;
    private ImageIcon ImagenEscalada;

    public FileChooser() {
        ventanaImagen = new JFileChooser();
        ventanaImagen.setCurrentDirectory(new java.io.File("src/fotografiasDePerfil"));
    }

    public void mostrarImagen(JLabel vent) {
        opcion = ventanaImagen.showDialog(ventanaImagen, "Selecciona una image, por favor.");
        if (opcion == 0) {
            rutaImagen = ventanaImagen.getSelectedFile().toString();
            ImagenSeleccionada = Toolkit.getDefaultToolkit().getImage(rutaImagen).getScaledInstance(vent.getWidth(), vent.getHeight(), 0);
            ImagenEscalada = new ImageIcon(ImagenSeleccionada);
            vent.setIcon(ImagenEscalada);
        }
    }

    public String getRuta() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

}
