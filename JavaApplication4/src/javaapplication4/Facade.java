/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author usuario
 */
public class Facade {

    public Facade() {
    }
    Sistema S=new Sistema();
    BancoDeDados banco = S.obterBanco();
    public void registrar(String nome, int id) {
         Cliente cl = Cliente.create(nome, id);
         Carrinho c = Carrinho.create();
         cl.adicionarCarrinho(c);
         banco.Clientes.addElement(cl);
}
public void comprar(int prodID, int clienteID) {
         Cliente c = banco.selectCliente(clienteID);
         Produto p = banco.selectProduto(prodID);
         c.getCarrinho().adicionar(p);
       
}
public void fecharCompra(int clienteID) {
      Cliente c = banco.selectCliente(clienteID);
      double valor = c.getCarrinho().getTotal();
     // banco.processarPagamento(c, valor);
}

}
