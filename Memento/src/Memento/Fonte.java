package Memento;

public class Fonte {
	
	
	
	
	public Memento criarMemento(Object e) {
		return new Memento(e);
		}
		public Object restauraDoMemento(Memento m) {
		     return m.getEstado();
     }

	
	

}
