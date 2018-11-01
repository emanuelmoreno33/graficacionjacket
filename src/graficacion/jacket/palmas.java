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
        //palma derecha
        int [] vx ={340,338,333,330,330,325,320,316,
            309,296,293,288,281,264,
            275,283,281,295,314,299,283,275,
            296,318,284,295,303,312,304,305,295,288,299,301,304,314,324,321,
            321,328,324,326,330,329,340,340,332,338,337,337,340
            };
        int [] vy ={480,480,477,472,465,462,462,458,
            465,473,469,477,481,482,
            467,465,462,450,442,440,438,429,
            420,420,408,401,401,404,396,392,390,384,382,387,385,392,403,393,
            384,384,370,357,356,350,333,349,368,369,382,395,384
            };
        g.fillPolygon(vx,vy,51);
        
    }
}
