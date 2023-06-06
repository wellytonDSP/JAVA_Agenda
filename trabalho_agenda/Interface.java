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
	
	public String nomeContato() {
		boolean status = true;
		while(status) {
			try {
				System.out.println("Digite o nome: ");
				String nome = scan.nextLine(); 
				status = false;
				return nome;
			}catch(Exception e) {
				System.out.println("Erro: " + e);
			}
		}
		return null;
	}
	
	public int idadeContato() {
		boolean status = true;
		int idade = 0;
		while(status) {
			try {
				System.out.println("Digite a idade: ");
				idade = scan.nextInt(); 
				status = false;
			}catch(Exception e) {
				System.out.println("Erro: " + e);
			}
		}
		return idade;
	}
	
	public String enderecoContato() {
		boolean status = true;
		String endereco = null;
		while(status) {
			try {
				System.out.println("Digite o endereço:  ");
				endereco = scan.nextLine(); 
				status = false;
			}catch(Exception e) {
				System.out.println("Erro: " + e);
			}
		}
		return endereco;
	}
	
	public String telefoneContato() {
		boolean status = true;
		String telefone = null;
		while(status) {
			try {
				System.out.println("Digite o telefone: ");
				telefone = scan.nextLine(); 
				status = false;
			}catch(Exception e) {
				System.out.println("Erro: " + e);
			}
		}
		return telefone;
	}
	
	public String emailContato() {
		boolean status = true;
		String email = null;
		while(status) {
			try {
				System.out.println("Digite o email: ");
				email = scan.nextLine(); 
				status = false;
			}catch(Exception e) {
				System.out.println("Erro: " + e);
			}
		}
		return email;
	}
	
	public Contato cadastraContato() {
		scan.nextLine();
		String nome;
		int idade;
		String endereco;
		String telefone;
		String email;
		
		nome = nomeContato();
		
		idade = idadeContato();
		scan.nextLine();
		endereco = enderecoContato();
		telefone = telefoneContato();
		email = emailContato();
		
		Contato conte = new Contato(nome,idade,endereco,telefone,email);
		
		return conte;
		
	}

}
