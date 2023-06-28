package matriz;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int ordemMatriz;
		do {
			System.out.print("Qual a ordem da matriz? Valor máximo dez! ");
			ordemMatriz = scanner.nextInt();
		} while (valorMaiorQueDez(ordemMatriz));

		int[][] matriz = new int[ordemMatriz][ordemMatriz];

		double somaPositivos = 0;
		for (int i = 0; i < ordemMatriz; i++) {
			for (int j = 0; j < ordemMatriz; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = scanner.nextInt();
				if (matriz[i][j] > 0) {
					somaPositivos += matriz[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Imprimindo a matriz: ");
		for (int i = 0; i < ordemMatriz; i++) {
			System.out.println();
			for (int j = 0; j < ordemMatriz; j++) {
				System.out.printf("%d ", matriz[i][j]);
			}
		}
		System.out.println();
		System.out.println("Soma dos positivos: " + somaPositivos);

		System.out.println();
		System.out.print("Escolha uma linha: ");
		int linhaEscolhida = scanner.nextInt();
		System.out.println();
		System.out.print("Linha escolhida: ");
		for (int i = 0; i < ordemMatriz; i++) {
			System.out.printf("%d ", matriz[linhaEscolhida][i]);
		}
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		int colunaEscolhida = scanner.nextInt();
		System.out.println();
		System.out.println("Coluna escolhida: ");
		for (int i = 0; i < ordemMatriz; i++) {
			System.out.println(matriz[i][colunaEscolhida]);
		}
		System.out.println();
		System.out.print("Diagonal principal: ");
		for (int i = 0; i < ordemMatriz; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		System.out.println("Matriz alterada: ");
		for (int i = 0; i < ordemMatriz; i++) {
			for (int j = 0; j < ordemMatriz; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = matriz[i][j] * matriz[i][j];
				}
			}
		}
		for (int i = 0; i < ordemMatriz; i++) {
			System.out.println();
			for (int j = 0; j < ordemMatriz; j++) {
				System.out.printf("%d ", matriz[i][j]);
			}
		}
		scanner.close();
	}

	public static boolean valorMaiorQueDez(int valor) {
		return valor > 10;
	}
}
