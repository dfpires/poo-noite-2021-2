package fatecfranca.edu.br.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatecfranca.edu.br.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

	// esta interface vai herdar todos os métodos prontos de CRUD, já customizados
	// para a classe Paciente
}
