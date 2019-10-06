package program;

import java.util.Scanner;

import model.entities.Conta;
import model.entitiesdominio.DomainException;

public class Aplication {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
			System.out.println("Dados da conta");
			System.out.print("Numero: ");
			int numero=sc.nextInt();
			System.out.print("Cliente: ");
			String cliente=sc.next();
			System.out.print("Saldo da conta: ");
			double saldo=sc.nextDouble();
			System.out.println("Limite de saque: ");
			double limite=sc.nextDouble();
			
			Conta conta=new Conta(numero, cliente, saldo, limite);
			System.out.print("Valor do saque: ");
			double valor=sc.nextDouble();
			
			try {
				conta.saque(valor);
				System.out.println("Saldo atualizado "+String.format("%.2f", conta.getSaldo()));
			}catch(DomainException e) {
				System.out.println("Erro: "+e.getMessage());
			}
			
		
		
		
		
		
		sc.close();

	}

}
