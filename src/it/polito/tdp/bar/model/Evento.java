package it.polito.tdp.bar.model;

import java.time.Duration;
import java.time.LocalTime;

public class Evento implements Comparable<Evento>{
	
	public enum TipoEvento {
		ARRIVO_GRUPPO_CLIENTI
	}

	private TipoEvento tipo;
	private LocalTime arrivo;
	private int numPersone;
	private Duration durata;
	private float tolleranza;
	
	public Evento(TipoEvento tipo, LocalTime arrivo, int numPersone, Duration durata, float tolleranza) {
		super();
		this.tipo=tipo;
		this.arrivo = arrivo;
		this.numPersone = numPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
	}

	
	public TipoEvento getTipo() {
		return tipo;
	}
	public LocalTime getArrivo() {
		return arrivo;
	}
	public void setArrivo(LocalTime arrivo) {
		this.arrivo = arrivo;
	}
	public int getNumPersone() {
		return numPersone;
	}
	public void setNumPersone(int numPersone) {
		this.numPersone = numPersone;
	}
	public Duration getDurata() {
		return durata;
	}
	public void setDurata(Duration durata) {
		this.durata = durata;
	}
	public float getTolleranza() {
		return tolleranza;
	}
	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}




	@Override
	public int compareTo(Evento arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "Evento [tipo=" + tipo + ", arrivo=" + arrivo + ", numPersone=" + numPersone + ", durata=" + durata.toMinutes()
				+ ", tolleranza=" + tolleranza + "]";
	}
	

}
