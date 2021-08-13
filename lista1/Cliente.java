package lista1;
public class Cliente {
    
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){

    }
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    // depositar um valor x
    public void depositar(float x){
        this.saldo = this.saldo + x;
    }

    // sacar um valor x
    public void sacar(float x){
        if (this.saldo - x >= 0){
            this.saldo -= x; 
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    // retorna dados do cliente
    public String dadosCliente(){
        return " Número da agência " + this.numeroAgencia + " Número da conta: " + this.numeroConta + " Saldo atual: " + this.saldo;
    }
}
