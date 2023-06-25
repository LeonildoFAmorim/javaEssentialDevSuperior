package listas.entidades;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;

	public Funcionario(int id, String nome, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public Funcionario() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", nome: " + nome + ", salario: " + String.format("%.2f", salario);
	}
}
