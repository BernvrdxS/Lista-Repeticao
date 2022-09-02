import java.util.Scanner;

public class Numero25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);

	   	double valorCaixa = 0; 
	   	
	   	for (int i = 1; i <= 50; i++) {
	   		valorCaixa = (i*1.99);
		   	System.out.println("O valor da caixa é: "+valorCaixa);

	   	}
	   	entrada.close();
	}

}
