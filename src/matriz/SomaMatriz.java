package matriz;

import java.util.Scanner;

public class SomaMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int linhas, colunas;
		do {
			System.out.print("Qual a quantidade de linhas da matriz? Valor máximo dez! ");
			linhas = scanner.nextInt();
		} while (valorMaiorQueDez(linhas));

		do {
			System.out.print("Qual a quantidade de colunas da matriz?  Valor máximo dez! ");
			colunas = scanner.nextInt();
		} while (valorMaiorQueDez(colunas));

		int[][] matrizA = new int[linhas][colunas];
		int[][] matrizB = new int[linhas][colunas];
		int[][] matrizC = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			System.out.println("Digite os elementos da matriz A: ");
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matrizA[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < linhas; i++) {
			System.out.println("Digite os elementos da matriz B: ");
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matrizB[i][j] = scanner.nextInt();
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		System.out.println("Matriz C (soma matriz A e matriz B):");
		for (int i = 0; i < linhas; i++) {
			System.out.println();
			for (int j = 0; j < colunas; j++) {
				System.out.printf("%d ", matrizC[i][j] = matrizA[i][j] + matrizB[i][j]);
			}
		}
	}

	public static boolean valorMaiorQueDez(int valor) {
		return valor > 10;
	}
}
