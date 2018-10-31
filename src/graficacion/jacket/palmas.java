package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class palmas {
    public palmas()
    {
        
    }
    public void paint(Graphics g)
    {
        Color amarillosol = new Color(112, 46, 126);
        g.setColor(amarillosol);
        //palma izquierda
        int [] vx ={0  ,  0, 44, 44, 89, 89,139,139,286,286,325,325,340,340};
        int [] vy ={610,494,494,440,440,494,494,477,477,439,439,477,477,610};
        g.fillPolygon(vx,vy,14);
    }
}
