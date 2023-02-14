package Memento;

public class Memento {
	private Object estado;
    
	Memento( Object estado ) {
		this.estado=estado;
	}

	Object getEstado() {
	return estado;
	}

}
