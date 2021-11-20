package fatecfranca.edu.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medico")
public class Medico {

	// chave primária com auto-incremento
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; // float ou real grande
	
	@Column(name="crm")
	private String crm;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="especialidade")
	private String especialidade;

	public Medico() {
		
	}
	public Medico(Long id, String crm, String nome, String especialidade) {
		this.id = id;
		this.crm = crm;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
