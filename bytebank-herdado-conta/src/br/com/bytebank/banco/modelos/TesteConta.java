package br.com.bytebank.banco.modelos;
public class TesteConta {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1594, 1111);
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(1111, 1594);
		cp.deposita(200);
		System.out.println(cp.getSaldo());
		
		cc.transfere(50, cp);
		System.out.println("O novo saldo da conta corrente é " + cc.getSaldo());
		System.out.println("O novo saldo da conta poupança é " + cp.getSaldo());
		cc.saca(5);
		System.out.println(cc.getSaldo());
	}
	
	
}
