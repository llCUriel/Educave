package classDAO;

import clasesImagen.Imagen;
import classVO.UsuarioVO;
import conexion.ConexionBD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO implements IUsuarioDAO {

    private ConexionBD cc;
    private String resul;
    private Imagen img;
    private String last;
    private Connection cn;
    private PreparedStatement pst;
    private FileInputStream fis;
    private File file;
    private String sql;
    private ResultSet rs;

    public UsuarioDAO(ConexionBD cc, String resul, String last, Connection cn, PreparedStatement pst, FileInputStream fis, File file, String sql, ResultSet rs) {
        this.cc = cc;
        this.resul = resul;
        this.last = last;
        this.cn = cn;
        this.pst = pst;
        this.fis = fis;
        this.file = file;
        this.sql = sql;
        this.rs = rs;
    }

    public UsuarioDAO() {
        cc = new ConexionBD();
        cn = cc.getConnection();
        img = new Imagen();
        resul = "";
        last = "";
        pst = null;
        fis = null;
        rs = null;
        sql = "";
    }

    @Override
    public String toString() {
        return "UsuarioDAO{" + "cc=" + cc + ", resul=" + resul + ", last=" + last + ", cn=" + cn + ", pst=" + pst + ", fis=" + fis + ", file=" + file + ", sql=" + sql + ", rs=" + rs + '}';
    }

    protected void finalize() {
        cc = null;
        resul = null;
        last = null;
        cn = null;
        pst = null;
        fis = null;
        file = null;
        sql = null;
        rs = null;
        System.gc();
    }

    public String registrarUsuario(UsuarioVO user) {
        sql = "INSERT INTO Usuario  (Nick,Contrasena,Apaterno,Amaterno,correoElectronico,progresoEnEducueva,imagenDePerfil)values(?,?,?,?,?,?,?)";
        try {
            file = new File(user.getRuta());
            fis = new FileInputStream(file);
            pst = cn.prepareStatement(sql);
            pst.setString(1, user.getNick());
            pst.setString(2, user.getContrasena());
            pst.setString(3, user.getApaterno());
            pst.setString(4, user.getAmaterno());
            pst.setString(5, user.getCorreoElectronico());
            pst.setInt(6, 0);
            pst.setBinaryStream(7, fis, (int) file.length());
            pst.execute();
            pst = cn.prepareStatement("SELECT MAX(id_Usuario) AS id FROM Usuario");
            rs = pst.executeQuery();
            if (rs.next()) {
                last = rs.getString(1);
            }
            resul = "Usuario registrado con Ã©xito, ID: " + last;
        } catch (SQLException ex) {
            resul = "Error en la consulta" + ex.getMessage();
        } catch (FileNotFoundException ex) {
            resul = "Error el cargar imagen. " + ex.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                resul = "Error:" + e;
            }
        }
        return resul;
    }

    public String actualizarUsuario(UsuarioVO user) {
        sql = "UPDATE Usuario SET Nick=?,Contrasena=?,Apaterno=?,Amaterno=?,correoElectronico=?,progresoEnEducueva=?,imagenDePerfil=? WHERE Nick=?";
        try {
            file = new File(user.getRuta());
            fis = new FileInputStream(file);
            pst = cn.prepareStatement(sql);
            pst.setString(1, user.getNick());
            pst.setString(2, user.getContrasena());
            pst.setString(3, user.getApaterno());
            pst.setString(4, user.getAmaterno());
            pst.setString(5, user.getCorreoElectronico());
            pst.setInt(6, (int) user.getProgresoEnEducueva());
            pst.setBinaryStream(7, fis, (int) file.length());
            pst.setBinaryStream(7, fis, (int) file.length());
            pst.setString(8, user.getNick());
            pst.execute();
            pst = cn.prepareStatement("SELECT MAX(id_Usuario) AS id FROM Usuario");
            rs = pst.executeQuery();
            if (rs.next()) {
                last = rs.getString(1);
            }
            resul = "Usuario registrado con éxito, ID: " + user.getId_Usuario();
        } catch (SQLException ex) {
            resul = "Error en la consulta" + ex.getMessage();
        } catch (FileNotFoundException ex) {
            resul = "Error el cargar imagen. " + ex.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                resul = "Error:" + e;
            }
        }
        return resul;
    }

    public UsuarioVO buscarUsuarioPorNick(String clave) {
        UsuarioVO user = new UsuarioVO();
        sql = "SELECT * FROM Usuario WHERE Nick=?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user.setId_Usuario(Integer.parseInt(rs.getString(1)));
                user.setNick(rs.getString(2));
                user.setContrasena(rs.getString(3));
                user.setApaterno(rs.getString(4));
                user.setAmaterno(rs.getString(5));
                user.setCorreoElectronico(rs.getString(6));
                user.setProgresoEnEducueva(Integer.parseInt(rs.getString(7)));
                Blob imagen = rs.getBlob("imagenDePerfil");
                user.setImagen(javax.imageio.ImageIO.read(imagen.getBinaryStream()));
            }
            user.setResultado("Busqueda exitosa.");
        } catch (SQLException ex) {
            user.setResultado("Error.");
        } catch (IOException ex) {
            user.setResultado("Error.");
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                user.setResultado("Error.");
            }
        }
        return user;
    }

    public String eliminarUsuario(String clave) {
        try {
            sql = "DELETE FROM Usuario WHERE Nick=?";
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            pst.executeUpdate();
            resul = "Usuario eliminado con Ã©xito";
        } catch (SQLException ex) {
            resul = "Error" + ex.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                resul = "Error" + e.getMessage();
            }
        }
        return resul;
    }

    public ArrayList<UsuarioVO> getListUsuario() {
        ArrayList<UsuarioVO> arrUser = new ArrayList<UsuarioVO>();
        UsuarioVO user = null;
        sql = "SELECT * FROM Usuario";
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                user = new UsuarioVO();
                user.setId_Usuario(Integer.parseInt(rs.getString(1)));
                user.setNick(rs.getString(2));
                user.setContrasena(rs.getString(3));
                user.setApaterno(rs.getString(4));
                user.setAmaterno(rs.getString(5));
                user.setCorreoElectronico(rs.getString(6));
                user.setProgresoEnEducueva(Integer.parseInt(rs.getString(7)));
                Blob imagen = rs.getBlob("imagenDePerfil");
                user.setImagen(javax.imageio.ImageIO.read(imagen.getBinaryStream()));
                arrUser.add(user);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return arrUser;
    }

    public UsuarioVO buscarUsuarioPorCorreo(String clave) {
        UsuarioVO user = new UsuarioVO();
        sql = "SELECT * FROM Usuario WHERE correoElectronico=?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user.setId_Usuario(Integer.parseInt(rs.getString(1)));
                user.setNick(rs.getString(2));
                user.setContrasena(rs.getString(3));
                user.setApaterno(rs.getString(4));
                user.setAmaterno(rs.getString(5));
                user.setCorreoElectronico(rs.getString(6));
                user.setProgresoEnEducueva(Integer.parseInt(rs.getString(7)));
                Blob imagen = rs.getBlob("imagenDePerfil");
                user.setImagen(javax.imageio.ImageIO.read(imagen.getBinaryStream()));
            }
            user.setResultado("Busqueda exitosa.");
        } catch (SQLException ex) {
            user.setResultado("Error.");
        } catch (IOException ex) {
            user.setResultado("Error.");
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                user.setResultado("Error.");
            }
        }
        return user;
    }
}
