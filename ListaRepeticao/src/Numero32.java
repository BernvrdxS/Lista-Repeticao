import java.util.Scanner;

public class Numero32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira um código para representar cada cidade: ");
		int cidCod = entrada.nextInt();
		System.out.print("Insira o número de veículos de passeio: ");
		int veiculosPass = entrada.nextInt();
		System.out.print("Insira o número de acidentes com vítimas: ");
		int acidVitimas = entrada.nextInt();

		float indiceAcidente = (acidVitimas / veiculosPass);
		float maiorIndice = indiceAcidente;
		float maiorIndiceCod = cidCod;
		float menorIndice = indiceAcidente;
		float menorIndiceCod = cidCod;

		float soma = veiculosPass;

		float somaVeiculos2000 = 0;
		float divMedia2000 = 1;

		double mediaAcid = (soma / 5);

		double mediaFinal2000 = ((somaVeiculos2000 / divMedia2000) * 100);

		if (veiculosPass < 2000) {
			somaVeiculos2000 = (somaVeiculos2000 + 1);
			divMedia2000 = (divMedia2000 + 1);
		}

		for (int i = 1; i <= 5; i++) {

			while (i < 5) {

				System.out.print("Insira um código para representar cada cidade: ");
				cidCod = entrada.nextInt();
				System.out.print("Insira o número de veículos de passeio: ");
				veiculosPass = entrada.nextInt();
				System.out.print("Insira o número de acidentes com vítimas: ");
				acidVitimas = entrada.nextInt();

				indiceAcidente = (acidVitimas / veiculosPass);
				soma = soma + veiculosPass;

				if (indiceAcidente > maiorIndice) {
					maiorIndice = indiceAcidente;
					maiorIndiceCod = cidCod;
				} else if (indiceAcidente < menorIndice) {
					menorIndice = indiceAcidente;
					menorIndiceCod = cidCod;
				} else if (veiculosPass < 2000) {
					somaVeiculos2000 = (somaVeiculos2000 + 1);
					divMedia2000 = (divMedia2000 + 1);

				}

				mediaAcid = (soma / 5);
				mediaFinal2000 = ((somaVeiculos2000 / divMedia2000) * 100);
			}

		}

		System.out.println(
				"O maior indíce de acidentes é: " + maiorIndice + " e o código da cidade é: " + maiorIndiceCod);
		System.out.println(
				"O menor indíce de acidentes é: " + menorIndice + " e o código da cidade é: " + menorIndiceCod);
		System.out.println("A média de veículos nas 5 cidades é: " + mediaAcid);
		System.out.println("A média de acidentes nas cidades com menos de 2000 veículos é: " + mediaFinal2000);

		entrada.close();
	}
}