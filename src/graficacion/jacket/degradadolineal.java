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
        //Creo el degradado horizontal con las
        //coordenadas (0,0) al (anchura del componente, 0)
        GradientPaint horizontalGradient = new GradientPaint (200,0, Color.BLUE, 200,400,Color.PINK);
        g2d.setPaint(horizontalGradient);
        g2d.fillRect(0,0, 400, 600);
    }
}
