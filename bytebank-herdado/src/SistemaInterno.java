
public class SistemaInterno {
	
	private int senha = 1594;
	
	public void autentica(Autenticavel f) {
		boolean autenticou = f.autentica(this.senha);
		if (autenticou) {
			System.out.println("Senha v�lida! entrando...");
		} else {
			System.out.println("Senha inv�lida! acesso negado.");
		}
		
	}
}
