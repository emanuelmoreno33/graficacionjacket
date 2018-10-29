package Graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 *
 * @author Usuario
 */
class degradadoHorizontal extends JPanel {

    public degradadoHorizontal() {
    }
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        //Creo el degradado horizontal con las
        //coordenadas (0,0) al (anchura del componente, 0)
        GradientPaint horizontalGradient = new GradientPaint (0,0, Color.RED, getWidth(),0,Color.BLUE);
        g2d.setPaint(horizontalGradient);
        g2d.fillRect(0,0, getWidth(), getHeight());
    }
}