import javax.swing.JOptionPane;

public class MassaCorporal {

	public static void main(String[] args) {
		float peso, altura, imc;

		altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura: "));
		imc = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso: "));

		peso = imc / (altura * altura);
		peso = Math.round(peso * 100.0f)/100.0f;

		if (peso <= 18.5) {
			System.out.println("Seu IMC = " + peso + ", MAGREZA.");
		} else if (peso >= 18.6 && peso <= 24.9) {
			System.out.println("Seu IMC = " + peso + ", NORMAL.");
		} else if (peso >= 25 && peso <= 29.9) {
			System.out.println("Seu IMC = " + peso + ", SOBREPESO.");
		} else if (peso >= 30 && peso <= 39.9) {
			System.out.println("Seu IMC = " + peso + ", OBESIDADE.");
		} else {
			System.out.println("Seu IMC = " + peso + ", OBESIDADE GRAVE.");
		}

	}

}
