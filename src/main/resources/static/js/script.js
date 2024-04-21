var createFuncio = document.getElementById("criarFuncionarioId");
var exibirFuncio = document.getElementById("exibirFuncionarioId");
var exibirFuncioTodos = document.getElementById("exibirTodosFuncionarioId");
var editarFuncio = document.getElementById("editarFuncionarioId");
var desabilitarFuncio = document.getElementById("desabilitarFuncionarioId");
var ativarFuncio = document.getElementById("ativarFuncionarioId");

var createDepend = document.getElementById("criarDependenteId");
var exibirDepend = document.getElementById("exibirDependenteId");
var editarDepend = document.getElementById("editarDependenteId");
var desabiDepend = document.getElementById("desabilitarDependenteId");
var ativarDepend = document.getElementById("ativarDependenteId");

var folhaPagamento = document.getElementById("folhaPagamento");
var calcularFolhaC = document.getElementById("calcularFolhaC");
var addDependenteFuncio = document.getElementById("addDependenteFuncionario");



var selectIds = document.getElementById("iExibirFuncionario");
var selectIdsEditar = document.getElementById("iEditarFuncionarioId");
var selectIdsDesabilitar = document.getElementById("iDesabilitarFuncionarioId");
var selectIdsAtivar = document.getElementById("iAtivarFuncionarioId");
var selectFolhaFuncio = document.getElementById("funcionarioFolha");
var selectFolhaFuncioCalcular = document.getElementById("funcionarioFolhaCalc");

var selectExibirD = document.getElementById("iExibirDependente");
var selectEditarD = document.getElementById("iEditarDependenteId");
var selectDesabilitarD = document.getElementById("iDesabilitarDependenteId");
var selectAtivarD = document.getElementById("iAtivarDependenteId");


