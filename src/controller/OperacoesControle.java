package controller;

public class OperacoesControle {
	public void concatenaString(int posicoes) {
		String sequencia = "";
		double tempoInicial = System.nanoTime();
		for (int i = 0 ; i < posicoes ; i++ ) {
			sequencia = sequencia + "x";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//Converter para segundos
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo para percorrer "+posicoes+" posições: "+tempoTotal+"s.");
	}
	
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0 ; i < 100000 ; i++) {
			buffer.append("x");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		
		//Converte de millisegundos para segundos.
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Buffer ==> "+tempoTotal+"s.");
		
	}
	
	public void divideFrase(String frase) {
		String[] vetorFrase = frase.split(" ");
		int cont = 0;
		for (String palavra : vetorFrase) {
			System.out.print(cont+" ");
			System.out.println(palavra);
			cont++;
		}
	}
	
	
	
	
}
