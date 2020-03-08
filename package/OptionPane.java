package paquete;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class OptionPane {

    private String linkDeImagen;
    private String mensaje;
    private String cabecera;
    private Icon guardado;
    private int r;
    private int g;
    private int b;

    public OptionPane(String linkDeImagen, int r, int g, int b, String mensaje, String cabecera, Icon guardado) {
        this.linkDeImagen = linkDeImagen;
        this.r = r;
        this.g = g;
        this.b = b;
        this.mensaje = mensaje;
        this.cabecera = cabecera;
        this.guardado = guardado;
    }

    public OptionPane() {
        this.linkDeImagen = "";
        this.r = 0;
        this.g = 0;
        this.b = 0;
        this.mensaje = "";
        this.cabecera = "";
        this.guardado = null;
    }

    public OptionPane(String linkDeImagen, int r, int g, int b, String mensaje, String cabecera) {
        this.linkDeImagen = linkDeImagen;
        this.r = r;
        this.g = g;
        this.b = b;
        this.mensaje = mensaje;
        this.cabecera = cabecera;
        this.guardado = null;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "linkDeImagen=" + linkDeImagen + ", r=" + r + ", g=" + g + ", b=" + b + ", mensaje=" + mensaje + ", cabecera=" + cabecera + ", guardado=" + guardado + '}';
    }

    public void enviarMensaje() {
        guardado = new ImageIcon(linkDeImagen);
        new UIManager();
        UIManager.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UIManager.put("Panel.background", new ColorUIResource(255, 255, 255));
        JOptionPane.showMessageDialog(null, cabecera, mensaje, JOptionPane.INFORMATION_MESSAGE, guardado);
    }

    public void enviarMensaje(String linkDeImagen, int r, int g, int b, String mensaje, String cabecera) {
        guardado = new ImageIcon(linkDeImagen);
        new UIManager();
        UIManager.put("OptionPane.background", new ColorUIResource(r, g, b));
        UIManager.put("Panel.background", new ColorUIResource(r, g, b));
        JOptionPane.showMessageDialog(null, cabecera, mensaje, JOptionPane.INFORMATION_MESSAGE, guardado);
    }

}
