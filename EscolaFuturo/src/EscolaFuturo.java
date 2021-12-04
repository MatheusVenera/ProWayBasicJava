import javax.swing.JOptionPane;

public class EscolaFuturo {

	public static void main(String[] args) {
		/* 
		1 - Informar quantidade de alunos (int)
		2 - Informar quantidade de notas (int)
		3 - Informar nota a nota (double)
		4 - Calcular média do aluno (double)
		5 - Para cada aluno, verificar a situação> (if)
			Se média < 6 - Reprovado
			Se média entre >= 6 e < 7.5 - Em recuperação
			se média >= 7.5 - Aprovado
		6 - Para cada aluno, imprimir nome, média e situação
		7 - No final, imprimir melhor média e a média geral
		*/
		
		//Dados aluno
		String nomeAluno;
		double mediaDoAluno = 0;
		String situacaoAluno;
		double nota;
		
		//Dados gerais
		int qtdAlunos;
		int qtdNotas;
		double melhorMedia = 0;
		double mediaGeral = 0;
		double somaDeTodasAsMedias = 0;
		
		//Informar dados iniciais (quantidade de alunos e notas) para formar os laços
		qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de alunos: \n", "Alunos", 3));
		qtdNotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de notas: \n", "Notas", 3));
		
		//Laço de alunos
		for (int i = 0; i < qtdAlunos; i++) {
			nomeAluno = JOptionPane.showInputDialog(null, "Insira o nome do aluno: \n", "Nome", 3);
			
			//Laço de notas
			for (int j = 0; j < qtdNotas; j++) {
				nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a " + (j+1) + "ª nota do " + nomeAluno, nomeAluno, 3));
				mediaDoAluno += nota / qtdNotas;
			}
			if (mediaDoAluno < 6) {
				situacaoAluno = "Reprovado";
			} else if (mediaDoAluno >= 6 && mediaDoAluno < 7.5) {
				situacaoAluno = "Em recuperação";
			} else {
				situacaoAluno = "Aprovado";
			}
			System.out.println("Nome: " + nomeAluno + "\nMédia: " + mediaDoAluno + "\nSituação: " + situacaoAluno);
			
			somaDeTodasAsMedias += mediaDoAluno;
			if (i == 0) {
				melhorMedia = mediaDoAluno;
			} else {
				if (mediaDoAluno > melhorMedia) {
					melhorMedia = mediaDoAluno;
				} 

				}
			mediaDoAluno = 0;
			}
			
		mediaGeral = somaDeTodasAsMedias / qtdAlunos;
			System.out.println("Melhor média da turma: " + melhorMedia + "\nMédia da turma: "+ mediaGeral);

		}
	}

