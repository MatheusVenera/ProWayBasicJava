import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		// Informar a quantidade de notas, pedir as notas e calcular a média simples
		/* Códigos ANSI para as cores a serem usadas no console
		String vermelho = "\u001B[31m";
		String amarelo = "\u001B[33m";
		String verde = "\u001B[32m";
		String cor_padrao = "\u001B[0m";
		*/
		float nota, media = 0;
		int qtdNotas = 0, contaNotas = 0;
		qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas: \n"));
		contaNotas = 1;
		float soma = 0;
		while (contaNotas <= qtdNotas) {
			nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nrº " + contaNotas));
			soma += nota;
			//Forma Nicolas: media += nota / qtdNotas;
			contaNotas++;
		}
		media = soma / qtdNotas;
		media = Math.round(media * 100.0f)/100.0f; //Quanto mais zeros, mais decimais terá a média
		JOptionPane.showMessageDialog(null, "A sua média é " + media, "MÉDIA", 1);
		
		
		/* Print com cor no console (precisa do plugin ANSI Console (Marketplace Eclipse > ANSI Console))
		if (media < 5) {
			System.out.println(vermelho + "Sua média é " + media + cor_padrao);
		} else if (media > 5 && media < 7) {
			System.out.println(amarelo + "Sua média é " + media + cor_padrao);
		} else {
			System.out.println(verde + "Sua média é " + media + cor_padrao);
		}
		*/
		
	}

}
