/*
 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */
import java.util.Scanner;
public class Exercício_Sequencial_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
int num;
double sal, h;
num = sc.nextInt();
sal = sc.nextDouble();
h = sc.nextDouble();
double salary = sal*h;
System.out.printf("NUMBER: %d%nSALARY: %.2f",num, salary );
sc.close();
	}

}