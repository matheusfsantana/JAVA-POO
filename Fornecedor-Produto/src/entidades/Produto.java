package entidades;

public class Produto {
	
	private int codigo;
	private String nome;
	private float valor;
	private Fornecedor fornecedor;
	
	//Constructs
	public Produto() {
		
	}

	public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}

	
	//Gets e Setters;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	public String toString() {
		return "Produto: " + nome + " | valor: " + valor + " | " + fornecedor;
	}
	
	//Methods
	
	public void atualizarPreco(float valorPorcentual)
	{
		valor += valor*valorPorcentual/100;
	}

	
	
	
	
	

}
