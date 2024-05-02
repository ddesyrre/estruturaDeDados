package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// Criar uma pilha de livros
	
		        Scanner scanner = new Scanner(System.in);
		        Stack<String> pilha = new Stack<>();

		        int option;
		        do {
		            System.out.println("************************************************\n");
		            System.out.println("		MENU							\n");
		            System.out.println("	1 - Adicionar Livro na pilha");
		            System.out.println("	2 - Listar todos os livros");
		            System.out.println("	3 - Retirar Livro da pilha");
		            System.out.println("	0 - Sair");
		            System.out.println("\n************************************************\n");
		            System.out.println("	Entre com a opção desejada: ");
		            option = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (option) {
		                case 1:
		                    System.out.print("Digite o nome do livro a ser adicionado: ");
		                    String nomeLivro = scanner.nextLine();
		                    pilha.push(nomeLivro);
		                    System.out.println("Lista de livros na Pilha: ");
	                        for (String livro : pilha) {
	                            System.out.println("- " + livro);
	                        }
		                    System.out.println("\nLivro adicionado!\n");
		                    break;
		                case 2:
		                    if (pilha.isEmpty()) {
		                        System.out.println("A pilha de livros está vazia.");
		                    } else {
		                        System.out.println("Lista de livros na Pilha: ");
		                        for (String livro : pilha) {
		                            System.out.println("- " + livro);
		                        }
		                    }
		                    break;
		                case 3:
		                    if (pilha.isEmpty()) {
		                        System.out.println("\nA Pilha está vazia!\n\n");
		                    } else {
		                        pilha.pop();
		                        for (String livro : pilha) {
		                            System.out.println("- " + livro);
		                        }
		                        System.out.println("Um Livro foi retirado da pilha.");
		                    }
		                    break;
		                case 0:
		                    System.out.println("Programa Finalizado!");
		                    break;
		                default:
		                    System.out.println("Opção inválida! Tente novamente.");
		                    break;
		            }
		        } while (option != 0);

		 

	}

}
