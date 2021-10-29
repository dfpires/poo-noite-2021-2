let cadastrar = () => {
    // recuperar os dados do usuário e já cria o objeto
    // vamos utilizar programação DOM (document object model)
    let paciente = {
        nome: document.getElementById("nome").value,
        cpf: document.getElementById("cpf").value,
        altura: Number(document.getElementById("altura").value),
        peso: Number(document.getElementById("peso").value),
        idade: Number(document.getElementById("idade").value)
    }

    // vamos criar a conexão
    let requisicao = new XMLHttpRequest()
    // true indica que a abertura de conexão é assíncrona
    requisicao.open('POST', 'http://localhost:8080/paciente', true)
    
    // configura o cabeçalho da requisição
    requisicao.setRequestHeader("Content-Type", "application/json")
    // converte json em string
    requisicao.send(JSON.stringify(paciente))
    alert('Paciente foi inserido com sucesso')

}

let preencherTabela = () => {

    
}