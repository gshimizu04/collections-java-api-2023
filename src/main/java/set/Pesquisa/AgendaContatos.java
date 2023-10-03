package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> ctts;

	public AgendaContatos() {
		this.ctts = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		ctts.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(ctts);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> cttsPorNome = new HashSet<>();
		for (Contato c : ctts) {
			if (c.getNome().startsWith(nome)) {
				cttsPorNome.add(c);
			}
		}
		return cttsPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato cttAtualizado = null;
		for (Contato c : ctts) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				cttAtualizado = c;
				break;
			}
		}
		return cttAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos ctts = new AgendaContatos();
		
		ctts.exibirContatos();
		
		ctts.adicionarContato("Guilherme Shimizu", 123321);
		ctts.adicionarContato("Guilherme Shimizu", 0);
		ctts.adicionarContato("Guilherme", 1111111);
		ctts.adicionarContato("Guilherme Java", 654789);
		ctts.adicionarContato("Karla Comachio", 1111111);
		
		ctts.exibirContatos();
		
		System.out.println(ctts.pesquisarPorNome("Guilherme"));
		
		System.out.println("Contato atualizado: " + ctts.atualizarNumeroContato("Karla Comachio", 5555555));
	}
}
