package Memento;

public class Cliente {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sistema s=new Sistema();
		
		s.janela.TextField="texto1";
		s.janela.imprimeJanela();
		s.gravar();
		s.janela.imprimeJanela();
		s.undo();
		s.janela.imprimeJanela();

	}

}

