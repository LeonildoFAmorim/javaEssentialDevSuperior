package matriz;

import java.util.Scanner;

public class NegativosMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ordemMatriz;

		do {
			System.out.println("OBS.: Máximo 10 linhas!");
			System.out.print("Qual a ordem da matriz? ");
			ordemMatriz = scanner.nextInt();

		} while (valorMaiorQueDez(ordemMatriz));

		int[][] matriz = new int[ordemMatriz][ordemMatriz];

		for (int i = 0; i < ordemMatriz; i++) {
			System.out.println("Digite os elementos da " + (i + 1) + "ª linha:");
			for (int j = 0; j < ordemMatriz; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Maior elemento de cada linha:");
		for (int i = 0; i < ordemMatriz; i++) {
			int maior = 0;
			for (int j = 0; j < ordemMatriz; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
			System.out.println(maior);
		}
	}

	public static boolean valorMaiorQueDez(int linha) {
		return linha > 10;
	}
}
