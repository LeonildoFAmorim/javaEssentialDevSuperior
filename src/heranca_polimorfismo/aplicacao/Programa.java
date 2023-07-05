package heranca_polimorfismo.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.entidades.Produto;
import heranca_polimorfismo.entidades.ProdutoImportado;
import heranca_polimorfismo.entidades.ProdutoUsado;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Produto> lista = new ArrayList<>();

		System.out.print("Digite a quantidade de produtos: ");
		int qtdProdutos = scanner.nextInt();

		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.println("Dados do produto #" + i);
			System.out.print("comum, usado ou importado (c/u/i)? ");
			char resposta = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Preço: ");
			Double preco = scanner.nextDouble();
			if (resposta == 'i') {
				System.out.print("Valor da alfândega: ");
				Double alfandega = scanner.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, alfandega));
			} else if (resposta == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				LocalDate dataFabricacao = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
			} else {
				lista.add(new Produto(nome, preco));
			}
		}
		scanner.close();
		System.out.println();
		System.out.println("Etiqueta de preços: ");
		for (Produto produto : lista) {
			System.out.println(produto.etiquetaPreco());
		}
	}
}
