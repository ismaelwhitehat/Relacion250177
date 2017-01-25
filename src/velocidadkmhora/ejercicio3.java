package velocidadkmhora;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double velocidad=velocidadhora();
	}

	public static double velocidadhora(){
		double velocidad;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca la velocidad: ");
		velocidad=teclado.nextDouble();
	   System.out.println(velocidad + " Km/h :  " + velocidad*1000/3600 + " m/s");
		
		return velocidad;
	}
	

	
}
	


