package it.jac.corsojava.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Notebook extends Dispositivo {

	private static Logger log = LogManager.getLogger(Dispositivo.class);
	
	private int batteriaAH;
	
	public Notebook() {
		super(); // richiama del costruttore di default della super classe
		log.info("Chiamato costruttore Notebook");
	}

	public int getBatteriaAH() {
		return batteriaAH;
	}

	public void setBatteriaAH(int batteria) {
		this.batteriaAH = batteria;
	}
	
	@Override
	public int getTotaleStorageGB() {
		log.info("Totale del Notebook");
		return this.getStorageGB();
	}
}
