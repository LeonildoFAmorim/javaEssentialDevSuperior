package associacao.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItemPedido> itensPedidos = new ArrayList<>();

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Pedido() {
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionaItem(ItemPedido item) {
		itensPedidos.add(item);
	}

	public void removeItem(ItemPedido item) {
		itensPedidos.remove(item);
	}

	public Double precoTotal() {
		Double soma = 0.0;
		for (ItemPedido itemPedido : itensPedidos) {
			soma += itemPedido.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\nRESUMO DO PEDIDO: \n");
		stringBuilder.append("Momento do pedido: " + sdf.format(momento) + "\n");
		stringBuilder.append("Status: " + status + "\n");
		stringBuilder.append("Cliente: " + cliente + "\n");
		stringBuilder.append("Itens pedidos: \n");
		for (ItemPedido itemPedido : itensPedidos) {
			stringBuilder.append(itemPedido + "\n");
		}
		stringBuilder.append("Total: " + String.format("%.2f", precoTotal()));
		return stringBuilder.toString();
	}

}
