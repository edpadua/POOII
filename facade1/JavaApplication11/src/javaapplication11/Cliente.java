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
public class Cliente {
   int Id;
   String nome;
    Carrinho cr;

    public Cliente(int Id, String nome) {
        this.Id = Id;
        this.nome = nome;
    }

   static Cliente create(String nome, int Id) {
        Cliente c=new Cliente(Id,nome);
        return c;
   }
   void adicionarCarrinho(Carrinho c) {
        cr=c;
   }
   Carrinho getCarrinho() {
        return cr;
   }
}
