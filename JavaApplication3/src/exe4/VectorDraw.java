/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exe4;

/**
 *
 * @author usuario
 */
public class VectorDraw {
    Shape s=new Shape();
    Shape t=new Adaptador();
    int w=2;
// Obtém instancia de Shape
    int x = s.getX();
    int height = s.getHeight();

    int x2 = t.getX();
    int height2 = t.getHeight();

    public void ImprimeValores(){

        System.out.println(x2);
        System.out.println(height2);
    }

}
