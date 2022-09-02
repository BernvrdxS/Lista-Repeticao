import java.util.Scanner;

public class Numero30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int alto = 0;
		int baixo = 0;
		double gordo = 0;
		double magro = 0;

		double maisAlto = Double.MIN_VALUE;
		double maisBaixo = Double.MAX_VALUE;

		double pesoTotal = 0;
		double alturaTotal = 0;

		int i = 0;
		while (true) {
			System.out.print("Insira seu código: ");
			int codCliente = entrada.nextInt();
			if (codCliente == 0)
				break;
			i++;

			System.out.print("Insira sua altura: ");
			double altura = entrada.nextDouble();
			System.out.print("Insira seu peso: ");
			double peso = entrada.nextDouble();
			pesoTotal = peso;
			alturaTotal = altura;

			if (peso > gordo) {
				gordo = codCliente;
				gordo = peso;
			}
			if (peso < magro) {
				magro = codCliente;
				magro = peso;
			}
			if (altura > maisAlto) {
				alto = codCliente;
				maisAlto = altura;
			}
			if (altura < maisBaixo) {
				baixo = codCliente;
				maisBaixo = altura;
			}

		}

		System.out.println("O código do cliente mais alto é: " + alto);
		System.out.println("O código do cliente mais baixo é: " + baixo);
		System.out.println("O código do cliente mais gordo é: " + gordo);
		System.out.println("O código do cliente mais magro é : " + magro);
		System.out.println("A média da altura dos clientes é: " + (alturaTotal / i));
		System.out.println("A média de peso dos clientes é: " + (pesoTotal / i));

		entrada.close();
	}

}
