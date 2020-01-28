/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import codigo.VentanaHerramientas;
import codigo.VentanaPaint;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Javier
 */
public class RectanguloLibre extends Polygon {
    //Nos indican los puntos desde los que parten las líneas
    public int x, y;
    //Color del que se pintará la línea
    public Color color;
    
    public RectanguloLibre(int posX, int posY, Color _color ) {
        x = posX;
        y = posY;
        color = _color;
    }
    
    public void dibujate(Graphics2D g2, int posX, int posY ,int grosor) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(grosor));
        //Pinto la línea superior
        g2.drawLine( x, y, posX, y);
        //Pinto la línea inferior
        g2.drawLine( x, posY, posX, posY);
        //Pinto la línea lateral
        g2.drawLine( x, y, x, posY);
       
        g2.drawLine( posX, y, posX, posY);    
        
    }
}
