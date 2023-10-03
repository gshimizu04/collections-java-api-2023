package main.java.set.Pesquisa;


public class Tarefa {
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao, boolean conclusao) {
		this.descricao = descricao;
		this.concluida = false;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "Tarefa{" +
				"descrição='" + descricao + '\'' +
				", concluida=" + concluida +
				'}';
	}
}
