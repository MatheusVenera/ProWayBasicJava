package antecessorESucessor;

import javax.swing.JOptionPane;

public class antecessorSucessor {

	public static void main(String[] args) {
		float numeroEscolhido = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero: \n"));
		float antecessor = numeroEscolhido - 1;
		float sucessor = numeroEscolhido + 1;
		System.out.println("O n�mero escolhido foi: " + numeroEscolhido);
		System.out.println("O antecessor desse n�mero �: " + antecessor);
		System.out.println("O sucessor desse n�mero �: " + sucessor);


	}

}
