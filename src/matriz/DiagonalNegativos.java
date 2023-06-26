package matriz;

import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int ordemMatriz = scanner.nextInt();
		int numeros[][] = new int[ordemMatriz][ordemMatriz];

		int numerosNegativos = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				numeros[i][j] = scanner.nextInt();
				if (numeros[i][j] < 0) {
					numerosNegativos++;
				}
			}
		}
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i][i]);
		}
		System.out.println();
		System.out.println("Quantidade de números negativos: " + numerosNegativos);
		scanner.close();
	}
}
