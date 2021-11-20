package fatecfranca.edu.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fatecfranca.edu.br.model.Medico;
import fatecfranca.edu.br.model.repositories.MedicoRepository;

@RestController // esta classe irá responder pelas requisições de médico
public class MedicoController {

	// injeção de dependência
	@Autowired
	MedicoRepository injecao;
	
	@GetMapping("/medico")
	@CrossOrigin(origins="*") // API pode ser acessada de qualquer IP
	public List<Medico> get(){
		return injecao.findAll();
	}
	
	@PostMapping("/medico")
	@CrossOrigin(origins="*") // API pode ser acessada de qualquer IP
	public String post(@RequestBody Medico medico) {
		injecao.save(medico);
		System.out.println("Médico inserido com sucesso");
		return "Médico inserido com sucesso";
	}
	
	@DeleteMapping("/medico/{id}")
	@CrossOrigin(origins="*") // API pode ser acessada de qualquer IP
	public String delete(@PathVariable Long id) {
		
		injecao.deleteById(id);
		System.out.println("Médico removido com sucesso");
		return "Médico removido com sucesso";
	}
	
	@PutMapping("/medico")
	@CrossOrigin(origins="*") // API pode ser acessada de qualquer IP
	public String put(@RequestBody Medico medico) {
		injecao.save(medico);
		System.out.println("Médico atualizado com sucesso");
		return "Médico atualizado com sucesso";
	}
	
}
