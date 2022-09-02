import java.util.Scanner;

public class Numero8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   	Scanner entrada = new Scanner(System.in);
			    
			   
			    System.out.print("Informe um número: ");
			    int numero1 = entrada.nextInt();
			    System.out.print("Informe outro número: ");
			    int numero2 = entrada.nextInt();
			    
			    for (int i = numero1; i < numero2; i++) {
			    System.out.println(i);
			}
			    int soma = numero1 + numero2;
			    System.out.println("Os números informados foram: "+numero1+  " e "  +numero2 );
			    System.out.println("A soma entre os dois valores informados é: "+soma);
			    
			    entrada.close();
		}
		
	}


