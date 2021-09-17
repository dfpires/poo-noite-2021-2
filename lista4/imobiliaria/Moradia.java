package lista4.imobiliaria;

public abstract class Moradia {
    protected String endereco, cidade;
    protected float tamanho;

    public Moradia() {
    }
    public Moradia(String endereco, String cidade, float tamanho) {
        this.setEndereco(endereco);
        this.setCidade(cidade);
        this.setTamanho(tamanho);
    }
    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   public String toString(){
       return "Endereço: " + this.endereco + " Cidade: " + this.cidade + " Tamanho: " + this.tamanho;
   }

    public abstract void calcularPreco();
}
