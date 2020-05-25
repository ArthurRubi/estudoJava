
public class TesteSistema {
	public static void main(String[] args) {
		Gerente rubi = new Gerente();
		rubi.setSenha(1594);
		
		Administrador rubi2 = new Administrador();
		rubi2.setSenha(2345);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(rubi);
		si.autentica(rubi2);
		
	}
}
