package graficacion.jacket;

import java.awt.AlphaComposite;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class lineasfondo  extends JPanel{
    public lineasfondo()
    {
        
    }
    public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
        Color linea11 = new Color(33, 57, 147);
        Color linea12 = new Color(73, 92, 132);
        GradientPaint horizontalGradient = new GradientPaint (100,0,linea11 , 200,0,linea12);
        g2d.setPaint(horizontalGradient);
        g2d.fillRect(0,0, 340, 23);
        
    }
}
