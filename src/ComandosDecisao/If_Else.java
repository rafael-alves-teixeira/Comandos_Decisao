package ComandosDecisao;

import java.util.Locale;
import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1, n2, n3, n4, media;
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
		System.out.printf("Media: %.1f%n", media);
		
		if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		else if (media >= 7.0 ) {
			System.out.println("Aluno aprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			float exame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", exame);
			media = (media + exame) / 2;
			if (media < 5.0) {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", media);
			}
			else {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", media);

			}
		}
		
		sc.close();
	}
}
