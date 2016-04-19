class Quadrado extends Figura implements IColorida {

	public float lado;

	Quadrado(float pLado) {
		this.tipo = "Quadrado";
		this.lado = pLado;
	}

	public String desenhar(int hegex){
		return this.tipo+"(#"+hegex+")";
	}

	float calcularArea() {
		return lado*lado;
	}
}
