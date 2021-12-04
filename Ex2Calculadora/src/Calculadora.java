import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		/*
		 * 1 - Somar 2 - Subtrair 3 - Multiplicar 4 - Dividir 9 - Sair
		 */
		int opcao = 0;
		do {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1 - Somar\r\n" + "2 - Subtrair\r\n" + "3 - Multiplicar\r\n" + "4 - Dividir\r\n" + "9 - Sair",
						"Escolha uma op��o", 3));
				switch (opcao) {
				case 1: {
					// Somar
					float PrimeiroNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o primeiro n�mero para somar:", "Primeiro n�mero", 3));
					float SegundoNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o segundo n�mero para somar:", "Segundo n�mero", 3));
					float soma = PrimeiroNumero + SegundoNumero;
					JOptionPane.showMessageDialog(null, "O resultado da sua soma �: " + soma, "RESULTADO", 1);
					break;
				}
				case 2: {
					// Subtrair
					float PrimeiroNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o primeiro n�mero para subtrair:", "Primeiro n�mero", 3));
					float SegundoNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o segundo n�mero para subtrair:", "Segundo n�mero", 3));
					float subtracao = PrimeiroNumero - SegundoNumero;
					JOptionPane.showMessageDialog(null, "O resultado da sua subtra��o �: " + subtracao, "RESULTADO", 1);
					break;
				}
				case 3: {
					// Multiplicar
					float PrimeiroNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o primeiro n�mero para multiplicar:", "Primeiro n�mero", 3));
					float SegundoNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o segundo n�mero para multiplicar:", "Segundo n�mero", 3));
					float multiplicacao = PrimeiroNumero * SegundoNumero;
					JOptionPane.showMessageDialog(null, "O resultado da sua multiplica��o �: " + multiplicacao,
							"RESULTADO", 1);
					break;
				}
				case 4: {
					// Dividir
					float PrimeiroNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o primeiro n�mero para dividir (dividendo):", "Primeiro n�mero", 3));
					float SegundoNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o segundo n�mero para dividir (divisor):", "Segundo n�mero", 3));
					if (SegundoNumero == 0) {
						JOptionPane.showMessageDialog(null, "N�o se pode dividir por 0! Voltando ao menu inicial.",
								"DIVIS�O POR ZERO", 0);
						break;
					} else {
						float divisao = PrimeiroNumero / SegundoNumero;
						float restoDivisao = PrimeiroNumero % SegundoNumero;
						JOptionPane.showMessageDialog(null, "O resultado da sua divis�o �: " + divisao + "\r\n"
								+ "O resto da sua divis�o � (caso dividido apenas por inteiro): " + restoDivisao,
								"RESULTADO", 1);
						break;
					}
				}
				case 9: {
					// Sair
					JOptionPane.showMessageDialog(null, "Encerrando o programa...", "AT� MAIS!", 1);
					break;
				}
				default:
					// Op��o inv�lida;
					JOptionPane.showMessageDialog(null, "Digite uma das op��es mostradas no menu!", "OP��O INV�LIDA",
							0);
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas n�meros!", "ENTRADA DE DADOS INCORRETA", 0);
			}

		} while (opcao != 9);
	}

}
