/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exe4;

/**
 *
 * @author usuario
 */
public class Adaptador extends Shape {
     RasterBox Box=new RasterBox();
    @Override
     public int getX() { return ( Box.getTopLeft().x+Box.getBottomRight().x )/2; }
    @Override
     public int getY() { return ( Box.getTopLeft().y+Box.getBottomRight().y )/2; }
    @Override
     public int getHeight() {
         return Box.getTopLeft().y-Box.getBottomRight().y; }
    @Override
     public int getWidth() {
         return Box.getBottomRight().x-Box.getTopLeft().x;
     }

}
