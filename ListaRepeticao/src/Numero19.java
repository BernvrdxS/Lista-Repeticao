import java.util.Scanner;

public class Numero19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int divisivel = 0;

		System.out.println("Insira um número inteiro:");
		int inteiro = entrada.nextInt();

		for (int i = 1; i <= inteiro; i++) {
			if ((i % 2 == 1) && (i != 2) || (i == 2)) {
				System.out.print(i + " | ");
				divisivel++;
			} else {
				divisivel++;
			}
		}
		System.out.println("O número de divisões feitas foram: " + divisivel);
		entrada.close();

	}

	{
	}
}
