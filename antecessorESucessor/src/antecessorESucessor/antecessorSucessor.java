package antecessorESucessor;

import javax.swing.JOptionPane;

public class antecessorSucessor {

	public static void main(String[] args) {
		float numeroEscolhido = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: \n"));
		float antecessor = numeroEscolhido - 1;
		float sucessor = numeroEscolhido + 1;
		System.out.println("O número escolhido foi: " + numeroEscolhido);
		System.out.println("O antecessor desse número é: " + antecessor);
		System.out.println("O sucessor desse número é: " + sucessor);


	}

}
