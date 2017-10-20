import java.util.Scanner;

public class ejercicio12a {

	public static void main(String[] args) {
		// Declaramos variables
		
				int num;
					 
				//Mostramos mensaje
					
				System.out.println("Introduce un número y te diré su valor absoluto:");
					
				//Creamos una clase o objeto para poder pedir por teclado
					
				Scanner teclado=new Scanner (System.in);
					
				num=teclado.nextInt();
							
				System.out.print("\nEl valor absoluto es ");
				if (num>0)
				{
					System.out.print(num);
				}
				else 
				{
					System.out.println(num*(-1));
				}
					
		}

}
