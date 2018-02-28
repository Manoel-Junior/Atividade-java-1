import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
	
		int opcao, tab;
		int i = 1;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número para mostrar a tabuada\n");
		
		opcao = leitor.nextInt();
		
		while(i != 11) {
			tab = opcao*i;
			System.out.println(""+tab);
			i = i + 1;
		}
	}
	

}
