package Factory;

public class Circulo implements Figura{

    private double raio;
    
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double area() {
		
		return (raio*raio)*3.14;
	}

}
