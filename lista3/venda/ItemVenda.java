package lista3.venda;

public class ItemVenda {
    private int codigo;
    private String nome;
    private int qtde;
    private float valor;

    public ItemVenda() {
    }
    public ItemVenda(int codigo, String nome, int qtde, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
    }
  

    public int getCodigo() {
        return codigo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "\n Código: "  +this.codigo + " Nome: " + this.nome + " Valor: " + this.valor +
        " Qtde: " + this.qtde;
    }
    
}
