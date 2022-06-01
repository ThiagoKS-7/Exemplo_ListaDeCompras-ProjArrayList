package app;

public class Produto {
	/* ATRIBUTOS DA CLASSE */
	private String nome;
	private int quantidade;
	private double precoUnitario;
	// ===========================================

	/* GETTERS E SETTERS */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	// ===========================================

	/* METODOS DA CLASSE */
	public double calcularTotal() {
		return this.quantidade * this.precoUnitario;
	}
	// ===========================================

	/* TO STRING */
	@Override
	public String toString() {
		return "Nome = " + nome + ", Preço Unitário = R$ " + precoUnitario + ", Quantidade = " + quantidade;
	}

}
