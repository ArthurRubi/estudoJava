
public class GerenteTeste {
	public static void main(String[] args) {
		Gerente rubi = new Gerente();
		rubi.setNome("Arthur Rubi");
		rubi.setSalario(2500.00);
		System.out.println(rubi.getNome());
		rubi.setSenha(1594);
		System.out.println(rubi.autentica(1595));
		System.out.println(rubi.getBonificacao());
	}
}
