public class NotaFiscal {
  private Pedido pedido;

  public NotaFiscal(Pedido pedido) {
    this.pedido = pedido;
  }

  public void gerarNotaFiscal() {
    System.out.println("Nota fiscal gerada para o pedido de " + pedido.getNomeCliente());
    // Aqui você pode adicionar mais detalhes da nota fiscal, como os itens do
    // pedido, total, etc.
  }
}
