public class Retangulo extends Figura {
	
	public float ladoA;
	public float ladoB;

        Retangulo(float pLadoA, float pLadoB) {
                this.tipo = "Retangulo";
                this.ladoA = pLadoA;
		this.ladoB = pLadoB;
        }

        public float calcArea() {
                return this.ladoA*this.ladoB;
        }

}
