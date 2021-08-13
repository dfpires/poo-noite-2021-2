package lista1;
public class TestaCliente {
    
    public static void main(String args[]){

        Cliente obj1 = new Cliente(123, 456, "Fulano", 4000);
        obj1.depositar(1000);
        obj1.sacar(500);

        System.out.println(obj1.dadosCliente());

        Cliente obj2 = new Cliente(789, 654, "Beltrano", 2000);
        obj2.depositar(1000);
        obj2.sacar(1500);

        System.out.println(obj2.dadosCliente());

    }
}
