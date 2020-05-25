
public class FuncionarioTeste {
	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; //0 - Funcionário, 1 - Gerente, 2 - Diretor.
	
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public FuncionarioTeste(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
			if (tipo == 0) {
				System.out.println("Funcionário " + nome);
			} else if (tipo == 1) {
				System.out.println("Gerente" + nome);
			} else {
				System.out.println("Diretor " + nome);
			}
	}
	
	public double getBonificacao() {
		if (this.tipo == 0) {
			return this.salario * 0.1;
		} else if (this.tipo == 1) {
			return this.salario;
		} else {
			return this.salario + 1000;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
