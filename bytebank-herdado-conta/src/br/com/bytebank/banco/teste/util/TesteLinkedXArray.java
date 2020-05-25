package br.com.bytebank.banco.teste.util;
import br.com.bytebank.banco.modelos.*;
import java.util.*;
public class TesteLinkedXArray {
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<>();
		
		ContaCorrente cc = new ContaCorrente(11, 111);
		ContaCorrente cc2 = new ContaCorrente(22, 222);
		ContaCorrente cc3 = new ContaCorrente(33, 333);
		ContaCorrente cc4 = new ContaCorrente(44, 444);
		ContaCorrente cc5 = new ContaCorrente(55, 555);
		
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println(lista.get(3));
		
		System.out.println(lista.size());
		lista.remove(0);
		System.out.println(lista.size());
		
		
	}
}
