import java.util.*;

public class Colecoes {

	Collection<String> colecao;

	public Colecoes(Collection<String> colecao, String itens[]) {
		for(String item : itens) {
			colecao.add(item);
		}

		this.colecao = colecao;
	}

	public void verificar() {

		// Verificar se aceita elementos repetidos
		System.out.println("\nAceita elementos duplicados?");
		if(this.colecao instanceof List) {
			System.out.print("Sim -> ");
			System.out.println(this.colecao);
		}
		if(this.colecao instanceof Set) {
			System.out.print("Não -> ");
			System.out.println(this.colecao);
		}

		// Verificar se ordenar automaticamente os elementos
		System.out.println("Ordena automaticamente os elementos?");
		if(this.colecao instanceof List) {
			System.out.print("Não -> ");
			System.out.println(this.colecao);
		}
		if(this.colecao instanceof Set) {
			System.out.print("Sim -> ");
			System.out.println(this.colecao);
		}

		// Verifica se garante a ordem de entrada dos elementos na coleção
		System.out.println("Garante a ordem de entrada dos elementos na coleção?");
		if(this.colecao instanceof List) {
			System.out.print("Sim -> ");
			System.out.println(this.colecao);
		}
		if(this.colecao instanceof Set) {
			System.out.print("Não -> ");
			System.out.println(this.colecao);
		}

	}
}
