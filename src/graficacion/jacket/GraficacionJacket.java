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
        degradado.setBounds(0, 0, 400, 600);
        window.getContentPane().add(degradado);
        window.setVisible(true);
        window.setSize(400,600);
        
    }
}
