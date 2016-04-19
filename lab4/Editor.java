class Editor {
	void receberComandos (int operacao, Figura fig){
		//...
		switch (operacao){
			/* Criar Figura */
			case 1:
				listaFig[contFig] = fig;
				break;
			/* Apagar Figura */
                        case 2:
                                /* Elimina figura da lista de figuras */
                                break;

		}
	}

	void imprimirAreas (){

	}

	void desenharFig() {
		System.out.println("Esse é o desenhar figura");
	}
}
