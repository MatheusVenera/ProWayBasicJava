import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		int opcao = 0;
		int numeroDigitado;
		int resultado;
		ArrayList<Integer> listaResultados = new ArrayList<>();
		do {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção:\r\n1 - Rodar o programa.\r\n9 - Encerrar o programa.", "Menu principal.", 3));
				switch (opcao) {
				case 1: {
					numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma número: \n", "Insira um número!", 3));
					for (int i = 0; i < 11; i++) {
						resultado = numeroDigitado * i;
						listaResultados.add(resultado);
					}
					JOptionPane.showMessageDialog(null, "0 X " + numeroDigitado + " = " + listaResultados.get(0) + "\r\n"
							+ "1 X " + numeroDigitado + " = " + listaResultados.get(1) + "\r\n"
							+ "2 X " + numeroDigitado + " = " + listaResultados.get(2) + "\r\n"
							+ "3 X " + numeroDigitado + " = " + listaResultados.get(3) + "\r\n"
							+ "4 X " + numeroDigitado + " = " + listaResultados.get(4) + "\r\n"
							+ "5 X " + numeroDigitado + " = " + listaResultados.get(5) + "\r\n"
							+ "6 X " + numeroDigitado + " = " + listaResultados.get(6) + "\r\n"
							+ "7 X " + numeroDigitado + " = " + listaResultados.get(7) + "\r\n"
							+ "8 X " + numeroDigitado + " = " + listaResultados.get(8) + "\r\n"
							+ "9 X " + numeroDigitado + " = " + listaResultados.get(9) + "\r\n"
							+ "10 X " + numeroDigitado + " = " + listaResultados.get(10) + "\r\n", "Tabuada do " + numeroDigitado, 3);
					listaResultados.clear();
					
					break;
				}
				case 9: {
					JOptionPane.showMessageDialog(null, "Encerrando o programa...", "Adeus!", 3);
					opcao = 9;
					break;
				}
				default:
					JOptionPane.showMessageDialog(null, "Insira uma opção válida.", "OPS...", 3);
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma opção válida!", "Erro", 0);
			}
		} while (opcao != 9);

	}

}
