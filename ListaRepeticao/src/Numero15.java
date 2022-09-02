import java.util.Scanner;

public class Numero15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);
	   	
	   	int numero = 37;
	   	int contador = 1;
	   	double resultado = 0;
	   	
	   	System.out.print("Soma = ");
	   	for (int i = numero; i > 0; i--) {
	   		resultado = resultado + (i * (i+1))/contador;
	   		contador = contador + 1;
	}
	   	System.out.println(resultado);
	   	entrada.close();
	   	
	}
}