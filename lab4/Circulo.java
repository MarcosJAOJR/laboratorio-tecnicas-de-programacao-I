public class Circulo extends Figura {

        public float raio;

        Circulo(float pRaio) {
                this.tipo = "Circulo";
                this.raio = pRaio;
        }

        public float calcArea() {
                return 3*this.raio*this.raio;
        }

}
