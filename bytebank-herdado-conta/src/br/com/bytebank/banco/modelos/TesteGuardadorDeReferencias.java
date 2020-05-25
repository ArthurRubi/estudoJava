package br.com.bytebank.banco.modelos;
public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		ContaCorrente contaRubi = new ContaCorrente(22, 1111);
		guardador.adiciona(contaRubi);
		
		ContaCorrente contaRubao = new ContaCorrente(11, 2222);
		guardador.adiciona(contaRubao);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getAgencia());
		
	}
}
