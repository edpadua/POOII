/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

/**
 *
 * @author usuario
 */
public class Produto {
    String nome;
    int Id;
    double preco;

    public Produto(String nome, int Id, double preco) {
        this.nome = nome;
        this.Id = Id;
        this.preco = preco;
    }

    static Produto create(String nome, int id,double preco) {
        Produto p=new Produto(nome,id,preco);
        return p;

    }
    double getPreco() {
      return this.preco;
    }

}
