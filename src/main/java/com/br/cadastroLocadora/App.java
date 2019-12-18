package com.br.cadastroLocadora;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import br.com.DTO.FilmesDiretor;
import br.com.DTO.diretores;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println(" CADASTRO DE DIRETORES & FILMES ************************************************");
		dadosDiretores();
	}
	public static void dadosDiretores(){
	    Scanner sc = new Scanner(System.in);
	    //Pessoa pessoa;
	    diretores Diretores;
	    FilmesDiretor filmesdiretor;
	    //List<diretores> listaDiretores = new ArrayList<diretores>();
	    List<FilmesDiretor> listaFilmeDiretores = new ArrayList<FilmesDiretor>();
	    //ArrayList<diretores> ListaDiretores = new ArrayList();
	    int opcao = 0;
	     
	    do {
	      System.out.println("## Escolha uma das opções abaixo ##");
	      System.out.println("Opção 1 - Cadastra Diretores e Filmes");
	          System.out.println("Opção 2 - Imprime Diretores e Filmes cadastrados");
	          System.out.println("Opção 0 - Sair do programa");
	          System.out.println("_______________________");
	           
	          System.out.print("Digite aqui sua opção: ");
	          opcao = Integer.parseInt(sc.nextLine());
	           
	          if(opcao == 1){
        	  //Cria um novo objeto 
        	  //Diretores = new diretores();
        	  filmesdiretor = new FilmesDiretor();
	           
	          System.out.print("Digite o Nome do Diretor: ");
	          filmesdiretor.setNome(sc.nextLine());
	           
	          System.out.print("Digite a Data de Nascimento: ");
	          filmesdiretor.setNascimento(sc.nextLine());
	          
	          System.out.print("Digite nome do Filme : ");
	          filmesdiretor.setNomeFilme(sc.nextLine());
	          
	          
	          System.out.print("Digite o ano de lançamentodo Filme : ");
	          filmesdiretor.setAno(sc.nextLine());
	          
	          System.out.println();
	           
	      //Guarda o objeto pessoa em uma lista.
          //listaDiretores.add(Diretores);
	          
          listaFilmeDiretores.add(filmesdiretor);
          
	          }else if(opcao == 2){
	            
	        	  if(listaFilmeDiretores.isEmpty()){
	              System.out.println("Não existem diretores cadastrados, pressione uma tecla para continuar!");
	              sc.nextLine();
	        	  }else{
	              
	        		  System.out.println(listaFilmeDiretores.toString());
	               
	        		  System.out.println("Pressione um tecla para continuar.");
	              
	        		  sc.nextLine();
	            }         }
	    } while (opcao != 0);
	     
	    sc.close();
	  }
}
	