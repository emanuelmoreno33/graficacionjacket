
package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author leonardo
 */
public class palmaTemporal extends JPanel{
    
    public palmaTemporal() {
    
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Color verdePalma = new Color(30, 232, 242);
        g.setColor(verdePalma);
        int [] vx = {};
        int [] vy = {};
        g.fillPolygon(vx, vy, 3);
    }
    
}
