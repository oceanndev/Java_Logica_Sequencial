// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa
import java.util.Locale;
import java.util.Scanner;

public class Exercício_Sequencial_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);;	
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		int Soma = (int) a+b;
				
System.out.printf( "A soma de A = %d e B = %d é: %s)",a ,b,Soma);
sc.close();
	}

}
