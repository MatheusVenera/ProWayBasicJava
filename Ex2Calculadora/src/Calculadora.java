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
						"Escolha uma opção", 3));
				switch (opcao) {
				case 1: {
					// Somar
					float PrimeiroNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o primeiro número para somar:", "Primeiro número", 3));
					float SegundoNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o segundo número para somar:", "Segundo número", 3));
					float soma = PrimeiroNumero + SegundoNumero;
					JOptionPane.showMessageDialog(null, "O resultado da sua soma é: " + soma, "RESULTADO", 1);
					break;
				}
				case 2: {
					// Subtrair
					float PrimeiroNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o primeiro número para subtrair:", "Primeiro número", 3));
					float SegundoNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o segundo número para subtrair:", "Segundo número", 3));
					float subtracao = PrimeiroNumero - SegundoNumero;
					JOptionPane.showMessageDialog(null, "O resultado da sua subtração é: " + subtracao, "RESULTADO", 1);
					break;
				}
				case 3: {
					// Multiplicar
					float PrimeiroNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o primeiro número para multiplicar:", "Primeiro número", 3));
					float SegundoNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o segundo número para multiplicar:", "Segundo número", 3));
					float multiplicacao = PrimeiroNumero * SegundoNumero;
					JOptionPane.showMessageDialog(null, "O resultado da sua multiplicação é: " + multiplicacao,
							"RESULTADO", 1);
					break;
				}
				case 4: {
					// Dividir
					float PrimeiroNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o primeiro número para dividir (dividendo):", "Primeiro número", 3));
					float SegundoNumero = Float.parseFloat(JOptionPane.showInputDialog(null,
							"Digite o segundo número para dividir (divisor):", "Segundo número", 3));
					if (SegundoNumero == 0) {
						JOptionPane.showMessageDialog(null, "Não se pode dividir por 0! Voltando ao menu inicial.",
								"DIVISÃO POR ZERO", 0);
						break;
					} else {
						float divisao = PrimeiroNumero / SegundoNumero;
						float restoDivisao = PrimeiroNumero % SegundoNumero;
						JOptionPane.showMessageDialog(null, "O resultado da sua divisão é: " + divisao + "\r\n"
								+ "O resto da sua divisão é (caso dividido apenas por inteiro): " + restoDivisao,
								"RESULTADO", 1);
						break;
					}
				}
				case 9: {
					// Sair
					JOptionPane.showMessageDialog(null, "Encerrando o programa...", "ATÉ MAIS!", 1);
					break;
				}
				default:
					// Opção inválida;
					JOptionPane.showMessageDialog(null, "Digite uma das opções mostradas no menu!", "OPÇÃO INVÁLIDA",
							0);
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas números!", "ENTRADA DE DADOS INCORRETA", 0);
			}

		} while (opcao != 9);
	}

}
