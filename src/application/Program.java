package application;

import java.util.Scanner;

import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos veiculos deseja cadastrar? ");
		int N = sc.nextInt();
		
		Veiculo [] vet = new Veiculo [N];
		
		for(int i =0;i<N;i++) {
			System.out.println("Veiculo "+ i+1);
			System.out.println("Digite o número do chassi: ");
			String chassi = sc.next();
			System.out.println("Digite o número da placa: ");
			String placa = sc.next();
			vet[i] = new Veiculo(chassi, placa);
		}
		
		for(Veiculo i : vet) {
			System.out.println("Veiculo "+ i);
			
		}
		
		sc.close();
		
	}

}
