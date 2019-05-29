package it.polito.tdp.bar.model;

public class Tavolo {
	
	private int dimensione;
	private Boolean libero;
	private int numMin;
	
	public Tavolo(int dimensione, Boolean libero, int numMin) {
		super();
		this.dimensione = dimensione;
		this.libero = true;
		this.numMin = dimensione/2;
	}

	public int getDimensione() {
		return dimensione;
	}

	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}

	public Boolean getLibero() {
		return libero;
	}

	public void setLibero(Boolean libero) {
		this.libero = libero;
	}

	public int getNumMin() {
		return numMin;
	}

	
	

}
