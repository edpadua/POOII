package Factory;

public class TrEquilatero implements Figura{
	private double lado;
	@Override
	
	public double area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	public TrEquilatero(double lado) {
		super();
		this.lado = lado;
	}

}
