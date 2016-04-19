class main {

	public static void main(String[] args) {

		// Exemplo Quadrado 1
		Quadrado q1 = new Quadrado(3);
		System.out.println("Exemplo 1: " + q1.desenhar());
		System.out.println("   Área: " + q1.calcularArea());
		System.out.println("   centro X: " + q1.centroX);
		System.out.println("   centro Y: " + q1.centroY);

		// Exemplo Quadrado 2
		Quadrado q2 = new Quadrado(35.68f);
		System.out.println("Exemplo 2: " + q2.desenhar());
		System.out.println("   Área: " + q2.calcularArea());
		q2.mover(2.2f, 3);
		System.out.println("   centro X: " + q2.centroX);
		System.out.println("   centro Y: " + q2.centroY);

		// Exemplo Circulo 3
		Circulo c3 = new Circulo(7.25f);
		System.out.println("Exemplo 3: " + c3.desenhar());
		System.out.println("   centro X: " + c3.centroX);
		System.out.println("   centro Y: " + c3.centroY);
		System.out.println("   Área: " + c3.calcularArea());

		// Exemplo Circulo 4
                Circulo c4 = new Circulo(7.25f);
                System.out.println("Exemplo 4: " + c4.desenhar());
                System.out.println("   Área(antes de mover): " + c4.calcularArea());
		c4.mover(3, 0);
                System.out.println("   centro X: " + c4.centroX);
                System.out.println("   centro Y: " + c4.centroY);
                System.out.println("   Área(depois de mover): " + c4.calcularArea());
	}
}
