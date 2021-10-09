package fatecfranca.edu.br.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fatecfranca.edu.br.model.Paciente;

// uma classe do tipo interface tem somente declaração de métodos
// a classe interface vai herdar a classe MongoRepository
// com esta herança, teremos todos os métodos de CRUD do banco dedados específicos
// da classe Paciente, String é o tipo da chave da classe Paciente
// CRUD -> Create, Retrieve, Update, Delete (comandos de banco de dados)

public interface PacienteRepository extends MongoRepository<Paciente, String>{

	// esta interface vai herdar e conter:
	// método save() para inserir e atualizar no banco de dados
	// método findAll() para consultar
	// método remove para remover
	
}
