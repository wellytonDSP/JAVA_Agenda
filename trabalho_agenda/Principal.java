package trabalho_agenda;

public class Principal {
	public static void main(String[] args) {
		Control control = new Control();
		Interface inter = new Interface();
		
		int alter = inter.MenuAgenda(); 
		
		while(alter != 0) {
			switch(alter) {
				case 1:{
					
					break;
				}
				case 2:{
					Contato cont = inter.cadastraContato();
					if (control.verificaContato(cont)) {
						System.out.println("Cadastrado com sucesso.");
					}else {
						System.out.println("Falha no cadastro.");
					}
					break;
				}
					
			}
		}
	}
}



