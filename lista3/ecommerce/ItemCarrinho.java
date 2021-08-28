package lista3.ecommerce;

public class ItemCarrinho {
    
    private int codigo;
    private float valor;
    private int qtde;
    public ItemCarrinho() {
    }
    public ItemCarrinho(int codigo, float valor, int qtde) {
        this.setCodigo(codigo);
        this.setValor(valor);
        this.setQtde(qtde);
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
  public String toString(){
      return "Código: " + this.codigo + "Valor: " + this.valor + " Qtde " + this.qtde;
  }

    
}
