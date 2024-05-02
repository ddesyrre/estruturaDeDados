package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scanner = new Scanner(System.in);
		        Queue<String> filaCliente = new LinkedList<>();

		        int opcao;
		        do {
		        	System.out.println("************************************************\n");
		            System.out.println("		MENU							\n");
		            System.out.println("1 - Adicionar Cliente na Fila");
		            System.out.println("2 - Listar todos os Clientes");
		            System.out.println("3 - Retirar Cliente da Fila");
		            System.out.println("0 - Sair do programa");
		            System.out.println("\n************************************************\n");
		            System.out.println("	Entre com a opção desejada: ");
		            opcao = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (opcao) {
		                case 1:
		                    System.out.print("Digite o nome: ");
		                    String nomeCliente = scanner.nextLine();
		                    filaCliente.offer(nomeCliente);
	                        for (String cliente : filaCliente) {
	                            System.out.println(cliente);
	                        }
	                        System.out.println("Cliente Adicionado!");
		                    break;
		                    
		                case 2:
		                    if (filaCliente.isEmpty()) {
		                        System.out.println("A Fila está vazia!");
		                    } else {
		                        System.out.println("Lista de Clientes na Fila:");
		                        for (String cliente : filaCliente) {
		                            System.out.println(cliente);
		                        }
		                    }
		                    break;
		                case 3:
		                    if (filaCliente.isEmpty()) {
		                        System.out.println("A Fila está vazia!");
		                    } else {
		                        String excluirCliente = filaCliente.poll();
		                        System.out.println("Fila:");
		                        for (String cliente : filaCliente) {
		                            System.out.println(cliente);
		                        }
		                        System.out.println("O Cliente foi Chamado!");
		                    }
		                    break;
		                case 0:
		                    System.out.println("Programa Finalizado!");
		                    break;
		                default:
		                    System.out.println("Opção inválida!");
		                    break;
		            }
		        } while (opcao != 0);

	}

}
