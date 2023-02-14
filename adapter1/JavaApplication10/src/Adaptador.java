/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Adaptador extends Shape{
       RasterBox R=new RasterBox();

    public Adaptador() {
    }

    @Override
       public int getX() {  return (R.getBottomRight().x+R.getTopLeft().x)/2; }
    @Override
       public int getY() {  return (R.getBottomRight().y+R.getTopLeft().y)/2;}
    @Override
       public int getHeight() { return R.getTopLeft().y-R.getBottomRight().y;}
    @Override
       public int getWidth() { return R.getBottomRight().x-R.getTopLeft().x;  }

}
