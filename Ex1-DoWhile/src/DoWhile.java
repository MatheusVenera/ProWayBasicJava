import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 * 1 - Incluir
		 * 2 - Alterar
		 * 3 - Excluir
		 * 4 - Consultar
		 * 9 - Sair
		 */
		int opcao;
		do {
			System.out.println("MENU PRINCIPAL");
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n"));
			switch (opcao) {
			case 1: {
				System.out.println("Menu incluir");
				break;
			} 
			case 2: {
				System.out.println("Menu alterar");
				break;
			}
			case 3: {
				System.out.println("Menu excluir");
				break;
			}
			case 4: {
				System.out.println("Menu Consultar");
				break;
			}
			case 9: {
				System.out.println("Saindo do programa");
				break;
			}
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 9);
	}

}
