package matriz;

import java.util.Scanner;

public class AcimaDiagonal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ordemMatriz;
		do {
			System.out.print("Qual a ordem da matriz? Valor máximo dez! ");
			ordemMatriz = scanner.nextInt();
		} while (valorMaiorQueDez(ordemMatriz));

		int[][] matriz = new int[ordemMatriz][ordemMatriz];

		for (int i = 0; i < ordemMatriz; i++) {
			for (int j = 0; j < ordemMatriz; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = scanner.nextInt();
			}
		}
		int somaAcimaDiagonal = 0;
		for (int i = 0; i < ordemMatriz; i++) {
			for (int j = 0; j < ordemMatriz; j++) {
				if (i < j) {
					somaAcimaDiagonal += matriz[i][j];
				}
			}
		}
		System.out.println("Soma dos números acima da diagonal principal: " + somaAcimaDiagonal);
	}

	public static boolean valorMaiorQueDez(int valor) {
		return valor > 10;
	}
}
