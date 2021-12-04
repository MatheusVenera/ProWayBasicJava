import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class MaiorEMenor {

	public static void main(String[] args) {
		int opcao = 1;
		//Do para rodar o menu principal
		do {
			//Try para evitar a entrada de dados incorretamente
			try {
				int qtdNumeros = 0;
				int validarEntrada = 0;
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite uma op��o:\r\n 1 - Rodar o programa \r\n 9 - Sair do programa", "Menu principal", 3));
				switch (opcao) {
				case 1: {
					do {
						qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog(null,
								"Digite a quantidade de n�meros que voc� deseja inserir (m�ximo 10): \n", "Quantidade!",
								3));
						//Verificar se o usu�rio inseriu um n�mero dentro do limite
						if (qtdNumeros > 10 || qtdNumeros < 1) {
							JOptionPane.showMessageDialog(null, "Voc� deve inserir entre 1-10 n�meros.",
									"Limite excedido!", 0);
						} else {
							validarEntrada = 1;
						}
					} while (validarEntrada == 0);
					ArrayList<Float> listaNumeros = new ArrayList<>();
				
					for (int i = 0; i < qtdNumeros; i++) {
						float numeroDigitado = Float.parseFloat(
								JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "� n�mero", null, 3));
						listaNumeros.add(numeroDigitado);
					}
					JOptionPane.showMessageDialog(null, "O maior n�mero �: " + Collections.max(listaNumeros) + "\r\n"
							+ "O menor n�mero �: " + Collections.min(listaNumeros), "Resultado!", 3);
					break;

				}
				case 9: {
					JOptionPane.showMessageDialog(null, "Saindo do programa...", "At� mais", 3);
					break;
				}
				default:
					JOptionPane.showMessageDialog(null, "Dgite uma op��o v�lida.", "Entrada incorreta", 0);
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas n�meros.", "Entrada inv�lida!", 0);
			}

		} while (opcao != 9);

	}

}
