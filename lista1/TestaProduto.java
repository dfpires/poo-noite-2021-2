package lista1;
public class TestaProduto {
    
    public static void main(String args[]){

        Produto prod1 = new Produto(1, 100, "Máscara", 3);
        prod1.comprar(10);
        prod1.subir(0.5f);

        Produto prod2 = new Produto(2, 50, "Álcool em gel", 15);

        prod2.vender(5);
        prod2.descer(5);

        System.out.println(prod1.mostra());
        System.out.println(prod2.mostra());
        
    }
}
