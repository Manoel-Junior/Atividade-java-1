import java.util.Scanner;

public class questao4 {
	public static void main(String[] args) {
		int salario;
		String nome;
		String fim = new String("Fim");
		
		Scanner leitor = new Scanner(System.in);
		
		int a = 0;
		
		while(a != 1) {
			System.out.println("Digite um nome\n");
			nome = leitor.next();
			
			if(nome.equals(fim)) {
				break;
			}
			System.out.println("Digite um salário\n");
			
			salario = leitor.nextInt();
			if(salario<=500) {
				salario=salario+salario/5;
				System.out.println("Salario com reajuste do "+nome +" é:"+ salario);
			}
			else if(salario>500) {
				System.out.println("Não haverá reajuste no salario");
			}
		}
	}

}
