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
        
        g.setColor(rojomancha);
        g.fillOval(130,430,9,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(195,430,7,7);
        g.setColor(rojomancha);
        g.fillOval(195,430,7,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(216,485,4,4);
        g.setColor(rojomancha);
        g.fillOval(216,485,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(223,486,6,6);
        g.setColor(rojomancha);
        g.fillOval(223,486,6,6);
        
        g.setColor(Color.BLACK);
        g.drawOval(209,500,9,9);
        g.setColor(rojomancha);
        g.fillOval(209,500,9,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(272,484,6,9);
        g.setColor(rojomancha);
        g.fillOval(272,484,6,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(213,534,13,9);
        g.setColor(rojomancha);
        g.fillOval(213,534,13,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(228,548,12,17);
        g.setColor(rojomancha);
        g.fillOval(228,548,12,17);
        
        g.setColor(Color.BLACK);
        g.drawOval(262,508,6,9);
        g.setColor(rojomancha);
        g.fillOval(262,508,6,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(216,485,4,4);
        g.setColor(rojomancha);
        g.fillOval(216,485,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(194,413,6,9);
        g.setColor(rojomancha);
        g.fillOval(194,413,6,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(180,405,10,13);
        g.setColor(rojomancha);
        g.fillOval(180,405,10,13);
        
        g.setColor(Color.BLACK);
        g.drawOval(201,439,7,11);
        g.setColor(rojomancha);
        g.fillOval(201,439,7,11);
        
        g.setColor(Color.BLACK);
        g.drawOval(202,448,4,7);
        g.setColor(rojomancha);
        g.fillOval(202,448,4,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(199,458,5,7);
        g.setColor(rojomancha);
        g.fillOval(199,458,5,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(193,471,4,9);
        g.setColor(rojomancha);
        g.fillOval(193,471,4,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(197,481,4,10);
        g.setColor(rojomancha);
        g.fillOval(197,481,4,10);
        
        g.setColor(Color.BLACK);
        g.drawOval(205,467,4,13);
        g.setColor(rojomancha);
        g.fillOval(205,467,4,13);
        
        g.setColor(Color.BLACK);
        g.drawOval(232,519,8,19);
        g.setColor(rojomancha);
        g.fillOval(232,519,8,19);
        
        g.setColor(Color.BLACK);
        g.drawOval(215,550,6,7);
        g.setColor(rojomancha);
        g.fillOval(215,550,6,7);
        
        int [] mancha13x={
          206,203,203,202,204,206,207,211,219,225,
          225,222,232,237,239,244,248,250,247,245,
          243,240,237,234,227,227,229,228,221,216,
          215,213,209,206,207
        };
        int [] mancha13y={
          529,525,521,510,508,508,511,508,507,507,
          505,499,509,514,516,518,527,533,534,528,
          522,519,518,514,514,511,511,509,511,510,
          509,510,512,515,528
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(mancha13x, mancha13y, 35);
        g.setColor(rojomancha);
        g.fillPolygon(mancha13x, mancha13y, 35);
        
        int [] mancha14x = {
            251,248,248,251,256,255,253,253,252,252,
            255,258,261,261,263,263,261,262,264,268,
            271,275,282,282,276,268,258,258,257,254,
            248,247,249
        };
        int [] mancha14y = {
            555,549,544,541,541,538,534,530,529,524,
            521,521,524,530,534,538,542,543,548,548,
            555,556,562,569,575,575,564,567,568,568,
            562,559,556
        };
         g.setColor(Color.BLACK);
        g.drawPolygon(mancha14x, mancha14y, 33);
        g.setColor(rojomancha);
        g.fillPolygon(mancha14x, mancha14y, 33);
        
        int [] mancha15x = {
            272,273,276,278,277,278,278,277,279,279,
            280,283,284,284,283,279,279,280,277,275,
            275,272,272,274,274,272
        };
        int [] mancha15y = {
            508,504,504,506,508,509,512,513,516,520,
            522,523,525,527,528,528,529,532,533,531,
            528,526,517,515,513,512
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(mancha15x, mancha15y, 26);
        g.setColor(rojomancha);
        g.fillPolygon(mancha15x, mancha15y, 26);
        
        int [] mancha16x = {
            213,215,216,217,221,222,222,218,215
        };
        int [] mancha16y = {
            555,554,558,561,561,564,566,566,566
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(mancha16x, mancha16y, 9);
        g.setColor(rojomancha);
        g.fillPolygon(mancha16x, mancha16y, 9);
        
        g.setColor(Color.BLACK);
        g.drawOval(279,534,6,17);
        g.setColor(rojomancha);
        g.fillOval(279,534,6,17);
        
        g.setColor(Color.BLACK);
        g.drawOval(289,541,6,19);
        g.setColor(rojomancha);
        g.fillOval(289,541,6,19);
        
        g.setColor(Color.BLACK);
        g.drawOval(285,556,6,14);
        g.setColor(rojomancha);
        g.fillOval(285,556,6,14);
        
        g.setColor(Color.BLACK);
        g.drawOval(278,553,5,5);
        g.setColor(rojomancha);
        g.fillOval(278,553,5,5);
        
        g.setColor(Color.BLACK);
        g.drawOval(224,570,8,17);
        g.setColor(rojomancha);
        g.fillOval(224,570,8,17);
        
        g.setColor(Color.BLACK);
        g.drawOval(240,563,11,13);
        g.setColor(rojomancha);
        g.fillOval(240,563,11,13);
        
        g.setColor(Color.BLACK);
        g.drawOval(184,454,10,10);
        g.setColor(rojomancha);
        g.fillOval(184,454,10,10);

        g.setColor(rojomancha);
        g.fillOval(213,526,8,8);
        
        g.setColor(rojomancha);
        g.fillOval(131,480,20,25);
        
        g.setColor(Color.BLACK);
        g.drawOval(125,532,8,8);
        g.setColor(rojomancha);
        g.fillOval(125,532,8,8);
        
        g.setColor(Color.BLACK);
        g.drawOval(112,537,4,10);
        g.setColor(rojomancha);
        g.fillOval(112,537,4,10);
        
        g.setColor(Color.BLACK);
        g.drawOval(118,500,6,6);
        g.setColor(rojomancha);
        g.fillOval(118,500,6,6);
        
        g.setColor(rojomancha);
        g.fillOval(77,506,6,6);
        
        g.setColor(rojomancha);
        g.fillOval(137,531,11,11);
        
        g.setColor(rojomancha);
        g.fillOval(147,471,9,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(105,551,8,11);
        g.setColor(rojomancha);
        g.fillOval(105,551,8,11);
        
        g.setColor(rojomancha);
        g.fillOval(165,505,9,9);
        
        g.setColor(Color.BLACK);
        g.drawOval(131,544,9,4);
        g.setColor(rojomancha);
        g.fillOval(131,544,9,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(106,551,6,10);
        g.setColor(rojomancha);
        g.fillOval(106,551,6,10);
        
        g.setColor(Color.BLACK);
        g.drawOval(129,565,5,5);
        g.setColor(rojomancha);
        g.fillOval(129,565,5,5);
        
        g.setColor(Color.BLACK);
        g.drawOval(130,573,7,7);
        g.setColor(rojomancha);
        g.fillOval(130,573,7,7);
        
        g.setColor(Color.BLACK);
        g.drawOval(97,566,6,22);
        g.setColor(rojomancha);
        g.fillOval(97,566,6,22);
        
        g.setColor(Color.BLACK);
        g.drawOval(130,573,7,7);
        g.setColor(rojomancha);
        g.fillOval(130,573,7,7);
        
        g.setColor(rojomancha);
        g.fillOval(66,527,21,12);
        
        g.setColor(rojomancha);
        g.fillOval(299,509,13,13);
        
        g.setColor(rojomancha);
        g.fillOval(312,498,6,6);
        
        g.setColor(rojomancha);
        g.fillOval(328,473,7,7);
        
        g.setColor(rojomancha);
        g.fillOval(327,472,7,7);
        
        g.setColor(rojomancha);
        g.fillOval(80,571,20,6);
        
        g.setColor(rojomancha);
        g.fillOval(61,542,7,7);
        
        g.setColor(rojomancha);
        g.fillOval(150,441,7,7);
        
        g.setColor(rojomancha);
        g.drawLine(292,530,303,519);
        g.drawLine(292,530,301,519);
        g.drawLine(292,530,300,518);
        g.drawLine(308,509,328,478);
        g.drawLine(305,509,320,472);
        g.drawLine(302,511,304,499);
        g.drawLine(214,476,209,455);
        g.drawLine(186,520,183,507);
        g.drawLine(175,485,171,479);
        g.drawLine(107,543,101,534);
        g.drawLine(99,521,85,510);
        g.drawLine(103,518,94,511);
        g.drawLine(109,518,99,511);
        g.drawLine(188,489,183,479);
        g.drawLine(187,489,183,478);
        
        int [] mancha17x = {
             63, 50, 44, 41, 22, 21, 23, 42, 48, 58, 67
        };
        int [] mancha17y = {
            527,519,518,515,503,499,498,510,516,520,525
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(mancha17x, mancha17y, 11);
        g.setColor(rojomancha);
        g.fillPolygon(mancha17x, mancha17y, 11);
        
        int [] mancha18x = {
             49, 41, 40, 52
        };
        int [] mancha18y = {
            504,496,494,500
        };
        g.setColor(Color.BLACK);
        g.drawPolygon(mancha18x, mancha18y, 4);
        g.setColor(rojomancha);
        g.fillPolygon(mancha18x, mancha18y, 4);
        
        Color luzrosa = new Color(255,121,255);
        
        int [] luzx = {
          268,269,275,276,285,290,297,295,288,277,268  
        };
        int [] luzy = {
          185,209,211,240,239,268,269,256,231,206,187
        };
        g.setColor(luzrosa);
        g.fillPolygon(luzx, luzy, 11);
        
        g.fillOval(289,277,9,8);
        
        int [] luz1x = {
          297,288,292,292,290,294,294,300,302,300,299,298,298,
        };
        int [] luz1y = {
          285,293,299,307,311,318,322,322,321,318,312,315,300,
        };
        g.setColor(luzrosa);
        g.fillPolygon(luz1x, luz1y, 10);
        
        int [] luz2x = {
          300,293,290,294,295,291,290,296,296,290,
          291,297,296,300,301,299,299,300
        };
        int [] luz2y = {
          326,331,340,346,350,353,359,359,362,366,
          370,370,380,378,373,357,345,334
        };
        g.setColor(luzrosa);
        g.fillPolygon(luz2x, luz2y, 18);
        
        Color cafesombra = new Color(233,173,124);
        
        int [] sombrax1 = {
        219,246,251,253,260,277,274,270,267,260,234,227,223  
        };
        int [] sombray1 = {
        155,177,187,217,237,222,209,210,184,174,149,148,151
        };
        g.setColor(cafesombra);
        g.fillPolygon(sombrax1,sombray1,13);
        
         int [] sombrax2 = {
        283,280,281,
        };
        int [] sombray2 = {
        240,248,264,
        };
        g.setColor(cafesombra);
        g.fillPolygon(sombrax2,sombray2,3);
        
        g.setColor(Color.BLACK);
        g.drawLine(217,189,218,203);
        g.drawLine(218,203,221,210);
        g.drawLine(221,210,223,202);
        g.drawLine(223,202,221,191);
        g.drawLine(221,191,223,183);
        g.drawLine(227,234,231,215);
        g.drawLine(262,248,274,219);
        g.drawLine(244,273,255,265);
        g.drawLine(255,265,263,262);
        g.drawLine(263,262,274,250);
        g.drawLine(243,287,278,271);
        g.drawLine(291,271,298,275);
        g.drawLine(247,293,264,281);
        g.drawLine(270,282,292,282);
        g.drawLine(250,298,262,298);
        g.drawLine(290,289,262,298);
        g.drawLine(250,308,265,303);
        g.drawLine(253,322,263,315);
        g.drawLine(263,315,278,315);
        g.drawLine(278,315,288,321);
        g.drawLine(282,328,286,330);
        g.drawLine(286,330,291,329);
        g.drawLine(261,334,277,334);
        g.drawLine(277,334,284,336);
        g.drawLine(257,346,268,342);
        g.drawLine(277,341,268,342);
        g.drawLine(277,341,285,338);
        g.drawLine(277,346,296,347);
        g.drawLine(254,366,261,366);
        g.drawLine(283,365,292,360);
        g.drawLine(292,360,295,360);
        g.drawLine(289,371,294,371);
        g.drawLine(291,375,295,375);
        g.drawLine(187,166,194,175);
        g.drawLine(204,197,207,201);
        g.drawLine(207,201,208,212);
        g.drawLine(201,203,208,212);
        g.drawLine(208,212,223,239);
        g.drawLine(203,232,209,236);
        g.drawLine(209,236,217,237);
        g.drawLine(221,210,221,232);
        g.drawLine(201,242,219,242);
        g.drawLine(158,252,146,256);
        g.drawLine(174,250,215,247);
        g.drawLine(215,247,225,242);
        g.drawLine(216,254,225,242);
        g.drawLine(205,259,216,254);
        g.drawLine(159,276,187,261);
        g.drawLine(172,281,179,277);
        g.drawLine(188,273,218,265);
        g.drawLine(192,278,218,265);
        g.drawLine(218,265,229,256);
        g.drawLine(170,291,183,283);
        g.drawLine(220,275,231,262);
        g.drawLine(217,299,238,275);
        g.drawLine(235,287,239,281);
        g.drawLine(231,321,245,314);
        g.drawLine(229,345,239,339);
        g.drawLine(204,326,212,326);
        g.drawLine(212,326,222,318);
        g.drawLine(177,334,185,333);
        g.drawLine(185,333,194,325);
        g.drawLine(194,325,208,322);
        g.drawLine(155,338,156,334);
        g.drawLine(156,334,162,326);
        g.drawLine(156,311,189,301);
        g.drawLine(148,336,152,330);
        g.drawLine(143,268,150,266);
        g.drawLine(142,243,147,238);
        g.drawLine(142,206,152,201);
        g.drawLine(129,336,140,338);
        g.drawLine(118,320,128,327);
        g.drawLine(94,331,105,345);
        g.drawLine(97,320,103,323);
        g.drawLine(103,323,110,323);
        g.drawLine(110,323,117,330);
        g.drawLine(89,313,92,316);
        g.drawLine(89,294,103,286);
        g.drawLine(94,291,102,290);
        g.drawLine(93,286,99,281);
        g.drawLine(100,274,123,264);
        g.drawLine(118,244,127,240);
        g.drawLine(127,240,133,240);
        g.drawLine(133,240,137,241);
        g.drawLine(91,250,110,235);
        g.drawLine(88,241,100,223);
        g.drawLine(92,235,92,227);
        g.drawLine(92,227,98,218);
        g.drawLine(121,183,130,190);
        
        
        
        
        //Lineas Brazo Arma
        g.setColor(Color.BLACK);
        g.drawLine(86,244,80,237);
        g.drawLine(80,237,76,224);
        g.drawLine(85,249,78,250);
        g.drawLine(88,268,78,258);
        g.drawLine(82,274,77,271);
        g.drawLine(86,279,79,278);
        g.drawLine(86,289,81,287);
        g.drawLine(83,286,76,286);
        g.drawLine(81,287,74,290);
        g.drawLine(80,297,73,300);
        g.drawLine(86,300,78,300);
        g.drawLine(78,300,70,305);
        g.drawLine(70,319,74,317);
        g.drawLine(78,323,73,323);
        g.drawLine(81,328,76,329);
        g.drawLine(74,345,63,351);
        g.drawLine(68,356,80,349);
        g.drawLine(94,371,86,366);
        g.drawLine(87,374,73,370);
        g.drawLine(65,380,79,378);
        g.drawLine(66,391,69,394);
        g.drawLine(69,394,77,393);
        g.drawLine(77,393,84,386);
        
        //Lineas manga brazo arma
        g.setColor(Color.BLACK);
        g.drawLine(59,405,60,411);
        g.drawLine(65,395,64,411);
        g.drawLine(71,395,69,411);
        g.drawLine(76,395,73,411);
        g.drawLine(80,396,80,406);
        g.drawLine(80,406,77,412);
        g.drawLine(86,398,84,407);
        g.drawLine(84,407,81,414);
        g.drawLine(88,401,88,409);
        g.drawLine(88,409,84,416);
        g.drawLine(85,417,89,415);
        
        //Lineas de la banda de la mano con el arma
        g.setColor(Color.BLACK);
        g.drawLine(55,425,56,420);
        g.drawLine(66,411,72,419);
        g.drawLine(72,419,75,428);
        g.drawLine(68,433,76,427);
        g.drawLine(77,427,77,413);
        g.drawLine(77,427,88,428);
        g.drawLine(69,434,83,440);
        g.drawLine(70,432,84,437);
        g.drawLine(86,428,81,432);
        g.drawLine(80,415,80,420);
        
        //Lineas de los dedos
        g.setColor(Color.BLACK);
        g.drawLine(60,442,58,441);
        g.drawLine(72,458,68,457);
        g.drawLine(78,459,74,459);
        g.drawLine(80,449,78,449);
        g.drawLine(70,444,73,446);
        g.drawLine(64,440,66,441);
        
        //Lineas de el Arma
        g.setColor(Color.BLACK);
        g.drawLine(37,376,46,373);
        g.drawLine(35,383,44,381);
        g.drawLine(44,381,50,395);
        g.drawLine(50,395,50,400);
        g.drawLine(50,400,25,478);
        g.drawLine(25,478,25,482);
        g.drawLine(49,401,43,397);
        g.drawLine(43,397,20,469);
        g.drawLine(20,469,25,473);
        g.drawLine(45,398,22,470);
        g.drawLine(48,400,24,473);
        
        g.drawLine(29,500,34,496);
        g.drawLine(34,496,36,493);
        g.drawLine(36,493,36,488);
        
        g.drawLine(24,489,32,494);
        g.drawLine(29,493,33,487);
        g.drawLine(30,491,19,484);
        g.drawLine(19,484,10,482);
        
        g.drawLine(47,510,52,505);
        g.drawLine(52,505,53,498);
        g.drawLine(51,513,57,507);
        g.drawLine(57,507,58,501);
        g.drawLine(57,515,61,510);
        g.drawLine(61,510,62,504);
        
        g.drawLine(59,362,68,360);
        g.drawLine(70,367,73,367);
        g.drawLine(73,367,71,364);
        g.drawLine(75,356,83,356);
        g.drawLine(83,356,88,354);
        
        //Tornillos UZI
        Color tornillos = new Color(134,121,130);
        g.setColor(Color.BLACK);
        g.drawOval(29,477,4,4);
        g.setColor(tornillos);
        g.fillOval(29,477,4,4);
        
        g.setColor(Color.BLACK);
        g.drawOval(38,446,2,2);
        g.setColor(Color.BLACK);
        g.fillOval(38,446,2,2);
        
        g.setColor(Color.BLACK);
        g.drawOval(50,415,2,2);
        g.setColor(Color.BLACK);
        g.fillOval(50,415,2,2);
        
        g.setColor(Color.BLACK);
        g.drawOval(57,387,3,3);
        g.setColor(Color.BLACK);
        g.fillOval(57,387,3,3);
       
        
 
        
        
     }
    
}
