package view;

import javax.swing.JOptionPane;

import controller.OperacoesControle;

public class Principal {

	public static void main(String[] args) {
		OperacoesControle opCont = new OperacoesControle();
		opCont.concatenaString(1000);
		opCont.concatenaString(10000);
		opCont.concatenaString(100000);
		opCont.concatenaBuffer();
		
		//String frase = "Sejam bem vindos à disciplina de Sistemas Operacionais I do 3o Semestre de ADS";
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
		opCont.divideFrase(frase);
	}

}
