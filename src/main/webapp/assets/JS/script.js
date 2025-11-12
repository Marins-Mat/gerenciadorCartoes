
function logar() {
	let login = document.getElementById("login");
	let senha = document.getElementById("senha");
	let msg = document.getElementById("mensagemErro")

	fetch("http://localhost:8080/gerenciadorCartoes/login", {
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
			} else {
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



	fetch("http://localhost:8080/gerenciadorCartoes/buscaClienteServlet", {
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
				window.location.href = "cartoesCliente.html";
			}

		})
		.catch(err => {
			console.error("Erro na requisição: ", err);
		})
	cpf.value = '';
}



function exibirContas() {



	let novaConta = document.createElement("div");
	novaConta.classList.add("conta");

	let nomeEst = document.createElement("h2");
	nomeEst.textContent = `Estabelecimento: `;

	let nomeTitular = document.createElement("p");
	nomeTitular.textContent = `Nome do titular: `;

	let status = document.createElement("p");
	status.textContent = `Status da conta: `;

	novaConta.appendChild(nomeEst);
	novaConta.appendChild(nomeTitular);
	novaConta.appendChild(status);


	document.getElementById("contas").appendChild(novaConta);
}