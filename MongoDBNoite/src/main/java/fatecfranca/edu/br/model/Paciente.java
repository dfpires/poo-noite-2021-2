package fatecfranca.edu.br.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// vamos associar esta classe Paciente com o documento paciente no banco de dados MongoDB
// Decorador @Document
@Document(collection="paciente")
public class Paciente {

	// campo chave do documento
	@Id
	private String id;
	
	private String nome, cpf;
	private int idade;
	private float peso, altura;
	
	public Paciente() {
		super();
	}
	public Paciente(String id, String nome, String cpf, int idade, float peso, float altura) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	
	
}
