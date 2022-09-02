import java.util.Scanner;

public class Numero21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de pessoas para a pesquisa: ");
		int quantPessoas = entrada.nextInt();

		int soma = 0;
		int idades = 0;

		for (int i = 0; i < quantPessoas; i++) {
			System.out.print("Informe suas idades: ");
			idades = entrada.nextInt();
			soma = idades + soma;
		}

		double media = soma / quantPessoas;
		System.out.println("A média de idades é: " + media);

		if ((media > 0) && (media < 25)) {

			System.out.println("Turma jovem!");
		} else if ((media > 25) && (media < 60)) {
			System.out.println("Turma adulta!");
		} else if (media >= 60) {
			System.out.println("Turma idosa!");
		}
		entrada.close();
	}
}