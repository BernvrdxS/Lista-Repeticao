import java.util.Scanner;

public class Numero24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de CDs da cole��o: ");
		int CDs = entrada.nextInt();

		int valorCds = 0;
		int valorTotal = 0;

		for (int i = 0; i < CDs; i++) {
			System.out.print("Informe o valor de cada CD: ");
			valorCds = entrada.nextInt();
			valorTotal = valorCds + valorTotal;

		}
		double media = valorTotal / CDs;
		System.out.println("A m�dia de valor gasto em cada CD �: " + media);

		entrada.close();

	}
}
