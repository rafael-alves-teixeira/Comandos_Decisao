package ComandosDecisao;
import java.util.Locale;
import java.util.Scanner;

public class If_Else_Operador_Logico {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");

		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");

		}
		else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");

		}
		else if (x != 0.0 && y == 0.0) {
			System.out.println("Eixo X");

		}
		else if (x == 0.0 && y != 0.0) {
			System.out.println("Eixo Y");

		}
		else if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
			
		sc.close();
	}
}
