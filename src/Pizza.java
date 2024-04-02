import java.util.Date;

public class Pizza extends ItemVenda {
  private String recheio;
  private String borda;
  private String molho;

  public Pizza(double preco, Date dataValidade, double peso, String recheio, String borda, String molho) {
    super(preco, dataValidade, peso);
    this.recheio = recheio;
    this.borda = borda;
    this.molho = molho;
  }

  public String getRecheio() {
    return recheio;
  }

  public void setRecheio(String recheio) {
    this.recheio = recheio;
  }

  public String getBorda() {
    return borda;
  }

  public void setBorda(String borda) {
    this.borda = borda;
  }

  public String getMolho() {
    return molho;
  }

  public void setMolho(String molho) {
    this.molho = molho;
  }
}
