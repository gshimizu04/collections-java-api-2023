package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listaNumeros;

	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public int calcularSoma() {
		int resultado = 0;
		for (Integer numero : listaNumeros) {
			resultado += numero;
		}
		return resultado;
	}
	
	public int encontrarMaiorNumero() {
	    int maiorNumero = Integer.MIN_VALUE;
	    if (!listaNumeros.isEmpty()) {
	      for (Integer numero : listaNumeros) {
	        if (numero >= maiorNumero) {
	          maiorNumero = numero;
	        }
	      }
	      return maiorNumero;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }

	  public int encontrarMenorNumero() {
	    int menorNumero = Integer.MAX_VALUE;
	    if (!listaNumeros.isEmpty()) {
	      for (Integer numero : listaNumeros) {
	        if (numero <= menorNumero) {
	          menorNumero = numero;
	        }
	      }
	      return menorNumero;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }

	  public void exibirNumeros() {
	    if (!listaNumeros.isEmpty()) {
	      System.out.println(this.listaNumeros);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(69);
		somaNumeros.adicionarNumero(24);
		somaNumeros.adicionarNumero(104);
		somaNumeros.adicionarNumero(55);
		somaNumeros.adicionarNumero(33);
		
		System.out.println("SOMA: " + somaNumeros.calcularSoma());
		
		System.out.println("MAIOR NUMERO: " + somaNumeros.encontrarMaiorNumero());
		System.out.println("MENOR NUMERO: " + somaNumeros.encontrarMenorNumero());
		
		somaNumeros.exibirNumeros();
	}
}
