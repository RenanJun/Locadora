#language: pt
Funcionalidade: Compras 
  
  COMO um analista de qualidade
  EU devo comprar produtos na loja
  PARA validar as funcionalidades

  ############################################################################################################
  #### @author Renan Jun  			##################################################################################
  #### @ PBI: 12345					 	###############################################
  ############################################################################################################
  # CT01 - Pesquisa Diretores
  ############################################################################################################
  Esquema do Cenario: [PBI 456789] "<Cenario>"-"<DescricaoDoCenario>"
    Dado que esteje no site de pesquisa "<Site>"
    E clique em SigIn
    E preencha os campos "<Login>" e "<Senha>"
    E Clica em SubmitSigIn
    E Pesquisa o produto "<Produto>"
    E Seleciona produto "<Link>"
    E Add to cart
    E Proceed to checkout
    E Proceed to checkout1
    E Proceed to checkout1
    E Concorde com os termos
    E Proceed to checkout2
    E PaybyBankWire
    Quando Confirmar meu pedido
    Entao Confirma pedido

    @CT01 
    Exemplos: 
      | Cenario | DescricaoDoCenario    | Site					|Login					|Senha |Produto			|Link																										 |
      | CT01.1  | Compras 			    | automationprice		|lctbressan@gmail.com	|123456|Printed Dress	|http://automationpractice.com/index.php?id_product=7&controller=product&search_query=Printed+Dress&results=5|
     