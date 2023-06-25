package listas.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import listas.entidades.Funcionario;

public class Programa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos funcionários serão registrados? ");
		int totalFuncionarios = scanner.nextInt();

		List<Funcionario> funcionarios = new ArrayList<>();

		for (int i = 0; i < totalFuncionarios; i++) {
			System.out.println("Funcionário #" + (i + 1));
			System.out.print("ID: ");
			int id = scanner.nextInt();
			while (idRepetido(funcionarios, id)) {
				System.out.print("ID repetido, digite outro ID: ");
				id = scanner.nextInt();
			}
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("Salário: ");
			double salario = scanner.nextDouble();
			System.out.println();
			funcionarios.add(new Funcionario(id, nome, salario));
		}
		System.out.print("Digite o ID do funcionário que terá o salário aumentado: ");
		int id = scanner.nextInt();
		if (idConstaNaLista(funcionarios, id) != null) {
			System.out.print("Qual a porcentagem de aumento? ");
			double porcentagemAumento = scanner.nextDouble();
			idConstaNaLista(funcionarios, id).aumentarSalario(porcentagemAumento);
		} else {
			System.out.println("ID não encontrado na lista.");
		}
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

	public static boolean idRepetido(List<Funcionario> funcionarios, int id) {
		Funcionario funcionario = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}

	public static Funcionario idConstaNaLista(List<Funcionario> funcionarios, int id) {
		Funcionario funcionario = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario;
	}
}
