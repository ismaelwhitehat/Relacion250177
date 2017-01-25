package radiocircunferencia;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double longitud=radiocircunferencia();
System.out.println(longitud);
System.out.println();

	}

public static double radiocircunferencia(){
double radio;
double longitud;
double area;
Scanner teclado=new Scanner(System.in);
System.out.println("Introduce el radio de la circunferencia: ");
radio=teclado.nextDouble();
longitud = 2 * Math.PI * radio; 
area = Math.PI * Math.pow(radio, 2);
System.out.println("Longitud de la circunferencia: "+longitud);
System.out.println("Area de la circunferencia : "+area);

return area;
}
	
}

