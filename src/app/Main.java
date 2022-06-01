package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/* INSTANCIA DA LISTA DE COMPRA */
		ListaDeCompra lc = new ListaDeCompra();

		/* PARTE DO MENU */
		int op;
		do {
			System.out.println("MENU ");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Visualizar produto");
			System.out.println("3 - Ver quantidade na lista");
			System.out.println("4 - Apagar todos os produtos");
			System.out.println("5 - Ver total de compras ");
			System.out.println("0 - Sair");
			System.out.print("Dgite a opção: ");
			op = sc.nextInt();
			switch (op) {

			case 1:
				Produto p1 = new Produto();
				System.out.print("Digite o nome do produto: ");
				p1.setNome(sc.next());

				/* VALIDAÇÃO DA QUANTIDADE */
				do {
					System.out.print("Digite a quantidade: ");
					p1.setQuantidade(sc.nextInt());
					if (p1.getQuantidade() <= 0) {
						System.out.println("Opção inválida");
					}
				} while (p1.getQuantidade() <= 0);
				// =========================

				/* VALIDAÇÃO DO PREÇO UNITÁRIO */
				do {
					System.out.print("Digite o preço: ");
					p1.setPrecoUnitario(sc.nextDouble());
					if (p1.getPrecoUnitario() <= 0) {
						System.out.println("Opção inválida");
					}
				} while (p1.getPrecoUnitario() <= 0);
				// =========================

				lc.adicionarProduto(p1);
				System.out.println("Cadastro realizado com sucesso!");
				break;
			case 2:
				/* PRINTA PRODUTOS DA LISTA SE ELA NÃO ESTIVER VAZIA */
				if (lc.getLista().isEmpty()) {
					System.out.println("Não há produtos cadastrados");
				} else {
					System.out.println(lc);
				}
				break;
			case 3:
				System.out.println("Total cadastrado: " + lc.obterQuantidadeDeProdutos());
				break;
			case 4: 
				/* VALIDAÇÃO DO REMOVER*/
				if (lc.getLista().isEmpty()) {
					System.out.println("Erro! Não há produtos para excluir");
				} else {
					/* VALIDAÇÃO DE CONFIRMAÇÃO */
					int confirma;
					System.out.println("Tem certeza que deseja EXCLUIR TUDO DA LISTA???\n1-Sim || 2-Não");
					confirma = sc.nextInt();
					if (confirma == 1) {
						lc.apagarTudo();						
						System.out.println("Lista apagada com sucesso!");
					} else {
						System.out.println("Opção cancelada!");
					}
				}
				break;
			case 5:
				System.out.println("Soma total da lista: R$ " + lc.calcularTotalDaLista());
				break;
			case 0:
				System.out.println("Fim do programa");
				break;
			default: 
				System.out.println("Opção inválida!");
				break;

			}
		} while (op != 0);
	}
}
