import java.util.Date;

public class Lanche extends ItemVenda {
  private String tipoPao;
  private String recheio;
  private String molho;

  public Lanche(double preco, Date dataValidade, double peso, String tipoPao, String recheio, String molho) {
    super(preco, dataValidade, peso);
    this.tipoPao = tipoPao;
    this.recheio = recheio;
    this.molho = molho;
  }

  public String getTipoPao() {
    return tipoPao;
  }

  public void setTipoPao(String tipoPao) {
    this.tipoPao = tipoPao;
  }

  public String getRecheio() {
    return recheio;
  }

  public void setRecheio(String recheio) {
    this.recheio = recheio;
  }

  public String getMolho() {
    return molho;
  }

  public void setMolho(String molho) {
    this.molho = molho;
  }
}
