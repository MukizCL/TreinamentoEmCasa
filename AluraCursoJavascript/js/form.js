// Trabalha com o formulário, etc...

var botaoAdicionar = document.querySelector("#adicionar-paciente");

botaoAdicionar.addEventListener("click", function() {
    event.preventDefault();    
    var form = document.querySelector("#form-adiciona");

    var paciente = obtemPacientedoForm(form); // Ele usará as informações da variável 'form' (que por sua vez vem do 'document').

    var pacienteTr = montarTr(paciente); // Ele usará as informações já criadas na função 'obtemPacienteDoForm' (que está contido na variável 'paciente').

    var erro = validaPaciente(paciente);
    console.log(erro);

    if (erro.length > 0){
       exibeMensagemErros(erro);
       return;
    }    

    var tabela = document.querySelector("#tabela-pacientes");
    tabela.appendChild(pacienteTr);
    form.reset();
    var mensagensErro = document.querySelector("#mensagens-erro");
    mensagensErro.innerHTML = "";
});

function exibeMensagemErros(erro) {
    var ul = document.querySelector("#mensagens-erro");
    ul.innerHTML = "";
    erro.forEach(function(erros) {
        var li = document.createElement("li");
        li.textContent = erros;
        ul.appendChild(li);
    });
}

function obtemPacientedoForm(form) {
    var paciente = { // Isso é basicamente um método construtor.
        nome: form.nome.value,
        peso: form.peso.value,
        altura: form.altura.value,
        gordura: form.gordura.value,
        imc: calcularImc(form.peso.value, form.altura.value)
    }

    return paciente;
}

function montarTr(paciente) {
    var pacienteTr = document.createElement("tr");
    pacienteTr.classList.add("paciente");
 
    var nomeTd = montarTd(paciente.nome, "info-nome");
    var pesoTd = montarTd(paciente.peso, "info-peso");
    var alturaTd = montarTd(paciente.altura, "info-altura");
    var gorduraTd = montarTd(paciente.gordura, "info-gordura");
    var imcTd = montarTd(paciente.imc, "info-imc");
    
    pacienteTr.appendChild(nomeTd);
    pacienteTr.appendChild(pesoTd);
    pacienteTr.appendChild(alturaTd);
    pacienteTr.appendChild(gorduraTd);
    pacienteTr.appendChild(imcTd);

    return pacienteTr;
}

function montarTd(dado, classe) {
    var td = document.createElement("td");
    td.textContent = dado;
    td.classList.add(classe);

    return td;
}

function validaPaciente(paciente) {
    var erros = [];

    if(paciente.nome.length == 0) erros.push("O nome não pode ser em branco!");
    if(paciente.gordura.length == 0) erros.push("A gordura não pode ser em branco!");
    if(!validaPeso(paciente.peso)) erros.push("Valor de peso inválido!");
    if(!validaAltura(paciente.altura)) erros.push("Valor de altura inválido!");

    return erros;
}