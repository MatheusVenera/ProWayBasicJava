import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pares {

	public static void main(String[] args) {
		ArrayList<Integer> listaPares = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				listaPares.add(i);
			}
		}
		JOptionPane.showMessageDialog(null, "Lista de números pares entre 1-100: \r\n" + listaPares, "Resultado", 3);
	}

}
