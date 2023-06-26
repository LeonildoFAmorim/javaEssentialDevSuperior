package matriz;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int ordemMatriz = scanner.nextInt();
		int numeros[][] = new int[ordemMatriz][ordemMatriz];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				numeros[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Diagonal principal: ");
		int numerosNegativos = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (i == j) {
					System.out.print(numeros[i][j] + " ");
				}
				if (numeros[i][j] < 0) {
					numerosNegativos++;
				}
			}
		}
		System.out.println();
		System.out.println("Quantidade de números negativos: " + numerosNegativos);
		scanner.close();
	}
}
