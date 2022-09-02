import java.util.Scanner;

public class Numero5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		for (int numero = 0; numero <= 20; numero++) {
			System.out.println(numero);
		}

		int numero = 0;

		while (numero <= 20) {
			System.out.println(numero);
			numero = numero + 1;
		}
		entrada.close();
	}
}
