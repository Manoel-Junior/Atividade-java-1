import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {
		float salario, aumento;
		System.out.println("Digite o sal�rio\n");
		
		Scanner leitor = new Scanner(System.in);
		
		salario = leitor.nextFloat();
		
		System.out.println("Digite o aumento\n");
		
		aumento = leitor.nextFloat();
		
		aumento = aumento/100;
		salario = salario + salario*aumento;
		
		System.out.println("O sal�rio final �\n"+salario );
		
	}
}
