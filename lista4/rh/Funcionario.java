package lista4.rh;

public class Funcionario {
    // # - protected -> permite que a variável seja herdada para as classes filhas
    protected String nome; 
    protected String rg;
    protected float salario;
    public Funcionario() {
        
    }
    public Funcionario(String nome, String rg, float salario) {
        this.setNome(nome);
        this.setRg(rg);
        this.setSalario(salario);
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "Rg " + this.rg + " Nome: " + this.nome + " Salário " + this.salario;
    }
    
    public void receberSalarioTotal(){
        // é possível implementar este método na classe Funcionário?
        // este método teria a mesma implementação nas classes filhas?
    }
}
