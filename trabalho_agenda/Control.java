package trabalho_agenda;

import java.util.ArrayList;

public class Control {

	private ArrayList<Contato> contato = new ArrayList<Contato>();
	
	
	
		public boolean cadastrarContato(Contato contato) {
			//Verifica se tem algum valor no array
			boolean alunoExistente = verificaContato(contato);
	
			if (alunoExistente) {
				return false;           // Não deu para cadastrar
			} else {			
				this.contato.add(contato); // Cadastra o aluno, adicionando o objeto no Array List
				return true;
			}
		}	
		
		public boolean verificaContato(Contato contato) {
			
			for (Contato alu: this.contato) {
				if (alu.equals(contato)) {
					return true;
				}
			}
			return false;
		}
}


