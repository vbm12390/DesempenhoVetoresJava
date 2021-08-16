package view;

import controller.OperacoesControle;

public class Principal {

	public static void main(String[] args) {
		OperacoesControle opCont = new OperacoesControle();
		opCont.concatenaString(1000);
		opCont.concatenaString(10000);
		opCont.concatenaString(100000);
	}

}
