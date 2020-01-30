/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Javier
 */
public class Limpiar extends Polygon {


    public void dibujate(Graphics2D g2, JPanel _panel) {
        g2.setColor(Color.white);
        g2.fillRect(0, 0, _panel.getWidth(), _panel.getHeight());
        
         
    }
}
