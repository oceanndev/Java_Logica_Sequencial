/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago */
import java.util.Locale;
import java.util.Scanner;
public class Exercício_Sequencial_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int cod, uni, cod1, uni1;
		double valor, valor1, tot;
		System.out.println("Escreva o código do produto:");
		cod=sc.nextInt();
		sc.nextLine();
		System.out.println("Quantidade de itens");
		uni = sc.nextInt();
		System.out.println("O valor do item");
		valor = sc.nextDouble();
		System.out.println("Escreva o código do produto:");
		cod1=sc.nextInt();
		System.out.println("Quantidade de itens");
		uni1 = sc.nextInt();
		System.out.println("O valor do item");
		valor1 = sc.nextDouble();
		System.out.printf("%d %d %.2f%n%n", cod, uni, valor );
		System.out.printf("%d %d %.2f%n", cod1, uni1, valor1);
		tot = uni*valor+uni1*valor1;
		System.out.printf("VALOR A PAGAR: R$%.2f", tot);
		sc.close();
	}
	}