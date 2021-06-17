package exercicio2Application;

import java.util.Scanner;

import exercicio2.PessoaFisica;
import exercicio2.PessoaJuridica;

public class Cadastro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1 para pessoa física ou 2 para jurídica: ");
		int cpfOuCnpj = sc.nextInt();
		System.out.println("Quantas pessoas deseja cadastrar? ");
		int N = sc.nextInt();
		
		
		if(cpfOuCnpj == 1) {
			PessoaFisica vet [] = new PessoaFisica [N];
			for(int i =0;i<N;i++) {
			System.out.println("Pessoa "+ (i+1));
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o cpf: ");
			String cpf = sc.next();
			vet[i] = new PessoaFisica(nome, cpf);
			System.out.println();
			System.out.println(vet[i]);
			}
		}
		
		if (cpfOuCnpj == 2) {
			PessoaJuridica vetJ [] = new PessoaJuridica[N];
			for(int i =0;i<N;i++) {
			System.out.println("Pessoa "+ (i+1));
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o cnpj: ");
			String cnpj = sc.next();
			vetJ[i] = new PessoaJuridica(nome, cnpj);
			System.out.println();
			System.out.println(vetJ[i]);
		}
	}
		
		sc.close();

	}

}
