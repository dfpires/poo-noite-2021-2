package lista4.rh;

public class Diretor extends Funcionario {
    private String carro;

    public Diretor() {
        super();
    }

    public Diretor(String nome, String rg, float salario, String carro) {
        super(nome, rg, salario);
        this.setCarro(carro);
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

   @Override
   public String toString(){
       return " Carro: " + this.carro + super.toString();
   }
    
}
