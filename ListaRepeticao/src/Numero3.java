import java.util.Scanner;

public class Numero3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);

	    System.out.print("Informe seu nome: ");
	    String nome = entrada.next();
	    while (nome.length() < 4) {
	    System.out.println("Nome inválido");
	    nome = entrada.next();
	    }
	    System.out.print("Informe sua idade: ");
	    int idade = entrada.nextInt();
	    System.out.print("Informe seu salário: ");
	    float salario = entrada.nextFloat();
	    System.out.print("Informe seu sexo, Feminino (f) e Masculino (m): ");
	    char sexo = entrada.next().charAt(0);
	    System.out.print("Informe seu estado civil, Solteiro (s), Casado (c), Viúvo (v) e Divorciado (d): ");
	    char estadoCivil = entrada.next().charAt(0);
	    

	    
	    System.out.println("Seu nome é: "+nome);
	    System.out.println("Sua idade é:"+idade);
	    System.out.println("Seu salário é: "+salario);
	    System.out.println("Seu sexo é: "+sexo+ "Feminino (f) e Masculino (m)" );
	    System.out.println("Seu estado civil é: "+estadoCivil+ "Solteiro (s), Casado (c), Viúvo (v) e Divorciado (d)");
	    
	    entrada.close();
	}

}
