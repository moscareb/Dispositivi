package it.jac.corsojava.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dispositivo {
	
	private static Logger log = LogManager.getLogger(Dispositivo.class);
	
	private int id;
	
	private String processore;
	private int ramGB;
	private int storageGB;
	
	public Dispositivo() {
		
		log.info("Chiamato costruttore Dispositivo");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProcessore() {
		return processore;
	}
	
	public void setProcessore(String processore) {
		this.processore = processore;
	}
	
	public int getRamGB() {
		return ramGB;
	}

	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}

	public int getStorageGB() {
		return storageGB;
	}

	public void setStorageGB(int storageGB) {
		this.storageGB = storageGB;
	}
	
//	TOTALE DELLO STORAGE
	public int getTotaleStorageGB() {
		log.info("Totale del Dispositivo");
		return this.storageGB; 
	}

	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", processore=" + processore + ", ramGB=" + ramGB + ", storageGB=" + storageGB
				+ "]";
	}
	
}
