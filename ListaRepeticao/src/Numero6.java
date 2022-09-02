import java.util.Scanner;

public class Numero6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		for (int numero = 1; numero <= 50; numero++) {
			if (numero % 2 != 0) {
				System.out.println(numero);
			}
			entrada.close();
		}
	}
}