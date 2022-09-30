package ComandosDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		double preco;
		
		cod = sc.nextInt();
		quant = sc.nextInt(); 
		
		switch (cod) {
			case 1:
				preco = 4.0 * quant;
				break;	
			case 2:
				preco = 4.5 * quant;
				break;
			case 3:
				preco = 5.0 * quant;
				break;
			case 4:
				preco = 2.0 * quant;
				break;
			case 5:
				preco = 1.5 * quant;
				break;
			default:
				preco = 0.0;
				break;
		}		
		
		System.out.printf("Total: R$ %.2f%n", preco);
		sc.close();				
	}
}
