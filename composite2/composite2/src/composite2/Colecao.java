/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package composite2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Colecao extends Publicacao {
    private List<Publicacao> publicacoes;
    private String nome;
    @Override
    public List getPublicacoes(){
           return publicacoes;
    }

    public Colecao(String nome) {
        this.nome = nome;
        publicacoes=new ArrayList<Publicacao>();
    }
    @Override
       public void addPublicacao(Publicacao P ){
          
           publicacoes.add(P);
       }
    @Override
       public String toString(){
            String A;
            A=" Nome publicacao: ";
            for ( Publicacao P: publicacoes ){
                 A=A+P.toString();
            }
            return A;
       }

}
