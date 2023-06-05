package trabalho_agenda;

public class Principal {
	public static void main(String[] args) {
		
		Interface inter = new Interface();
		
		int alter = inter.MenuAgenda();
		
		if (alter == 1) {
			
		}
		
		if (alter == 2) {
			Contato conta = inter.cadastraContato();
			
			
		}
	}
}



