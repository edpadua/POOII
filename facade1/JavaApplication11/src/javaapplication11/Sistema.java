/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

/**
 *
 * @author usuario
 */
public class Sistema {
      BancoDeDados Banco=new BancoDeDados();
      public BancoDeDados obterBanco(){
          Cliente c=new Cliente(1,"Jose");
          Carrinho ca = Carrinho.create();
          c.adicionarCarrinho(ca);
          Banco.Clientes.add(c);
          c=new Cliente(2,"Luisa");
          c.adicionarCarrinho(ca);
          Banco.Clientes.add(c);
          c=new Cliente(3,"Carlos");
          c.adicionarCarrinho(ca);
          Banco.Clientes.add(c);
          c=new Cliente(4,"Maria");
          c.adicionarCarrinho(ca);
          Banco.Clientes.add(c);

          Produto p=new Produto("Açucar",1,5);
          Banco.Produtos.add(p);
          p=new Produto("Arroz",2,6);
          Banco.Produtos.add(p);
          p=new Produto("Farinha",3,7);
          Banco.Produtos.add(p);
          p=new Produto("Feijao",4,4);
          Banco.Produtos.add(p);

          return Banco;
      }
}
