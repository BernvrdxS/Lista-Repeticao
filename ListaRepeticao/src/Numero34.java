import java.util.Scanner;

public class Numero34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira a quantidade de números positivos que quiser: ");
		int num = entrada.nextInt();

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;

		while (a < num) {
			System.out.print("Insira um número: ");
			int num2 = entrada.nextInt();
			a = a + 1;

			if (num2 < 0) {
				break;
			}
			if ((num2 >= 0) && (num2 <= 25)) {
				b = b + 1;
			}
			if ((num2 >= 26) && (num2 <= 50)) {
				c = c + 1;
			}
			if ((num2 >= 51) && (num2 <= 75)) {
				d = d + 1;
			}
			if ((num2 >= 76) && (num2 <= 100)) {
				e = e + 1;
			}
		}

		System.out.println("O 1o intervalo é de: " + b);
		System.out.println("O 2o intervalo é de: " + c);
		System.out.println("O 3o intervalo é de: " + d);
		System.out.println("O 4o intervalo é de: " + e);

		entrada.close();

	}

}
