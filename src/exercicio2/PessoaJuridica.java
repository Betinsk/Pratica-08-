package exercicio2;

public class PessoaJuridica extends Pessoa {

		String cnpj;

		public PessoaJuridica(String nome, String cnpj) {
			super(nome);
			this.cnpj = cnpj;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

	
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		@Override
		public String toString() {
			return "PessoaJuridica = " + nome + "\nCnpj = " + cnpj;
		}
}
