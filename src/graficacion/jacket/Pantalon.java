package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Pantalon extends JPanel{
    public Pantalon(){
    
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d=(Graphics2D)g;
     //pantalon
        //completo
        Color azulpantalon = new Color(56, 119, 196);
        int [] vx = { 46, 54, 56, 61, 60, 67, 74, 76, 87, 87,
                      89, 96,147,161,218,254,260,272,275,291,
                     294,295,302,309,314,326,227,223,222,217,
                     204,198,197,175,143,139,139,135
        };
        int [] vy = {610,593,563,554,543,528,477,474,426,421,
                     418,385,369,367,367,380,412,452,467,519,
                     525,536,549,565,581,610,610,603,590,580,
                     532,520,512,456,554,582,598,610
        };        
        g.setColor(azulpantalon);
        g.fillPolygon(vx,vy,38);
        g.setColor(Color.BLACK);
        g.drawPolygon(vx, vy, 38);
        //zipper
        int [] zipperx = {
        158,149,145,144,156,158,162,162
        };
        int [] zippery ={
        431,417,406,373,371,404,415,424
        };
        g.drawPolygon(zipperx, zippery, 8);
        
        //cinturon
        int [] cintox = {
         96,108,149,164,181,210,248,248,211,167,
         136,108, 95  
        };
        int [] cintoy = {
        389,385,371,369,368,369,377,370,363,362,
        367,376,381
        };
        g.drawPolygon(cintox, cintoy,13);
        g.fillPolygon(cintox, cintoy, 13);
        int [] hevillax = {
            139,166,167,139
        };
        int [] hevillay = {
            377,372,359,362
        };
        g.setColor(Color.GRAY);
        g.drawPolygon(hevillax, hevillay,4);
        g.fillPolygon(hevillax, hevillay, 4);
        int [] hevilla2x = {
            143,164,164,143
        };
        int [] hevilla2y = {
            374,370,362,364
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(hevilla2x, hevilla2y,4);
        g.fillPolygon(hevilla2x, hevilla2y, 4);
        
        g.drawLine(158,430,168,441);
        int[] panx = {
            174,173,168,167
        };
        int [] pany = {
            455,451,439,432
        };
        g.drawPolyline(panx, pany,4);
        
        int [] trab1x = {
            104,104,108,108
        };
        int [] trab1y = {
            388,375,375,388
        };
        int [] trab2x = {
            127,128,132,132
        };
        int [] trab2y = {
            381,372,371,381
        };
        
        int [] trab3x = {
            178,178,182,182
        };
        int [] trab3y = {
            372,362,362,371
        };
        int [] trab4x = {
            207,207,212,211
        };
        int [] trab4y = {
            374,364,361,372
        };
        g.setColor(azulpantalon);
        g.fillPolygon(trab1x, trab1y, 4);
        g.fillPolygon(trab2x, trab2y, 4);
        g.fillPolygon(trab3x, trab3y, 4);
        g.fillPolygon(trab4x, trab4y, 4);
        
        g.setColor(Color.BLACK);
        g.drawLine(139,378,131,396);
        g.drawLine(153,376,153,380);
        g.drawLine(152,383,152,386);
        g.drawLine(153,390,153,392);
        g.drawLine(153,395,154,399);
        g.drawLine(154,402,155,405);
        g.drawLine(156,408,157,412);
        g.drawLine(158,414,158,417);
        g.drawLine(159,420,159,422);
        g.drawLine(156,385,164,394);
        g.drawLine(162,373,169,385);
        g.drawLine(172,370,179,378);
        g.drawLine(196,370,201,382);
        g.drawLine(158,404,181,416);
        g.drawLine(144,406,129,412);
        g.drawLine(143,430,127,440);
        g.drawLine(89,419,104,419);
        g.drawLine(162,434,122,456);
        g.drawLine(150,438,139,456);
        g.drawLine(76,474,91,483);
        
        
         Color luzrosa = new Color(255,121,255);
         int [] luzx1 = {
           237,224,230,236,241,235,236,241,263  
         };
         int [] luzy1 = {
           375,379,384,383,388,399,405,409,380
         };
         g.setColor(luzrosa);
         g.fillPolygon(luzx1, luzy1,9);
         
         int [] luzx2 = {
             270,265,268,273,276,272,270,284,286,259,
             276,257,278,288,233,320,279,326
         };
         int [] luzy2 = {
             453,465,480,481,502,506,520,518,521,532,
             533,545,545,549,579,597,610,610
         };
         g.setColor(luzrosa);
         g.fillPolygon(luzx2, luzy2,18);
         
}
}