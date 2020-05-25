package br.com.bytebank.banco.modelos;
public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente rubi = new ContaCorrente(1111, 222);
		rubi.deposita(100);
		
		SeguroVida vidaRubi = new SeguroVida();
		
		
		CalculadorDeImposto calculaRubi = new CalculadorDeImposto();
		calculaRubi.registra(vidaRubi);
		calculaRubi.registra(rubi);
		System.out.println(calculaRubi.getTotalImposto());
		
	}
}
