
package br.com.bytebank.banco.modelos;///bytebank-herdado-conta/src/Teste.java
public class TesteArray {

	public static void main(String[] args) {

		int idades[] = new int[5];

		int index = 0;

		for (int v = 16; v <= 16 + 4; v++) {
			idades[index] = v;
			index++;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
			
	}
}

//		for(int i = 0; i < idades.length; i++) {			
//			idades[i] = i;
//			for(int v = 16; v < 16 + 5; v++) {
//				complemento = v;
//					if(v == 20) {
//						
//					}
//			}
//				idades[i] = complemento;
//				System.out.println(idades[i]);
//			}
// 16
// 17
// 18
// 19
// 20
