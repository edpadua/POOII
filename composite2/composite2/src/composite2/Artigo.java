/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package composite2;

/**
 *
 * @author usuario
 */
public class Artigo extends Publicacao{
       private String Nome;
       private String[] Autores;

    public Artigo(String Nome, String[] Autores) {
        this.Nome = Nome;
        this.Autores = Autores;
    }
    @Override
    public String toString(){
        String a="Nome artigo: ";
        a=a+Nome;
        a=a+"Autor ";
        int i=0;
        System.out.println(" ");
        for (i=0; i<Autores.length; i++ )
        {
           a=a+" "+Autores[i]+" ";
        }
        return(a);
    }
}
