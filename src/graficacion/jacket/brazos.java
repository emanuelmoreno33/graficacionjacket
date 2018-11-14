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
public class brazos extends JPanel {
    public brazos(){
        
    }
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        //Brazo martillo
        //manga
        Color cremachamarra = new Color(246,219,176);
        int [] brx= {
            237,229,224,222,219,218,213,210,211,213,216,223,225,232,
            240,240,242,241,241,247,246,250,251,248,
            248,246,245,250,261,266,282,289,294,295,
            301,300,302,301,298,298,299,298,296,292,
            286,273,262,250,245,237,233,231
        };
        int [] bry = {
            147,148,149,151,157,157,167,183,198,213,224,236,244,262,
            276,284,287,290,296,303,316,324,333,334,
            350,356,365,371,366,365,365,370,379,384,
            376,347,340,321,301,280,277,275,256,243,
            226,195,175,160,154,147,146,146
        };
        g.setColor(cremachamarra);
        g.fillPolygon(brx,bry,52);
        g.setColor(Color.BLACK);
        g.drawPolygon(brx,bry,52);
        
        //puño de la chamarra
        Color marronchamarra = new Color(169, 87, 101);
        int [] pux = {
           250,260,265,281,285,287,290,294,294,293,
            290,287,282,276,274,260,257,253,250,248,248,249
        };
        int [] puy = {
           371,367,366,366,367,369,373,379,398,400,
           403,398,394,390,390,390,391,393,394,392,383,379
        };
        g.setColor(marronchamarra);
        g.fillPolygon(pux,puy,22);
        g.setColor(Color.BLACK);
        g.drawPolygon(pux,puy,22);
        
    }
}
