package mediaAritmetica;

public class mediaAritmetica {

	public static void main(String[] args) {
		//M�dia entre 8.9 e 7
		float primeiraMedia = (8.9f + 7f) / 2f;
		System.out.println("A m�dia dos n�meros 8.9 e 7 �:\n" + primeiraMedia);

		//M�dia entre 4, 5 e 6
		float segundaMedia = (4f + 5f + 6f) / 3f;
		System.out.println("A m�dia dos n�meros 4, 5 e 6 �:\n" + segundaMedia);
		
		//Soma das m�dias
		float somaDasMedias = primeiraMedia + segundaMedia;
		System.out.println("A soma das m�dias �:\n" + somaDasMedias);
		
		//M�dia das m�dias
		float mediaDasMedias = (primeiraMedia + segundaMedia) / 2;
		System.out.println("A m�dia das m�dias �:\n" + mediaDasMedias);

	}

}
