package calculoSalariosMinimos;

import javax.swing.JOptionPane;

public class calculoSalario {

	public static void main(String[] args) {
		//Salário mínimo = R$788.00
		float salarioUsuario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário: \n"));
		float resultado = salarioUsuario / 788;
		System.out.println("Seu salário é equivalente a " + resultado + " salários mínimos.");

	}

}
