import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		int numero;
		int i = 10;
		
		Scanner leitor = new Scanner(System.in);
		
		while(i != 0) {
			System.out.println("Digite um número\n");
			numero = leitor.nextInt();
			
			if(numero%2 == 0) {
				System.out.println("O número é par\n");
			}
			else {
				System.out.println("O número é impar");
			}
		}
	}
	
	

}
