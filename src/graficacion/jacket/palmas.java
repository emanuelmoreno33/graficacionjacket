package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class palmas extends JPanel{
    public palmas()
    {
    }
     public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        Color azulpalma = new Color(30, 232, 242);
        g.setColor(azulpalma);
        int [] vx ={340,338,332,330,330,325,323};
        int [] vy ={490,480,475,469,460,457,447};
        g.fillPolygon(vx,vy,3);
        
    }
}
