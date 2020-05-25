
public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario rubi = new Gerente();
		rubi.setSalario(2500.0);
		
		Funcionario gabriel = new Designer();
		gabriel.setSalario(1500.0);
		
		Funcionario gustavo = new EditorVideo();
		gustavo.setSalario(1250.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(rubi);
		controle.registra(gabriel);
		controle.registra(gustavo);
		System.out.println(controle.getSoma());
		
	}

}
