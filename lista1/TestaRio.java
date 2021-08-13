package lista1;
public class TestaRio {
    
    // públic indica que o método é público
    // static indica que o método é de classe
    // void indica que o método não retorna nada
    // String args[] indica que o método recebe como parâmetro um array de strings
    public static void main(String args[]){

        Rio obj1 = new Rio("Amazonas", 1.3f, false);
        obj1.subir(0.4f);
        obj1.sujar();

        Rio obj2 = new Rio("Tamoios", 0.9f, true);
        obj2.descer(0.3f);
        obj2.limpar();

        System.out.println(obj1.mostra());
        System.out.println(obj2.mostra());
        

    }
}