function createF(){
    createFuncio.style.display = "block";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function exibirF(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "block";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function exibirTodosF(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "block";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
    exibirFuncioTodos.style.display = "block";

    exibirTodosFuncionarioTest()

}

function editarF(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "block";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function desativarF(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "block";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function ativarF(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "block";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function createD(){
    createFuncio.style.display = "none";
    createDepend.style.display = "block";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function exibirD(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "block";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function editarD(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "block";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function desativarD(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "block";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function ativarD(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "block";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function calcularFolha(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "block";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "none";
}

function calcFolha(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "block";
    addDependenteFuncio.style.display = "none";
}

function addDependente(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
    desabiDepend.style.display = "none";
    ativarFuncio.style.display = "none";
    ativarDepend.style.display = "none";
    folhaPagamento.style.display = "none";
    calcularFolhaC.style.display = "none";
    addDependenteFuncio.style.display = "block";
}



function getNome(){
    var nome = document.getElementById("nome");
    if(nome){
        var value = nome.value;
        return value;
    }
    return "None";
}

function getRg(){
    var rg = document.getElementById("rg");
    if(rg){
        var value = rg.value;
        return value;
    }
    return "None";
}

function getCpf(){
    var cpf = document.getElementById("cpfFuncionario");
    if(cpf){
        var value = cpf.value;
        return value;
    }
    return "None";
}

function getCargo(){
    var cargo = document.getElementById("cargo");
    if(cargo){
        var value = cargo.value;
        return value;
    }
    return "AUXILIAR";
}

function getFuncao(){
    var funcao = document.getElementById("funcao");
    if(funcao){
        var value = funcao.value;
        return value;
    }
    return "None";
}

function getPeriodo(){
    var radioButtons = document.querySelectorAll('input[type="radio"][name="typePeriodo"]');

    for (var i = 0; i < radioButtons.length; i++) {
        var radioButton = radioButtons[i];
        if (radioButton.checked) {
            var selectedRadioValue = radioButton.value;
            return selectedRadioValue;
            break;
        }
    }
    return "MATUTINO";
}

function getSexo(){
    var radioButtons = document.querySelectorAll('input[type="radio"][name="typeSexo"]');

    for (var i = 0; i < radioButtons.length; i++) {
        var radioButton = radioButtons[i];
        if (radioButton.checked) {
            var selectedRadioValue = radioButton.value;
            return selectedRadioValue;
            break;
        }
    }
    return "MASCULINO";
}

function getDateF(){
    var dataAniversario = document.getElementById("dataAniversarioF");
    if(dataAniversario){
        var value = dataAniversario.value;
        return value;
    }
    return "None";
}

function getAssegurado(){
    var categoriaAss = document.getElementById("categoriaAss");
    if(categoriaAss){
        var value = categoriaAss.value;
        return value;
    }
    return "EMPREGADO_CONTRATADO";
}

//endereço

function getRua(){
    var rua = document.getElementById("rua");
    if(rua){
        var value = rua.value;
        return value;
    }
    return "None";
}

function getNumero(){
    var numero = document.getElementById("numero");
    if(numero){
        var value = numero.value;
        return value;
    }
    return "None";
}

function getBairro(){
    var bairro = document.getElementById("bairro");
    if(bairro){
        var value = bairro.value;
        return value;
    }
    return "None";
}

function getCidade(){
    var cidade = document.getElementById("cidade");
    if(cidade){
        var value = cidade.value;
        return value;
    }
    return "None";
}

function getCep(){
    var cep = document.getElementById("cep");
    if(cep){
        var value = cep.value;
        return value;
    }
    return "None";
}

function limparInputs(){
    var radioInputs = document.querySelectorAll('input[type="radio"]');
    radioInputs.forEach(function(input) {
        input.checked = false;
    });
    document.getElementById("nome").value = "";
    document.getElementById("rg").value = "";
    document.getElementById("cpfFuncionario").value = "";
    document.getElementById("cargo").value = "";
    document.getElementById("funcao").value = "";
    document.getElementById("dataAniversarioF").value = "";
    document.getElementById("categoriaAss").value = "";
    document.getElementById("rua").value = "";
    document.getElementById("numero").value = "";
    document.getElementById("bairro").value = "";
    document.getElementById("cidade").value = "";
    document.getElementById("cep").value = "";
}

function criarJson(){
        var json = {
        "nome": getNome(),
        "rg": getRg(),
        "cpf": getCpf(),
        "typeCargo": getCargo(),
        "funcao": getFuncao(),
        "typePeriodo": getPeriodo(),
        "typeSexo": getSexo(),
        "dataAniversario": getDateF(),
        "endereco": {
            "rua": getRua(),
            "numero": getNumero(),
            "bairro": getBairro(),
            "cidade": getCidade(),
            "cep": getCep()
        },
        "typeCategoriaSegurados": getAssegurado(),
    }

    return json;
}

function criarFuncionario(){

    var url = "http://localhost:8080/api/v1/created"

    var json = criarJson();

    console.log(json);

    fetch(url, {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json',
    },
    body: JSON.stringify(json)
    })
    .then(response => {
        if (response.status == 201) {
            return response.json();
        }else{
            throw new Error('Erro ao acessar a API: ' + response.status);
        }
    })
    .then(data => {
        limparInputs();
        alert("Funcionario Criado!");
        console.log(data);

        var optionExibir = document.createElement("option");
        optionExibir.value = data['id'];
        optionExibir.textContent = '' + data['nome'] + " - CPF: " + data['cpf'];

        var optionEditar = document.createElement("option");
        optionEditar.value = data['id'];
        optionEditar.textContent = '' + data['nome'] + " - CPF: " + data['cpf'];

        var optionDesabilitar = document.createElement("option");
        optionDesabilitar.value = data['id'];
        optionDesabilitar.textContent = '' + data['nome'] + " - CPF: " + data['cpf'];

        var optionFolha = document.createElement("option");
        optionFolha.value = data['id'];
        optionFolha.textContent = '' + data['nome'] + " - CPF: " + data['cpf'];

        var optionFolhaCalc = document.createElement("option");
        optionFolhaCalc.value = data['id'];
        optionFolhaCalc.textContent = '' + data['nome'] + " - CPF: " + data['cpf'];

        selectIdsEditar.appendChild(optionEditar);
        selectIds.appendChild(optionExibir);
        selectIdsDesabilitar.appendChild(optionDesabilitar);
        selectFolhaFuncio.appendChild(optionFolha);
        funcionarioFolhaCalc.appendChild(optionFolhaCalc);
        

    })
    .catch(error => {
        console.error('Erro de requisição:', error);
        alert("Não foi possivel criar o funcionario, Revise os dados inseridos e tente novamente!");
    });
}

function encontrarFuncionario(){

    var response = document.getElementById("exibir");

    if(selectIds){
        var value = selectIds.value;
    }

    var id = value;
    var url = "http://localhost:8080/api/v1/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            console.log("Entrou");

            var htmlString = `
            <p>Nome: ${data.nome}</p>
            <p>RG: ${data.rg}</p>
            <p>CPF: ${data.cpf}</p>
            <p>Cargo: ${data.typeCargo}</p>
            <p>Função: ${data.funcao}</p>
            <p>Período: ${data.typePeriodo}</p>
            <p>Sexo: ${data.typeSexo}</p>
            <p>Data de Aniversário: ${data.dataAniversario}</p>
            <p>Endereço:</p>
            <ul>
                <li>Rua: ${data.endereco.rua}</li>
                <li>Número: ${data.endereco.numero}</li>
                <li>Bairro: ${data.endereco.bairro}</li>
                <li>Cidade: ${data.endereco.cidade}</li>
                <li>CEP: ${data.endereco.cep}</li>
            </ul>
            <p>Categoria de Segurados: ${data.typeCategoriaSegurados}</p>
            `;

            console.log("Criou a String certo");

            response.innerHTML = htmlString;

            console.log("Deu bom");
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
        });
}

function buscarFuncionario(){
    var valueSelect = selectIdsEditar.value;
    var inputs = document.getElementById("editarFuncionario");
    if(valueSelect == "none"){
        inputs.style.display = "none"
    }else{
        inputs.style.display = "block"
    }

    

    if(selectIdsEditar){
        var value = selectIdsEditar.value;
    }

    var id = value;
    var url = "http://localhost:8080/api/v1/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {

            var nome = document.getElementById("nomeEditar");
            nome.value = data.nome;

            var rg = document.getElementById("rgEditar");
            rg.value = data.rg;

            var cpf = document.getElementById("cpfFuncionarioEditar");
            cpf.value = data.cpf;

            var cargo = document.getElementById("cargoEditar");
            for (var i = 0; i < cargo.options.length; i++) {
                if (cargo.options[i].value === data.typeCargo) {
                    cargo.options[i].selected = true;
                  break;
                }
            }

            var funcao = document.getElementById("funcaoEditar");
            funcao.value = data.funcao;

            var sexoRadios = document.querySelectorAll('input[type="radio"][name="typeSexo"]');
            sexoRadios.forEach(function(input) {
                if (input.value.toUpperCase().includes(data.typeSexo)) {
                  input.checked = true; 
                } else {
                  input.checked = false; 
                }
            });

            var periodoRadios = document.querySelectorAll('input[type="radio"][name="typePeriodo"]');
            periodoRadios.forEach(function(input) {
                if (input.value.toUpperCase().includes(data.typePeriodo)) {
                  input.checked = true; 
                } else {
                  input.checked = false; 
                }
            });

            var dataN = document.getElementById("dataAniversarioFEdit");
            dataN.value = data.dataAniversario;

            var assegurado = document.getElementById("categoriaAssEditar");
            for (var i = 0; i < assegurado.options.length; i++) {
                if (assegurado.options[i].value === data.typeCategoriaSegurados) {
                    assegurado.options[i].selected = true;
                  break;
                }
            }

            var rua = document.getElementById("ruaEditar");
            rua.value = data.endereco.rua;

            var numero = document.getElementById("numeroEditar");
            numero.value = data.endereco.numero;

            var bairro = document.getElementById("bairroEditar");
            bairro.value = data.endereco.bairro;

            var cidade = document.getElementById("cidadeEditar");
            cidade.value = data.endereco.cidade;

            var cep = document.getElementById("cepEditar");
            cep.value = data.endereco.cep;
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
        });

}

function montarJsonEditar(){
    var nome = document.getElementById("nomeEditar");
    var rg = document.getElementById("rgEditar");
    var cpf = document.getElementById("cpfFuncionarioEditar");
    var cargo = document.getElementById("cargoEditar");
    var funcao = document.getElementById("funcaoEditar");
    var sexoRadios = document.querySelectorAll('input[type="radio"][name="typeSexo"]');
    for (var i = 0; i < sexoRadios.length; i++) {
        var radioButton = sexoRadios[i];
        if (radioButton.checked) {
            var selectedSexoValue = radioButton.value;
        }
    }
    var periodoRadios = document.querySelectorAll('input[type="radio"][name="typePeriodo"]');
    for (var i = 0; i < periodoRadios.length; i++) {
        var radioButton = periodoRadios[i];
        if (radioButton.checked) {
            var selectedPeriodoValue = radioButton.value;
        }
    }
    var dataN = document.getElementById("dataAniversarioFEdit");
    var assegurado = document.getElementById("categoriaAssEditar");
    var rua = document.getElementById("ruaEditar");
    var numero = document.getElementById("numeroEditar");
    var bairro = document.getElementById("bairroEditar");
    var cidade = document.getElementById("cidadeEditar");
    var cep = document.getElementById("cepEditar");


    var json = {
        "nome": nome.value,
        "rg": rg.value,
        "cpf": cpf.value,
        "typeCargo": cargo.value,
        "funcao": funcao.value,
        "typePeriodo": selectedPeriodoValue,
        "typeSexo": selectedSexoValue,
        "dataAniversario": dataN.value,
        "endereco": {
            "rua": rua.value,
            "numero": numero.value,
            "bairro": bairro.value,
            "cidade": cidade.value,
            "cep": cep.value
        },
        "typeCategoriaSegurados": assegurado.value,
    }

    return json;
}

function editarFuncionarioInfo(){
    if(selectIdsEditar){
        var value = selectIdsEditar.value;
    }

    var id = value;

    var url = "http://localhost:8080/api/v1/put/" + id;

    var json = montarJsonEditar();

    console.log(json);
    fetch(url, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(json)
        })
        .then(response => {
            if (response.status == 200) {
                console.log(response);
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            alert("Funcionário Editado com sucesso!");
            console.log(data)

            for (var i = 0; i < selectIdsEditar.options.length; i++) {
                if (cargo.options[i].value == "none") {
                    cargo.options[i].selected = true;
                    break;
                }
            }

            for (var i = 0; i < selectIds.options.length; i++) {
                if (selectIds.options[i].value == id) {
                    selectIds.options[i].textContent = "" + data["nome"] + " - CPF:" + data["cpf"];
                  break;
                }
            }

            for (var i = 0; i < selectIdsEditar.options.length; i++) {
                if (selectIdsEditar.options[i].value == id) {
                    selectIdsEditar.options[i].textContent = "" + data["nome"] + " - CPF:" + data["cpf"];
                  break;
                }
            }

            for (var i = 0; i < selectIdsDesabilitar.options.length; i++) {
                if (selectIdsDesabilitar.options[i].value == id) {
                    selectIdsDesabilitar.options[i].textContent = "" + data["nome"] + " - CPF:" + data["cpf"];
                  break;
                }
            }
            
            for (var i = 0; i < selectFolhaFuncio.options.length; i++) {
                if (selectFolhaFuncio.options[i].value == id) {
                    selectFolhaFuncio.options[i].textContent = "" + data["nome"] + " - CPF:" + data["cpf"];
                  break;
                }
            }

            for (var i = 0; i < funcionarioFolhaCalc.options.length; i++) {
                if (funcionarioFolhaCalc.options[i].value == id) {
                    funcionarioFolhaCalc.options[i].textContent = "" + data["nome"] + " - CPF:" + data["cpf"];
                  break;
                }
            }
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel criar o funcionario, Revise os dados inseridos e tente novamente!");
        });
    
}

function encontrarFuncionarioDesabilitar(){
    var response = document.getElementById("exibirDesabilitar");

    if(selectIdsDesabilitar){
        var value = selectIdsDesabilitar.value;
    }

    var id = value;
    var url = "http://localhost:8080/api/v1/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            console.log("Entrou");

            var htmlString = `
            <p>Nome: ${data.nome}</p>
            <p>RG: ${data.rg}</p>
            <p>CPF: ${data.cpf}</p>
            <p>Cargo: ${data.typeCargo}</p>
            <p>Função: ${data.funcao}</p>
            <p>Período: ${data.typePeriodo}</p>
            <p>Sexo: ${data.typeSexo}</p>
            <p>Data de Aniversário: ${data.dataAniversario}</p>
            <p>Endereço:</p>
            <ul>
                <li>Rua: ${data.endereco.rua}</li>
                <li>Número: ${data.endereco.numero}</li>
                <li>Bairro: ${data.endereco.bairro}</li>
                <li>Cidade: ${data.endereco.cidade}</li>
                <li>CEP: ${data.endereco.cep}</li>
            </ul>
            <p>Categoria de Segurados: ${data.typeCategoriaSegurados}</p>
            `;

            console.log("Criou a String certo");

            response.innerHTML = htmlString;

            var buttonDesabilitarF = document.getElementById("buttonDesabilitarF");
            buttonDesabilitarF.style.display = "block";

            console.log("Deu bom");
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
        });
}

function desabilitarFuncionario(){

    if(selectIdsDesabilitar){
        var value = selectIdsDesabilitar.value;
    }

    var id = value;
    var name = "";

    for (var i = 0; i < selectIdsDesabilitar.options.length; i++) {
        if (selectIdsDesabilitar.options[i].value == id) {
            name = selectIdsDesabilitar.options[i].textContent;
            break;
        }
    }

    var url = "http://localhost:8080/api/v1/disable/" + id;

    console.log(url);

    fetch(url, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        })
        .then(response => {
            if (response.status == 200) {
                return response.text();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            alert("Funcionario Desabilitado com sucesso!");
            console.log(data);
            
            for (var i = 0; i < selectIds.options.length; i++) {
                if (selectIds.options[i].value == id) {
                    selectIds.options[i].remove();
                  break;
                }
            }

            for (var i = 0; i < selectIdsEditar.options.length; i++) {
                if (selectIdsEditar.options[i].value == id) {
                    selectIdsEditar.options[i].remove();
                  break;
                }
            }

            for (var i = 0; i < selectIdsDesabilitar.options.length; i++) {
                if (selectIdsDesabilitar.options[i].value == id) {
                    selectIdsDesabilitar.options[i].remove();
                  break;
                }
            }

            for (var i = 0; i < selectFolhaFuncio.options.length; i++) {
                if (selectFolhaFuncio.options[i].value == id) {
                    selectFolhaFuncio.options[i].remove();
                  break;
                }
            }

            for (var i = 0; i < selectFolhaFuncioCalcular.options.length; i++) {
                if (selectFolhaFuncioCalcular.options[i].value == id) {
                    selectFolhaFuncioCalcular.options[i].remove();
                  break;
                }
            }

            var optionAtivar = document.createElement("option");
            optionAtivar.value = id;
            optionAtivar.textContent = name;

            selectIdsAtivar.appendChild(optionAtivar);

            var buttonDesabilitarF = document.getElementById("buttonDesabilitarF");
            buttonDesabilitarF.style.display = "none";

            var response = document.getElementById("exibirDesabilitar");
            response.innerHTML = "";
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
    });

}

function criarDependente(){
    var cpfResponsavel = document.getElementById("cpfResponsavel");
    var nomeDependente = document.getElementById("nomeDependente");
    var cpfDependente = document.getElementById("cpfDependente");
    var grauParentesco = document.getElementById("grauDeParentesco");
    var dataNascimento = document.getElementById("dataAniversarioD");

    var json = {
        "cpfResponsavel": cpfResponsavel.value,
        "nomeDependente": nomeDependente.value,
        "cpf": cpfDependente.value,
        "grauDeParentesco": grauParentesco.value,
        "dataNascimento": dataNascimento.value
    }

    var url = "http://localhost:8080/api/v1/dependente/created";

    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(json)
        })
        .then(response => {
            if (response.status == 201) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            limparInputs();
            alert("Dependente Criado!");
            console.log(data);

            cpfResponsavel.value = "";
            nomeDependente.value = "";
            cpfDependente.value = "";
            grauParentesco.value = "";
            dataNascimento.value = "";
    
            var optionExibirD = document.createElement("option");
            optionExibirD.value = data['id'];
            optionExibirD.textContent = '' + data['nomeDependente'] + " - CPF: " + data['cpf'];
    
            var optionEditarD = document.createElement("option");
            optionEditarD.value = data['id'];
            optionEditarD.textContent = '' + data['nomeDependente'] + " - CPF: " + data['cpf'];
    
            var optionDesabilitarD = document.createElement("option");
            optionDesabilitarD.value = data['id'];
            optionDesabilitarD.textContent = '' + data['nomeDependente'] + " - CPF: " + data['cpf'];
    
            
            selectExibirD.appendChild(optionExibirD);
            selectEditarD.appendChild(optionEditarD);
            selectDesabilitarD.appendChild(optionDesabilitarD);
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel criar o Dependente, Revise os dados inseridos e tente novamente!");
        });
}

function encontrarDependente(){
    var response = document.getElementById("exibirD");

    if(selectExibirD){
        var value = selectExibirD.value;
    }

    var id = value;
    var url = "http://localhost:8080/api/v1/dependente/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            console.log("Entrou");

            console.log(data);

            var htmlString = `
            <p>CPF Responsavel: ${data.cpfResponsavel}</p>
            <p>Nome Dependente: ${data.nomeDependente}</p>
            <p>CPF Dependente: ${data.cpf}</p>
            <p>Grau de Parentesco: ${data.grauDeParentesco}</p>
            <p>Data de Nascimento: ${data.dataNascimento}</p>
            `;

            console.log("Criou a String certo");

            response.innerHTML = htmlString;

            console.log("Deu bom");
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
        });
}

