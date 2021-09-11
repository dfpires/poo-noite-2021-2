package lista4.rh;

public class Testa {
    
    public static void main(String args[]){
        Assistente as1 = new Assistente("Fulano", "123", 2000, 2);
        System.out.println(as1.toString());

        Gerente ger1 = new Gerente("Beltrano", "456", 4000, 1000, "batida 100%");
        System.out.println(ger1.toString());

        Diretor dir1 = new Diretor("Ciclano", "789", 6000, "Civic");
        System.out.println(dir1.toString());
    }
}
