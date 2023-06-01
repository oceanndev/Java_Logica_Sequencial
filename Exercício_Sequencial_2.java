/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */
import java.util.Scanner;

public class Exercício_Sequencial_2 {
	

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			Locale.setDefault(Locale.US);
			double pi = 3.14159; 
			double raio = sc.nextDouble();
			sc.nextLine();
			double area = pi*(raio*raio);
			System.out.printf("A área do raio de valor %f do círculo de circunferência é %.4f" ,raio, area);
		}
		}
	}