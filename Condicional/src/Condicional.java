import javax.swing.JOptionPane;

public class Condicional {

	public static void main(String[] args) {

		int idade = 15;
		//Comando condicional Simples
		if (idade < 18) {
			System.out.println("Di Menó");
		}
		//Comando condicional composto com "ELSE"
		idade = 22;
		if(idade < 18) {
			System.out.println("Di Menó");
		} else {
			System.out.println("Di maió");
		}
		
		//Comando condicional composto com ELSE IF
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		
		if(idade < 18) {
			System.out.println("Di Menó");
		} else if (idade >= 18 && idade <= 44){
			System.out.println("Di maió");
		} else {
			System.out.println("É sinho");
		}
		
	}
}
