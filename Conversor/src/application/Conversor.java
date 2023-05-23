package application;

import java.util.Locale;
import java.util.Scanner;



public class Conversor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual a cotação atual do Dollar? ");
		double dollar = sc.nextDouble();
		
		System.out.print("Qual valor em Dollar você precisa? ");
		double valor = sc.nextDouble();
		
		double res = dollar * valor * 1.06;
		double iof = res - (dollar * valor);
		
		
		System.out.printf("Cotação em reais é: %.2f%n", res);
		System.out.printf("Valor do iof é de: %.2f%n", iof);
		
		
		
		sc.close();

	}

}
