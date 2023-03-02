package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		//Lista é uma estrutura ordenada, conseguimos acessar lista atraves do ID, aceita repeticao
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Jose"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Juliana"));
		lista.add(new Usuario("Guilherme"));
		
		System.out.println(lista.get(2).nome);
		
		for(Usuario u:lista) {
			System.out.println(u.nome);
		}
	}

}
