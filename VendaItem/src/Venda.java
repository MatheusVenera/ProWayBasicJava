import javax.swing.JOptionPane;

public class Venda {

	public static void main(String[] args) {
		int qtdDeItensVendidos;
		int codigoItem;
		String descItem;
		float vlrUnitario;
		float qtdVendidaDoItem;
		float vlrTotalItem = 0;
		int vlrTotalNota = 0;
		qtdDeItensVendidos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens vendidos: \n"));
		for (int i = 0; i < qtdDeItensVendidos; i++) {
			codigoItem = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do item: \n"));
			descItem = JOptionPane.showInputDialog("Digite a descrição do item: \n");
			vlrUnitario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário do item: \n"));
			qtdVendidaDoItem = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida desse item: \n"));
			vlrTotalItem = vlrUnitario * qtdVendidaDoItem;
			vlrTotalNota += vlrTotalItem;
			/*
			JOptionPane.showMessageDialog(null, "Código: " + codigoItem + "\r\n"
					+ "Descrição: " + descItem + "\r\n"
							+ "Valor unitário: " + vlrUnitario + "\r\n"
									+ "Quantidade do item: " + qtdVendidaDoItem + "\r\n"
											+ "Valor total desse item: " + vlrTotalItem, "Item", 3);
		*/
			System.out.println("--------------------------------------------- \r\n| Código: " + codigoItem + "\r\n"
					+ "| Descrição: " + descItem + "\r\n"
							+ "| Valor unitário: " + vlrUnitario + "\r\n"
									+ "| Quantidade do item: " + qtdVendidaDoItem + "\r\n"
											+ "| Valor total desse item: " + vlrTotalItem + "\r\n---------------------------------------------");
		}
		System.out.println("Valor total da nota: " + vlrTotalNota);
	}

}
