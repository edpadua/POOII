/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package composite1;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Congresso c=new Congresso();
        c.Inicializa();
        System.out.println("total de participantes "+c.totalParticipantes());
        System.out.println("total de assentos "+c.totalAssentos());

        // TODO code application logic here
    }

}
