import java.util.Scanner;

public class clase12 {

	public static void main(String[] args) {
		// Declaramos variables
		
		int num, valorAbs;
			 
		//Mostramos mensaje
			
		System.out.println("Introduce un n�mero:");
			
		//Creamos una clase o objeto para poder pedir por teclado
			
		Scanner teclado=new Scanner (System.in);
			
		num=teclado.nextInt();
			
		//C�lculo abs
			
		valorAbs=Math.abs(num);
			
		System.out.println("El valor absoluto es "+valorAbs);
			
	}

}
