package lista2.produto;

public class Produto {
    // vamos encapsular as variáveis -> esconder, proteger, privar de mau uso
    private int id, qtde;
    private String descricao;
    private float preco;

    public Produto(){

    }
    public Produto(int id, int qtde, String descricao, float preco){
        // construtor está considerando o encapsulamento
        this.setId(id);
        this.setQtde(qtde);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    // vamos criar os métodos setters
    // método final não pode ser alterado nas classes filhas
    public final void setQtde(int qtde){
        if (qtde >=0){
            this.qtde = qtde;
        }
        else {
            System.out.println("Qtde de produto não pode ser negativo");
        }
    }
    // método final não pode ser alterado nas classes filhas
    public final void setPreco(float preco){
        if (preco >= 0){
            this.preco = preco;
        }
        else {
            System.out.println("Preço de produto não pode ser negativo");
        }
    }
    // método final não pode ser alterado nas classes filhas
    public final void setId(int id){
        if (id >= 0){
            this.id = id;
        }
        else {
            System.out.println("Id de produto não pode ser negativo");
        }
    }
    // método final não pode ser alterado nas classes filhas
    public final void setDescricao(String descricao){
        if (!descricao.isEmpty()){ // se descricao não for vazio
            this.descricao = descricao;
        }
        else {
            System.out.println("Descrição de produto não pode ser vazio");
        }
        
    }

    // comprar
    public void comprar(int x){

        this.qtde += x;

    }
     // vender
     public void vender(int x){

        this.setQtde(this.qtde-x);

    }
     // subir
     public void subir(float x){
        this.preco += x;
    }
     // subir
     public void descer(float x){

        this.setPreco(this.preco - x);
    
    }

    public String mostra(){
        return String.format("Id: %d Nome: %s Qtde: %d Preço %.2f", this.id, this.descricao, this.qtde, this.preco);
    }


}
