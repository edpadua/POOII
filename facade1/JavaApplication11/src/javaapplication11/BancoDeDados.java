/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

import java.util.Vector;

/**
 *
 * @author usuario
 */
public class BancoDeDados {
     Vector<Cliente> Clientes=new Vector<Cliente>();
     Vector<Produto> Produtos=new Vector<Produto>();
     Cliente selectCliente(int id) {
         int i=0;
         boolean achou=false;
         while(i<=Clientes.size()&& !achou)
         {
             if (Clientes.elementAt(i).Id==id)
             {
                 achou=true;
             }
             else
                 i++;
         }
         if( achou)
         {
             return Clientes.elementAt(i);
         }
         else
             return null;
     }
     Produto selectProduto(int id) {
         int i=0;
         boolean achou=false;
         while(i<=Produtos.size()&& !achou)
         {
             if (Produtos.elementAt(i).Id==id)
             {
                 achou=true;
             }
             else
                 i++;
         }
         if( achou)
         {
             return Produtos.elementAt(i);
         }
         else
             return null;
     }
     void processarPagamento() {}
}
