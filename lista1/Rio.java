package lista1;
public class Rio {
    
    public String nome;
    public float nivel;
    public boolean poluido; // rio poluído é true e rio limpo é false

    public Rio(){

    }
    public Rio (String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void subir(float x){
        this.nivel += x;
    }

    public void descer(float x){
        this.nivel -= x;
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public String mostra(){
        String auxiliar = this.poluido? "está poluído" : "está limpo";
        return "Nome: " + this.nome + " Nível: " + (this.nivel) + " " + auxiliar;
    } 
}
