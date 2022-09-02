import java.util.Scanner;

public class Numero26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);


	   	double valorPaes = 0; 
	   	
	   	for (int i = 1; i <= 50; i++) {
	   		valorPaes = (i * 0.18);
		   	System.out.println("O valor dos pães é: "+valorPaes);
	   	}
	   	entrada.close();
	}
	}


