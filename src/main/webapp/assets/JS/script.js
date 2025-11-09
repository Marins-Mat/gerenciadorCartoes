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

/*
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
		}
		
		}
	*/