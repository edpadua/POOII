/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package composite1;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Instituicao extends Participante{
     private ArrayList<Participante> participantes=new ArrayList();
     private String nome;


    public Instituicao(String nome) {
        this.nome = nome;
    }
    @Override
    public void add( Participante participante ){
           participantes.add(participante);

      }
    @Override
      public void remove(Participante participante){
          participantes.remove(participante);

      }
    @Override
      public Participante getChild( int i ){
           return (Participante)participantes.get(i);
      }
      public ArrayList getMembros(){
          return participantes;
      }
      public void ImprimeMembros(){
          for( Participante Participante: participantes )
          {
              System.out.println(participantes+" "+this.nome);
          }
      }

}
