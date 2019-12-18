#language: pt
Funcionalidade: Pesquisa no Google 
  
  COMO um analista de qualidade
  EU devo pesquisar os diretores e filmes no site do google
  PARA fornecer os resultados encontrados

  ############################################################################################################
  #### @author Renan Jun  			##################################################################################
  #### @ PBI: 12345					 	###############################################
  ############################################################################################################
  # CT01 - Pesquisa Diretores
  ############################################################################################################
  Esquema do Cenario: [PBI 12345] "<Cenario>"-"<DescricaoDoCenario>"
    Dado que esteje no site de pesquisa "<Site>"
    E informe no campo pesquisa o nome de um diretor "<Nome>" e o fime "<Filme>"
    Quando clicar em Pesquisar
    Entao devo apresentar a quantidade de filmes "<Filme>" deste diretor

    @CT01 
    Exemplos: 
      | Cenario | DescricaoDoCenario    | Site	|Nome	            |Filme| DataNasc  |
      | CT01.1  | Pesquisa Google	    | Google|Steven Spielberg	|E.T. | 01/01/1960|
     