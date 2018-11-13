
package graficacion.jacket;
import java.awt.event.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;

public class GraficacionJacket extends JFrame{
 
	public GraficacionJacket(){

	}
    
    public static void main(String[] args)
    {        
        ventana window = new ventana();
        window.setTitle("Graficacion 4ta Unidad - Jacket");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //declaras las clases
        degradadolineal degradado = new degradadolineal();
        sol soldibujo = new sol();
        ciudad ciudaddibujo = new ciudad();
        palmas palmasdibujo = new palmas();
        Torso torsodibujo = new Torso();
        Pantalon pantalondibujo = new Pantalon();
        brazos brazosdibujo = new brazos();
        manomartillo manoderecha = new manomartillo();
        Mascara mascaradibujo = new Mascara();
        manchas manchasdibujo = new manchas();
//el que se muestra primero va arriba,lo que seria la mascara, al final debe estar el degradado
        manchasdibujo.setBounds(0, 0, 350, 650);
        window.getContentPane().add(manchasdibujo);
        
        mascaradibujo.setBounds(0,0,350,650);
        window.getContentPane().add(mascaradibujo);

        manoderecha.setBounds(0, 0, 350, 650);
        window.getContentPane().add(manoderecha);

        brazosdibujo.setBounds(0, 0, 350, 650);
        window.getContentPane().add(brazosdibujo);
        
        torsodibujo.setBounds(0,0,350,650);
        window.getContentPane().add(torsodibujo);

        pantalondibujo.setBounds(0,0,350,650);
        window.getContentPane().add(pantalondibujo);

        palmasdibujo.setBounds(0,0,350,650);
        window.getContentPane().add(palmasdibujo);
        
        ciudaddibujo.setBounds(0,0,350,650);
        window.getContentPane().add(ciudaddibujo);
        
        soldibujo.setBounds(0, 0, 350, 650);
        window.getContentPane().add(soldibujo);
        
        degradado.setBounds(0, 0, 350, 650);
        window.getContentPane().add(degradado);
        
        JButton boton = new JButton();
        boton.setText("Guardar");
        boton.addActionListener((ActionEvent e) -> {
            guardar(window);
        });
        boton.setLocation(340, 200);
        boton.setSize(100,50);
        window.add(boton);
        window.setVisible(true);
        window.setSize(455,649);  
        
    }
    
    
    public static void guardar(ventana ven)
    {
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Ubicacion para guardar");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG","jpg");
        file.setFileFilter(filter);
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
        {
        File fichero = new File(file.getSelectedFile() + ".jpg");
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

    }


