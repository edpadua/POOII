package Factory;

public class Quadrado implements Figura{

	private double lado;
	@Override
	
	public double area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

}
