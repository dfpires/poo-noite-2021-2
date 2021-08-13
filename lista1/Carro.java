package lista1;
public class Carro {

    // dois tipos de variáveis
    // tipo primitivo - int, float, double, char
    // tipo de classe - String, Float, Double, Integer

    // propriedades (variáveis) da classe
    float velocidade; // número com ponto flutuante
    boolean motor; // booleana - true (ligado) ou false (desligado) 
    int ano; // número inteiro
    String modelo; // String é uma classe pronta - cj de caracteres

    // método construtor
    public Carro(){

    }

    // método construtor
    public Carro(String modelo, int ano, boolean motor, float velocidade ){ //"Celta", 2016, true, 50
        // variável do objeto = variável do usuário
        // this representa o objeto sendo criado
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velocidade = velocidade;
    }

    // um método ou operação
    public void mostra(){
        // qual palavra representa o objeto que chama o método
        System.out.println("Modelo: " + this.modelo + " Ano: " + this.ano + " Vel: " + this.velocidade);
  
    }
}