function buscarDependente(){
    var valueSelect = selectEditarD.value;
    var inputs = document.getElementById("editarDependente");
    if(valueSelect == "none"){
        inputs.style.display = "none"
    }else{
        inputs.style.display = "block"
    }

    

    if(selectEditarD){
        var value = selectEditarD.value;
    }

    var id = value;
    var url = "http://localhost:8080/api/v1/dependente/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {

            var cpfResponsavel = document.getElementById("cpfResponsavelE");
            cpfResponsavel.value = data.cpfResponsavel;

            var nomeDependente = document.getElementById("nomeDependenteE");
            nomeDependente.value = data.nomeDependente;

            var cpfDependente = document.getElementById("cpfDependenteE");
            cpfDependente.value = data.cpf;

            var grauParentesco = document.getElementById("grauDeParentescoE");
            grauParentesco.value = data.grauDeParentesco;

            var dataAniversario = document.getElementById("dataAniversarioDE");
            dataAniversario.value = data.dataNascimento;
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
        });

}

function editarDependente(){
    var cpfResponsavel = document.getElementById("cpfResponsavelE");
    var nomeDependente = document.getElementById("nomeDependenteE");
    var cpfDependente = document.getElementById("cpfDependenteE");
    var grauParentesco = document.getElementById("grauDeParentescoE");
    var dataNascimento = document.getElementById("dataAniversarioDE");

    var json = {
        "cpfResponsavel": cpfResponsavel.value,
        "nomeDependente": nomeDependente.value,
        "cpf": cpfDependente.value,
        "grauDeParentesco": grauParentesco.value,
        "dataNascimento": dataNascimento.value
    }

    if(selectEditarD){
        var value = selectEditarD.value;
    }

    var id = value;

    var url = "http://localhost:8080/api/v1/dependente/put/" + id;

    fetch(url, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(json)
        })
        .then(response => {
            if (response.status == 200) {
                console.log(response);
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            alert("Dependente Editado com sucesso!");
            console.log(data);

            for (var i = 0; i < selectEditarD.options.length; i++) {
                if (selectEditarD.options[i].value == "none") {
                    selectEditarD.options[i].selected = true;
                    break;
                }
            }

            for (var i = 0; i < selectExibirD.options.length; i++) {
                if (selectExibirD.options[i].value == id) {
                    selectExibirD.options[i].textContent = "" + data["nomeDependente"] + " - CPF:" + data["cpf"];
                    break;
                }
            }

            for (var i = 0; i < selectEditarD.options.length; i++) {
                if (selectEditarD.options[i].value == id) {
                    selectEditarD.options[i].textContent = "" + data["nomeDependente"] + " - CPF:" + data["cpf"];
                    break;
                }
            }

            var inputsDE = document.getElementById("editarDependente");
            inputsDE.style.display = "none";

            for (var i = 0; i < selectDesabilitarD.options.length; i++) {
                if (selectDesabilitarD.options[i].value == id) {
                    selectDesabilitarD.options[i].textContent = "" + data["nomeDependente"] + " - CPF:" + data["cpf"];
                    break;
                }
            }
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel criar o funcionario, Revise os dados inseridos e tente novamente!");
        });
}

