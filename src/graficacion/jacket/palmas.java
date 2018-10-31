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
        Color amarillosol = new Color(14, 172, 184);
        g.setColor(amarillosol);
        //palma derecha
        int [] vx ={340,338,337,336,335,334,333,332,331,330,329,328,328,327,326,325,324,323,311,310,309,308,307,306,305,304,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,334,328,336,};
        int [] vy ={257,257,256,255,254,253,252,251,250,249,248,247,235,234,233,232,231,230,230,229,228,227,226,225,224,223,222,221,220,219,218,217,216,215,214,213,212,211,210,209,208,191,188,199,};
        g.fillPolygon(vx,vy,14);
    }
}
