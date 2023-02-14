/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exe4;

/**
 *
 * @author usuario
 */
public class RasterBox {
   private Coords topLeft, bottomRight;
   public Coords getTopLeft(){
      return topLeft;
   }
   public Coords getBottomRight() {
      return bottomRight;
   }
   public RasterBox(){
        topLeft=new Coords();
        bottomRight=new Coords();
        topLeft.x=4;
        topLeft.y=9;
        bottomRight.x=8;
        bottomRight.y=1;
   }
}
