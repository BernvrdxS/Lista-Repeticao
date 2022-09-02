import java.util.Scanner;

public class Numero22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o número de eleitores: ");
		int eleitores = entrada.nextInt();

		int candidatoA = 0;
		int candidatoB = 0;
		int candidatoC = 0;
		int votantes = 0;

		while (votantes < eleitores) {
			System.out.print(
					"Digite 1 para votar no candidato A, digite 2 para votar no candidato B e digite 3 para votar no candidato C");
			int voto = entrada.nextInt();

			if (voto == 1) {
				candidatoA = candidatoA + 1;
			} else if (voto == 2) {
				candidatoB = candidatoB + 1;
			} else if (voto == 3) {
				candidatoC = candidatoC + 1;
			}
			votantes = votantes + 1;
		}

		System.out.println("O candidato A teve " + candidatoA + " votos");
		System.out.println("O candidato B teve " + candidatoB + " votos");
		System.out.println("O candidato C teve " + candidatoC + " votos");

		entrada.close();

	}
}