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

/**
 *
 * @author Maxcel Center
 */
public class GraficacionJacket extends JFrame{
    public static void main(String[] args)
    {
        ventana window = new ventana();
        
        window.setTitle("Primera ventana");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        degradadolineal degradado = new degradadolineal();
        sol soldibujo = new sol();
        degradado.setBounds(0, 0, 350, 650);
        window.getContentPane().add(degradado);
        soldibujo.setBounds(0, 0, 350, 650);
        window.getContentPane().add(soldibujo);
        window.setVisible(true);
        window.setSize(350,650);
        
    }
}
