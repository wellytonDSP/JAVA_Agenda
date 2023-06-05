package trabalho_agenda;

import java.util.Scanner;

public class Interface {
	
	Scanner scan = new Scanner(System.in);
	
	public int MenuAgenda() {
		int alternativa = 0;
		boolean status = true;
		
		while(status){
			try {
				System.out.println("--------------------------------");
				System.out.println("----------Menu Agenda-----------");
				System.out.println("--------------------------------");
				System.out.println("1- Lista contatos.");
				System.out.println("2- Adicionar contano.");
				System.out.println("3- Excluir contatos.");
				System.out.println("4- Editar contato.");
				System.out.println("");
				System.out.println("5- Sair");
				alternativa = scan.nextInt();
				
				while (alternativa > 5 || alternativa <= 0) {
					
					System.out.println("--------------------------------");
					System.out.println("----------Menu Agenda-----------");
					System.out.println("--------------------------------");
					System.out.println("1- Lista contatos.");
					System.out.println("2- Adicionar contano.");
					System.out.println("3- Excluir contatos.");
					System.out.println("4- Editar contato.");
					System.out.println("");
					System.out.println("5- Sair");
					alternativa = scan.nextInt();
					
					
				}
				status = false;
				
				
			}catch(java.util.InputMismatchException e ){
				System.out.println("Valor diferente de numero, escolha uma das alternativas validas.");
				scan.nextLine();
			}catch(Exception e) {
				System.out.println("Erro: " + e);
				scan.nextLine();
			}
		}
			return alternativa;
	}

}
