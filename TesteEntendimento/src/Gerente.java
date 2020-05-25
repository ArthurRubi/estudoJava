
public class Gerente extends Funcionario implements Autenticacao {
	int senha;

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso liberado!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
}
