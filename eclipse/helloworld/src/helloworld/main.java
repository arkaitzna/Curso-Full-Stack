package helloworld;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello world");

// En realidad para hacer esto de combinar string y numeros utilizamos System.out.printf
System.out.println("3+2*4*3/6=" + (3+2*4*3/6));


// Secuencia de escape: para poner comillas en un texto como el de abajo, si no pones eso \" no funciona\
System.out.println("Esto \" es una comilla");



// Existen otras secuencias de escape

// Tabulación: \t
System.out.println("Hola amigos \t esto es una tabulacion");


// Salto de linea: n\
System.out.println("Hola amigos \n esto es un Salto de line");

// Imprimir \: \\
System.out.println("Hola amigos \\ esto imprime un \\");

// Imprimir ": "\
System.out.println("Hola amigos esto imprime un \"");


// \'
System.out.println("Hola amigos esto imprime un \'");


// System.out.printf: nos ayuda a mezclar distintos tipos de valores en una expresion
System.out.printf("3+2*4*3/6=%d",  3+2*4*3/6).println();

//%d, que denota el espacio en el texto que debe ser sustituido por un número entero
//Pueden establecerse tantos caracteres de formato especial como se quiera
System.out.printf("%d + %d + %d= %d", 3,3, 3*2,12 ).println();
System.out.printf("%d+%d+%d=%d" ,5, 6 , 7, 18).println();
// Para flotantes(0.8) se utiliza %f
System.out.printf("%f+%f+%f=%f" ,0.5, 0.6 , 0.7, 1.8).println();
//Variables: siempre deben empezar el nombre de la variable por una letra minuscula ,nunca por numero ni simbolo, asi: holaMundo
int a = 2;
int b = 4;
System.out.println("a+b=" + (a+b));
  

// El valor se puede modificar mas tarde
a= 7;
b= 9;
int c= 4;
System.out.println(a+b+c);
c=8;
System.out.println(a+b+c);

int j = 2147483647;
//el valor de j es incrementado
j = j + 1;
//Tambien se puede hacer asi j++
//el valor de j es ahora -2147483648
System.out.println(j);


//1. El número de goles en un partido de fútbol. --> byte
//2. El número de personas que viven en el mundo.  --> long
//3. La letra del DNI.--> int
//4. Si una bombilla está encendida o apagada. --> boolean
//5. El precio de una barra de pan. --> float
//6. La distancia existente entre planetas. --> long

	}

}
