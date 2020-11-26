package it.jac.corsojava.dao;

import java.util.ArrayList;
import java.util.List;

import it.jac.corsojava.bean.Dispositivo;
import it.jac.corsojava.bean.Nas;
import it.jac.corsojava.bean.Notebook;
import it.jac.corsojava.bean.Pc;

public class DispositivoDao {
//	MEMORIZZAZIONE DATI
	private static DispositivoDao instance = new DispositivoDao();
	
	private List<Dispositivo> cache = new ArrayList<>();
	
//	COSTRUTTORE PRIVATO per singleton
	private DispositivoDao() {
		
	}
	
	public static DispositivoDao getInstance() {
		return instance;
	}
	
	public void aggiungi(Dispositivo dispositivo) {
		
		this.cache.add(dispositivo);
	}
	

	public void modifica(Dispositivo dispositivo) {
		
		for(Dispositivo d : this.cache) {
			if(d.getId() == dispositivo.getId()) {
				d.setProcessore(dispositivo.getProcessore());
				d.setRamGB(dispositivo.getRamGB());
				d.setStorageGB(dispositivo.getStorageGB());
				
				if(d instanceof Nas) {
					Nas n1 = (Nas)d;
					Nas n2 = (Nas)dispositivo;
					n1.setNumeroBay(n2.getNumeroBay());
				} else if(d instanceof Pc) {
					Pc pc1 = (Pc)d;
					Pc pc2 = (Pc)dispositivo;
					pc1.setScatola(pc2.getScatola());
				} else if(d instanceof Notebook) {
					Notebook nb1 = (Notebook)d;
					Notebook nb2 = (Notebook)d;
					nb1.setBatteriaAH(nb2.getBatteriaAH());
				}

				break;
			}
		}
	}
	
	public void elimina(Dispositivo dispositivo) {
		
		int pos = -1;
		int i= 0;
		for(Dispositivo d : this.cache) {
			if(d.getId() == dispositivo.getId()) {
				pos = i;
				break;
			}
			i++;
		}
		if(pos > -1) {
			this.cache.remove(pos);
		}
	}
	
	public Dispositivo cerca(int id) {
		
		for(Dispositivo d : this.cache) {
			if(d.getId() == id) {
				return d;
			}
		}
		return null;
	}
	
	public List<Dispositivo> cerca() {
		
		return this.cache;
	}
	
}
