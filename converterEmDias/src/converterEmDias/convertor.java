package converterEmDias;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class convertor {

	public static void main(String[] args) {
		String idadeCompleta;
		idadeCompleta = "";
		int controle = 0;
		while (controle == 0) {
			idadeCompleta = JOptionPane.showInputDialog("Digite sua idade seguindo o padrão: x anos, y meses, z dias.");
			if (idadeCompleta.contains(",") == true) {
				int quantidadeVirgulas = 0;
				for (int i = 0; i < idadeCompleta.length(); i++) {
					if (idadeCompleta.charAt(i) == ',') {
						quantidadeVirgulas++;
					}
				}
				if (quantidadeVirgulas == 2) {
					if (idadeCompleta.contains("anos")) {
						if (idadeCompleta.contains("meses")) {
							if (idadeCompleta.contains("dias")) {
								controle = 1;
								break;
							}
						}
					}
				}
			}
			JOptionPane.showMessageDialog(null, "Use o padrão correto!");
		}
		idadeCompleta = idadeCompleta.replaceAll("\\s+", "");
		idadeCompleta = idadeCompleta.replaceAll("anos", "");
		idadeCompleta = idadeCompleta.replaceAll("meses", "");
		idadeCompleta = idadeCompleta.replaceAll("dias", "");
		String [] idadeCompletaArray = idadeCompleta.split(",");
		int anos = Integer.parseInt(idadeCompletaArray[0]);
		int meses = Integer.parseInt(idadeCompletaArray[1]);
		int dias = Integer.parseInt(idadeCompletaArray[2]);
		int idadeTotalEmDias = (anos * 365) + (meses * 30) + dias;
		System.out.println(idadeTotalEmDias);

	}

}
