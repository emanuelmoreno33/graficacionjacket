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
        
        g.setColor(Color.BLACK);
        g.drawOval(255,437,7,11);
        g.setColor(rojomancha);
        g.fillOval(255,437,7,11);
        
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
        g.drawLine(251,438,264,429);
        g.drawLine(251,440,265,431);
        g.drawLine(252,443,266,433);
        g.drawLine(254,448,266,435);
        g.drawLine(253,430,257,430);
        g.drawLine(257,430,263,426);
        g.drawLine(249,436,253,434);
        g.drawLine(253,434,253,432);
        g.drawLine(251,432,253,432);
        g.drawLine(248,434,251,432);
        g.drawLine(292,407,299,403);
        g.drawLine(294,409,300,404);
        g.drawLine(294,412,301,406);
        g.drawLine(295,414,301,409);
        g.drawLine(296,416,302,410);
        
        g.setColor(Color.BLACK);
        g.drawOval(238,453,11,11);
        g.setColor(rojomancha);
        g.fillOval(238,453,11,11);
        
        g.setColor(Color.BLACK);
        g.drawOval(248,454,7,7);
        g.setColor(rojomancha);
        g.fillOval(248,454,7,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(243,462,5,5);
        g.setColor(rojomancha);
        g.fillOval(243,462,5,5);
        
        g.setColor(Color.BLACK);
        g.drawOval(238,479,9,11);
        g.setColor(rojomancha);
        g.fillOval(238,479,9,11);
        
        g.setColor(Color.BLACK);
        g.drawOval(247,465,4,4);
        g.setColor(rojomancha);
        g.fillOval(247,465,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(237,483,3,6);
        g.setColor(rojomancha);
        g.fillOval(237,483,3,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(238,488,5,4);
        g.setColor(rojomancha);
        g.fillOval(238,488,5,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(241,485,5,6);
        g.setColor(rojomancha);
        g.fillOval(241,485,5,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(247,437,7,6);
        g.setColor(rojomancha);
        g.fillOval(247,437,7,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(250,477,10,11);
        g.setColor(rojomancha);
        g.fillOval(250,477,10,11);
        
        int [] manchamartillox = {
          241,243,241,243,248,249,254,259,264,269,271,261,
          256,245
        };
        int [] manchamartilloy = {
          498,497,493,490,489,488,484,483,477,484,494,504,
          505,506
        };
        g.setColor(rojomancha);
        g.fillPolygon(manchamartillox, manchamartilloy, 14);
        
        g.setColor(Color.BLACK);
        g.drawLine(227,472,247,465);
        g.drawLine(247,465,256,457);
        g.drawLine(247,465,231,421);
        g.drawLine(231,421,226,403);
        g.drawLine(226,403,226,385);
        g.drawLine(221,424,214,405);
        g.drawLine(214,405,212,390);
        g.drawLine(221,424,218,411);
        
        //resorte chamarra torso
        g.drawLine(98,364,98,383);
        g.drawLine(101,360,101,383);
        g.drawLine(105,358,103,379);
        g.drawLine(103,379,105,381);
        g.drawLine(109,356,107,378);
        g.drawLine(107,378,108,380);
        g.drawLine(112,355,110,375);
        g.drawLine(110,375,111,379);
        g.drawLine(116,353,114,374);
        g.drawLine(114,374,116,377);
        g.drawLine(120,351,118,373);
        g.drawLine(118,373,120,376);
        g.drawLine(123,350,121,371);
        g.drawLine(124,375,121,371);
        g.drawLine(126,349,125,370);
        g.drawLine(125,370,127,374);
        g.drawLine(131,348,129,370);
        g.drawLine(129,370,131,373);
        g.drawLine(134,346,131,367);
        g.drawLine(131,367,134,372);
        g.drawLine(137,346,136,367);
        g.drawLine(136,367,138,371);
        g.drawLine(141,345,139,367);
        g.drawLine(139,367,142,370);
        g.drawLine(147,343,146,364);
        g.drawLine(146,364,149,367);
        g.drawLine(146,364,149,368);
        g.drawLine(149,343,150,362);
        g.drawLine(150,362,153,367);
        g.drawLine(158,342,158,360);
        g.drawLine(158,360,161,366);
        g.drawLine(163,341,164,362);
        g.drawLine(164,362,165,366);
        g.drawLine(169,341,169,366);
        g.drawLine(173,341,173,365);
        g.drawLine(179,342,178,365);
        g.drawLine(185,341,184,365);
        g.drawLine(191,342,189,365);
        g.drawLine(197,342,196,365);
        g.drawLine(204,343,205,362);
        g.drawLine(205,362,202,366);
        g.drawLine(211,343,212,361);
        g.drawLine(212,361,209,365);
        g.drawLine(217,343,217,364);
        g.drawLine(217,364,216,367);
        g.drawLine(222,344,223,364);
        g.drawLine(223,364,221,367);
        g.drawLine(227,346,229,366);
        g.drawLine(229,366,227,369);
        g.drawLine(233,347,234,368);
        g.drawLine(234,368,233,370);
        g.drawLine(237,349,238,368);
        g.drawLine(238,368,237,372);
        g.drawLine(241,351,242,368);
        g.drawLine(242,368,240,372);
        g.drawLine(245,352,245,373);
        
        g.setColor(Color.BLACK);
        g.drawOval(186,401,7,7);
        g.setColor(rojomancha);
        g.fillOval(186,401,7,7);

        g.setColor(Color.BLACK);
        g.drawOval(195,398,4,4);
        g.setColor(rojomancha);
        g.fillOval(195,398,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(250,477,10,11);
        g.setColor(rojomancha);
        g.fillOval(250,477,10,11);
        
        //lineas torso
        
        
     }
    
}
