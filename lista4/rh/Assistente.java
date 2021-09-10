package lista4.rh;

public class Assistente extends Funcionario{

    private float horaExtra;

    // Assistente as1 = new Assistente("Fulano", "123", 200, 2);
    public Assistente(String nome, String rg, float salario, float horaExtra) {
        super(nome, rg, salario); // chama construtor da superclasse - reutilização de código
        this.horaExtra = horaExtra;
    }

    public Assistente() {
        super(); // chama construtor da superclasse
    }

    
    
    
}
