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
    //cuello
    Color pielcuello = new Color(167,129,133);
    int [] pielx = {
        125,133,150,159,155,128
    };
    int [] piely = {
        165,171,172,171,158,157
    };
    g.setColor(pielcuello);
    g.fillPolygon(pielx, piely, 6);
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
             260,254,243,223,197,163,169,174,189,219,
             254,245,224,207,173,166,142,142,145,155,
             173,199,218,235,244,276,283,287,289,294,
             303,317,333,352,374,367,366,369,385
        };
        g.setColor(marronchamarra);
        g.fillPolygon(chx,chy,49);
        g.setColor(Color.BLACK);
        g.drawPolygon(chx,chy,49);
        
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
        Color letra = new Color(246,219,176);
        int [] bx = {
            166,162,163,169,166,166,173,196,203,203,
            201,197,205,205,199,186,180,173
        };
        int [] by = {
            241,239,223,193,192,185,180,179,187,198,
            202,207,216,228,235,240,242,242
        };        
        g.setColor(letra);
        g.fillPolygon(bx, by, 17);
        g.setColor(Color.BLACK);
        g.drawPolygon(bx, by, 17);
        
        int [] bx2 = {
            167,165,165,172,168,168,173,180,196,200,
            200,194,191,194,197,202,202,193,186,179,175,167
        };
        int [] by2 = {
            238,236,224,191,190,186,184,182,182,187,
            198,207,208,209,210,218,228,235,237,239,239,239
        };
        g.setColor(letra);
        g.fillPolygon(bx2, by2, 22);
        g.setColor(Color.BLACK);
        g.drawPolygon(bx2, by2, 22);
        
        int []ba1x = {
         181,187,191,191,186,185,180,179,179
        };
        int []ba1y={
         190,190,192,196,201,202,202,200,193
        };
        g.setColor(letra);
        g.fillPolygon(ba1x, ba1y, 9);
        g.setColor(Color.BLACK);
        g.drawPolygon(ba1x, ba1y, 9);
         int []bb1x = {
        177,184,191,191,185,176,174
        };
        int []bb1y={
        214,215,218,224,229,229,228
        };
        g.setColor(letra);
        g.fillPolygon(bb1x, bb1y, 7);
        g.setColor(Color.BLACK);
        g.drawPolygon(bb1x, bb1y, 7);
        
        int []ba2x = {
         182,187,189,189,186,184,181,181
        };
        int []ba2y={
         192,193,194,196,198,199,199,194
        };
        g.setColor(marronchamarra);
        g.fillPolygon(ba2x, ba2y, 8);
        g.setColor(Color.BLACK);
        g.drawPolygon(ba2x, ba2y, 8);
        int []bb2x = {
        177,177,179,185,188,188,184,176
        };
        int []bb2y={
        226,221,216,217,220,223,226,227
        };
        g.setColor(marronchamarra);
        g.fillPolygon(bb2x, bb2y, 7);
        g.setColor(Color.BLACK);
        g.drawPolygon(bb2x, bb2y, 7);
        
        int [] zipx={
            144,143,141,142,144,143,146
        };
        int [] zipy={
            253,304,312,328,344,365,369
        };
        g.setColor(Color.BLACK);
        g.drawPolyline(zipx, zipy, 7);
        
        int[] elasx={
            95,112,144,149,220,247
        };
        int [] elasy={
            366,354,344,343,343,353
        };
        g.drawPolyline(elasx,elasy, 6);
    //playera
        Color azulplayera = new Color(41, 202, 210);
        Color azulplayera2 = new Color(6, 146, 162);
        int [] play1x = {
            148,143,144,148,151,151,152,152
        };
        int [] play1y = {
            224,215,170,169,169,179,191,207
        };
        g.setColor(azulplayera);
        g.fillPolygon(play1x, play1y, 8);
        int [] play2x = {
            143,142,138,137,133,126,126,132,136,144,
            144,147,148
        };
        int [] play2y = {
            253,241,220,193,185,175,163,168,169,169,
            213,223,244
        };
        g.setColor(azulplayera2);
        g.fillPolygon(play2x, play2y, 13);
        g.setColor(Color.BLACK);
        
        int [] cuellox={
            125,125,132,135,151,151,148,134,131,
        };
        int [] cuelloy={
            167,163,168,169,169,173,173,173,171,
        };
        
        g.drawPolygon(cuellox,cuelloy, 9);
        int [] cuellochamarrax ={
            151,172,181
        };
        int [] cuellochamarray ={
            173,156,142
        };
        
        int [] sombrax = {
            151,162,170,178,185,188,222,221,228,214,190,173,151
        };
        int [] sombray = {
            173,172,167,163,158,153,152,146,147,145,142,143,161
        };
        Color sombra = new Color(137,86,123);
        g.setColor(sombra);
        g.fillPolygon(sombrax, sombray, 13);
        g.setColor(Color.BLACK);
        g.drawPolyline(cuellochamarrax, cuellochamarray, 3);
        
        
        
    }
}
