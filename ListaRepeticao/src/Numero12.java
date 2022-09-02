import java.util.Scanner;

public class Numero12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	Scanner entrada = new Scanner(System.in);
       
	   	
	   	int numero1 = 1;
	   	int numero2 = 0;
        
        System.out.println(numero2);
        System.out.println(numero1);
        
        for(int i = 0; i < 8; i++){
        	numero1 = numero1 + numero2;
        	numero2 = numero1 - numero2;
            System.out.println(numero1);
        }
	   	entrada.close();
	}

}
