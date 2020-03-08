package Fichero;

import java.io.*;

public class LeeFichero {

    private File archivo;
    private FileReader fr;
    private BufferedReader br;
    private String linea;

    public LeeFichero(File archivo, FileReader fr, BufferedReader br, String linea) {
        this.archivo = archivo;
        this.fr = fr;
        this.br = br;
        this.linea = linea;
    }

    public LeeFichero() {
        this.archivo = null;
        this.fr = null;
        this.br = null;
        this.linea = "";
    }

    @Override
    public String toString() {
        return "LeeFichero{" + "archivo=" + archivo + ", fr=" + fr + ", br=" + br + ", linea=" + linea + '}';
    }

    public String retornarPas(String liga) {
        char[] aux = retornarContenido(liga).toCharArray();
        String retorno = "";
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] == '|') {
                for (int j = i + 1; j < aux.length; j++) {
                    retorno += aux[j];
                }
                break;
            }
        }
        if (retorno == null || retorno.equalsIgnoreCase("")) {
            return "";
        } else {
            return retorno;
        }
    }

    public String retornarUsuario(String liga) {
        char[] aux = retornarContenido(liga).toCharArray();
        String retorno = "";
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] != '|') {
                retorno += aux[i];
            } else {
                break;
            }
        }
        return retorno;
    }

    public String retornarContenido(String liga) {
        String rpo = "";
        try {
            archivo = new File(liga);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                rpo += linea;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return rpo;
    }
}
