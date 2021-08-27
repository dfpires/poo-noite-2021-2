package lista3.viagem;
import java.util.Date;

public class Voo {
    private int numero;
    private String origem, destino;
    private Date data;

    public Voo() {
    }
    public Voo(int numero, String origem, String destino, Date data) {
        this.setNumero(numero);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setData(data);
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String toString(){
        return "Número: " + this.numero + " Origem: " + this.origem + " Destino " + this.destino + " Data: " + this.data;
    } 

}
