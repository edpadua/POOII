/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package composite2;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teste t=new Teste();
        t.Inicializa();
        t.testeToString();
        System.out.println("numero de publicacao "+t.nPublicacoes());
          System.out.println("numero de publicacao "+t.nArtigos());


    }

}
