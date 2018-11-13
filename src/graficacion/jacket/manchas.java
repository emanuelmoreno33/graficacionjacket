package graficacion.jacket;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class manchas extends JPanel {
    public manchas()
    {
        
    }
    
    public void paint(Graphics g)
    {
        Color rojomancha = new Color(190,29,60);
        //brazo
        int [] m1x = {
          245,244,247,249,248,  
        };
        int [] m1y = {
          216,217,221,222,218,
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m1x, m1y, 5);
        g.setColor(rojomancha);
        g.fillPolygon(m1x, m1y, 5);
        
         int [] m2x = {
        263,265,267,267,264,263, 
        };
        int [] m2y = {
        238,238,241,244,243,242,
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m2x, m2y, 5);
        g.setColor(rojomancha);
        g.fillPolygon(m2x, m2y, 5);
        
         int [] m3x = {
          270,270,273,272,271
        };
        int [] m3y = {
          250,253,254,251,250
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m3x, m3y, 5);
        g.setColor(rojomancha);
        g.fillPolygon(m3x, m3y, 5);
        
        g.setColor(Color.BLACK);
        g.drawOval(272,261,5,5);
        g.setColor(rojomancha);
        g.fillOval(272, 261, 5, 5);
        
        g.setColor(Color.BLACK);
        g.drawOval(260,265,3,3);
        g.setColor(rojomancha);
        g.fillOval(260, 265, 3, 3);
        
        g.setColor(Color.BLACK);
        g.drawOval(261,269,3,3);
        g.setColor(rojomancha);
        g.fillOval(261, 269, 3, 3);
        
        int [] m4x = {
          279,282,284,284,281,279,278,278,279,
        };
        int [] m4y = {
          282,282,285,287,290,290,289,287,286,
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m4x, m4y, 5);
        g.setColor(rojomancha);
        g.fillPolygon(m4x, m4y, 5);
        
        g.setColor(Color.BLACK);
        g.drawOval(285,295,5,7);
        g.setColor(rojomancha);
        g.fillOval(285,295,5,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(263,301,5,6);
        g.setColor(rojomancha);
        g.fillOval(263,301,5,6);
        
         g.setColor(Color.BLACK);
        g.drawOval(280,321,5,4);
        g.setColor(rojomancha);
        g.fillOval(280,321,5,4);
        
         g.setColor(Color.BLACK);
        g.drawOval(292,323,7,5);
        g.setColor(rojomancha);
        g.fillOval(292,323,7,5);
        
         g.setColor(Color.BLACK);
        g.drawOval(263,326,5,5);
        g.setColor(rojomancha);
        g.fillOval(263,326,5,5);
        
         g.setColor(Color.BLACK);
        g.drawOval(284,332,4,6);
        g.setColor(rojomancha);
        g.fillOval(284,332,4,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(284,349,8,9);
        g.setColor(rojomancha);
        g.fillOval(284,349,8,9);
        
         int [] m5x = {
          249,251,254,257,257,254,249,
        };
        int [] m5y = {
          335,335,339,340,345,345,340,
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m5x, m5y, 7);
        g.setColor(rojomancha);
        g.fillPolygon(m5x, m5y, 7);
        
        g.setColor(Color.BLACK);
        g.drawOval(254,347,6,4);
        g.setColor(rojomancha);
        g.fillOval(254,347,6,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(275,350,7,7);
        g.setColor(rojomancha);
        g.fillOval(275,350,7,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(277,360,5,5);
        g.setColor(rojomancha);
        g.fillOval(277,360,5,5);
        
        g.setColor(Color.BLACK);
        g.drawOval(282,358,9,9);
        g.setColor(rojomancha);
        g.fillOval(282,358,9,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(267,360,6,4);
        g.setColor(rojomancha);
        g.fillOval(267,360,6,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(159,266,4,4);
        g.setColor(rojomancha);
        g.fillOval(159,266,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(210,275,4,4);
        g.setColor(rojomancha);
        g.fillOval(210,275,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(185,303,4,4);
        g.setColor(rojomancha);
        g.fillOval(185,303,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(277,366,6,6);
        g.setColor(rojomancha);
        g.fillOval(277,366,6,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(206,334,7,7);
        g.setColor(rojomancha);
        g.fillOval(206,334,7,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(219,328,4,6);
        g.setColor(rojomancha);
        g.fillOval(219,328,4,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(151,351,3,3);
        g.setColor(rojomancha);
        g.fillOval(151,351,3,3);
        
        g.setColor(Color.BLACK);
        g.drawOval(157,354,2,3);
        g.setColor(rojomancha);
        g.fillOval(157,354,2,3);
        
        g.setColor(Color.BLACK);
        g.drawOval(172,354,5,5);
        g.setColor(rojomancha);
        g.fillOval(172,354,5,5);
        
        g.setColor(Color.BLACK);
        g.drawOval(209,351,6,6);
        g.setColor(rojomancha);
        g.fillOval(209,351,6,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(218,345,5,5);
        g.setColor(rojomancha);
        g.fillOval(218,345,5,5);
        
        g.setColor(Color.BLACK);
        g.drawOval(284,349,8,9);
        g.setColor(rojomancha);
        g.fillOval(284,349,8,9);
        
         int [] m6x = {
           280,281,278,274,276,272,268,267,274,280,
           287,290,287,286,291,291,285,283
        };
        int [] m6y = {
           373,379,384,384,379,378,383,389,389,391,
           396,392,386,383,382,375,374,373
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m6x, m6y, 18);
        g.setColor(rojomancha);
        g.fillPolygon(m6x, m6y, 18);
        
        g.setColor(Color.BLACK);
        g.drawOval(262,369,7,7);
        g.setColor(rojomancha);
        g.fillOval(262,369,7,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(267,369,3,3);
        g.setColor(rojomancha);
        g.fillOval(267,369,3,3);
        
        g.setColor(Color.BLACK);
        g.drawLine(255,369,252,387);
        g.drawLine(252, 387,253, 392);
        g.drawLine(260,367,258,386);
        g.drawLine(258,386,259,390);
        g.drawLine(265,366,263,385);
        g.drawLine(263,385,264,390);
        g.drawLine(271,366,268,389);
        g.drawLine(277,366,274,389);
        g.drawLine(282,367,281,387);
        g.drawLine(281,387,279,391);
        g.drawLine(288,371,286,388);
        g.drawLine(286,388,283,393);
        g.drawLine(292,375,291,393);
        g.drawLine(291,393,287,398);
        
        //mano manchada
        g.setColor(rojomancha);
        g.fillOval(264,396,5,5);
        g.setColor(Color.BLACK);
        g.drawOval(264,396,5,5);
        g.setColor(rojomancha);
        g.fillOval(272,396,5,5);
        g.setColor(Color.BLACK);
        g.drawOval(272,396,5,5);
        g.setColor(rojomancha);
        g.fillOval(278,404,6,8);
        g.setColor(Color.BLACK);
        g.drawOval(278,404,6,8);
        g.setColor(rojomancha);
        g.fillOval(272,412,7,5);
        g.setColor(Color.BLACK);
        g.drawOval(272,412,7,5);
        g.setColor(rojomancha);
        g.fillOval(276,419,5,9);
        g.setColor(Color.BLACK);
        g.drawOval(276,419,5,9);
        g.setColor(rojomancha);
        g.fillOval(258,409,7,12);
        g.setColor(Color.BLACK);
        g.drawOval(258,409,7,12);
        
        int [] m7x = {
           263,265,267,270,273,273,273,269,267,265,
           267,264
        };
        int [] m7y = {
           420,417,416,416,418,426,432,432,432,427,
           424,422
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m7x, m7y, 12);
        g.setColor(rojomancha);
        g.fillPolygon(m7x, m7y, 12);
        
        g.setColor(Color.BLACK);
        g.drawOval(288,418,4,4);
        g.setColor(rojomancha);
        g.fillOval(288,418,4,4);
        
        int [] m8x = {
           260,256,255,251,252,261,260
        };
        int [] m8y = {
           419,420,422,426,430,425,420
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m8x, m8y, 7);
        g.setColor(rojomancha);
        g.fillPolygon(m8x, m8y, 7);
        
        int [] m9x = {
           257,270,274,274,278,279,281,285,287,291,
           293,297,299,286,264,258,
        };
        int [] m9y = {
           450,435,435,431,429,428,430,429,426,426,
           428,431,433,446,452,455
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m9x, m9y, 16);
        g.setColor(rojomancha);
        g.fillPolygon(m9x, m9y, 16);
        
        g.setColor(Color.BLACK);
        g.drawLine(250,398,281,394);
        g.drawLine(265,395,265,411);
        g.drawLine(250,398,265,412);
        g.drawLine(279,393,265,411);
        g.drawLine(265,415,274,412);
        g.drawLine(274,412,295,415);
        g.drawLine(279,404,282,429);
        g.drawLine(286,404,291,427);
        g.drawLine(270,432,297,427);
        g.drawLine(283,439,265,451);
        g.drawLine(293,436,275,449);
        
        
        //chamarra
        int [] m10x = {
            180,178,176,173,175,177,178,179,180
        };
        int [] m10y ={
            350,347,344,338,336,337,341,346,347
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m10x, m10y, 9);
        g.setColor(rojomancha);
        g.fillPolygon(m10x, m10y, 9);
        
        int [] m11x = {
            186,191,194,194,191,188,186
        };
        int [] m11y ={
            355,355,360,363,363,358,358
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(m11x, m11y, 7);
        g.setColor(rojomancha);
        g.fillPolygon(m11x, m11y, 7);
        
        g.setColor(Color.BLACK);
        g.drawOval(180,351,4,4);
        g.setColor(rojomancha);
        g.fillOval(180,351,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(200,358,6,6);
        g.setColor(rojomancha);
        g.fillOval(200,358,6,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(209,361,13,7);
        g.setColor(rojomancha);
        g.fillOval(209,361,13,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(173,383,8,8);
        g.setColor(rojomancha);
        g.fillOval(173,383,8,8);
        
        g.setColor(Color.BLACK);
        g.drawOval(236,380,4,4);
        g.setColor(rojomancha);
        g.fillOval(236,380,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(237,395,4,11);
        g.setColor(rojomancha);
        g.fillOval(237,395,4,11);
        
        g.setColor(Color.BLACK);
        g.drawOval(237,407,5,5);
        g.setColor(rojomancha);
        g.fillOval(237,407,5,5);
        
        g.fillOval(288,454,6,6);
        g.fillOval(295,459,5,5);
        g.fillOval(313,428,5,5);
        g.fillOval(316,436,4,4);
        g.fillOval(326,459,5,5);
        g.fillOval(324,463,4,4);
        g.fillOval(336, 447, 4, 20);
        
        //martillo
        g.setColor(Color.BLACK);
        g.drawLine(223,443,229,444);
        g.drawLine(238,459,229,444);
        
        
     }
    
}
