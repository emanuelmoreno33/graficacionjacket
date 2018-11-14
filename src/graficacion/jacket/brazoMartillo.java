
package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author leonardo
 */
public class brazoMartillo extends JPanel {
    
    public brazoMartillo() {
    
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        
        //Brazo izquierda
        Color brazoChamarra = new Color(246,219,176);
        int [] brazoMx = {81,76,74,73,73,72,72,73,74,
                          74,73,72,72,71,71,73,74,74,74,
                          72,72,73,72,71,69,70,66,65,63,
                          61,61,59,59,58,57,55,54,63,75,
                          87,92,94,96,96,96,88};
        
        int [] brazoMy = {197,208,213,219,256,260,266,266,270,
                          276,278,280,284,284,281,289,291,293,295,
                          297,299,302,304,305,306,319,326,329,336,
                          342,348,350,354,357,363,370,374,395,395,
                          399,402,397,390,384,372,192};
        
        g.setColor(brazoChamarra);
        g.fillPolygon(brazoMx,brazoMy,46);
        g.setColor(Color.BLACK);
        g.drawPolygon(brazoMx,brazoMy,46);
    
    }
}
