import java.util.Scanner;

public class Numero17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número para verificar se ele é primo ou não: ");
		int numero = entrada.nextInt();

		int contador = 0;

		while (contador <= numero) {
			if (numero % 2 == 1) {
				contador = contador + 1;
				System.out.println("Número primo!");
				break;
			} else {
				System.out.println("Número não primo!");
				break;
			}
		}
		entrada.close();
	}
}