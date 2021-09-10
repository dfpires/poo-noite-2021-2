package lista3.streaming;

public class Filme {
    private int codigo;
    private String nome;
    private String classificacao;
    
    public Filme() {
    }
    public Filme(int codigo, String nome, String classificacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.classificacao = classificacao;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
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
        return "\n Nome: " + this.nome + "Código: " + this.codigo + "Class " + this.classificacao;
    }
    
}
