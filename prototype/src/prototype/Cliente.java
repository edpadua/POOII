package prototype;

public class Cliente {
	public double area;
	
	
	
	
	
	public static void main(String[] args) {
		
				
		
		Figura f2 = Figura.getFigura("q");
		System.out.println(" Area:" + f2.getArea());


		Figura f1 = Figura.getFigura("c");
		System.out.println("Area:" + f1.getArea());
		
		Figura f3 = Figura.getFigura("t");
		System.out.println(" Area:" + f3.getArea());
		

		
		Circulo c = (Circulo)f1.clone();
		System.out.println("Circulo de raio:" + c.raio);
		
		
	
		
	}
	
	
	
}