import javax.swing.JOptionPane;

public class UsoSwitch {

	public static void main(String[] args) {
		int opcao;
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o: \n"));
		
		//switch = opcao
		
		switch (opcao) {
		case 1: {
			
			System.out.println("Inclus�o");
			break;
		}
		case 2: {
			
			System.out.println("Altera��o");
			break;
		}
		case 3: {
			
			System.out.println("Exclus�o");
			break;
		}
		case 4: {
			
			System.out.println("Consulta");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida", "ATEN��O", 0);
		}
		
	}

}
