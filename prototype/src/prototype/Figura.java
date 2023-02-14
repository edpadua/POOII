package prototype;

import java.util.HashMap;

public class Figura implements Cloneable{
	
	
	
	
	static HashMap construtor = new HashMap<String, Figura>();
	
	
	public Figura(String nome){
		
		construtor = new HashMap<String, Figura>();
	}
	
	public Object clone() {
        
        try {
        	return super.clone();
        	

        	} catch (CloneNotSupportedException e) {return null;}

        
}

	
	public double getArea(){
		return 1;
	}


	public static Figura getFigura(String palavra) {
		Figura aux=null;
		
		if(construtor.containsKey(palavra)){
			return (Figura) construtor.get(palavra);
			
		}
		else{
			
			if(palavra.equals("c")) {
			aux = new Circulo("c");
			construtor.put("c", aux);
			
			}
			

			if(palavra.equals("q")){
			aux = new Quadrado("q");
			construtor.put("q", aux);
		
			}
			

			if(palavra.equals("t")){
			aux = new TriangEquilatero("t");
			construtor.put("t", aux);
			}

			return aux;
			
		}
		
	}


	

}
