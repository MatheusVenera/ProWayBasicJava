package calculoSalariosMinimos;

import javax.swing.JOptionPane;

public class calculoSalario {

	public static void main(String[] args) {
		//Sal�rio m�nimo = R$788.00
		float salarioUsuario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu sal�rio: \n"));
		float resultado = salarioUsuario / 788;
		System.out.println("Seu sal�rio � equivalente a " + resultado + " sal�rios m�nimos.");

	}

}
