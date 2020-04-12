# AppVeterinariaRest
Projeto Spring Boot Restfull Hibernate

################
#   Endpoints  #
################

#### Veterinaria ####


incluir: POST http://localhost:8080/api/veterinaria

{
	"nome": "PetParaiso"
}

obterLista: GET http://localhost:8080/api/veterinaria
excluir: DELETE http://localhost:8080/api/veterinaria/1

=======================================================================================

#### Localidade ####

incluir: POST http://localhost:8080/api/localidade

{
	"bairro" : "bangu"
}

obterLista: GET http://localhost:8080/api/localidade
excluir: DELETE http://localhost:8080/api/localidade/1

=======================================================================================

#### Higiene ####

incluir: POST http://localhost:8080/api/higiene

{
	"tipoProduto" : "Higiene",
	"item": "Perfume",
	"descricao" : "o melhor perfume"
}

obterLista: GET http://localhost:8080/api/higiene
excluir: DELETE http://localhost:8080/api/higiene/1

=======================================================================================

#### Racao ####

incluir: POST http://localhost:8080/api/racao

{
	"tipoProduto" : "Racao",
	"fabricante": "Premier",
	"raca": "Golden Retriever",
	"descricao" : "Racao super premium"
}

obterLista: GET http://localhost:8080/api/racao
excluir: DELETE http://localhost:8080/api/racao/1


=======================================================================================

#### Medicina ####

incluir: POST http://localhost:8080/api/medicina

{
	"tipoProduto" : "Medicina", 
	"tipoServico": "Vacina",
	"descricao" : "Vacinas importadas"
}

obterLista: GET http://localhost:8080/api/medicina
excluir: DELETE http://localhost:8080/api/medicina/1


=======================================================================================

#### Produto ####


incluir: POST http://localhost:8080/api/produto

{
	"tipoProduto": "Medicina",
	"descricao": "Vacina contra 10 tipos de doencas",
	"tipo": "Vacina V10"
}

obterLista: GET http://localhost:8080/api/produto
excluir: DELETE http://localhost:8080/api/produto/1


=======================================================================================

#### Veterinaria com localidade ####


incluir: POST http://localhost:8080/api/veterinaria

{
	"nome": "PetParaiso com localidade 1",
	"localidade": {"bairro" : "Santa Cruz"}
}

obterLista: GET http://localhost:8080/api/veterinaria
excluir: DELETE http://localhost:8080/api/veterinaria/1


=======================================================================================

#### Veterinaria com localidade e produtos ####


incluir: POST http://localhost:8080/api/veterinaria

{
	"nome":"PetParaiso",
	"localidade":{
		"bairro" : "Bangu"
	},
	"produtos":[
		{
			"tipoProduto": "Higiene",
			"item":"perfume",
			"descricao":"higiene basica"
		},
		{
			"tipoProduto": "Medicina",
			"tipoServico":"consulta veterinaria",
			"descricao":"Tudo pelo seu pet"
		},
		{
			"tipoProduto": "Racao",
			"raca":"golden retriever",
			"fabricante":"premier formula",
			"descricao":"racao super premium"
		}
	]
}

obterLista: GET http://localhost:8080/api/veterinaria
excluir: DELETE http://localhost:8080/api/veterinaria/1
