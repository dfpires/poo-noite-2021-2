package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.Paciente;
import br.edu.fatecfranca.model.repositories.PacienteRepository;

// a classe é responsável por responder as requisições
@RestController
@RequestMapping("/paciente")
public class PacienteController {

	// Spring possui o recurso de injeção de dependência
	// objeto pode executar métodos de uma interface sem instanciar
	@Autowired
	PacienteRepository injecao;
	

	// método para inserir no banco de dados
	// os valores do paciente virão no corpo (body) da requisição
	@PostMapping
	@CrossOrigin(origins="*")
	public String add(@RequestBody Paciente paciente) {
		// { cpf: "12121",
		//   idade: 20,
		//   altura: 1.78,
		//   peso: 78
		//  }
		injecao.save(paciente);
		return "Paciente inserido com sucesso";
	}
	
	// método para consultar no banco de dados
	@GetMapping
	@CrossOrigin(origins="*")
	public List<Paciente> get(){
		return injecao.findAll();
	}
	
	// método para remover do banco de dados
	@DeleteMapping("/{id}")
	@CrossOrigin(origins="*")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Paciente removido com sucesso";
	}
	
	// método para atualizar no banco de dados
	@PutMapping
	@CrossOrigin(origins="*")
	public String update(@RequestBody Paciente paciente) {
		injecao.save(paciente); // paciente tem id, e portanto vai atualizar
		return "Paciente atualizado com sucesso";
		
				// { id: 2,         
				//   cpf: "12121",
				//   idade: 20,
				//   altura: 1.78,
				//   peso: 78
				//  }
	}
}
