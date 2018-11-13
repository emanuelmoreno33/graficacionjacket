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
        Color lineacresta = new Color(109,13,25);
        
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
        //lineas para plumas
        g.drawLine(154, 65, 164, 73);
        g.drawLine(142, 62, 136, 65);
        g.drawLine(144, 76, 150, 72);
        g.drawLine(150, 72, 157, 71);
        g.drawLine(123,70,119,67);
        g.drawLine(119,67,116,67);
        g.drawLine(112,72,107,77);
        g.drawLine(107,79,103,86);
        g.drawLine(111,77,107,83);
        g.drawLine(118,81,125,81);
        g.drawLine(125,81,119,77);
        g.drawLine(146,80,152,75);
        g.drawLine(152,75,158,76);
        g.drawLine(120,83,113,82);
        g.drawLine(113,82,107,89);
        g.drawLine(109,91,115,86);
        g.drawLine(115,86,121,86);
        g.drawLine(164,94,169,95);
        g.drawLine(171,102,175,110);
        g.drawLine(161,103,168,108);
        g.drawLine(162,105,168,110);
        g.drawLine(106,106,103,120);
        g.drawLine(112,112,107,119);
        g.drawLine(115,115,109,124);
        g.drawLine(116,118,113,125);
        g.drawLine(117,128,119,148);
        g.drawLine(117,127,114,138);
        g.drawLine(110,134,106,145);
        g.drawLine(112,145,110,154);
        g.drawLine(163,117,168,122);
        g.drawLine(173,118,178,125);
        g.drawLine(166,129,173,135);
        
        int []fondoplumax = {
            121,118,110,106,103,102,123
        };
        int [] fondoplumay = {
            163,165,172,166,170,154,155
        };
        Color grispluma = new Color(211,211,211);
        g.setColor(grispluma);
        g.fillPolygon(fondoplumax, fondoplumay, 7);
        g.setColor(Color.BLACK);
        int [] plumax1 = {
         120,122,117,116,111,109,105,103,100,102,97
        };
        int [] plumay1 = {
         164,158,163,159,166,158,162,153,157,149,155
        };
        g.drawPolyline(plumax1, plumay1, 11);
   
        g.setColor(blancopluma);        
        int [] plumax11 = {
         120,122,117,116,111,109,105,103,100,102,97,115,126
        };
        int [] plumay11 = {
         164,158,163,159,166,158,162,153,157,149,155,146,151
        };
        g.fillPolygon(plumax11, plumay11, 13);
        
        int  [] plumitasx = {
        138,140,141,144,144,146,147,150,150,153,
        151,154,154   
        };
        int [] plumitasy = {
        152,154,150,155,151,154,150,156,150,153,
        147,153,149
        };
        g.setColor(Color.BLACK);
        g.drawPolyline(plumitasx, plumitasy, 13);
                
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
        g.setColor(lineacresta);
        int [] barba1xd = {
            163,160,157,155,154
        };
        int  [] barba1yd = {
            128,124,121,117,116
        };
        g.drawPolyline(barba1xd, barba1yd, 5);
        int [] barba2xd = {
            162,158,155,153
        };
        int  [] barba2yd = {
            119,115,113,110
        };
        g.drawPolyline(barba2xd, barba2yd,4);
        int [] barba3xd = {
            157,153,146,143,142,139
        };
        int  [] barba3yd = {
            111,103, 91, 89, 88, 88
        };
        g.drawPolyline(barba3xd, barba3yd,6);
        int [] barba4xd = {
          149,143,136 
        };
        int  [] barba4yd = {
           90, 86, 85
        };
        g.drawPolyline(barba4xd, barba4yd,3);
        int [] barba1xi = {
            124,126,126
        };
        int  [] barba1yi = {
            136,134,120
        };
        g.drawPolyline(barba1xi, barba1yi,3);
        int [] barba2xi = {
           122,124,125,125
        };
        int  [] barba2yi = {
           126,113,115,101
        };
        g.drawPolyline(barba2xi, barba2yi,4);
        int [] barba3xi = {
           120,122,123,126,130
        };
        int  [] barba3yi = {
           120,112,101, 95, 90
        };
        g.drawPolyline(barba3xi, barba3yi,5);
        int [] barba4xi = {
            120,122,125,130
        };
        int  [] barba4yi = {
             98, 94, 91, 88
        };
        g.drawPolyline(barba4xi, barba4yi,4);
        
        
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
        g.setColor(lineacresta);
        int [] crestaln1x = {
            128,129,135
        };
        int [] crestaln1y = {
            78,69,75
        };
        g.drawPolyline(crestaln1x, crestaln1y, 3);
        int [] crestaln2x = {
            125,126,133
        };
        int [] crestaln2y = {
            66,56,66
        };
        g.drawPolyline(crestaln2x, crestaln2y, 3);
        int [] crestaln3x = {
            120,121,122,132
        };
        int [] crestaln3y = {
             55, 52, 38, 54
        };
        g.drawPolyline(crestaln3x, crestaln3y, 4);
        
        //pico
        int [] fondopicox = {
            129,150,150,143,129
        };
        int [] fondopicoy = {
            121,114,121,132,122
        };
        g.setColor(Color.BLACK);
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
        g.fillOval(132,98, 2, 2);
        g.fillOval(139, 97, 2, 2);
        g.drawLine(136, 99, 142, 127);
        
        
        //ojos
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
        
    }
}

