class Quadrado extends Figura {

	public float lado;

	Quadrado(float pLado) {
		this.tipo = "Quadrado";
		this.lado = pLado;
	}

	float calcularArea() {
		return lado*lado;
	}
}
