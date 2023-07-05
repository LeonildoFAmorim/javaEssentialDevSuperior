package heranca_polimorfismo.entidades;

import java.time.LocalDate;

public class ProdutoUsado extends Produto {
	private LocalDate dataFabricacao;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String etiquetaPreco() {
		return super.etiquetaPreco()
				+ " (data da fabricação: " + dataFabricacao + ")";
	}
}
