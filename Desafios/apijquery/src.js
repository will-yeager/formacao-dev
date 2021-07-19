
function gerarInfo() {
    let nomeDoPokemon = document.getElementById("nomeDoPokemon").value;
    const documentAPI = document.getElementById("api");
    nomeDoPokemon = nomeDoPokemon.toLowerCase();
    var resultado = function(data) {
        var pokemon = data;
        console.log(data);

        const nome = data.name;
        const abilityDoPokemon = data.abilities[0].ability.name;
        const imgDoPokemon = data.sprites.front_default;

        documentAPI.innerHTML = "Nome: " + nome + " <p>Habilidade : " + abilityDoPokemon + "</p>" + " <img width='200px' src=" + imgDoPokemon + ">"

    }

    $.get("https://pokeapi.co/api/v2/pokemon/" + nomeDoPokemon, resultado);
}

function gerarInfoDoCep() {
    let cep = document.getElementById("CEP").value;
    let documentCEPAPI = document.getElementById("apiCep");
    var resultado = function(data) {
        var cepData = data;
        console.log(cepData);

        documentCEPAPI.innerHTML = "Logradouro: " + cepData.logradouro + "<p> Bairro: " + cepData.bairro + "</p>" + "<p>Cidade: " + cepData.localidade

    }

    $.get("https://viacep.com.br/ws/" + cep + "/json/", resultado);
}

document.getElementById("btnPokemon").addEventListener("click", function() {
    /* função */
})