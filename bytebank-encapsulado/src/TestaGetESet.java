
public class TestaGetESet {
	public static void main(String[] args) {
		Conta contaRubi = new Conta(224695, 2278);
		
		System.out.println(contaRubi.getNumero());
		System.out.println(contaRubi.getAgencia());
		
		Cliente rubi = new Cliente();
		rubi.setNome("Arthur Rubi");
		rubi.setProfissao("Programador");
		
		contaRubi.setTitular(rubi);
		System.out.println(contaRubi.getTitular().getNome());
		System.out.println(contaRubi.getTitular().getProfissao());
		System.out.println(Conta.getTotal());
	}
}
