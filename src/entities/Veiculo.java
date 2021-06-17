package entities;

public class Veiculo {
	
	private String chassi;
	private String placa;
	
	public Veiculo(String chassi, String placa) {
		this.chassi = chassi;
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "O chassi: "+
	chassi
	+ "placa: "
	+ placa;
	}


}
