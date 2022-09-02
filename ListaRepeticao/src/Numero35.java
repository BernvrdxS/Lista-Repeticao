import java.util.Scanner;

public class Numero35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		double cachorroQuente = 1.20;
		double bauruSimples = 1.30;
		double bauruCOvo = 1.50;
		double hamburguer = 1.20;
		double cheeseBurguer = 1.30;
		double refri = 1;
		double total = 0;
		double compraTotal = 0;

		while (true) {
			System.out.print("Insira o código do item: ");
			int codigo = entrada.nextInt();
			System.out.print("Insira a quantidade desejada do produto: ");
			int quant = entrada.nextInt();

			System.out.println("Digite 0 para encerrar o programa!");

			if (codigo == 100) {
				total = quant * cachorroQuente;
				compraTotal = compraTotal + total;
				System.out.println("R$ " + total);
			} else if (codigo == 101) {
				total = quant * bauruSimples;
				compraTotal = compraTotal + total;
				System.out.println("R$ " + total);
			} else if (codigo == 102) {
				total = quant * bauruCOvo;
				compraTotal = compraTotal + total;
				System.out.println("R$ " + total);
			} else if (codigo == 103) {
				total = quant * hamburguer;
				compraTotal = compraTotal + total;
				System.out.println("R$ " + total);
			} else if (codigo == 104) {
				total = quant * cheeseBurguer;
				compraTotal = compraTotal + total;
				System.out.println("R$ " + total);
			} else if (codigo == 105) {
				total = quant * refri;
				compraTotal = compraTotal + total;
				System.out.println("R$ " + total);
			} else if (codigo == 0) {
				System.out.println("Programa encerrado. Compra finalizada.");
				break;
			}

		}
		System.out.println("O valor total do pedido é: R$" + compraTotal);

		entrada.close();
	}

}
