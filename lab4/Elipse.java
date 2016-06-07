public class Elipse extends Figura {

        public float A;
        public float B;

        Elipse(float pA, float pB) {
                this.tipo = "Elipse";
                this.A = pA;
                this.B = pB;
        }

        public float calcArea() {
                return 3*this.A*this.B;
        }

}