function encontrarDependenteDesabilitar(){
    
    if(selectDesabilitarD){
        var value = selectDesabilitarD.value;
    }

    var id = value;
    var url = "http://localhost:8080/api/v1/dependente/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            var response = document.getElementById("exibirDesabilitarD");

            var htmlString = `
            <p>CPF Responsavel: ${data.cpfResponsavel}</p>
            <p>Nome Dependente: ${data.nomeDependente}</p>
            <p>CPF Dependente: ${data.cpf}</p>
            <p>Grau de Parentesco: ${data.grauDeParentesco}</p>
            <p>Data de Nascimento: ${data.dataNascimento}</p>
            `;

            response.innerHTML = htmlString;

            var buttonDesabilitarF = document.getElementById("buttonDesabilitarD");
            buttonDesabilitarF.style.display = "block";
            
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o Dependente, tente novamente!");
        });
}

function desabilitarDependente(){

    if(selectDesabilitarD){
        var value = selectDesabilitarD.value;
    }

    var id = value;
    var name = "";

    for (var i = 0; i < selectDesabilitarD.options.length; i++) {
        if (selectDesabilitarD.options[i].value == id) {
            name = selectDesabilitarD.options[i].textContent;
            break;
        }
    }

    var url = "http://localhost:8080/api/v1/dependente/disable/" + id;

    fetch(url, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        })
        .then(response => {
            if (response.status == 200) {
                return response.text();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            alert("Funcionario Desabilitado com sucesso!");
            
            for (var i = 0; i < selectExibirD.options.length; i++) {
                if (selectExibirD.options[i].value == id) {
                    selectExibirD.options[i].remove();
                  break;
                }
            }

            for (var i = 0; i < selectEditarD.options.length; i++) {
                if (selectEditarD.options[i].value == id) {
                    selectEditarD.options[i].remove();
                  break;
                }
            }

            for (var i = 0; i < selectDesabilitarD.options.length; i++) {
                if (selectDesabilitarD.options[i].value == id) {
                    selectDesabilitarD.options[i].remove();
                  break;
                }
            }

            var optionAtivarD = document.createElement("option");
            optionAtivarD.value = id;
            optionAtivarD.textContent = name;
    
            selectAtivarD.appendChild(optionAtivarD);

            var buttonDesabilitarF = document.getElementById("buttonDesabilitarD");
            buttonDesabilitarF.style.display = "none";

            var response = document.getElementById("exibirDesabilitarD");
            response.innerHTML = "";
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
    });
}

