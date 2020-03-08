package conexion;

import Fichero.LeeFichero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private Connection conectar;
    private LeeFichero miFichero;
    private String usuario;
    private String pass;
    private String bd;

    public ConexionBD(String usuario, String pass, String bd, LeeFichero miFichero) {
        this.miFichero = miFichero;
        this.usuario = usuario;
        this.pass = pass;
        this.bd = bd;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/" + bd, usuario, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public ConexionBD() {
        String liga = "src/Fichero/dat.txt";
        miFichero = new LeeFichero();
        usuario = miFichero.retornarUsuario(liga);
        pass = miFichero.retornarPas(liga);
        bd = "prueba";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/" + bd, usuario, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conectar;
    }

    public void desconectarBD() {
        conectar = null;
    }

}
