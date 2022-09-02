import java.util.Scanner;

public class Numero13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número para saber seu fatorial: ");
		int numero = entrada.nextInt();

		double resultado = 1;

		for (int i = numero; i >= 1; i--) {
			resultado = resultado * i;
		}
		System.out.println("O resultado é: " + resultado);
		entrada.close();
	}

}
