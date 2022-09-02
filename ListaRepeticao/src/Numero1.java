import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    System.out.print("Insira uma nota entre 0 e 10: ");
	    int numero = entrada.nextInt();
	    
	    while ((numero <= 0) || (numero >= 10)) {
	    	System.out.println("Insira um valor válido");
	    }
	    entrada.close();
	}

}
