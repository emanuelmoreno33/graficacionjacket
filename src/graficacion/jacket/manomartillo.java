package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 *
 * @author Maxcel Center
 */
public class manomartillo  extends JPanel {
    public manomartillo()
    {
        
    }
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        Color blancovenda = new Color(235,235,235);
        Color mano = new Color(243,204,175);
        Color mangomartillo = new Color(156,97,65);
        Color cabezamartillo = new Color(179,176,204);
        
        //mango del martillo
        int [] mangox = {
        247,250,296,299,301,302,302,302,256,   
        };
        int [] mangoy = {
        431,431,401,402,404,406,411,412,450,
        };
        g.setColor(mangomartillo);
        g.fillPolygon(mangox,mangoy,9);
        
        //venda
        int manox [] = {
            251,260,261,277,281,284,290,299,285,273,
            264,257,256,267,267,264,262,259,257,253,
            250,245,247
        };
        int manoy [] = {
            395,391,390,390,392,394,401,434,446,450,
            452,455,450,439,431,426,423,418,414,412,
            411,411,403
        };
        g.setColor(blancovenda);
        g.fillPolygon(manox,manoy,23);
        g.drawPolygon(manox, manoy,23);
        
        //dedo
        int[] dedox = {
        246,250,254,256,257,259,261,261,247,245,244,243,
        243
        };
        int [] dedoy = {
        410,411,412,414,415,418,422,425,431,429,424,422,
        414
        };
        g.setColor(mano);
        g.fillPolygon(dedox, dedoy,13);
        
        //cabeza del martillo
        int [] cabezax = {
          246,242,240,236,233,231,229,225,217,217,216,215,  
        };
        int [] cabezay = {
          429,428,424,416,409,402,386,385,389,408,401,390,
        };
        
        
        
    }
}
