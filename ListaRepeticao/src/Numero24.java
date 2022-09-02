import java.util.Scanner;

public class Numero24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de CDs da coleção: ");
		int CDs = entrada.nextInt();

		int valorCds = 0;
		int valorTotal = 0;

		for (int i = 0; i < CDs; i++) {
			System.out.print("Informe o valor de cada CD: ");
			valorCds = entrada.nextInt();
			valorTotal = valorCds + valorTotal;

		}
		double media = valorTotal / CDs;
		System.out.println("A média de valor gasto em cada CD é: " + media);

		entrada.close();

	}
}
