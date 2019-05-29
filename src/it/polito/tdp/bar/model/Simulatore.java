package it.polito.tdp.bar.model;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

import it.polito.tdp.bar.model.Evento.TipoEvento;

public class Simulatore {

	//coda eventi
	private PriorityQueue<Evento> queue= new PriorityQueue<>();
	
	//modello del mondo
	private List<Tavolo> tavoli;
	
	//parametri di simulazione
	private LocalTime T_inizio = LocalTime.of(8, 0);
	
	
	
	//statistiche da calcolare
	private int numTotC;
	private int numSoddisfatti;
	private int numInsoddisfatti;
	
	//variabili interne
	private Random rand= new Random();
	private LocalTime oraArrivo;
	
	
	public void init() {
		this.queue.clear();
		
		Evento e= new Evento(TipoEvento.ARRIVO_GRUPPO_CLIENTI, T_inizio, rand.nextInt(10)+1, Duration.ofMinutes((long)(rand.nextInt(60)+60)), rand.nextFloat());
		queue.add(e);
		oraArrivo= T_inizio.plus(Duration.ofMinutes((long)(rand.nextInt(10)+1)));
		System.out.println(e);
		
	}
	
	public void run() {
		
		for(int i=1; i<2000; i++) {
			
			Evento e= new Evento(TipoEvento.ARRIVO_GRUPPO_CLIENTI, oraArrivo, rand.nextInt(10)+1, Duration.ofMinutes((long)(rand.nextInt(60)+60)), rand.nextFloat());
			queue.add(e);
			oraArrivo=oraArrivo.plus(Duration.ofMinutes((long)(rand.nextInt(10)+1)));
			System.out.println(e);
			System.out.println(i);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
