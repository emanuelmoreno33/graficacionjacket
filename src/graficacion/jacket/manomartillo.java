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
        g.setColor(Color.BLACK);
        g.drawPolygon(mangox, mangoy, 9);
        
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
        g.setColor(Color.BLACK);
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
        g.setColor(Color.BLACK);
        g.drawPolygon(dedox, dedoy, 13);
        
        //cabeza del martillo
        int [] cabezax = {
          246,242,240,236,233,231,229,225,217,217,
          216,215,216,217,215,215,214,212,206,206,
          208,212,216,219,224,227,230,232,234,236,
          236,237,241,245,252,257,262,264,272,272,
          271,263,258,257,256,258,251
        };
        int [] cabezay = {
          429,428,424,416,409,402,386,385,389,408,
          401,390,401,406,400,396,390,390,393,408,
          423,438,453,462,473,473,475,477,479,482,
          489,493,503,507,507,506,503,502,495,492,
          488,474,469,466,457,455,441
        };
        g.setColor(cabezamartillo);
        g.fillPolygon(cabezax, cabezay,47);
        g.setColor(Color.BLACK);
        g.drawPolygon(cabezax, cabezay, 47);
        
        //mango del martillo parte superior
        int [] mango2x = {
        238,238,237,235,230,225,221,220,220,221,
        221,222,222,223,224,229,231,235
        };
        int [] mango2y = {
        466,455,450,445,440,440,444,455,453,454,
        458,458,461,461,463,468,469,470
        };
        g.setColor(mangomartillo);
        g.fillPolygon(mango2x,mango2y,18);
        g.setColor(Color.BLACK);
        g.drawPolygon(mango2x, mango2y, 18);
        
    }
}
