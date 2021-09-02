package lista3.redesocial;
import java.util.ArrayList;

public class RedeSocial {
    private int codigo;
    private String nome;
    private String url;
    // associação com ArrayList
    private ArrayList<Usuario> usuarios; // vetor
    public RedeSocial() {
    }
    public RedeSocial(int codigo, String nome, String url, ArrayList<Usuario> usuarios) {
        this.codigo = codigo;
        this.nome = nome;
        this.url = url;
        this.usuarios = usuarios;
    }
    public int getCodigo() {
        return codigo;
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setRedes(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
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
    public String toString(){
        return "Código: " + this.codigo + " Nome: " + this.nome + " url: " + this.url + " \n Usuários " + this.usuarios.toString();
    }

}
