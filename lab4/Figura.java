public abstract class Figura {
	
	public int cor;
	public Ponto pInicial;
	public String tipo;

	public abstract float calcArea();

	public void mover(Ponto pMovimento) {
		this.pInicial.x += pMovimento.x;
		this.pInicial.y += pMovimento.y;
	}

	public void desenhar() {
		System.out.println(this);
	}

	public String toString() {
		return this.tipo;
	}
}
