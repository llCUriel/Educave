package classVO;

import java.awt.Image;

public class UsuarioVO implements Comparable<UsuarioVO> {

    private Integer id_Usuario;
    private String Nick;
    private String Contrasena;
    private String Apaterno;
    private String Amaterno;
    private String correoElectronico;
    private String resultado;
    private String ruta;
    private Image imagen;
    private int progresoEnEducueva;

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public UsuarioVO(Integer id_Usuario, String Nick, String Contrasena, String Apaterno, String Amaterno, String correoElectronico, int progresoEnEducueva, String ruta) {
        this.id_Usuario = id_Usuario;
        this.Nick = Nick;
        this.Contrasena = Contrasena;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.correoElectronico = correoElectronico;
        this.progresoEnEducueva = progresoEnEducueva;
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "UsuarioVO{" + "id_Usuario=" + id_Usuario + ", Nick=" + Nick + ", Contrasena=" + Contrasena + ", Apaterno=" + Apaterno + ", Amaterno=" + Amaterno + ", correoElectronico=" + correoElectronico + ", progresoEnEducueva=" + progresoEnEducueva + ", resultado=" + resultado + ", ruta=" + ruta + ", imagen=" + imagen + '}';
    }

    public UsuarioVO() {
        this.id_Usuario = 0;
        this.Nick = "";
        this.Contrasena = "";
        this.Apaterno = "";
        this.Amaterno = "";
        this.correoElectronico = "";
        this.progresoEnEducueva = 0;
        this.ruta = "";
    }

    public Integer getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Integer id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNick() {
        return Nick;
    }

    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public float getProgresoEnEducueva() {
        return progresoEnEducueva;
    }

    public void setProgresoEnEducueva(int progresoEnEducueva) {
        this.progresoEnEducueva = progresoEnEducueva;
    }

    @Override
    public int compareTo(UsuarioVO o) {
        if (progresoEnEducueva < o.progresoEnEducueva) {
            return -1;
        }
        if (progresoEnEducueva > o.progresoEnEducueva) {
            return 1;
        }
        return 0;
    }
}
