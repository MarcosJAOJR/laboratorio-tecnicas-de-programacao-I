public class Triangulo extends Figura {

        public float ladoA;
        public float ladoB;
	public float ladoC;

        Triangulo(float pLadoA, float pLadoB, float pLadoC) {
                this.tipo = "Triangulo";
                this.ladoA = pLadoA;
                this.ladoB = pLadoB;
		this.ladoC = pLadoC;
        }

        public float calcArea() {
		float p = (this.ladoA + this.ladoB + this.ladoC)/2;
                return (float) Math.sqrt(p*(p-this.ladoA)*(p-this.ladoB)*(p-this.ladoC));
        }

}
