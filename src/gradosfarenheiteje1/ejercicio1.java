package gradosfarenheiteje1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float gradosF = farenheit();
		System.out.println(gradosF);
	    System.out.println(); 
	    
	}

	public static float farenheit() {
		float gradosF;
		float gradosC;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce grados cent�grados: ");
		gradosC = teclado.nextFloat();
		gradosF =32 + (9 * gradosC / 5);
		System.out.println(gradosC +" �C = " + gradosF + " �F");

		return gradosF;

	}

}
