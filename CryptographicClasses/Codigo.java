package MD5;

import java.util.GregorianCalendar;
import java.util.Random;

public class Codigo {

    private String cadenaAleatoria;

    public Codigo() {
        cadenaAleatoria = "";
    }

    public String getCadenaAleatoria() {
        return cadenaAleatoria;
    }

    public String getCadenaAlfanumAleatoria(int longitud) {
        cadenaAleatoria = "";
        long milis = new GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
    }

}
