package br.com.bytebank.banco.modelos;

public abstract class Conta extends Object{
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {
		
	}

	Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta Destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			Destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero(int novoNumero) {
		if (novoNumero >= 0) {
			this.numero = novoNumero;
		} else {
			System.out.println("N�o � poss�vel criar um n�mero com esses valores");
		}
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setAgencia(int novaAgencia) {
		if (novaAgencia >= 0) {
			this.agencia = novaAgencia;
		} else {
			System.out.println("N�o � poss�vel criar uma ag�ncia com esses valores");
		}
	}
	
	public int getAgencia() {
		return this.agencia;
		
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia || this.numero != outra.numero) {
			return false;
		} else {
			return true;
		}
	}
	
	
}
	

