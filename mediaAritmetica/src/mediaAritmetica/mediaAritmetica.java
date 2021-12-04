package mediaAritmetica;

public class mediaAritmetica {

	public static void main(String[] args) {
		//Média entre 8.9 e 7
		float primeiraMedia = (8.9f + 7f) / 2f;
		System.out.println("A média dos números 8.9 e 7 é:\n" + primeiraMedia);

		//Média entre 4, 5 e 6
		float segundaMedia = (4f + 5f + 6f) / 3f;
		System.out.println("A média dos números 4, 5 e 6 é:\n" + segundaMedia);
		
		//Soma das médias
		float somaDasMedias = primeiraMedia + segundaMedia;
		System.out.println("A soma das médias é:\n" + somaDasMedias);
		
		//Média das médias
		float mediaDasMedias = (primeiraMedia + segundaMedia) / 2;
		System.out.println("A média das médias é:\n" + mediaDasMedias);

	}

}
