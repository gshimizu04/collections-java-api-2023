package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> numeros;

	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> nmrAscend = new ArrayList<>(this.numeros);
		if (!numeros.isEmpty()) {
			Collections.sort(nmrAscend);
			return nmrAscend;
		} else {
			throw new RuntimeException("A lista está vazia.");
		}
	}
	
	public List<Integer> ordenarDescendente() {
		List<Integer> nmrDescend = new ArrayList<>(this.numeros);
		if (!numeros.isEmpty()) {
			nmrDescend.sort(Collections.reverseOrder());
			return nmrDescend;
		} else {
			throw new RuntimeException("A lista está vazia.");
		}
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordNum = new OrdenacaoNumeros();
		ordNum.adicionarNumero(24);
		ordNum.adicionarNumero(104);
		ordNum.adicionarNumero(33);
		ordNum.adicionarNumero(4);
		ordNum.adicionarNumero(69);
		
		System.out.println(ordNum.ordenarAscendente());
		System.out.println(ordNum.ordenarDescendente());
	}
}
