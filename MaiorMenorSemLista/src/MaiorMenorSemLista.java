import javax.swing.JOptionPane;

public class MaiorMenorSemLista {

	public static void main(String[] args) {
		int numero;
		int maior = 0;
		int menor = 0;
		for (int i = 0; i < 3; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: \n"));
			if (i == 0) {
				maior = numero;
				menor = numero;
			} else {
				if (numero > maior) {
					maior = numero;
				} else if (numero < menor) {
					menor = numero;
				}
			}
			
		}
		System.out.println("Menor número: " + menor);
		System.out.println("Mairo número: " + maior);
	}

}
