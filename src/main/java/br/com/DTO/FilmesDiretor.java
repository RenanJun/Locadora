package br.com.DTO;

public class FilmesDiretor {
     
	String nome;
	String nascimento;
	String nomeFilme;
	String ano;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
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
	            "\n"+ "Nascimento: "+nascimento+"" +
	    		"\n"+ "NomeFilme: "+nomeFilme+"" +
	    		"\n"+ "Ano: "+ano+"\n";
	  }
	
	
	
}
