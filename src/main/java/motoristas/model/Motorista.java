package motoristas.model;

import java.util.Optional;
import java.util.Set;

public class Motorista {

	private Long cnh;
	private String nome;
	private Set<Carro> carros;
	
	public Motorista(Long cnh, String nome) {
		this.cnh = cnh;
		this.nome = nome;
	}
	public Long getCnh() {
		return cnh;
	}
	public void setCnh(Long cnh) {
		this.cnh = cnh;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Optional<Set<Carro>> getCarros() {
		return Optional.ofNullable(carros);
	}
	public void setCarros(Set<Carro> carros) {
		this.carros = carros;
	}
	
	@Override
	public String toString() {
		return "Motorista [cnh=" + cnh + ", nome=" + nome + "]";
	}
	
	
}
