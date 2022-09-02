import java.util.Scanner;

public class Numero4v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Informe a população da cidade A: ");
	    double a = entrada.nextDouble();
	    System.out.print("Informe a população da cidade B");
	    double b = entrada.nextDouble();
	    int ano = 0;
	    
	    while (a <= b) { 
	    	a = (a * 0.03);
	    	b = (b * 0.015);
	    	ano = ano + 1;
	    }
	    
	    System.out.println("A irá ultrapassar ou igualar-se a B em " +ano+ " anos");
	    
	    entrada.close();
	}

}
