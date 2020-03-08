package paquete;

import java.awt.Color;

public class miHiloBarra extends Thread
{
  private PanelDeCirculoDeProgreso jp_progress;
  private int progreso;
  
  public void setProgreso(int progreso) {
    this.progreso = progreso;
  }
  
  public miHiloBarra(PanelDeCirculoDeProgreso jp_progress) {
    this.jp_progress = jp_progress;
  }
  
  public void run() {
    for (int i = 0; i <= progreso; i++) {
      try {
        jp_progress.setColor(elegirColor(i));
        jp_progress.updateProgress(i);
        jp_progress.repaint();
        Thread.sleep(70L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
  
  public Color elegirColor(int progreso) {
    Color aux = Color.BLUE;
    if (progreso <= 10) {
      aux = Color.RED;
    } else if ((progreso > 10) && (progreso <= 30)) {
      aux = Color.ORANGE;
    } else if ((progreso > 30) && (progreso <= 60)) {
      aux = Color.BLUE;
    } else {
      aux = Color.GREEN;
    }
    return aux;
  }
}