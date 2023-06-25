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
			String nome = scanner.next();
			System.out.print("Salário: ");
			double salario = scanner.nextDouble();
			funcionarios.add(new Funcionario(id, nome, salario));
		}
		System.out.print("Digite o ID do funcionário que terá o salário aumentado em 10%: ");
		int id = scanner.nextInt();
		if (idConstaNaLista(funcionarios, id)) {
			System.out.print("Qual a porcentagem de aumento? ");
			double porcentagemAumento = scanner.nextDouble();
			for (Funcionario funcionario : funcionarios) {
				if (funcionario.getId() == id) {
					funcionario.aumentarSalario(porcentagemAumento);
				}
			}
		} else {
			System.out.println("ID não encontrado na lista.");
		}

		System.out.println();
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

	public static boolean idRepetido(List<Funcionario> funcionarios, int id) {
		boolean buscaId = false;
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId() == id) {
				buscaId = true;
			}
		}
		return buscaId;
	}

	public static boolean idConstaNaLista(List<Funcionario> funcionarios, int id) {
		boolean buscaId = false;
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId() == id) {
				buscaId = true;
			}
		}
		return buscaId;
	}
}

