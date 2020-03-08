package Sonido;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sonido {

    private String liga;
    private InputStream in;
    private AudioStream audio;

    public Sonido(String liga) {
        try {
            this.liga = liga;
            in = new FileInputStream(liga);
            audio = new AudioStream(in);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Sonido() {
        this.liga = "";
        this.in = null;
        this.audio = null;
    }

    public void emitirSonido() {
        AudioPlayer.player.start(audio);
    }

    public void emitirSonido(String liga) {
        try {
            this.in = new FileInputStream(liga);
            this.audio = new AudioStream(in);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AudioPlayer.player.start(audio);
    }
}
