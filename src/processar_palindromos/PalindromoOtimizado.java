package processar_palindromos;

import java.util.Scanner;

public class PalindromoOtimizado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("*****************************************");
		System.out.println("*       BEM-VINDOS AO PROCESSADOR       *");
		System.out.println("*             DE PALÍNDROMOS            *");
		System.out.println("*****************************************");
		System.out.println(" ");
		
		while(true) {
		System.out.println("Digite uma palavra, frase ou número:");
		
		String palavra=leia.nextLine();
		
		String limpa = palavra.toLowerCase().replaceAll("[^a-z0-9]","");
		
		String palavrainvertida="";
		for (int i=limpa.length()-1;i>=0;i--) {
			palavrainvertida += limpa.charAt(i);
		}
		
		if(limpa.equalsIgnoreCase(palavrainvertida)) {
			System.out.println("\n 🎉 Parabéns!!! " + palavra + " é um palíndromo! 🎉 ");
		}else {
			System.out.println("\n ☹ Que pena! " + palavra + " não é um palíndromo. ☹ ");
		}
		
		System.out.println("\n---------------------------------------");
		System.out.println("| Para CONTINUAR, pressione ENTER.    |");
		System.out.println("| Para ENCERRAR, digite SAIR.         |");
		System.out.println("---------------------------------------");
		
		String encerrar = leia.nextLine();
		if(encerrar.equalsIgnoreCase("sair")) {
			System.out.println("\n Encerrando...");
			System.out.println("\n Obrigada por nos escolher!");
			System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
			break;
		}
		
		}
		
		leia.close();
	}

}
