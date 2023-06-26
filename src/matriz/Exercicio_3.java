package matriz;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int linhas;
		int colunas;
		do {
			System.out.println("OBS.: Máximo 10 linhas e 10 colunas!");
			System.out.print("Qual a quantidade de linhas da matriz? ");
			linhas = scanner.nextInt();
			System.out.print("Qual a quantidade de colunas da matriz? ");
			colunas = scanner.nextInt();

		} while (umDosValoresMaiorQueDez(linhas, colunas));

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Vetor gerado (números negativos:)");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (matriz[i][j] < 0) {
					System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
	}

	public static boolean umDosValoresMaiorQueDez(int linha, int coluna) {
		return linha > 10 || coluna > 10;
	}
}
