import java.util.Scanner;

public class Numero11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int contPar = 0;
		int contImpar = 0;
		int cont = 0;
		int seq = 10;

		while (cont < seq) {
			System.out.print("Informe um digito: ");
			int numero = entrada.nextInt();
			cont = cont + 1;
			if (numero % 2 == 0) {
				contPar = contPar + 1;
			} else {
				contImpar = contImpar + 1;
			}
		}
		System.out.println("A quantidade de números pares é: " + contPar);
		System.out.println("A quantidade de números ímpares é: " + contImpar);

		entrada.close();
	}

}
