/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class manoUzi extends JPanel {
    
    public manoUzi() {
    
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        //*****MUÑECA*******
        //banda de la chamarra del brazo izquierdo 
        Color mangaChamarraIzq = new Color(169, 87, 101);
        int [] mangaizqX = {63,75,87,92,90,88,83,76,68,58,
                            55,60,63};
        
        int [] mangaizqY = {395,395,399,402,411,420,416,413,412,412,
                            408,402,395};
        
        g.setColor(mangaChamarraIzq);
        g.fillPolygon(mangaizqX,mangaizqY,13);
        g.setColor(Color.BLACK);
        g.drawPolygon(mangaizqX,mangaizqY,13);
        
        //*******MANO********
        //banda de la mano izquierda
        Color manoIzq = new Color(235,235,235);
        int [] manoizqX = {56,60,60,73,75,77,78,80,81,82,
            83,85,85,86,87,86,85,85,83,82,
            81,60,64,68,68,68,67,66,66,65,
            64,63,62,61,60,56,55,54,52,52,
            53,53,54,55,55,56};
        
        int [] manoIzqY = {412,412,411,411,413,413,413,414,414,416,
                           417,417,420,421,420,428,430,434,440,447,
                           449,440,431,433,431,430,428,428,427,426,
                           425,424,424,423,422,422,424,426,425,423,
                           422,420,418,416,414,412};
        
        g.setColor(manoIzq);
        g.fillPolygon(manoizqX,manoIzqY,46);
        g.setColor(Color.BLACK);
        g.drawPolygon(manoizqX,manoIzqY,46);
        
        //Dedo índice de la mano izquierda
        //Color de los dedos
        Color dedos = new Color(243,204,175);
        int [] dedoIX = {52,46,43,43,44,45,50,52,54,54,54,53,
                        52,51,50,52,58,52};
        
        int [] dedoIY = {424,447,458,466,469,472,477,477,474,473,470,469,
                        467,464,459,448,427,425};
        
        g.setColor(dedos);
        g.fillPolygon(dedoIX,dedoIY,18);
        g.setColor(Color.BLACK);
        g.drawPolygon(dedoIX,dedoIY,18);
        
        //Dedo extra(?) de la mano izquierda
        int [] dedoEX = {77,77,74,73,72,75,77};
        
        int [] dedoEY = {460,467,467,466,464,461,460};
        
        g.setColor(dedos);
        g.fillPolygon(dedoEX,dedoEY,7);
        g.setColor(Color.BLACK);
        g.drawPolygon(dedoEX,dedoEY,7);
        
        //Dedo meñique de la mano izquierda
        int [] dedoMinX = {77,80,80,79,79,78,72,71,70,68,
                           68,66,65,65,76};
        
        int [] dedoMinY = {444,444,454,455,458,460,465,465,466,466,
                           465,465,464,462,444};
        
        g.setColor(dedos);
        g.fillPolygon(dedoMinX,dedoMinY,15);
        g.setColor(Color.BLACK);
        g.drawPolygon(dedoMinX,dedoMinY,15);
        
         //Dedo anular de la mano izquierda
        int [] dedoAX = {70,71,73,74,76,76,75,75,74,72,
                         70,68,67,65,65,60,59,57,56,57,
                         68,70};
        
        int [] dedoAY = {433,441,439,439,441,451,451,454,456,458,
                         460,461,462,462,463,463,462,461,460,458,
                         443,443};
        
        g.setColor(dedos);
        g.fillPolygon(dedoAX,dedoAY,22);
        g.setColor(Color.BLACK);
        g.drawPolygon(dedoAX,dedoAY,22);
        
        //Dedo medio de la mano izquierda
        int [] dedoMX = {62,62,63,63,65,66,68,69,70,70,
                         69,69,68,68,67,66,66,64,63,61,
                         59,54,53,53,55,58,60,62};
        
        int [] dedoMY = {444,442,440,439,437,436,436,438,439,443,
                         444,446,447,449,450,451,453,455,457,458,
                         459,459,457,454,453,451,449,444};
        
        g.setColor(dedos);
        g.fillPolygon(dedoMX,dedoMY,28);
        g.setColor(Color.BLACK);
        g.drawPolygon(dedoMX,dedoMY,28);
        
               //Mango del arma
       Color Mango = new Color(74,62,76);
       int [] MangoX = {52,45,53,55,52};
       
       int [] MangoY = {425,445,453,451,425};
       
       g.setColor(Mango);
       g.fillPolygon(MangoX,MangoY,5);
       g.setColor(Color.BLACK);
       g.drawPolygon(MangoX,MangoY,5);
        
        //Dedo Pulgar de la mano izquierda
        int [] dedoPX = {57,60,62,64,66,67,68,68,66,63,
                        63,62,61,60,61,61,62,63,63,62,
                        61,60,58,56,54,51,51,52,52,53,
                        53,55,57};
        
        int [] dedoPY = {422,422,424,425,427,428,431,433,434,434,
                         436,438,440,442,444,446,448,449,452,454,
                         455,455,454,452,450,447,440,439,435,434,
                         428,425,422};
        
        g.setColor(dedos);
        g.fillPolygon(dedoPX,dedoPY,33);
        g.setColor(Color.BLACK);
        g.drawPolygon(dedoPX,dedoPY,33);
        
        
        /**********ARMA*********
             Cuerpo del arma parte lateral*/
        
       Color armaPLateral = new Color(56,206,239);
       int [] armaLateralX = {47,65,33,14,47};
       
       int [] armaLateralY = {372,383,486,476,372};
       
       g.setColor(armaPLateral);
       g.fillPolygon(armaLateralX,armaLateralY,5);
       g.setColor(Color.BLACK);
       g.drawPolygon(armaLateralX,armaLateralY,5); 
        
        //Cuerpo del arma parte superior
        Color armaPSuperior = new Color(56,206,239);
        int [] armaSuperiorX = {48,44,15,14,11,11,9,8,9,34,
                                34,35,35,34,34,35,35,36,37,37,
                                40,41,48};
       
       int [] armaSuperiorY = {371,381,472,477,477,476,476,474,469,392,
                               389,388,384,384,382,382,380,377,376,373,
                               373,371,371};
       
       g.setColor(armaPSuperior);
       g.fillPolygon(armaSuperiorX,armaSuperiorY,23);
       g.setColor(Color.BLACK);
       g.drawPolygon(armaSuperiorX,armaSuperiorY,23); 
       
       //Boton de la parte Superior
       Color boton = new Color(90,102,128);
       int [] boton1X = {18,18,17,17,14,12,15,16,17,17,
                        15,12,11,11,12};
       
       int [] boton1Y = {451,456,457,458,461,460,457,454,451,450,
                        450,453,455,459,460};
       
       g.setColor(boton);
       g.fillPolygon(boton1X,boton1Y,15);
       g.setColor(Color.BLACK);
       g.drawPolygon(boton1X,boton1Y,15); 
       
         int [] boton2X = {19,29,30,30,28,27,27,18,19};
       
         int [] boton2Y = {450,420,419,418,417,419,421,449,450};
       
       g.setColor(boton);
       g.fillPolygon(boton2X,boton2Y,9);
       g.setColor(Color.BLACK);
       g.drawPolygon(boton2X,boton2Y,9); 
       
        //Gatillo del Arma
       Color Gatillo = new Color(74,62,76);
       //Fierro de alrededor
       int [] GatilloX = {45,51,52,52,52,51,49,47,45,44,
                          38,39,43,46,48,48,48,49,50,50,
                          47,44,45};
       
       int [] GatilloY = {448,452,453,457,462,465,468,470,471,471,
                          469,466,468,468,465,462,460,459,457,454,
                          452,450,448};
       
       g.setColor(Gatillo);
       g.fillPolygon(GatilloX,GatilloY,23);
       g.setColor(Color.BLACK);
       g.drawPolygon(GatilloX,GatilloY,23);
       
       //Actual gatillo
       int [] GatilloAX = {43,48,47,46,44,42,43};
       
       int [] GatilloAY = {453,458,459,459,457,456,453};
       
       g.setColor(Gatillo);
       g.fillPolygon(GatilloAX,GatilloAY,7);
       g.setColor(Color.BLACK);
       g.drawPolygon(GatilloAX,GatilloAY,7);
       
        //Grip Anillo
        Color Grip = new Color(109,111,162);
       int [] GripAnilloX = {28,28,30,33,36,38,38,36,34,32,28};
       
       int [] GripAnilloY = {497,501,501,500,496,492,489,487,487,489,496};
       
       g.setColor(Grip);
       g.fillPolygon(GripAnilloX,GripAnilloY,11);
       g.setColor(Color.BLACK);
       g.drawPolygon(GripAnilloX,GripAnilloY,11);
       
       // GRIP parte de arriba
       int [] GripArribaX = {15,29,32,34,33,31,28,24,24,10,11,12,15};
       
       int [] GripArribaY = {477,485,487,490,493,495,496,494,489,482,479,478,477};
       
       g.setColor(Grip);
       g.fillPolygon(GripArribaX,GripArribaY,13);
       g.setColor(Color.BLACK);
       g.drawPolygon(GripArribaX,GripArribaY,13);
       
         // GRIP parte de abajo
       int [] GripAbajoX = {39,53,54,67,67,62,61,47,46,33,39};
       
       int [] GripAbajoY = {491,498,498,508,513,518,518,510,510,500,491};
       
       g.setColor(Grip);
       g.fillPolygon(GripAbajoX,GripAbajoY,11);
       g.setColor(Color.BLACK);
       g.drawPolygon(GripAbajoX,GripAbajoY,11);
       
       
       //Cañon del arma
       Color Cañon = new Color(109,111,162);
       int [] CañonX = {24,24,23,0,0,7,9,9,10,15,19,24};
       
       int [] CañonY = {487,489,493,567,505,484,484,482,482,482,484,487};
       
       g.setColor(Cañon);
       g.fillPolygon(CañonX,CañonY,12);
       g.setColor(Color.BLACK);
       g.drawPolygon(CañonX,CañonY,12);
       
       Color CañonHoyos = new Color(75,83,120);
       int [] CañonHX1 = {6,7,8,9,7,5,4,3,4,6};
       
       int [] CañonHY1 = {505,501,498,496,496,497,501,505,506,505};
       
       g.setColor(CañonHoyos);
       g.fillPolygon(CañonHX1,CañonHY1,10);
       g.setColor(Color.BLACK);
       g.drawPolygon(CañonHX1,CañonHY1,10);
       
       int [] CañonHX2 = {16,18,20,19,17,16,14,15,16};
       
       int [] CañonHY2 = {504,499,496,493,493,496,501,503,504};
       
       g.setColor(CañonHoyos);
       g.fillPolygon(CañonHX2,CañonHY2,9);
       g.setColor(Color.BLACK);
       g.drawPolygon(CañonHX2,CañonHY2,9);
       
       int [] CañonHX3 = {13,10,9,9,10,12,13,14,13};
       
       int [] CañonHY3 = {511,513,518,521,522,520,517,513,511};
       
       g.setColor(CañonHoyos);
       g.fillPolygon(CañonHX3,CañonHY3,9);
       g.setColor(Color.BLACK);
       g.drawPolygon(CañonHX3,CañonHY3,9);
       
       int [] CañonHX4 = {8,6,3,3,5,6,8,8};
       
       int [] CañonHY4 = {529,529,535,538,539,539,531,529};
       
       g.setColor(CañonHoyos);
       g.fillPolygon(CañonHX4,CañonHY4,8);
       g.setColor(Color.BLACK);
       g.drawPolygon(CañonHX4,CañonHY4,8);
       
       int [] CañonHX5 = {0,2,2,0,0};
       
       int [] CañonHY5 = {517,518,520,527,517};
       
       g.setColor(CañonHoyos);
       g.fillPolygon(CañonHX5,CañonHY5,5);
       g.setColor(Color.BLACK);
       g.drawPolygon(CañonHX5,CañonHY5,5);
       
       //Culata del arma Parte 1 (fierro)
       Color Culata = new Color(109,111,162);
       int [] Culata2X = {59,59,62,65,67,70,74,80,80,88,
                          87,82,82,81,81,74,73,69,68,62,59};
       
       int [] Culata2Y = {364,361,359,359,360,365,356,356,355,351,
                          358,360,362,363,366,369,370,370,369,365,364};
       
       g.setColor(Culata);
       g.fillPolygon(Culata2X,Culata2Y,21);
       g.setColor(Color.BLACK);
       g.drawPolygon(Culata2X,Culata2Y,21);
       
       
       //Culata del arma parte 2 (palillos)
       int [] Culata1X = {64,69,69,69,68,66,61,58,61,60,59,56};
       
       int [] Culata1Y = {381,365,364,361,361,362,380,377,365,364,364,376};
       
       g.setColor(Culata);
       g.fillPolygon(Culata1X,Culata1Y,12);
       g.setColor(Color.BLACK);
       g.drawPolygon(Culata1X,Culata1Y,12);
       
       //Culata Parte 3 (Correa)
       int [] Culata3X = {86,84,80,77,75,74,74,76,80,82,
                          84,86,87,83,79,77,76,77,79,82,
                          86,86};
       
       int [] Culata3Y = {331,330,325,319,315,313,309,307,307,308,
                          310,312,318,313,309,309,311,314,318,324,
                          328,331};
       
       g.setColor(Culata);
       g.fillPolygon(Culata3X,Culata3Y,22);
       g.setColor(Color.BLACK);
       g.drawPolygon(Culata3X,Culata3Y,22);
       
   
    }
    
}
