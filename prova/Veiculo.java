package prova;

public abstract class Veiculo {
    protected int ano;
    protected float preco;
    protected String descricao;
    public Veiculo() {
    }
    public Veiculo(int ano, float preco, String descricao) {
        this.setAno(ano);
        this.setPreco(preco);
        this.setDescricao(descricao);
    }
    public int getAno() {
        return ano;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String toString(){
        return "Descrição: " + this.descricao + " Preço: " + this.preco + " Ano: " + this.ano;
    }
}
