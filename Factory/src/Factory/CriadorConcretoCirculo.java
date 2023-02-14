package Factory;

public class CriadorConcretoCirculo implements Criador{

	Figura figura;
	
	@Override
	public Figura getFigura( double a) {
		// TODO Auto-generated method stub
		figura=new Circulo(a);
		return figura;
		
	}

	@Override
	public void operacao() {
		// TODO Auto-generated method stub
		
	}

}
