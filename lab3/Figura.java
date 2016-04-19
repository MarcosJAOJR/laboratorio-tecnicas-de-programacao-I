abstract class Figura {
	protected String tipo;
	public float centroX;
	public float centroY;

	String desenhar() {
		return this.toString();
	}

	void mover(float dx, float dy) {
		this.centroX = dx;
		this.centroY = dy;
	}

	float calcularArea() {
		return 0;
	}

	public String toString() {
		return this.tipo;
	}
}
