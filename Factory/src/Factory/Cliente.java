package Factory;

public class Cliente {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Criador c;
		Figura f;
		c=CriadorFactory.getCriador("Circulo");
		f=c.getFigura(2);
        System.out.println("Area"+f.area());
	}

}
