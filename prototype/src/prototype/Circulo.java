package prototype;

public class Circulo extends Figura{
	public int raio;
	
	
	public Circulo(String a){

		super(a);
		
	} 

	
	
	public double getArea(){
		//System.out.println("Usando a area do Circulo");
		return 3*(2*3.14*3.14);
		//supondo que raio = 3
	}
	
	

}