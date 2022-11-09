package entidades;

public class Fornecedor {
	
	private String cnpj;
	private String telefone;
	private String nome;
	
	//Constructors
	public Fornecedor(){
		
	}
	
	public Fornecedor(String cnpj, String telefone, String nome) {
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.nome = nome;
	}
	
	//Gets e Setters
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Fornecedor: " + nome + " | CNPJ: " + cnpj;
	}
	
	
	
	
	
	
}
