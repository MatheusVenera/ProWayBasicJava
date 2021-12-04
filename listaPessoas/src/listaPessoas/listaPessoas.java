package listaPessoas;

import javax.swing.JOptionPane;

public class listaPessoas {

	public static void main(String[] args) {
		/*
		Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
		a. a maior e a menor altura do grupo;
		b. média de altura dos homens;
		c. o número de mulheres.
		*/
		float altura, sexo, maior=0, menor=0, mediaAltH=0, qtdM=0, soma=0;
		for (int i = 0; i < 10; i++) {
			sexo = Float.parseFloat(JOptionPane.showInputDialog("Digite o sexo da pessoa: (1 - Homem, 2 - Mulher)\n"));
			
			altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da pessoa (cm): \n"));
			if (sexo == 2) {
				qtdM ++;
			} else {
				soma += altura;
			}
			if (maior == 0) {
				maior = altura;
			} else {
				if (altura > maior) {
					maior = altura;
				}
			}
			if (menor == 0) {
				menor = altura;
			} else {
				if (altura < menor) {
					menor = altura;
				}
			}
		}
		mediaAltH = soma / (10 - qtdM);
		
		System.out.println("A maior altura do grupo é " + maior + " e a menor é " + menor + "\n");
		System.out.println("A média de altura dos homens é " + mediaAltH + "\n");
		System.out.println("O número de mulheres é " + qtdM);
		}
	}
