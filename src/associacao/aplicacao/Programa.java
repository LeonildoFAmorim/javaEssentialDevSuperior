package associacao.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import associacao.entidades.Cliente;
import associacao.entidades.ItemPedido;
import associacao.entidades.Pedido;
import associacao.entidades.Produto;
import associacao.entidades.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.next();
		System.out.print("Data de nascimento: dd/MM/yyyy: ");
		Date dataNascimento = sdf.parse(scanner.next());
		Cliente cliente = new Cliente(nome, email, dataNascimento);

		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(scanner.next());
		System.out.print("Quantos itens para este pedido: ");
		int itens = scanner.nextInt();

		Pedido pedido = new Pedido(new Date(), status, cliente);

		for (int i = 0; i < itens; i++) {
			System.out.println("Entre com os dados do produto #" + (i + 1));
			System.out.print("Nome do produto: ");
			String nomeProduto = scanner.next();
			System.out.print("Preço do produto: ");
			double precoPrduto = scanner.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = scanner.nextInt();
			scanner.nextLine();
			Produto produto = new Produto(nomeProduto, precoPrduto);
			ItemPedido itemPedido = new ItemPedido(quantidade, precoPrduto, produto);
			pedido.adicionaItem(itemPedido);
		}
		System.out.println(pedido);
		scanner.close();
	}
}
