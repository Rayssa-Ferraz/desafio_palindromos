package processar_palindromos;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma palavra ou frase:");
		String palavra=leia.nextLine();
		
		String palavrainvertida="";
		
		for (int i=palavra.length()-1;i>=0;i--) {
			palavrainvertida += palavra.charAt(i);
		}
		
		if(palavra.equalsIgnoreCase(palavrainvertida)) {
			System.out.println("Parabéns!!! É um palíndromo! :D");
		}else {
			System.out.println("Que pena! Não é um palíndromo.:(");
		}
		
		leia.close();
	}

}
