/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion.jacket;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author Maxcel Center
 */
public class GraficacionJacket extends JFrame{
 
	public GraficacionJacket(){

	}
    
    public static void main(String[] args)
    {        
        ventana window = new ventana();
        window.setTitle("Primera ventana");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //declaras las clases
        degradadolineal degradado = new degradadolineal();
        sol soldibujo = new sol();
        ciudad ciudaddibujo = new ciudad();
        palmas palmasdibujo = new palmas();
        lineasfondo lineasdibujo = new lineasfondo();
//el que se muestra primero va arriba,lo que seria la mascara, al final debe estar el degradado
        palmasdibujo.setBounds(0,0,350,650);
        window.getContentPane().add(palmasdibujo);
        
        ciudaddibujo.setBounds(0,0,350,650);
        window.getContentPane().add(ciudaddibujo);
        
        soldibujo.setBounds(0, 0, 350, 650);
        window.getContentPane().add(soldibujo);
        
        lineasdibujo.setBounds(0,0,350,650);
        window.getContentPane().add(lineasdibujo);
        
        degradado.setBounds(0, 0, 350, 650);
        window.getContentPane().add(degradado);
        
        window.setVisible(true);
        window.setSize(356,649);  
        
    }
    
    
    public void guardar(ventana ven)
    {
        File fichero = new File("foto.jpg");
		String formato = "jpg";

		// Creamos la imagen para dibujar en ella.
		BufferedImage imagen = new BufferedImage(340,610, BufferedImage.TYPE_INT_RGB);

		// Hacemos el dibujo
		Graphics g = imagen.getGraphics();
		ven.getContentPane().paint(g);

		// Escribimos la imagen en el archivo.
		try {
			ImageIO.write(imagen, formato, fichero);
		} catch (IOException e) {
			System.out.println("Error de escritura");
		}
    }

    }


