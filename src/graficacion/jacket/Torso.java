package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Torso extends JPanel {
public Torso()
{

}

public void paint(Graphics g){
        Graphics2D g2d=(Graphics2D)g;
//torso
    //chamarra
        Color marronchamarra = new Color(169, 87, 101);
        int [] chx = {
              95, 95, 88, 89, 87, 87, 89, 87, 87, 90,
              90, 88, 86, 80, 81,122,125,125,136,138,
             143,147,147,152,151,152,175,214,233,218,
             211,211,215,222,226,239,240,242,241,241,
             246,246,247,247,249,218,156,144,95
        };
        int [] chy = {
             384,368,361,348,341,297,295,291,274,268,
             260,254,243,223,197,162,169,174,189,219,
             254,245,224,207,173,166,142,142,145,155,
             173,199,218,235,244,276,283,287,289,294,
             303,317,333,352,374,367,366,369,385
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(chx,chy,49);
        g.setColor(marronchamarra);
        g.fillPolygon(chx,chy,49);
        
    //botones
        Color boton = new Color(222,139,125);
        //boton 1
        g.setColor(Color.BLACK);
        g.drawOval(155, 178, 5, 5);
        g.setColor(boton);
        g.fillOval(155, 178, 5, 5);
         //boton 2
        g.setColor(Color.BLACK);
        g.drawOval(155, 210, 5, 5);
        g.setColor(boton);
        g.fillOval(155, 210, 5, 5);
        //boton 3
        g.setColor(Color.BLACK);
        g.drawOval(152, 242, 5, 5);
        g.setColor(boton);
        g.fillOval(152, 242, 5, 5);
        //boton 4
        g.setColor(Color.BLACK);
        g.drawOval(137, 261, 2, 8);
        g.setColor(boton);
        g.fillOval(137, 261, 2, 8);
        //boton 5
        g.setColor(Color.BLACK);
        g.drawOval(136, 291, 5, 6);
        g.setColor(boton);
        g.fillOval(136, 291, 5, 6);
        //boton 6
        g.setColor(Color.BLACK);
        g.drawOval(135, 317, 5, 6);
        g.setColor(boton);
        g.fillOval(135, 317, 5, 6);
    //bolsillos
        //bolsillo derecho
        Color chammaracrema = new Color(239,203,189);
        int [] bdx = {
        225,220,197,177,185,203,224,225
        };
        int [] bdy = {
        312,311,296,271,270,290,304,311
        };
        int [] bdlx = {
            222,219,200,183
        };
        int [] bdly = {
            308,307,292,273
        };        
        g.setColor(chammaracrema);
        g.fillPolygon(bdx,bdy,8);
        g.setColor(Color.BLACK);
        g.drawPolygon(bdx, bdy, 8);
        g.drawPolyline(bdlx, bdly, 4);
        
        //bolsillo izquierdo
         int [] bix = {
        94,95,97,110,110,107,97,92,90,90
        };
        int [] biy = {
        333,325,318,285,281,282,301,316,326,333
        };
        int [] bilx = {
            107,98,93,91
        };
        int [] bily = {
            285,304,322,331
        };
        g.setColor(chammaracrema);
        g.fillPolygon(bix,biy,10);
        g.setColor(Color.BLACK);        
        g.drawPolygon(bix, biy, 10);
        g.drawPolyline(bilx, bily, 4);
        
        //letra B
        
    //playera
        Color azulplayera = new Color(56, 119, 196);
    }
}
