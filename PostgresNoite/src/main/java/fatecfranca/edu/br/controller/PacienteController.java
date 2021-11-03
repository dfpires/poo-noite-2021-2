package fatecfranca.edu.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fatecfranca.edu.br.model.Paciente;
import fatecfranca.edu.br.model.repositories.PacienteRepository;

@RestController
public class PacienteController {

	// injeção de dependência
	// permite que um objeto possa chamar métodos sem precisar instanciá-lo
	@Autowired
	PacienteRepository injecao;
	
	@GetMapping("/paciente")
	public List<Paciente> get(){
		return injecao.findAll();
	}
	
	@PostMapping("/paciente")
	public String add(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Paciente inserido com sucesso";
	}
	
	@DeleteMapping("/paciente/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Paciente removido com sucesso";
	}
	
	@PutMapping("/paciente")
	public String put(@RequestBody Paciente paciente) {
		injecao.save(paciente); // se este paciente tiver id, e ele existir no banco, atualiza
		// se este paciente não tiver id, ele insere no banco
		return "Paciente atualizado com sucesso";
	}
}
