package lista1;
public class Aluno {
    public int numeroAluno, idade; // int é tipo primitivo
    public String nome; // String é uma classe, por isso começa com letra maiúscula
    public float p1, p2; // float é tipo primitivo

    // construtor
    public Aluno(){

    }
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    // retorna a média
    public float notaFinal(){
        float media = (this.p1 + this.p2) / 2;
        return media;
    }

    // retorna os dados do aluno
    public String dadosAluno(){
        return "Número do aluno " + this.numeroAluno + " Nome: " + this.nome + " nota final: " + this.notaFinal();
    }

    // verifica se passou
    public String passou(){
        if (this.notaFinal() >= 6){
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }

     //   return (this.notaFinal() >= 6) ? "aprovado" : "reprovado";
    }
}
