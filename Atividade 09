/*9)	Faça um programa que leia um número inteiro positivo N (máximo = 9) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

Exemplo:
Quantos números você vai digitar? 3
Digite um número: -1
Digite um número: 9
Digite um número: -51
Números Negativos:
-51
-1
*/
package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, i;
		
		System.out.println("Quantos números você vai digitar?");
		x = sc.nextInt();
		
		int[] vetor = new int[x];
		if (x > 9) {
			System.out.println("O número digitado não pode ser maior que 9");
		}
		
		for (i = 0; i < x; i++) {
			System.out.println("Digite um número:");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos");
		for (i = 0; i < x; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();
	}
}
