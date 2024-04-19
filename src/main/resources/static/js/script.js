var createFuncio = document.getElementById("criarFuncionarioId");
var exibirFuncio = document.getElementById("exibirFuncionarioId");
var editarFuncio = document.getElementById("editarFuncionarioId");
var desabilitarFuncio = document.getElementById("desabilitarFuncionarioId");

var createDepend = document.getElementById("criarDependenteId");
var exibirDepend = document.getElementById("exibirDependenteId");
var editarDepend = document.getElementById("editarDependenteId");

var selectIds = document.getElementById("iExibirFuncionario");
var selectIdsEditar = document.getElementById("iEditarFuncionarioId");
var selectIdsDesabilitar = document.getElementById("iDesabilitarFuncionarioId");

var selectExibirD = document.getElementById("iExibirDependente");
var selectEditarD = document.getElementById("iEditarDependenteId");
var selectDesabilitarD = document.getElementById("");


function createF(){
    createFuncio.style.display = "block";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
}

function exibirF(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "block";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
}

function editarF(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "block";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
}

function desativarF(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "block";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
}

function createD(){
    createFuncio.style.display = "none";
    createDepend.style.display = "block";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "none";
}

function exibirD(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "block";
    editarDepend.style.display = "none";
}

function editarD(){
    createFuncio.style.display = "none";
    createDepend.style.display = "none";
    exibirFuncio.style.display = "none";
    editarFuncio.style.display = "none";
    desabilitarFuncio.style.display = "none";
    exibirDepend.style.display = "none";
    editarDepend.style.display = "block";
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

        selectIdsEditar.appendChild(optionEditar);
        selectIds.appendChild(optionExibir);
        selectIdsDesabilitar.appendChild(optionDesabilitar);
        

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
                if (selectDesabilitarD.options[i].value == "none") {
                    selectDesabilitarD.options[i].selected = true;
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