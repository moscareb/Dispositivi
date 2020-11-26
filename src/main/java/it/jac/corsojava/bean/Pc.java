package it.jac.corsojava.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pc extends Dispositivo {

	private static Logger log = LogManager.getLogger(Dispositivo.class);
	
	private String scatola;
	
	public Pc() {
		super(); // richiama del costruttore di default della super classe
		log.info("Chiamato costruttore Pc");
	}

	public String getScatola() {
		return scatola;
	}

	public void setScatola(String scatola) {
		this.scatola = scatola;
	}
	
	@Override 
	public int getTotaleStorageGB() {
		
		log.info("Totale del Pc");
		return this.getStorageGB();
	}
}
