package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Mascara extends JPanel{
    public Mascara()
    {
        
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d;
        Color blancopluma = new Color(255,255,255);
        Color rojocrestabarbilla = new Color(230,68,83);
        Color amarillopico = new Color(249,161,53);
        Color azulojo = new Color(196,228,217);
        
        //plumas
        int [] plumax = {
            115,108, 97,107,101, 99, 97, 96,102,101,
            100,100, 99, 97,101,101,100,100, 99, 96,
             95, 98, 97,101,101,103,106,109,120,120,
            126,126,132,134,137,142,145,151,153,156,
            159,163,164,164,174,170,182,175,187,181,
            188,187,194,184,188,181,179,182,187,181,
            176,178,182,176,173,167,172,166,161,155,
            152,150,155,148,123
        };
        int [] plumay = {
             58, 63, 69, 69, 76, 80, 83, 91, 85, 91,
             97,104,109,115,109,138,140,145,148,154,
            156,154,165,157,163,170,165,172,163,166,
            160,167,160,167,163,171,161,167,160,168,
            159,167,164,156,156,151,151,143,142,139,
            139,137,137,127,127,117,110,116,119,108,
             93, 94, 97, 89, 86, 70, 70, 64, 60, 56,
             55, 54, 48, 51, 53
        };
        g.setColor(blancopluma);
        g.fillPolygon(plumax,plumay,75);
        g.setColor(Color.BLACK);
        g.drawPolygon(plumax, plumay,75);
        
        //barbilla
        
        int[] barbillax = {
        126,123,119,121,117,117,116,117,120,120,
        122,123,125,124,123,122,127,134,138,139,
        134,144,148,150,151,151,152,152,158,162,
        168,168,167,167,163,163,164,164,162,163,
        158,160,161,161,159,148,146,140
        };
        int [] baribllay = {
         86, 86, 93, 93,114,115,119,121,120,125,
        126,134,136,140,145,153,157,157,152,146,
        134,142,142,137,139,144,144,147,152,152,
        145,136,136,134,129,128,126,123,120,117,
        111,110,108,106,102, 84, 83, 82
        };        
        g.setColor(rojocrestabarbilla);
        g.fillPolygon(barbillax,baribllay,48);
        g.setColor(Color.BLACK);
        g.drawPolygon(barbillax, baribllay,48);
        
        //cresta
        
        int [] crestax = {
         115,116,116,117,117,119,121,121,122,122,
         123,123,124,124,129,133,135,140,140,138,
         138,139,139,137,130,126,126,123,119,118,
         118,117,117,116,116,115
        };
        int [] crestay = {
          57, 57, 59, 59, 62, 65, 67, 69, 70, 76,
          77, 81, 81, 83, 88, 88, 87, 81, 74, 71,
          59, 57, 50, 49, 43, 38, 35, 30, 30, 32,
          35, 35, 50, 51, 53, 54
        };
        g.setColor(rojocrestabarbilla);
        g.fillPolygon(crestax, crestay, 36);
        g.setColor(Color.BLACK);
        g.drawPolygon(crestax, crestay, 36);
        
        //pico
        
        int [] fondopicox = {
            129,150,150,143,129
        };
        int [] fondopicoy = {
            121,114,121,132,122
        };
        g.fillPolygon(fondopicox, fondopicoy, 4);
        
        int [] picox = {
          129,142,150,144,139,134,129,129,142  
        };
        int [] picoy = {
          121,127,115, 97, 92, 92, 97,121,128
        };
        g.setColor(amarillopico);
        g.fillPolygon(picox, picoy, 9);
        g.setColor(Color.BLACK);
        g.drawPolygon(picox, picoy, 9);
        
        int [] pico2x = {
        129,129,144,146,150,143,141
        };
        int [] pico2y = {
        122,123,136,136,119,131,130
        };
        
        g.setColor(amarillopico);
        g.fillPolygon(pico2x, pico2y, 7);
        g.setColor(Color.BLACK);
        g.drawPolygon(pico2x, pico2y, 7);
        
        g.setColor(azulojo);
        g.fillOval(108,90, 15, 24);
        g.setColor(Color.BLACK);
        g.drawOval(108,90, 15, 24);
        g.drawOval(110,93,10,18);
        g.fillOval(110,93,10,18);
        
        g.setColor(azulojo);
        g.fillOval(149,79, 15, 24);
        g.setColor(Color.BLACK);
        g.drawOval(149,79, 15, 24);
        g.drawOval(152,82,10,18);
        g.fillOval(152,82,10,18);
        
//       int [] ojox = {
//           149,150,151,152,153,
//           157,158,160,161,162,163,
//           163,163,162,161,160,
//           156,154,153,151,149
//       };
//       int [] ojoy = {
//            85, 84, 83, 81, 79,
//            79, 81, 82, 84, 86, 87,
//            93, 99,100,101,102,
//           102,101, 99, 97, 94
//       };
//        
//        g.setColor(azulojo);
//        g.fillPolygon(ojox, ojoy, 21);
//        g.setColor(Color.BLACK);
//        g.drawPolygon(ojox, ojoy, 21);
//            
//        int [] pupilax ={
//            152,152,153,154,
//            157,159,160,161,161,
//            160,
//            159,157,
//            155,154,152
//        };
//        int [] pupilay ={
//             92, 85, 84, 82,
//             82, 84, 86, 88, 97,
//             98,
//             99, 99,
//             97, 96, 94
//        };
//
//        g.setColor(Color.BLACK);
//        g.fillPolygon(pupilax, pupilay, 15);
    }
}

