import java.util.Scanner;

public class Numero27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int i = 0;
		float valorTotal = 0;
		float resto = 0;
		float prod = 1;

		while (prod != 0) {
			System.out.println("Insira o valor do produto:");
			prod = entrada.nextFloat();
			++i;
			System.out.println("O valor 0 deve ser informado pelo operador para indicar o final da compra!");
			System.out.println("Lojas Tabajara");
			System.out.println("Produto" + i + ": - R$" + prod);
			valorTotal = (valorTotal + prod);
		}
		System.out.println("Total: R$ " + valorTotal);
		System.out.println("Insira o valor em dinheiro:");
		double dinheiro = entrada.nextDouble();
		System.out.println("Dinheiro: R$ " + dinheiro);
		resto = (float) (dinheiro - valorTotal);
		System.out.println("Troco: R$ " + resto);

		entrada.close();
	}

}
