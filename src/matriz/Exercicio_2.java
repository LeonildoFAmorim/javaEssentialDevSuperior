package matriz;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int linhas;
		int colunas;
		do {
			System.out.println("OBS.: máximo 10 linhas e 10 colunas digite novamente!");
			System.out.print("Qual a quantidade de linhas da matriz? ");
			linhas = scanner.nextInt();
			System.out.print("Qual a quantidade de colunas da matriz? ");
			colunas = scanner.nextInt();

		} while (umDosValoresMaiorQueDez(linhas, colunas));

		int[][] matriz = new int[linhas][colunas];
		int[] vetor = new int[linhas];

		for (int i = 0; i < linhas; i++) {
			System.out.println("Digite os elementos da " + (i + 1) + "ª linha:");
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = scanner.nextInt();
				vetor[i] += matriz[i][j];
			}
		}
		System.out.println("Vetor gerado (soma correspondente das linhas:)");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
	}

	public static boolean umDosValoresMaiorQueDez(int linha, int coluna) {
		return linha > 10 || coluna > 10;
	}
}
