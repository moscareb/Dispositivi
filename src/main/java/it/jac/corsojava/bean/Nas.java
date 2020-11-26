package it.jac.corsojava.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Nas extends Dispositivo {
	//eredito da dispositivo
	private static Logger log = LogManager.getLogger(Dispositivo.class);
	
	private int numeroBay;
	
	public Nas() {
		super(); // richiama del costruttore di default della super classe
		log.info("Chiamato costruttore Nas");
	}

	public int getNumeroBay() {
		return numeroBay;
	}

	public void setNumeroBay(int numeroBay) {
		this.numeroBay = numeroBay;
	}
	
	@Override //SOVRASCRIVO il metodo della super classe
	public int getTotaleStorageGB() {
		//con super. faccio riferimeno al metodo della super classe
		log.info("Totale del Nas");
		return this.getStorageGB() * this.numeroBay;
	}
	
}
