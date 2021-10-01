package prova;

public class NaoMotorizada extends Veiculo{
    private String meioLocomocao;
    public NaoMotorizada() {
        super();
    }
    public NaoMotorizada(int ano, float preco, String descricao, String meioLocomocao) {
        super(ano, preco, descricao);
        this.meioLocomocao = meioLocomocao;
    }
    public String getMeioLocomocao() {
        return meioLocomocao;
    }
    public void setMeioLocomocao(String meioLocomocao) {
        this.meioLocomocao = meioLocomocao;
    }
    @Override
    public String toString(){
        return super.toString() + " Meio de Locomoção: " + this.meioLocomocao;
    }

}
