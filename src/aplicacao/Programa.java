package aplicacao;

import java.util.Scanner;

import entidades.ContaUsuario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu ID: ");
		int idUsuario = sc.nextInt();
		System.out.println("Digite seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Digite a quantidade de livros que voce pegou da biblioteca: ");
		int numeroLivrosEmprestados = sc.nextInt();
		ContaUsuario conta = new ContaUsuario(idUsuario, nome, numeroLivrosEmprestados);
		System.out.println("Quantos livros voce vai alugar: ");
		int quantidadeLivros = sc.nextInt();
		conta.emprestarLivro(quantidadeLivros);
		System.out.println("Emprestimo de " + quantidadeLivros + " livros feito com sucesso");
		System.out.println(conta);
		System.out.println();
		System.out.println("Voce deseja devolver quantos livros: ");
		quantidadeLivros = sc.nextInt();
		if (quantidadeLivros <= conta.getNumeroLivrosEmprestados()) {
			conta.devolverLivro(quantidadeLivros);
			System.out.println("Devolucao de " + quantidadeLivros + " livros realizada com sucesso"); 
			System.out.println(conta);
		} else {
			System.out.println("Quantidade de livros devolvidos maior do que de livros emprestados");
		}

	}

}
