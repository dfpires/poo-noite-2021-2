package lista3.ecommerce;
import java.util.Date;


public class Testa {
    public static void main(String args[]){

        // item do carrinho é criado dentro do carrinho, não é criado de forma independente
        // associação de composição
        Carrinho ca = new Carrinho(10, 1000, "Cartão de Crédito", new Date(), "Sedex", 11, 1000, 1);

        System.out.println(ca.toString());
        
    }
}
