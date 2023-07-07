package classes_abstratas.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleServiceProvider;

import classes_abstratas.entidades.Contribuinte;
import classes_abstratas.entidades.PessoaFisica;
import classes_abstratas.entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Contribuinte> listaContribuintes = new ArrayList<>();

		System.out.print("Entre com o númerso de contribuintes: ");
		int numeroContribuintes = scanner.nextInt();

		for (int i = 1; i <= numeroContribuintes; i++) {
			System.out.println("Dados do contribuinte #" + i + ":");
			System.out.print("Pessoa física ou jurídica (f/j): ");
			char contribuinte = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			System.out.print("Renda anual: ");
			Double rendaAnual = scanner.nextDouble();
			if (contribuinte == 'f') {
				System.out.print("Gastos com saúde: ");
				Double gastosSaude = scanner.nextDouble();
				listaContribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = scanner.nextInt();
				listaContribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		scanner.close();
		System.out.println();
		System.out.println("Impostos pagos:");
		double totalImpostosPagos = 0;
		for (Contribuinte contribuinte : listaContribuintes) {
			System.out.println(contribuinte.getNome() + " $ " + String.format("%.2f", contribuinte.imposto()));
			totalImpostosPagos += contribuinte.imposto();
		}
		System.out.println();
		System.out.println("Total de impostos pagos: $" + totalImpostosPagos);
	}
}
