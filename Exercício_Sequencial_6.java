/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/
import java.util.Locale;
import java.util.Scanner;
public class Exercício_Sequencial_6 {

	public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);
 double a,b,c, tri, cir, tra, qua, ret;
 a = sc.nextDouble();
 b = sc.nextDouble();
 c = sc.nextDouble();
tri = (a*c)/2;
cir = (c*c) * 3.14159;
tra = (float)(a+b)*c*0.5;
qua = b*b;
ret = a*b;
System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", tri,cir,tra,qua,ret);
 
	}

}