package prova;

// objeto-parte
public class Unidade {
    private String cidade, estado;
    public Unidade() {
    }
    public Unidade(String cidade, String estado) {
        this.setCidade(cidade); // -> mantenho o encapsulamento
       // this.cidade = cidade; -> perco o encapsulamento
        this.setEstado(estado);
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String toString(){
        return "Cidade: " + this.cidade + " Estado: " + this.estado;
    }
}