function encontrarFuncionarioAtivar(){
    var response = document.getElementById("exibirAtivar");

    if(selectIdsAtivar){
        var value = selectIdsAtivar.value;
    }

    var id = value;
    var url = "http://localhost:8080/api/v1/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            console.log("Entrou");

            var htmlString = `
            <p>Nome: ${data.nome}</p>
            <p>RG: ${data.rg}</p>
            <p>CPF: ${data.cpf}</p>
            <p>Cargo: ${data.typeCargo}</p>
            <p>Função: ${data.funcao}</p>
            <p>Período: ${data.typePeriodo}</p>
            <p>Sexo: ${data.typeSexo}</p>
            <p>Data de Aniversário: ${data.dataAniversario}</p>
            <p>Endereço:</p>
            <ul>
                <li>Rua: ${data.endereco.rua}</li>
                <li>Número: ${data.endereco.numero}</li>
                <li>Bairro: ${data.endereco.bairro}</li>
                <li>Cidade: ${data.endereco.cidade}</li>
                <li>CEP: ${data.endereco.cep}</li>
            </ul>
            <p>Categoria de Segurados: ${data.typeCategoriaSegurados}</p>
            `;

            console.log("Criou a String certo");

            response.innerHTML = htmlString;

            var buttonDesabilitarF = document.getElementById("buttonAtivarF");
            buttonDesabilitarF.style.display = "block";

            console.log("Deu bom");
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
        });
}

