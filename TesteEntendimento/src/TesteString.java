
public class TesteString {
	public static void main(String[] args) {
		String nome = "Alura";
		char caractere = nome.charAt(nome.length() - 1);
		String nova = nome.replace(caractere, 'A');
		System.out.println(nova);
		
		
	}
}
