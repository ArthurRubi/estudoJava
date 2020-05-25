
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Gerente arthur = new Gerente();
		
		arthur.setName("Arthur");
		String nome = arthur.getNome();
		
		arthur.setSalario(2500.0);
		double salario = arthur.getSalario();
		
		arthur.setSenha(1594);
		
		if (arthur.autentica(1594)) {
		System.out.println(nome);
		System.out.println(salario);
		}
		
	}
}
