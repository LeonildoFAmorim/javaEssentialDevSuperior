package classes_abstratas.entidades;

public class PessoaFisica extends Contribuinte {
	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getgastosSaude() {
		return gastosSaude;
	}

	public void setgastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		double valorImposto = 0.0;
		if (getRendaAnual() < 20000) {
			valorImposto = (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
		} else {
			valorImposto = (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
		}
		return valorImposto;
	}
}
