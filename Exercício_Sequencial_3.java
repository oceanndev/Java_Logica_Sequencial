/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
 */
import java.util.Locale;
public class Exercício_Sequencial_3 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a,b,c,d,DIFERENCA;
    Locale.setDefault(Locale.US);
 a = sc.nextInt();
		  sc.nextLine();
 b = sc.nextInt();
		  sc.nextLine();
 c = sc.nextInt();
          sc.nextLine();
 d = sc.nextInt();
		  sc.nextLine();
		  
  DIFERENCA = a * b - c * d;
		System.out.printf("A diferença de (A = %d * B = %d) - (C = %d * D = %d) é = %d",a,b,c,d,DIFERENCA);
		sc.close();
	}

}