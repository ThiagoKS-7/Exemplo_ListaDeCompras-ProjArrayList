package app;

import java.util.ArrayList;

public class ListaDeCompra {
	/*
	 * ESTRUTURA ESTÁTICA JUNTO COM INTERFACE JAVA (LIST) LISTA DE PRODUTOS -
	 * DEPENDÊNCIA ASSOCIATIVA
	 */
	private ArrayList<Produto> lista;
	/* VANTAGEM: É DINÂMICO, NÃO TEM LIMITE */
	// ===================================

	/* CONSTRUTOR - INICIALIZANDO ATRIBUTO */
	public ListaDeCompra() {
		this.lista = new ArrayList<Produto>();
	}
	// ===================================

	/* GETTERS E SETTERS */
	public ArrayList<Produto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Produto> lista) {
		this.lista = lista;
	}
	// ===================================

	/* METODOS DA CLASSE */
	public void adicionarProduto(Produto produto) {
		this.lista.add(produto);
	}
	public void apagarTudo() {
		this.lista.clear();
	}
	public int obterQuantidadeDeProdutos() {
		return this.lista.size();
	}
	
	public double calcularTotalDaLista() {
		double soma = 0;
		/* CALCULA  O TOTAL DE CADA ITEM DA LISTA */
		for (int i = 0; i < this.lista.size(); i ++) {
			soma += lista.get(i).calcularTotal();
		}	
		return soma;
	}	
	// ===================================

	/* TO STRING */
	@Override
	public String toString() {
		return "ListaDeCompras{ " + "lista=" + this.lista + "}";
	}

}
