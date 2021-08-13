package lista1;
public class TestaAluno {
    // públic indica que o método é público
    // static indica que o método é de classe
    // void indica que o método não retorna nada
    // String args[] indica que o método recebe como parâmetro um array de strings
    public static void main(String args[]){

       
        // vamos criar uma instância de aluno
        Aluno obj1 = new Aluno(456, "Dirceu", 25, 9, 8); // chama construtor Aluno()
        System.out.println(obj1.dadosAluno());
        System.out.println(obj1.passou());

        // chama construtor Aluno(int, String, int, float, float)
        Aluno obj2 = new Aluno(123, "Pedro", 20, 8, 7); 
        System.out.println(obj2.dadosAluno());
        System.out.println(obj2.passou());
    }
}


// public void soma(){
//    System.out.println("Somei");
// }

// public String soma(){
//    return "Somei";
// }
