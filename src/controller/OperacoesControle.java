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
}
