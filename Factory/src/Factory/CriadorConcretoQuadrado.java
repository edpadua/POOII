package Factory;

public class CriadorConcretoQuadrado implements Criador{

	Figura figura;
	@Override
	public Figura getFigura(double a) {
		// TODO Auto-generated method stub
		figura=new Quadrado(a);
		return figura;
		
	}

	@Override
	public void operacao() {
		// TODO Auto-generated method stub
		
	}

}
