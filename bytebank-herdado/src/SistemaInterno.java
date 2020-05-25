
public class SistemaInterno {
	
	private int senha = 1594;
	
	public void autentica(Autenticavel f) {
		boolean autenticou = f.autentica(this.senha);
		if (autenticou) {
			System.out.println("Senha válida! entrando...");
		} else {
			System.out.println("Senha inválida! acesso negado.");
		}
		
	}
}
