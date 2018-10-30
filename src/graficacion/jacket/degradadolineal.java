package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class degradadolineal extends JPanel {
    public degradadolineal() {
    }
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        Color azulfuerte = new Color(7, 0, 162);
        Color rosafuerte = new Color(255, 0, 255);
        GradientPaint horizontalGradient = new GradientPaint (200,0,azulfuerte , 200,400,rosafuerte);
        g2d.setPaint(horizontalGradient);
        g2d.fillRect(0,0, 340, 610);
    }
}
