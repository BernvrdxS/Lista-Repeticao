import java.util.Scanner;

public class Numero38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a seguir o número a ser invertido: ");
		int numero = entrada.nextInt();

		int i = 0;

		while (numero > 0) {
			i *= 10;
			i += (numero % 10);
			numero /= 10;
		}

		System.out.printf("O número invertido é: " + i);

		entrada.close();
	}

}
