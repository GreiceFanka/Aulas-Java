package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");// Retorna erro caso nao consiga add, lanca uma excecao
		fila.offer("Thiago");// Retorna false caso nao consiga add
		fila.offer("Julia");
		fila.add("Luiza");
		
		System.out.println(fila.peek());
	}
}
