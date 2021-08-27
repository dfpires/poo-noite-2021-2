package lista3.viagem;

public class Passageiro {
    
    private String rg;
    private String cpf;
    private String nome;

    public Passageiro() {
    }
    public Passageiro(String rg, String cpf, String nome) {
        this.setRg(rg);
        this.setCpf(cpf);
        this.setNome(nome);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
   public String toString(){
       return "Nome: " + this.nome + " RG: " + this.rg + " CPF: " + this.cpf;
   }

}
