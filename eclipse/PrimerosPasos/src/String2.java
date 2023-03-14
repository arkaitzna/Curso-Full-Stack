public class String2 {

	public static void main(String[] args) {
		String frase="Hoy es un estupendo dia para aprender a programar Java";
		
		String fraseResumen=frase.substring(0, 29) + "para ir a clase y " + frase.substring(29);
		System.out.println(fraseResumen);
	}
}