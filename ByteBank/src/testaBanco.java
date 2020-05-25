
public class testaBanco {
	public static void main(String[] args) {
		Cliente arthur = new Cliente();
		arthur.nome = "Arthur Rubi";
		arthur.CPF = "999.999.999-99";
		arthur.profissao = "programador";
		
		Conta contaDoRubi = new Conta();
		contaDoRubi.deposita(50);
		contaDoRubi.deposita(50);
		System.out.println(contaDoRubi.pegaSaldo());
		contaDoRubi.titular = arthur;
		System.out.println(contaDoRubi.titular.nome);
		
	}
}
