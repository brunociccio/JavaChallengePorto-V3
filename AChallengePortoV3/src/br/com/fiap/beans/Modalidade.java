package br.com.fiap.beans;

public class Modalidade {
	// variáveis
	private String mountainBike;
	private String performance;
	private String urbana;
	// vazio
	public Modalidade() {
		super();
	}
	// cheio
	public Modalidade(String mountainBike, String performance, String urbana) {
		super();
		this.mountainBike = mountainBike;
		this.performance = performance;
		this.urbana = urbana;
	}
	// setters and getters
	public String getMountainBike() {
		return mountainBike;
	}
	public void setMountainBike(String mountainBike) {
		this.mountainBike = mountainBike;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public String getUrbana() {
		return urbana;
	}
	public void setUrbana(String urbana) {
		this.urbana = urbana;
	}

}
