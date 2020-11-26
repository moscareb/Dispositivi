package it.jac.corsojava.service;

import java.util.List;

import it.jac.corsojava.bean.Dispositivo;
import it.jac.corsojava.dao.DispositivoDao;

public class ArchivioService {
	//USERA' IL DAO, OPERATIVITA' su un solo DAO --> SINGLETON
	
	public void registraDispositivo(Dispositivo d) {
		
		DispositivoDao dao = DispositivoDao.getInstance();
		dao.aggiungi(d);
	}
	
	public List<Dispositivo> getList() {
		
		return DispositivoDao.getInstance().cerca();
	}
	
	public List<Dispositivo> getpagina(int pag){
		//manca controllo se pag negativa o se supera il numero di pagine che ho
		DispositivoDao dao = DispositivoDao.getInstance();
		List<Dispositivo> fullList =  dao.cerca();
		
		int fromIndex = (pag - 1) * 3;
		int toIndex = Math.min((pag * 3), fullList.size());
		
		return fullList.subList(fromIndex, toIndex);
	}
	
}
