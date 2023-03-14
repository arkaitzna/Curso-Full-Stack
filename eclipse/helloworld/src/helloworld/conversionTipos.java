package helloworld;

public class conversionTipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Para convertir tipos en Java se tiene que tener en cuenta si esos tipos son compatibles
		// Si son compatibles se hace directamente de esta manera
		int i = 100;
		// long > int (conversión automática)
		long l = i;
		// float > long (conversión automática)
		float f = l;
		
		//Si no son compatibles se hace de esta forma
		double d = 100;
		// short < double (casting)
		short s = (short) d;
		// byte < double (casting)
		byte b = (byte) d;
	}

}
