package reajuste;

import javax.swing.JOptionPane;

public class reajuste {

	public static void main(String[] args) {
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para ser reajustado em 1% para cima"));
		valor = valor * 1.01f;
		System.out.println("O valor reajustado é:\n" + valor);
	}

}
