package Java;
import java.io.IOException;
import java.util.Scanner;

public class Teste{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior;
		double soma;
		boolean triangulo;
		
		if (A > B && A > C) maior = A;
		else if (B > C) maior = B;
		else maior = C;

		if (maior == A) soma = B + C;
		else if (maior == B) soma = A + C;
		else soma = B + A;
		
		if (soma > maior) triangulo = true;
		else triangulo = false;
		
		if (triangulo) {
			double perimetro = A + B + C;
			System.out.println(String.format("Perimetro = %.1f", perimetro));
		} else {
			double areaTrapezio = ((A + B) * C) / 2; //Insira o cálculo no espço em branco
			System.out.println(String.format("Area = %.1f", areaTrapezio));
		}
	}
	
}

