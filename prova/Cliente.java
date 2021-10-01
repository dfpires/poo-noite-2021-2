package prova;

// objeto-parte
public class Cliente {
    private String rg, nome;
    public Cliente() {
    }
    public Cliente(String rg, String nome) {
        this.setRg(rg);
        this.setNome(nome);
    }
    public String getRg() {
        return rg;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String toString(){
        return "Nome: " + this.getNome() + " RG: " + this.rg;
    }
}
