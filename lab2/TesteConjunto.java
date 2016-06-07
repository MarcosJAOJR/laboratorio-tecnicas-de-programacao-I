public class TesteConjunto{

	public static void main(String[] args){
		Conjunto A = new Conjunto(new Object[]{1,2,3,4,5,6,7,8,9,10});
		Conjunto B = new Conjunto(new Object[]{2,4,6,8,10});
		Conjunto C = new Conjunto(new Object[]{1,3,5,7,9});
		Conjunto D = new Conjunto(new Object[]{2,3,5,7,11,13,17,19,23,29});
		Conjunto U = new Conjunto(50);

		int i = 0;
		for (Object elemento : U.elementos) {
			U.elementos[i] = i++;
		}


		// QUESTÕES

		// a)
		System.out.println("a) O conjunto 4 é subconjunto de si mesmo? " + D.contem(D));

		// b)
		System.out.println("b) O conjunto 2 pertence ao conjunto 1? " + B.esta_contido(A));
		System.out.println("   O conjunto 3 pertence ao conjunto 1? " + C.esta_contido(A));
		System.out.println("   O conjunto 4 pertence ao conjunto 1? " + D.esta_contido(A));

		// c)
		boolean resposta =  B.uniao(C).esta_contido(A) && A.esta_contido(B.uniao(C));
		System.out.println("c) A união do conjunto 2 e do conjunto 3 é igual ao conjunto 1? " + resposta);

		// d)
		resposta =  (A.interseccao(B).elementos.length == 0);
		System.out.println("d) A intersecção do conjunto 1 e do conjunto 2 é vazia? " + resposta);

		// e)
		Conjunto diferenca =  (A.diferenca(B));
		System.out.println("e) A diferença entre o conjunto 1 e o conjunto 2 é:");
		System.out.print("   [");
		for (Object elemento : diferenca.elementos) {
			System.out.print(elemento+",");
		}
		System.out.println("]");

		System.out.println("\nProduto Cartesiano");
		B.cartesiano(C);

		System.out.println("\nLeis de Morgan");
		// 1ª lei
		System.out.println("1ª Lei");
		System.out.print("   Complemento de (A união B) = (Complemento de A) intersecção (complemento de B): ");
		Conjunto C1 = (A.uniao(B)).complemento(U);
		Conjunto C2 = (A.complemento(U)).interseccao(B.complemento(U));
		System.out.println(C1.esta_contido(C2) && C2.esta_contido(C1));

		// 2ª lei
		System.out.println("2ª Lei");
		System.out.print("   Complemento de (A intersecção B) = (Complemento de A) união (complemento de B): ");
		Conjunto C3 = (A.interseccao(B)).complemento(U);
		Conjunto C4 = (A.complemento(U)).uniao(B.complemento(U));
		System.out.println(C3.esta_contido(C4) && C4.esta_contido(C3));
	}

}
