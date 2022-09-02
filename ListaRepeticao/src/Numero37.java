import java.util.Scanner;

public class Numero37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		float media;
		String[] resposta = new String[10];

		for (int b = 0; b < 10; b++) {
			System.out.println("Gabarito " + (b + 1) + " :");
			resposta[b] = entrada.nextLine();
		}

		int contador = 1;
		int maiorAcerto = 0;
		int menorAcerto = 0;
		float soma = 0;

		boolean z = true;
		while (z) {

			int respCerta = 0;

			for (int b = 0; b < 10; b++) {

				System.out.println("A resposta da questão é: " + (b + 1) + ":");
				String r = entrada.nextLine();

				if (resposta[b].equals(r)) {
					respCerta++;
				} else {
					System.out.println(resposta[b] + " é a resposta correta!");
				}

			}
			System.out.println("Total de acertos: " + respCerta);
			System.out.println("Nota = " + respCerta);

			if (contador == 1) {
				maiorAcerto = respCerta;
				menorAcerto = respCerta;
				soma = soma + respCerta;
			} else {
				if (respCerta < menorAcerto) {
					menorAcerto = respCerta;
					soma = soma + respCerta;
				} else if (respCerta > maiorAcerto) {
					maiorAcerto = respCerta;
					soma = soma + respCerta;
				}
			}

			System.out.println("Outro aluno vai utilizar o sistema? 1 - Sim. 2 - Não.");
			int aluno = entrada.nextInt();

			entrada.nextLine();

			if (aluno == 1) {
				z = true;
				contador++;
			} else if (aluno == 2) {
				z = false;
			}

		}

		media = (soma / contador);

		System.out.println("O menor número de acertos foi: " + menorAcerto);
		System.out.println("O maior número de acertos foi: " + maiorAcerto);
		System.out.println("O total de alunos que utilizaram o sistema: " + contador);
		System.out.println("A média das notas das turmas é: " + media);

		entrada.close();
	}

}
