package br.com.bytebank.banco.teste.util;
import java.util.*;
import br.com.bytebank.banco.modelos.*;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente contaRubi = new ContaCorrente(11, 222);
		lista.add(contaRubi);
		
		ContaCorrente contaRubi2 = new ContaCorrente(33, 444);
		lista.add(contaRubi2);
		
		ContaCorrente contaPaola = new ContaCorrente(55, 666);
		lista.add(contaPaola);
		
		boolean existe = lista.contains(contaPaola);
		
		if(existe == true) {
			System.out.println("J� existe? Sim");
		} else {
			System.out.println("J� existe? N�o");
		}
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
		
	}

}
