public class Conjunto {
	public Object elementos[];

	public Conjunto () {
		this.elementos = new Object[10];
	};
	public Conjunto(int nelementos) {
		this.elementos = new Object[nelementos];
	};
	public Conjunto(Conjunto conjunto) {
		this.elementos = conjunto.elementos;
	};
  public Conjunto(Object conjunto[]) {
		this.elementos = conjunto;
	};

	public boolean pertence (Object elemento){
		for(Object item : this.elementos) {
			if (elemento == item) {
				return true;
			}
		}
		return false;
	};

	public boolean contem (Conjunto outro){
		for(Object outroElemento : outro.elementos)
			if (!this.pertence(outroElemento))
				return false;
		return true;
	}
  public boolean esta_contido (Conjunto outro){
		for(Object elemento : this.elementos)
			if (!outro.pertence(elemento))
				return false;
		return true;
	}
  public Conjunto uniao (Conjunto outro){
		Conjunto temp = new Conjunto(this.elementos.length + outro.elementos.length);

		int i = 0;
		for (Object elemento : this.elementos)
			temp.elementos[i] = this.elementos[i++];

		for (Object elemento : outro.elementos )
			if (!temp.pertence(elemento))
				temp.elementos[i++] = elemento;

		Conjunto retorno = new Conjunto(i);
		i = 0;
		for (Object elemento : temp.elementos )
			if (elemento != null)
				retorno.elementos[i++] = elemento;
		return retorno;
	};

  public Conjunto interseccao (Conjunto outro){
		Object[] temp = new Object[this.elementos.length + outro.elementos.length];

		int i = 0;
		for (Object elemento : this.elementos )
			if (outro.pertence(elemento))
				temp[i++] = elemento;

		Conjunto retorno = new Conjunto(i);
		for (int j = 0 ; j < i ; j++) {
			retorno.elementos[j] = temp[j];
		}

		return retorno;
	};

	public Conjunto diferenca (Conjunto outro){

		Conjunto interseccao = this.interseccao(outro);
		Conjunto retorno = new Conjunto(this.elementos.length - interseccao.elementos.length);

		int i = 0;
		for (Object elemento : this.elementos)
			if (!interseccao.pertence(elemento))
				retorno.elementos[i++] = elemento;

		return retorno;
	};

	public void cartesiano (Conjunto outro){

		System.out.print("{");
		for (Object elemento : this.elementos ) {
			for (Object outrosElementos : outro.elementos) {
				System.out.print("("+elemento+","+outrosElementos+")");
			}
		}

		System.out.print("}\n");
	};

	public Conjunto complemento (Conjunto U){

		return U.diferenca(this);
	};

}
