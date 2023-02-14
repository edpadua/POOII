package Memento;

public class Sistema {

	 Janela janela=new Janela();
	 Fonte fonte=new Fonte();
	 Memento memento;
	 
	 public void gravar(){
	     memento=fonte.criarMemento(janela);
	     
	 }
	 
	 public void undo(){
	     janela=(Janela)fonte.restauraDoMemento(memento);
	     
	 }
	
}
