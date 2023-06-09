package view;

import br.edu.fateczl.arvorechar.Arvore;

public class main {

	public static void main(String[] args) throws Exception {
		char[] vet = { 'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K' };
		Arvore arvore = new Arvore();
		for (char i : vet) {
			arvore.insert(i);
		}
		arvore.remove('F');
		arvore.remove('U');
		System.out.print("Pré-ordem: ");
		arvore.prefixSearch();
		System.out.println(" ");
		System.out.print("Pós-ordem: ");
		arvore.postfixSearch();
		System.out.println(" ");
		System.out.print("Em ordem: ");
		arvore.infixSearch();
	}
}