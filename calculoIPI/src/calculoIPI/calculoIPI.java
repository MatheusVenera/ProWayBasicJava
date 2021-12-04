package calculoIPI;

import javax.swing.JOptionPane;

public class calculoIPI {

	public static void main(String[] args) {
		
		//Coletar dados das peças
		float IPI = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do IPI a ser acrescido no valor do produto."));
		float codigoPc1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o código da peça 1."));
		float vlrPc1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário da peça 1."));
		float qtddPc1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade do produto em estoque."));
		
		float codigoPc2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o código da peça 2."));
		float vlrPc2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário da peça 2."));
		float qtddPc2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade do produto em estoque."));
		
		float valorTotal = (vlrPc1*qtddPc1 + vlrPc2*qtddPc2) * ((IPI/100) + 1);
		System.out.println("O valor total da compra é de " + valorTotal);
	}

}
