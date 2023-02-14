package Factory;

public class CriadorConcretoTriangulo implements Criador{

	Figura figura;
	@Override
	public Figura getFigura(double a) {
		// TODO Auto-generated method stub
		figura=new TrEquilatero(a);
		return figura;
	}

	@Override
	public void operacao() {
		// TODO Auto-generated method stub
		
	}

}
