class Circulo extends Figura {

	public float raio;

	Circulo(float pRaio) {
		this.tipo = "Circulo";
		this.raio = pRaio;
	}

	float calcularArea() {
		return 3.1415f*raio*raio;
	}
}
