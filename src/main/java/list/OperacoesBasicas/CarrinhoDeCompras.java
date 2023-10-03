package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for (Item i : itemList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		itemList.removeAll(itemParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		for (Item i : itemList) {
			valorTotal += i.getPreco() * i.getQuantidade();
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(itemList);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras cdc = new CarrinhoDeCompras();
		
		cdc.exibirItens();
		
		cdc.adicionarItem("Lapis", 12.25, 3);
		cdc.adicionarItem("Caneta", 10.50, 2);
		cdc.adicionarItem("PostIt", 3.75, 6);
		
		cdc.exibirItens();
		System.out.println(cdc.calcularValorTotal());;
		cdc.removerItem("Caneta");
		cdc.exibirItens();
		System.out.println(cdc.calcularValorTotal());;
	}
}
