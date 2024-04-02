import java.util.Date;

public class App {
    public static void main(String[] args) {
        Pedido pedidoCliente = new Pedido("João", 2.50);

        Pizza pizza = new Pizza(20.0, new Date(), 500, "Calabresa", "Catupiry", "Tomate");
        pedidoCliente.adicionarItem(pizza);

        Lanche lanche = new Lanche(15.0, new Date(), 200, "Brioche", "Frango", "Maionese");
        pedidoCliente.adicionarItem(lanche);

        Salgadinho salgadinho = new Salgadinho(2.5, new Date(), 50, "Frito", "Massa Folhada", "Queijo");
        pedidoCliente.adicionarItem(salgadinho);

        NotaFiscal notaFiscal = new NotaFiscal(pedidoCliente);
        notaFiscal.gerarNotaFiscal();

        System.out.println("Cliente: " + pedidoCliente.getNomeCliente());
        System.out.println("Total do pedido: R$" + pedidoCliente.calcularTotal());

    }
}
