var campoFiltro = document.querySelector("#filtrar-tabela");

campoFiltro.addEventListener("input", function(){
    console.log(this.value);
    var pacientes = document.querySelectorAll(".paciente");

    if(this.value.length > 0) {
        for(var i = 0; i < pacientes.length; i++) { // Percorrer todos os pacientes.
            var paciente = pacientes[i];
            var tdNome = paciente.querySelector(".info-nome"); // Pegar a info específica (no caso, nome do paciente)
            var nome = tdNome.textContent; // Colocar o conteúdo da classe acima em uma variável.
            var expressao = new RegExp(this.value, "i") // Pra fazer uma busca, utilizaremos uma expressão regular (RegExp). Dá pra passar pra ela duas coisas, 'algo para buscar' e 'como buscar'.
            if(!expressao.test(nome)) {
                paciente.classList.add("invisivel");
            } else {
                paciente.classList.remove("invisivel");
            }
        }
    } else {
        for(var i = 0; i < pacientes.length; i++) {
            var paciente = pacientes[i];
            paciente.classList.remove("invisivel");
        }
    }
});

/*

Existe outro meio de fazer essa pesquisa sem utilizar RegExp.
Podemos utilizar a função substring, que recebe dois parâmetros:
 - A posição do caracter que vai iniciar;
 - A posição do caracter que vai terminar; (podemos colocar '.length' caso seja necessário fazer ela toda)

Veja abaixo:
    var comparavel = nome.substring(0, this.value.length);

    if (!(this.value == comparavel)) {
        paciente.classList.add("invisivel");
    } else{
        paciente.classList.remove("invisivel");
    }

Lembrando que, nesse modo acima, há a distinção de letras maiúsculas e minúsculas.
Caso não queira isso, é necessário transformar os valores de 'this.value' em minúsculo e...
... o de '___.substring' também, usando '.toLowerCase()'.

Veja abaixo:
    var comparavel = nome.substr(0, this.value.length);
    var comparavelMinusculo = comparavel.toLowerCase();
    var valorDigitadoMinusculo = this.value.toLowerCase();

    if (!(valorDigitadoMinusculo == comparavelMinusculo)) {
        paciente.classList.add("invisivel");
    } else{
        paciente.classList.remove("invisivel");
    }

*/ 