import java.util.Scanner;

public class Numero18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um n?mero para verificar se ele ? primo ou n?o: ");
		int numero = entrada.nextInt();

		int contador = 0;
		int contador2 = 1;

		while (contador <= numero) {
			if (numero % 2 == 1) {
				contador = contador + 1;
				System.out.println("N?mero primo!");
				break;
			} else {
				System.out.println("N?mero n?o primo!");
				break;
			}

		}
		if (numero % contador2 == 0) {
			contador2 = contador2 + 1;
			System.out.println(contador2);
		}
		entrada.close();
	}
}
