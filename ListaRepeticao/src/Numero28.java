import java.util.Scanner;
public class Numero28 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeTemp = 0;
		int i = 0;
		float temperatura = 0;
		float maiorTemp = 0;
		float menorTemp = 0;
		float soma = 0;
		float tempMedia = 0;

		System.out.println("Informe a quantidade de temperaturas que serão inseridas? ");
		quantidadeTemp = entrada.nextInt();

		for (i = 0; i < quantidadeTemp; i++) {
			System.out.println("Insira a temperatura:");
			temperatura = entrada.nextFloat();

			if (i == 1) {
				maiorTemp = temperatura;
				menorTemp = temperatura;
				soma = soma + temperatura;
			} else {
				if (temperatura > maiorTemp) {
					maiorTemp = temperatura;
					soma = soma + temperatura;
				} else {
					menorTemp = temperatura;
					soma = soma + temperatura;
				}
			}
		}
		tempMedia = soma / i;

		System.out.println("A menor temperatura informada é: " + menorTemp);
		System.out.println("A maior temperatura informada é: " + maiorTemp);
		System.out.println("A média das temperaturas informadas foi: " + tempMedia);

		entrada.close();
	}

}
