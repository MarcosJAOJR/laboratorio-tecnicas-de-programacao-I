public class Editor {
	
	Figura[] listaFig;

	
	Editor() {
		this.listaFig = new Figura[10];
	}

	Editor(int n) {
		this.listaFig = new Figura[n];
	}
	
	public void receberComandos (int operacao, Figura fig) {

		int contFig=-1;
		int currFig=0;
		for(int i = 0; i < listaFig.length; i++) {
			if( listaFig[i] == null && contFig == -1)
				contFig = i;
			if( listaFig[i] == fig)
				currFig = i;
		}

		switch (operacao) {
			/* Criar Figura */       
			case 1: listaFig[contFig] = fig; break; 
			/* Apagar Figura */
			case 2: listaFig[currFig] = null; break;
		}
	}

	public void imprimirAreas() {
		for(Figura item : this.listaFig) {
			if(item != null)
				System.out.println("-> "+Float.toString(item.calcArea()));
		}
	}

	public void desenharFig(int i) {
		this.listaFig[i].desenhar();
	}

	public void desenharFig(Figura fig) {
		fig.desenhar();
	}

	public static void main (String args[]) {
		Editor e = new Editor();
		
		System.out.println("Adicionando elementos 0 e 1");
		e.receberComandos(1, new Quadrado(4));
		e.receberComandos(1, new Circulo(1.3f));
		e.imprimirAreas();
		
		System.out.println("Apagando elemento 0");
		e.receberComandos(2, e.listaFig[0]);
		e.imprimirAreas();

		System.out.println("Adicionando elementos 0, 2, 3, 4");
                e.receberComandos(1, new Retangulo(4, 3.5f));
                e.receberComandos(1, new Triangulo(3, 4, 5));
		e.receberComandos(1, new Elipse(1, 0.5f));
		e.receberComandos(1, new Quadrado(33));
                e.imprimirAreas();
		e.desenharFig(0);
		e.desenharFig(1);
		e.desenharFig(2);
		e.desenharFig(3);
		e.desenharFig(e.listaFig[4]);

	}
}
