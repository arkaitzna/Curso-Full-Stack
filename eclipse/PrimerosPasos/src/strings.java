
public class strings {

	public static void main(String[] args) {
		String nombre="alberto";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("La primera letra de mi nombre es la " + nombre.charAt(0));
		int ultimaletra;
		ultimaletra=nombre.length();
		System.out.println("La ultima letra es la " + nombre.charAt(ultimaletra-1));


	}
}
