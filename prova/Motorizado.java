package prova;

public class Motorizado extends Veiculo{
    private float potencia;
    private String combustivel;
    public Motorizado() {
        super();
    }
    public Motorizado(int ano, float preco, String descricao, float potencia, String combustivel) {
        super(ano, preco, descricao);
        this.potencia = potencia;
        this.combustivel = combustivel;
    }
    public float getPotencia() {
        return potencia;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    @Override
    public String toString(){
        return " Potência: " + this.potencia + " Combustível: " + this.combustivel + super.toString();
    }
    
}
