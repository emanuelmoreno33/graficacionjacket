package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Mascara extends JPanel{
    public Mascara()
    {
        
    }
    public void paint(Graphics g)
    {
        Color blancopluma = new Color(255,255,255);
        //plumas
        int [] plumax = {
            
        };
        int [] plumay = {
            
        };
        g.setColor(blancopluma);
        g.fillPolygon(plumax,plumay,1);
        g.drawPolygon(plumax, plumay,1);
        
    }
}

