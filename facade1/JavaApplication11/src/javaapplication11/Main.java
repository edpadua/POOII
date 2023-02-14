/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facade f=new Facade();
        System.out.println(f.banco.Clientes.elementAt(0).nome);
        System.out.println(f.banco.Clientes.elementAt(1).nome);
        System.out.println(f.banco.Clientes.elementAt(2).nome);
        System.out.println(f.banco.Clientes.elementAt(3).nome);
        f.registrar("antonio", 5);
        System.out.println(f.banco.Clientes.elementAt(4).nome);
        f.comprar(2, 2);

        // TODO code application logic here
    }

}
