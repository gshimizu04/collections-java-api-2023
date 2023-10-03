package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> tarefas;

	public ListaTarefas() {
		this.tarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao, false));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		for (Tarefa t : tarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover = t;
				break;
			}
		}
		tarefas.remove(tarefaParaRemover);
	}
	
	public void exibirTarefas( ) {
		System.out.println(tarefas);
	}
	
	public int contarTarefas() {
		return tarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		if (!tarefas.isEmpty()) {
			for (Tarefa t : tarefas) {
				if (t.isConcluida() == true) {
					tarefasConcluidas.add(t);
				}
			}
		} else {
			System.out.println("Não existem tarefas no conjunto.");
		}
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		if (!tarefas.isEmpty()) {
			for (Tarefa t : tarefas) {
				if (t.isConcluida() == false) {
					tarefasPendentes.add(t);
				}
			}
		} else {
			System.out.println("Não existem tarefas no conjunto.");
		}
		return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : tarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
				break;
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		for (Tarefa t : tarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(false);
				break;
			}
		}
	}
	
	public void limparListaTarefas() {
		tarefas.removeAll(tarefas);
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    // Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");

	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Marcando tarefas como pendentes
	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	}
}
