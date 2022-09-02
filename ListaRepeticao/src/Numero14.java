import java.util.Scanner;

public class Numero14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);

	   	System.out.print("Informe um termo: ");
	   	int termo = entrada.nextInt();
	   	
	   	int div = 1;
	   	
	   	for (int i = 1; i <= termo; i++) {
	   		div = (i * 2) - 1;
	   		System.out.println(i+ " / " +div);
	   	
	   		
	   	}
	   	entrada.close();
	}

}
