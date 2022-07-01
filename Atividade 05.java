/*5)	Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. 
Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais, conforme exemplo.
Exemplo:
Digite a largura do terreno: 10.0
Digite o comprimento do terreno: 30.0
Digite o valor do metro quadrado: 200.00
Área do terreno = 300.00
Preço do terreno = 60000.00

i)	Declare as variáveis 
ii)	Monte a lógica
a.	Receber os dados do usuário
b.	Fazer o cálculo
iii)	Exibir o resultado
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetro, areaTerreno, precoTerreno;
		
		System.out.println("Digite a Largura do terreno");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento guras do terreno");
		comprimento = sc.nextDouble();
		System.out.println("Qual o valor do metro quadrado ?");
		valorMetro = sc.nextDouble();
		
		areaTerreno = largura * comprimento;
		precoTerreno = valorMetro * areaTerreno;
		System.out.printf("Área do terreno = %.2f%n ", areaTerreno);
		System.out.printf("Preço do terreno = R$ %.2f", precoTerreno);
		
		sc.close();
	}
}
