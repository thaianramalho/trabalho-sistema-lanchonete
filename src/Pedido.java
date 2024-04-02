import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private String nomeCliente;
  private List<ItemVenda> itensConsumidos;
  private double taxaServico;

  public Pedido(String nomeCliente, double taxaServico) {
    this.nomeCliente = nomeCliente;
    this.taxaServico = taxaServico;
    this.itensConsumidos = new ArrayList<>();
  }

  public void adicionarItem(ItemVenda item) {
    this.itensConsumidos.add(item);
  }

  public double calcularTotal() {
    double total = 0;
    for (ItemVenda item : itensConsumidos) {
      total += item.getPreco();
    }
    total += taxaServico;
    return total;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public double getTaxaServico() {
    return taxaServico;
  }

  public void setTaxaServico(double taxaServico) {
    this.taxaServico = taxaServico;
  }
}
