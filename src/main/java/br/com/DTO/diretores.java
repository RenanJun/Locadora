package br.com.DTO;

public class diretores {

	String nome;
	String nascimento;
	
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
	
	
	@Override
	  public String toString() {
	    return "Nome: "+ nome + "" +
	            "\n"+ "Nascimento: "+nascimento+"\n";
	  }
}
