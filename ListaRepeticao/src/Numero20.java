import java.util.Scanner;

public class Numero20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);

	   	System.out.print("Informe a quantidade de notas: ");
	   	int quantidade = entrada.nextInt();
	   	
	   	int soma = 1;
	   	
	   	for (int i = 0; i < quantidade; i++) {
		   	System.out.print("Informe suas notas: ");
		   	int nota = entrada.nextInt();
		   	soma = nota + soma;
	   	}
	   	
	   	float media = soma / quantidade;
	   	
	   	System.out.println("A média final é: "+media);
	   	
	   	entrada.close();
	}

}
