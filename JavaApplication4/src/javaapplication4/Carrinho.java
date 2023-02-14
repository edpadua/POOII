/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.util.Vector;


/**
 *
 * @author usuario
 */
public class Carrinho {
    Vector<Produto> prod=new Vector<Produto>();
    private double total=0;

    public Carrinho() {
    }
    
    static Carrinho create() {
        Carrinho c=new Carrinho();
        return c;
    }
    void adicionar(Produto p) {
     
        prod.add(p);
        total=total+p.preco;
        
    }
    double getTotal() {
        return total;
    }

}
