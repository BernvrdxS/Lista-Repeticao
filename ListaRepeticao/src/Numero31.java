import java.util.Scanner;

public class Numero31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int alto = 0;
		int baixo = 0;
		int maisAlto = 0;
		int maisBaixo = 0;
		int altura = 0;
		int numrep = 0;
		
		    
		    for (int i = 1; i <= 10; i++) {
			   
		    	System.out.print("Insira um número para representar cada aluno: ");
			    numrep = entrada.nextInt();
			  		    
			   System.out.print("Insira sua altura, em centímetros. Ex: 179cm (1,79m): ");
			    altura = entrada.nextInt();
		    
			if (altura > maisAlto) {
				alto = numrep;
				maisAlto = altura;
			}
			else 	
				if (altura < maisBaixo) {
					baixo = numrep;
					maisBaixo = altura;
				}
		   
			System.out.println("O número que representa o aluno mais alto é: " +numrep+ "e sua altura é: " +maisAlto);
			System.out.println("O número que representa o aluno mais baixo é: " +numrep+ "e sua altura é: " +maisBaixo);
			

		    }
			
			
			entrada.close();
	}
}