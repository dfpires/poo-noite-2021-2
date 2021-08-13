package lista2.produto;

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

        Produto prod3 = new Produto();
        prod3.setQtde(10); // prod3.qtde = 10
        prod3.setPreco(15); // prod3.qtde = 15
        prod3.setId(1); 
        prod3.setDescricao("sabonete");

        Produto prod4 = new Produto();
        prod4.setQtde(-3); // pode isso, Arnaldo? A regra é clara, não pode
        prod4.setPreco(-13); // pode isso, Arnaldo? A regra é clara, não pode
        prod4.setId(-1);
        prod4.setDescricao("chuveiro");

        Produto prod5 = new Produto(100, 5, "Xícara", 8);
        prod5.vender(7);
        prod5.descer(10);
        System.out.println(prod5.mostra());

    }
}
