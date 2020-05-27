package motoristas.model;

import java.util.Optional;

public class Carro {

	private String placa;
	private String modelo;
	private Seguro seguro;
	
	public Carro(String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Optional<Seguro> getSeguro() {
		return Optional.ofNullable(seguro);
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	
	
}
