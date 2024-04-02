import java.util.Date;

public class ItemVenda {
  private double preco;
  private Date dataValidade;
  private double peso;

  public ItemVenda(double preco, Date dataValidade, double peso) {
    this.preco = preco;
    this.dataValidade = dataValidade;
    this.peso = peso;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Date getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }
}