function ativarFuncionario(){

    if(selectIdsAtivar){
        var value = selectIdsAtivar.value;
    }

    var id = value;
    var name = "";

    for (var i = 0; i < selectIdsAtivar.options.length; i++) {
        if (selectIdsAtivar.options[i].value == id) {
            name = selectIdsAtivar.options[i].textContent;
            break;
        }
    }

    var url = "http://localhost:8080/api/v1/active/" + id;

    console.log(url);

    fetch(url, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        })
        .then(response => {
            if (response.status == 200) {
                return response.text();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            alert("Funcionario Ativado com sucesso!");

            var optionExibir = document.createElement("option");
            optionExibir.value = id;
            optionExibir.textContent = name;

            var optionEditar = document.createElement("option");
            optionEditar.value = id;
            optionEditar.textContent = name;

            var optionDesabilitar = document.createElement("option");
            optionDesabilitar.value = id;
            optionDesabilitar.textContent = name;

            var optionFolha = document.createElement("option");
            optionFolha.value = id;
            optionFolha.textContent = name;

            var optionFolhaCalc = document.createElement("option");
            optionFolhaCalc.value = id;
            optionFolhaCalc.textContent = name;

            selectIdsEditar.appendChild(optionEditar);
            selectIds.appendChild(optionExibir);
            selectIdsDesabilitar.appendChild(optionDesabilitar);
            selectFolhaFuncio.appendChild(optionFolha);
            selectFolhaFuncioCalcular.appendChild(optionFolhaCalc);

            for (var i = 0; i < selectIdsAtivar.options.length; i++) {
                if (selectIdsAtivar.options[i].value == id) {
                    selectIdsAtivar.options[i].remove();
                  break;
                }
            }
            
            var buttonDesabilitarF = document.getElementById("buttonAtivarF");
            buttonDesabilitarF.style.display = "none";

            var response = document.getElementById("exibirAtivar");
            response.innerHTML = "";
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
    });
}

