/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package composite1;

import java.util.Vector;

/**
 *
 * @author usuario
 */
public class Congresso {

        private Vector<Participante> Participantes=new Vector<Participante>();
        public void Inicializa(){
            Participante Inst=new Instituicao("Inst");
            Participante Ind=new Individuo(1,"nome1");
            Inst.add(Ind);
            Ind=new Individuo(2,"nome2");
            Inst.add(Ind);
            Ind=new Individuo(3,"nome3");

            Participantes.add(Inst);
            Participantes.add(Ind);
        }
        public int totalParticipantes(){
            int nParticipantes=0;
            for ( Participante participante: Participantes )
            {
                if ( participante instanceof Individuo ){
                     nParticipantes++;
                }
                else if (participante instanceof Instituicao )
                {
                    Instituicao I=(Instituicao)participante;
                    nParticipantes=nParticipantes+I.getMembros().size()+1;
                }
            }
            return nParticipantes;
        }
        public int totalAssentos(){
            int nAssentos=0;
            for ( Participante participante: Participantes )
            {
                if ( participante instanceof Individuo ){
                     nAssentos++;
                }
                else if (participante instanceof Instituicao )
                {
                    Instituicao I=(Instituicao)participante;
                    nAssentos=nAssentos+I.getMembros().size();
                }
            }

            return nAssentos;
        }
}
