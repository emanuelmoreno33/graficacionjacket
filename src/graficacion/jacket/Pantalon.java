package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Pantalon extends JPanel{
    public Pantalon(){
    
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d=(Graphics2D)g;
        //pantalon
        Color azulpantalon = new Color(56, 119, 196);
        int [] vx = { 46, 54, 56, 61, 60, 67, 74, 76, 87, 87,
                      89, 96,147,161,218,254,260,272,275,291,
                     294,295,302,309,314,326,227,223,222,217,
                     204,198,197,175,143,139,139,135
        };
        int [] vy = {610,593,563,554,543,528,477,474,426,421,
                     418,385,369,367,367,380,412,452,467,519,
                     525,536,549,565,581,610,610,603,590,580,
                     532,520,512,456,554,582,598,610
        };        
        g.setColor(azulpantalon);
        g.fillPolygon(vx,vy,38);
        g.setColor(Color.BLACK);
        g.drawPolygon(vx, vy, 38);
    }
}
