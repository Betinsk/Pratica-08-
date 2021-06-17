package exercicio2;

public class PessoaFisica extends Pessoa {

	String cpf;

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "PessoaFisica = " + nome + "\nCpf = " + cpf+ "\n";
	}
	
	
	
}
