package array.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import array.entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos produtos serão digitados? ");
		int totalProdutos = scanner.nextInt();

		Produto[] produtos = new Produto[totalProdutos];

		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Produto " + (i + 1));
			System.out.print("Nome do produto: ");
			String nome = scanner.next();
			System.out.print("Preço de compra: ");
			double precoCompra = scanner.nextDouble();
			System.out.print("Preço de venda: ");
			double precoVenda = scanner.nextDouble();
			produtos[i] = new Produto(nome, precoCompra, precoVenda);
		}
		scanner.close();
		System.out.println();
		System.out.println("RELATÓRIO");

		int lucroAbaixo10Porcento = 0;
		int lucroEntre10_20Porcento = 0;
		int lucroAcima20Porcento = 0;
		double valorTotalCompra = 0;
		double valorTotalVenda = 0;

		for (Produto produto : produtos) {
			if (produto.calcularLucro() < 10) {
				lucroAbaixo10Porcento++;
			} else if (produto.calcularLucro() < 20) {
				lucroEntre10_20Porcento++;
			} else {
				lucroAcima20Porcento++;
			}
			valorTotalCompra += produto.getPrecoCompra();
			valorTotalVenda += produto.getPrecoVenda();
		}
		System.out.printf("Lucro abaixo de 10 %%: %d\n", lucroAbaixo10Porcento);
		System.out.printf("Lucro entre 10 e 20 %%: %d\n", lucroEntre10_20Porcento);
		System.out.printf("Lucro acima de 20 %%: %d\n", lucroAcima20Porcento);
		System.out.printf("Valor total de compra: %.2f\n", valorTotalCompra);
		System.out.printf("Valor total de venda: %.2f\n", valorTotalVenda);
		System.out.printf("Lucro total: %.2f\n", (valorTotalVenda - valorTotalCompra));
	}
}