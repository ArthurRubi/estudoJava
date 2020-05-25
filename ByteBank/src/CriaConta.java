
public class CriaConta {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;

		Conta segundaConta = new Conta();
		segundaConta.saldo = 1000;

		Conta terceiraConta = segundaConta;

		System.out.println("a primeira conta tem: R$" + primeiraConta.saldo);
		System.out.println("a segunda conta tem : R$" + segundaConta.saldo);
		System.out.println("a terceira conta tem: R$" + terceiraConta.saldo);
		System.out.println();

		if (primeiraConta.saldo == segundaConta.saldo) {
			System.out.println("A 1�a e a 2�a conta s�o a mesma conta!");
		} else {
			System.out.println("A 1�a e a 2�a conta s�o contas diferentes!");
		}
		
		if (segundaConta == terceiraConta) {
			System.out.println("A 2�a e a 3�a conta s�o a mesma conta!");
		} else {
			System.out.println("A 2�a e a 3�a conta s�o contas diferentes!");
		}

		System.out.println();
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println(terceiraConta);
		System.out.println();
		
		Conta contaDoTots = new Conta();
		contaDoTots.saldo = 15;
		System.out.println("O saldo do Heitor � " + contaDoTots.saldo);
		contaDoTots.deposita(10);
		System.out.println("Ap�s o dep�sito, o saldo do Heitor � " + contaDoTots.saldo);
		System.out.println();

		boolean consegueRetirar = contaDoTots.saca(15);
		System.out.println(consegueRetirar);
		
		contaDoTots.saca(15);
		System.out.println(contaDoTots.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(20);
		System.out.println();
		System.out.println("O saldo inicial de Marcela � " + contaDaMarcela.saldo);
		contaDaMarcela.transfere(10, contaDoTots);
		System.out.println("O saldo atual de Marcela � " + contaDaMarcela.saldo);
		System.out.println();
		
		System.out.println("Ap�s a transfer�ncia, o saldo do Tots � " + contaDoTots.saldo);
		consegueRetirar = contaDoTots.saca(20);
		System.out.println(consegueRetirar);
		System.out.println("Ap�s o saque, o saldo de Tots � " + contaDoTots.saldo);
		
		
	}
}
