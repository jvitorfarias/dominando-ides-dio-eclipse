package primeiro.programa.segunda.tentativa.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	/* It is always important to close the data entry so as not to feed resources during program execution */
		scan.close();
	}

	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
}
