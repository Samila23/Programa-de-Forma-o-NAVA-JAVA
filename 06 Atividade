/*6)	Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no formato horas:minutos:segundos conforme exemplo:
Exemplo de resultado esperado.
Digite a duração em segundos: 140811
39:6:51 
*/

package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int horas , minutos , segundos; 
		
		System.out.println("Digite a quantidade em segundos:");
		segundos = sc.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);


		sc.close();
	}

}