function encontrarDependenteAtivar(){
    var response = document.getElementById("exibirAtivarD");

    if(selectAtivarD){
        var value = selectAtivarD.value;
    }

    var id = value;
    var url = "http://localhost:8080/api/v1/dependente/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            console.log("Entrou");

            var htmlString = `
            <p>CPF Responsavel: ${data.cpfResponsavel}</p>
            <p>Nome Dependente: ${data.nomeDependente}</p>
            <p>CPF Dependente: ${data.cpf}</p>
            <p>Grau de Parentesco: ${data.grauDeParentesco}</p>
            <p>Data de Nascimento: ${data.dataNascimento}</p>
            `;

            console.log("Criou a String certo");

            response.innerHTML = htmlString;

            var buttonDesabilitarF = document.getElementById("buttonAtivarD");
            buttonDesabilitarF.style.display = "block";

            console.log("Deu bom");
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
        });
}

function ativarDependente(){
    if(selectAtivarD){
        var value = selectAtivarD.value;
    }

    var id = value;
    var name = "";

    for (var i = 0; i < selectAtivarD.options.length; i++) {
        if (selectAtivarD.options[i].value == id) {
            name = selectAtivarD.options[i].textContent;
            break;
        }
    }

    var url = "http://localhost:8080/api/v1/dependente/active/" + id;

    console.log(url);

    fetch(url, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        })
        .then(response => {
            if (response.status == 200) {
                return response.text();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            alert("Dependente Ativado com sucesso!");

            var optionExibirD = document.createElement("option");
            optionExibirD.value = id;
            optionExibirD.textContent = name;
    
            var optionEditarD = document.createElement("option");
            optionEditarD.value = id;
            optionEditarD.textContent = name;
    
            var optionDesabilitarD = document.createElement("option");
            optionDesabilitarD.value = id;
            optionDesabilitarD.textContent = name;
    
            
            selectExibirD.appendChild(optionExibirD);
            selectEditarD.appendChild(optionEditarD);
            selectDesabilitarD.appendChild(optionDesabilitarD);

            for (var i = 0; i < selectAtivarD.options.length; i++) {
                if (selectAtivarD.options[i].value == id) {
                    selectAtivarD.options[i].remove();
                  break;
                }
            }
            
            var buttonDesabilitarF = document.getElementById("buttonAtivarD");
            buttonDesabilitarF.style.display = "none";

            var response = document.getElementById("exibirAtivarD");
            response.innerHTML = "";
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
    });
}

