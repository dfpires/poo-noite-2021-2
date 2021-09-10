package lista3.streaming;
import java.util.ArrayList;

public class Streaming {
    private int codigo;
    private String nome;
    private String url;
    // associação
    private ArrayList<Filme> filmes;

    public Streaming() {
        this.filmes = new ArrayList<Filme>();
    }
    public Streaming(int codigo, String nome, String url) {
        this.codigo = codigo;
        this.nome = nome;
        this.url = url;
        this.filmes = new ArrayList<Filme>();
    }
    
    public int getCodigo() {
        return codigo;
    }
    public ArrayList<Filme> getFilmes() {
        return filmes;
    }
    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
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

    public void addFilme(Filme filme){
        this.filmes.add(filme);
    }

    public String toString(){
        return "Código: " + this.codigo + " Nome: " + this.nome + 
        " URL: " + this.url + " Filmes " + this.filmes.toString();
    }
}
