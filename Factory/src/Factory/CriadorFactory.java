package Factory;

import java.util.HashMap;

public class CriadorFactory {
  static HashMap<String, Figura> criadores;
  public CriadorFactory(){
	  criadores.put("Circulo", new CriadorConcretoCirculo());
	  criadores.put("Quadrado", new CriadorConcretoQuadrado());
	  criadores.put("Triangulo", new CriadorConcretoTriangulo());
  }
  
  public Figura getFigura(String nome){
	  if(criadores.containsKey(nome)){
		  return (Figura) criadores.get(nome);
		  
	  }
	  else{
		  if(nome.equals("circulo")){
			  Figura aux;
			  aux = (Figura) new CriadorConcretoCirculo());
			  
			  criadores.put("Circulo", aux);
		  }
		  
		  
	  }
	  criadores.put("Circulo", new CriadorConcretoCirculo());
	  criadores.put("Quadrado", new CriadorConcretoQuadrado());
	  criadores.put("Triangulo", new CriadorConcretoTriangulo());
  }
  
  
  
  public static Criador getCriador( String key){
	  Criador c=(Criador)criadores.get(key);
	  return c.getFigura(a);
  }
}
