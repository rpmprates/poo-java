
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println(" A primeita conta tem saldo de " + primeiraConta.saldo + " reais");
		System.out.println(" A segunda conta tem saldo de " + segundaConta.saldo + " reais");
		
		
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.numero);
	}

}
