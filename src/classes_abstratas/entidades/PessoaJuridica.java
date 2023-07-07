package classes_abstratas.entidades;

public class PessoaJuridica extends Contribuinte {
	private int numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double imposto() {
		double valorImposto = 0;
		valorImposto = getNumeroFuncionarios() > 10 ? getRendaAnual() * 0.14 : getRendaAnual() * 0.16;
		return valorImposto;
	}
}
