package br.com.bytebank.banco.modelos;
public class TesteArrayReferencias {
	public static void main(String[] args) {
	
//		ContaCorrente[] cc = new ContaCorrente[5];
//		ContaCorrente cc1 = new ContaCorrente(1111, 222);
//		cc[0] = cc1;
//		ContaCorrente contaRubi = cc[0];
//		System.out.println(contaRubi.getNumero());
		
		Object[] c = new Object[3];
		
		
		ContaCorrente cc1 = new ContaCorrente(1111, 222);
		c[0] = cc1;
		ContaCorrente contaRubi = (ContaCorrente) c[0];
		
		
		ContaPoupanca cp1 = new ContaPoupanca(456, 1234);
		c[1] = cp1;
		ContaPoupanca contaCliente = (ContaPoupanca) c[1];
		
		
		Cliente arthur = new Cliente();
		arthur.setNome("Arthur");
		c[2] = arthur;
		Cliente arthurBanco = (Cliente) c[2];
		
		
		System.out.println(arthurBanco.getNome());
		System.out.println(contaRubi.getAgencia());
		System.out.println(contaCliente.getAgencia());
		
		
	}
}
