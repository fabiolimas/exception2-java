package model.entities;

import model.entitiesdominio.DomainException;

public class Conta {
	
	private int numero;
	private String cliente;
	private double saldo;
	private double limite;
	
	public Conta(int numero, String cliente, double saldo, double limite) {
		
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void deposito(double valor) {
		
		saldo+=valor;
	}
	public void saque(double valor) {
		
		if(saldo < valor) {
			throw new DomainException("Não há saldo suficiente para saque");
		}
		if(limite<valor) {
			throw new DomainException("O saque Excede o limite");
		}
		
		saldo-=valor;
	}

}
