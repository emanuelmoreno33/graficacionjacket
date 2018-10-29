package graficacion.jacket;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.*;

public class Paneldegradado extends JPanel {
    public Paneldegradado(){
  setLayout(new BorderLayout());
 }
 
 public void paintComponent(Graphics g){
  super.paintComponents(g);
  Graphics2D g2d=(Graphics2D)g;
  Color azulfuerte = new Color(0,0,162);
  Color rosafuerte = new Color (255,47,162);
  g2d.setPaint(new GradientPaint(200, 0, azulfuerte, 200, 400, rosafuerte));
  g2d.fillRect(0, 0, 400, 600);
 }
}
