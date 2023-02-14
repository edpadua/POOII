/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class RasterBox {
    private Coords topLeft, bottomRight;

    public RasterBox() {
         topLeft=new Coords();
         bottomRight=new Coords();
         topLeft.x=1;
         topLeft.y=9;
         bottomRight.x=5;
         bottomRight.y=3;
    }
    public Coords getTopLeft() {
    return topLeft;
    }
    public Coords getBottomRight() {
    return bottomRight;
    }
}
