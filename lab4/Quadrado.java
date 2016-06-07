public class Quadrado extends Figura {
	
	public float lado;

	Quadrado(float pLado) {
		this.tipo = "Quadrado";
		this.lado = pLado;
	}

	public float calcArea() {
		return this.lado*this.lado;
	}
}
