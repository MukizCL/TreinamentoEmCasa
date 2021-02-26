// Calcular IMC, etc...

var titulo = document.querySelector(".titulo");
titulo.textContent = "Aparecida Nutricionista";

var pacientes = document.querySelectorAll(".paciente");

for(var i = 0; i < pacientes.length; i++){
    var paciente = pacientes[i];
    
    var tdPeso = paciente.querySelector(".info-peso");
    var peso = tdPeso.textContent;

    var tdAltura = paciente.querySelector(".info-altura");
    var altura = tdAltura.textContent;

    var tdImc = paciente.querySelector(".info-imc");

    var infoValidaPeso = validaPeso(peso);
    var infoValidaAltura = validaAltura(altura);

    if(!infoValidaPeso){
        console.log("Peso inválido!");
        tdImc.textContent = "Peso inválido"               
    }

    if(!infoValidaAltura){
        console.log("Altura inválido!");
        tdImc.textContent = "Altura inválida"               
    }

    if (infoValidaAltura == true && infoValidaPeso == true){
        var imc = calcularImc(peso, altura);
        tdImc.textContent = imc;
    } else {
        paciente.classList.add("paciente-invalido");
    }
}

function validaPeso(peso) {
    if (peso > 0 && peso < 1000) {
        return true;
    } else {
        return false;
    }
}

function validaAltura(altura) {
    if (altura > 0 && altura < 3.00) {
        return true;
    } else {
        return false;
    }
}

function calcularImc(peso, altura) {
    var imc = 0
    imc = (peso / (altura * altura));

    return imc.toFixed(2);
}