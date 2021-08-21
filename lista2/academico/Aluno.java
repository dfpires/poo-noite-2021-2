package lista2.academico;

public class Aluno {
    
    private float p1, p2;
    private int idade, numeroAluno;
    private String nome;

    public Aluno(){

    }
    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2){
        this.setNome(nome);
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    public final void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome não pode ser grande");
        }
    }
    public final void setNumeroAluno(int numeroAluno){
        // converte numeroAluno para String
        String numeroAlunoString = Integer.toString(numeroAluno);
        if (numeroAlunoString.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else {
            System.out.println("Número do aluno não pode ser negativa");
        }
    }
    public final void setP1(float p1){
        if (p1 >= 0){
            this.p1 = p1;
        }
        else {
            System.out.println("nota p1 não pode ser negativa");
        }
    }
    public final void setP2(float p2){
        if (p2 >= 0){
            this.p2 = p2;
        }
        else {
            System.out.println("nota p2 não pode ser negativa");
        }
    }
    public final void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else {
            System.out.println("idade não pode ser negativa");
        }
    }

    // getters - retornam o valor da variável privada
    // método que retorna um inteiro
    public int getIdade(){
        return this.idade;
    }
    // método que retorna um float
    public float getP1(){
        return this.p1;
    }
    // método que retorna um float
    public float getP2(){
        return this.p2;
    }
    // método que retorna um String
    public String getNome(){
        return this.nome;
    }
    // método que retorna um inteiro
    public int getNumeroAluno(){
        return this.numeroAluno;
    }
    public String toString(){
        return "Número do aluno "  +this.numeroAluno + "Nome " + this.nome + "p1 " + this.p1 + 
        " p2 " + this.p2 + " idade: " + this.idade + " nota final " + this.notaFinal();
    }

    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
}
