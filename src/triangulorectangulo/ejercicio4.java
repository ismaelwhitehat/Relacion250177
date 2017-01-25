package triangulorectangulo;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double longitud=triangulorec();
	}
public static double triangulorec(){
double cateto1;
double cateto2;
Scanner teclado=new Scanner(System.in);
System.out.print("Introduzca longitud del primer cateto: ");
cateto1=teclado.nextDouble();
System.out.print("Introduzca longitud del segundo cateto: ");
cateto2=teclado.nextDouble();
System.out.println("Hipotenusa: "+ Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2,2)));

return cateto2;

}
	
}

