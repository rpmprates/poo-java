
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condocionais:");
		int idade = 5;
		int quantidadePessoas = 0;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo!!!");
		} else {
			if (quantidadePessoas > 0) {
				System.out.println("Como voc� esta acompanhado pode entrar");
			}else
			System.out.println("Infelimente voc� n�o pode entrar.");
		}
	}

}
