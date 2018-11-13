package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class manchas extends JPanel {
    public manchas()
    {
        
    }
    
    public void paint(Graphics g)
    {
        Color rojomancha = new Color(190,29,60);
        //brazo
        int [] m1x = {
          245,244,247,249,248,  
        };
        int [] m1y = {
          216,217,221,222,218,
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m1x, m1y, 5);
        g.setColor(rojomancha);
        g.fillPolygon(m1x, m1y, 5);
        
         int [] m2x = {
        263,265,267,267,264,263, 
        };
        int [] m2y = {
        238,238,241,244,243,242,
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m2x, m2y, 5);
        g.setColor(rojomancha);
        g.fillPolygon(m2x, m2y, 5);
        
         int [] m3x = {
          270,270,273,272,271
        };
        int [] m3y = {
          250,253,254,251,250
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m3x, m3y, 5);
        g.setColor(rojomancha);
        g.fillPolygon(m3x, m3y, 5);
        
        g.setColor(Color.BLACK);
        g.drawOval(272,261,5,5);
        g.setColor(rojomancha);
        g.fillOval(272, 261, 5, 5);
        
        g.setColor(Color.BLACK);
        g.drawOval(260,265,3,3);
        g.setColor(rojomancha);
        g.fillOval(260, 265, 3, 3);
        
        g.setColor(Color.BLACK);
        g.drawOval(261,269,3,3);
        g.setColor(rojomancha);
        g.fillOval(261, 269, 3, 3);
        
        int [] m4x = {
          279,282,284,284,281,279,278,278,279,
        };
        int [] m4y = {
          282,282,285,287,290,290,289,287,286,
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m4x, m4y, 5);
        g.setColor(rojomancha);
        g.fillPolygon(m4x, m4y, 5);
        
        g.setColor(Color.BLACK);
        g.drawOval(285,295,5,7);
        g.setColor(rojomancha);
        g.fillOval(285,295,5,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(263,301,5,6);
        g.setColor(rojomancha);
        g.fillOval(263,301,5,6);
        
    }
    
}
