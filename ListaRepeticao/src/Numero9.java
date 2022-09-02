import java.util.Scanner;

public class Numero9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);

	   	System.out.print("Informe um número para saber sua tabuada: ");
	   	int tabuada = entrada.nextInt();
	   	
	   	final int tam = 10;
	   	
	   	for (int i = 0; i <= tam; i++ ) {
	   		System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
	   	}
	   	entrada.close();
	}

}
