import java.util.Scanner;

public class Numero10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);
	   	
	   	System.out.print("Informe uma base: ");
	   	int base = entrada.nextInt();
	   	System.out.print("Informe um expoente: ");
	   	int expo = entrada.nextInt();
	   	
	   	int potencia = 1;
	   	int i = 1;
	   	
	   	while (i <= expo)  {
	   		potencia *= base;
	   		i++;
	}
	   	System.out.println(base+ " ^ " +expo+ " = " +potencia);
	   	entrada.close();
}
}