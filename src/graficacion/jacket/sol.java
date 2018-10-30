
package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class sol extends JPanel{
    public sol(){
    
}
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        Color amarillosol = new Color(251, 213, 86);
        g.setColor(amarillosol);
        g.fillOval(40, 62, 323, 323);
        
    }
}