function addInfoFuncionario(){
    var salarioBruto = document.getElementById("salarioBrutoId");
    var horasExtras = document.getElementById("horasExtrasId");
    var adicionalNoturno = document.getElementById("adicionalNoturnoId");
    var faltasAtrasos = document.getElementById("faltasAtrasosId");
    var adiantamento = document.getElementById("adiantamentoId");
    var sindical = document.querySelectorAll('input[type="radio"][name="sindical"]');
    
    for (var i = 0; i < sindical.length; i++) {
        if (sindical[i].checked) {
            var selectedSindicalValue = sindical[i].value;
            console.log(selectedSindicalValue);
        }
    }

    var viagem = document.querySelectorAll('input[type="radio"][name="viagem"]');
    
    for (var i = 0; i < viagem.length; i++) {
        if (viagem[i].checked) {
            var selectedViagemValue = viagem[i].value;
            console.log(selectedViagemValue);
        }
    }

    var grauInsalubridade = document.getElementById("selectInsalubridade");

    var periculosidade = document.querySelectorAll('input[type="radio"][name="periculosidade"]');
    
    for (var i = 0; i < periculosidade.length; i++) {
        if (periculosidade[i].checked) {
            var selectedPericulosidadeValue = periculosidade[i].value;
            console.log(selectedPericulosidadeValue)
        }
    }


    var json = {
        "salarioBruto": salarioBruto.value,
        "horasEtras": horasExtras.value,
        "adicionalNoturno": adicionalNoturno.value,
        "faltasAtrasos": faltasAtrasos.value,
        "adiantamento": adiantamento.value,
        "sindical": selectedSindicalValue,
        "viagem": selectedViagemValue,
        "grauInsalubridade": grauInsalubridade.value,
        "periculosidade": selectedPericulosidadeValue
    }

    if(selectFolhaFuncio){
        var value = selectFolhaFuncio.value;
    }

    var id = value;

    var url = "http://localhost:8080/api/v1/info/" + id;

    fetch(url, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(json)
        })
        .then(response => {
            if (response.status == 200) {
                console.log(response);
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {
            console.log(data);
    
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel criar o funcionario, Revise os dados inseridos e tente novamente!");
        });
}

function calcularFolhaPagamento(){
    var folha = document.getElementById("folha");

    if(selectFolhaFuncio){
        var value = selectFolhaFuncio.value;
    }

    var id = value;

    var url = "http://localhost:8080/api/v1/folha/" + id;

    fetch(url)
        .then(response => {
            if (response.status == 200) {
                return response.json();
            }else{
                throw new Error('Erro ao acessar a API: ' + response.status);
            }
        })
        .then(data => {

            var htmlString = "<p>Nome do Empregador: " + data["nomeEmpregador"] + "</p>" +
                    "<p>CNPJ do Empregador: " + data["cnpjEmpregador"] + "</p>" +
                    "<p>Endereço do Empregador: " + data["enderecoEmpregador"] + "</p>" +
                    "<p>Nome Fantasia da Empresa: " + data["nomeFantasiaEmpresa"] + "</p>" +
                    "<p>Setor da Empresa: " + data["setorEmpresa"] + "</p>" +
                    "<p>ID do Funcionário: " + data["idFuncionario"] + "</p>" +
                    "<p>Função do Funcionário: " + data["funcaoFuncionario"] + "</p>" +
                    "<p>Cargo do Funcionário: " + data["cargoFuncionario"] + "</p>" +
                    "<p>Categoria do Funcionário: " + data["categoriaFuncionario"] + "</p>" +
                    "<p>INSS: " + data["inss"] + "</p>" +
                    "<p>FGTS: " + data["fgts"] + "</p>" +
                    "<p>IRRF: " + data["irrf"] + "</p>" +
                    "<p>Sindical: " + data["sindical"] + "</p>" +
                    "<p>Vale Alimentação: " + data["valeAlimentacao"] + "</p>" +
                    "<p>Vale Transporte: " + data["valeTransport"] + "</p>" +
                    "<p>Hora Extra: " + data["horaExtra"] + "</p>" +
                    "<p>DSR: " + data["dsr"] + "</p>" +
                    "<p>Noturno: " + data["noturno"] + "</p>" +
                    "<p>Insalubridade: " + data["insalubridade"] + "</p>" +
                    "<p>Periculosidade: " + data["periculosidade"] + "</p>" +
                    "<p>Salário Família: " + data["salarioFamilia"] + "</p>" +
                    "<p>Diárias de Viagens: " + data["diariasViagens"] + "</p>" +
                    "<p>Adicional: " + data["adicional"] + "</p>" +
                    "<p>Auxílio Creche: " + data["auxilioCreche"] + "</p>" +
                    "<h3>Salário Bruto: " + data["salarioBruto"] + "</h3>" +
                    "<h3>Salário Líquido: " + data["salarioLiquido"] + "</h3>";
            
                folha.innerHTML = htmlString;
        })
        .catch(error => {
            console.error('Erro de requisição:', error);
            alert("Não foi possivel exibir o funcionario, tente novamente!");
        });

}


function blockPericulosidade(){

    var select = document.getElementById("selectInsalubridade");
    var radio1 = document.getElementById("periculosidadeSim");
    var radio2 = document.getElementById("periculosidadeNao");

    var opcaoSelecionada = select.value;

    if (opcaoSelecionada != "GRAU0") {
        radio1.checked = false;
        radio2.checked = true;

        radio1.disabled = true;
    }else{
        radio1.disabled = false;
    }
}

function exibirTodosFuncionarioTest(){
    var url = "http://localhost:8080/api/v1";

    var html = document.getElementById("exibirTodos");
    html.innerHTML = "";

    fetch(url)
    .then(response => {
        if (response.status == 200) {
            return response.json();
        }else{
            throw new Error('Erro ao acessar a API: ' + response.status);
        } 
    })
    .then(data => {

        for (var i = 0; i < data.length; i++) {
            var objeto = data[i];
            var htmlString = `
            <br>
            <br>
            <p>Nome: ${objeto.nome}</p>
            <p>RG: ${objeto.rg}</p>
            <p>CPF: ${objeto.cpf}</p>
            <p>Cargo: ${objeto.typeCargo}</p>
            <p>Função: ${objeto.funcao}</p>
            <p>Período: ${objeto.typePeriodo}</p>
            <p>Sexo: ${objeto.typeSexo}</p>
            <p>Data de Aniversário: ${objeto.dataAniversario}</p>
            <p>Endereço:</p>
            <ul>
                <li>Rua: ${objeto.endereco.rua}</li>
                <li>Número: ${objeto.endereco.numero}</li>
                <li>Bairro: ${objeto.endereco.bairro}</li>
                <li>Cidade: ${objeto.endereco.cidade}</li>
                <li>CEP: ${objeto.endereco.cep}</li>
            </ul>
            <p>Categoria de Segurados: ${objeto.typeCategoriaSegurados}</p>
            <br>
            <br>
            `;

            html.innerHTML += htmlString
        }

        

        


    })
    .catch()
}