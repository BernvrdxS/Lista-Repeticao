import java.util.Scanner;

public class Numero29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a taboada desejada:");
		int tab = entrada.nextInt();

		System.out.println("Informe o valor inicial da taboada:");
		int inicio = entrada.nextInt();
		System.out.println("Informe o valor final da taboada:");
		final int fim = entrada.nextInt();

		System.out.println("Irei montar a tabuada de: " + tab);
		System.out.println("Começando em: " + inicio);
		System.out.println(" e terminando em: " + fim);

		while (true) {
			if (fim > inicio) {
				for (int i = inicio; i <= fim; i++) {
					System.out.println(tab + " x " + i + " = " + (tab * i));
				}
				break;
			} else
				System.out.println("Valor final menor que o valor inicial.");
			break;
		}

		entrada.close();
	}

}
