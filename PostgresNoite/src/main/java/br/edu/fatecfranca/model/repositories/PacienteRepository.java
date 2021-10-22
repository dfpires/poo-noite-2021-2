package br.edu.fatecfranca.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecfranca.model.Paciente;

// a interface vai herdar os métodos da classe JpaRepository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

	// esta interface terá todos os métodos para operar com o paciente no banco de dados
	// inserir, remover, consultar e atualizar
	
}
