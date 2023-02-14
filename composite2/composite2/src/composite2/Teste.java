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
public class Teste {

       Publicacao f=new Colecao("col3");
      public Publicacao getf(){
          return f;
      }
      public void Inicializa()
      {
          Publicacao p=new Colecao("col1");
        Publicacao b=new Colecao("col2");
        String[] h={"jose","francisco"};
        Publicacao a=new Artigo("art1",h);

        String[] h1={"joao","ana"};
        Publicacao a1=new Artigo("art2",h1);
        String[] h2={"maria","luisa"};
        Publicacao a2=new Artigo("art3",h1);
        String[] h3={"paulo","carlos"};
        Publicacao a3=new Artigo("art4",h3);
        String[] h4={"Andre","ana"};
        Publicacao a4=new Artigo("art5",h4);

        p.addPublicacao(a);

        p.addPublicacao(a1);

        b.addPublicacao(p);
        b.addPublicacao(a2);
        f.addPublicacao(b);
        f.addPublicacao(a3);
        f.addPublicacao(a4);
      }
      public void testeToString(){
            System.out.println(f.toString()+" ");
      }
      public int nPublicacoesp( Publicacao p ){
          int i=0;
          List<Publicacao> publicacoes;
          publicacoes=new ArrayList();
          publicacoes=p.getPublicacoes();

          for( Publicacao publicacao: publicacoes ){
              if ( publicacao instanceof Colecao )
              {
                  //System.out.println("nome"+publicacao.)
                  i=nPublicacoesp( publicacao )+1;

              }
          }
          return i;
            //return f.getPublicacoes().size();

      }

      public int nArtigop( Publicacao p ){
          int i=0;
          List<Publicacao> publicacoes;
          publicacoes=new ArrayList();
          publicacoes=p.getPublicacoes();

          for( Publicacao publicacao: publicacoes ){
              if ( publicacao instanceof Artigo )
              {
                  //System.out.println("nome"+publicacao.)
                  i=i+1;

              }
              else{
                  i=nArtigop(publicacao);
              }

          }
          return i;
            //return f.getPublicacoes().size();

      }

      public int nPublicacoes(){


          return  this.nPublicacoesp(f);
            //return f.getPublicacoes().size();

      }

       public int nArtigos(){


          return  this.nArtigop(f);
            //return f.getPublicacoes().size();

      }


}
