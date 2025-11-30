document.addEventListener("DOMContentLoaded", () => {
	if (window.location.pathname.includes("cartoesCliente.html")) {
		let contas = JSON.parse(localStorage.getItem("contas"));
		listarContas(contas);

	}
	if (window.location.pathname.includes("contaCliente.html")) {
		let id = JSON.parse(localStorage.getItem("idConta"));
		exibirConta(id);
	}
})


function logar() {
	let login = document.getElementById("login");
	let senha = document.getElementById("senha");
	let msg = document.getElementById("mensagemErro")


	fetch("http://localhost:8080/gerenciadorDeCartoes/login", {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
		body: JSON.stringify({
			login: login.value,
			senha: senha.value
		})
	}).then(res => res.json())
		.then(data => {

			if (data.sucesso) {
				msg.style.visibility = "hidden";
				window.location.href = "templates/buscaCliente.html";
			}
			else {
				msg.style.visibility = "visible";
			}
		})
		.catch(err => {
			console.error("Erro na requisição: ", err);
			msg.style.visibility = "visible";
		})




	login.value = "";
	senha.value = "";

}


function buscarCliente() {
	let cpf = document.getElementById("cpf");



	fetch("http://localhost:8080/gerenciadorDeCartoes/buscaCliente", {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
		body: JSON.stringify({
			cpf: cpf.value
		})


	}).then(res => res.json())
		.then(data => {
			let msg = document.getElementById("naoEncontrado");
			if (data.length == 0) {
				msg.style.visibility = "visible";
			} else {
				msg.style.visibility = "hidden";
				localStorage.setItem("contas", JSON.stringify(data));
				window.location.href = "cartoesCliente.html";

			}

		})
		.catch(err => {
			console.error("Erro na requisição: ", err);
		})
	cpf.value = '';
}

function capitalize(str) {
	return str.charAt(0).toUpperCase() + str.slice(1);
}

function listarContas(contas) {

	let i = 0;
	for (let conta of contas) {


		conta.status = capitalize(conta.status);
		conta.nome_estabelecimento = capitalize(conta.nome_estabelecimento);
		conta.nome_cliente = capitalize(conta.nome_cliente);

		let novaConta = document.createElement("div");
		novaConta.classList.add("conta");
		novaConta.id = "conta-" + i;
		novaConta.addEventListener("dblclick", () => {
			
			console.log("TESTANDO");
			
		})


		let nomeEst = document.createElement("h2");
		nomeEst.textContent = `Estabelecimento: ${conta.nome_estabelecimento}`;

		let nomeTitular = document.createElement("p");
		nomeTitular.textContent = `Nome do titular: ${conta.nome_cliente}`;

		let status = document.createElement("p");
		status.textContent = `Status da conta: ${conta.status}`;

		novaConta.appendChild(nomeEst);
		novaConta.appendChild(nomeTitular);
		novaConta.appendChild(status);


		document.getElementById("contas").appendChild(novaConta);

		i++;
	}
}


function abrirConta(id) {
	console.log("DATA");
	localStorage.setItem("idConta", id);
	window.location.href = "contaCliente.html";
}

function exibirConta(id) {
	console.log("data");

	fetch("http://localhost:8080/gerenciadorDeCartoes/ExibeConta", {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
		body: JSON.stringify({
			cod_cliente: contas[id].cod_cliente,
			cod_estabelecimento: contas[id].cod_estabelecimento,
		})
	}).then(res => res.json())
		.then(data => {
			console.log("data");
			localStorage.setItem("dadosConta", JSON.stringify(data));
		}).catch(err => {
			console.error("Erro na requisição: ", err);
		});


}

function consol () {
	
	Console.log("Teste");
}
