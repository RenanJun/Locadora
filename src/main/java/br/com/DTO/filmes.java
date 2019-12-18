package br.com.DTO;

public class filmes {
     
	String nome;
	String ano;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}


	@Override
	  public String toString() {
	    return "Nome: "+ nome + "" +
	            "\n"+ "Ano: "+ano+"\n";
	  }
}
