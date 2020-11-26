package it.jac.corsojava;

import java.util.ArrayList;
import java.util.List;

import it.jac.corsojava.bean.Dispositivo;
import it.jac.corsojava.bean.Nas;
import it.jac.corsojava.bean.Notebook;
import it.jac.corsojava.bean.Pc;
import it.jac.corsojava.dao.DispositivoDao;
import it.jac.corsojava.export.BaseExporter;
import it.jac.corsojava.export.ExcelExporter;
import it.jac.corsojava.export.JsonExporter;

public class MainDispositivi {

	public static void main(String[] args) {
		
		Dispositivo d = new Dispositivo();
		List<Dispositivo> lista = new ArrayList<>();
		
		d.setProcessore("intel i7");
		d.setRamGB(16);
		d.setStorageGB(500);
		System.out.println(d.getTotaleStorageGB());

		Dispositivo n = new Nas(); //UPCASTING: istanzio classe derivata ma di tipo Dispositivo
		
		n.setProcessore("nas-1");
		n.setRamGB(4);
		n.setStorageGB(500);
		((Nas) n).setNumeroBay(2); //cast della classe derivata
		System.out.println(n.getTotaleStorageGB());
		
		Dispositivo pc = new Pc();
		
		pc.setProcessore("intel core");
		pc.setRamGB(16);
		pc.setStorageGB(500);
		((Pc) pc).setScatola(" ");
		System.out.println(pc.getTotaleStorageGB());
		
		Dispositivo nb = new Notebook();
		
		nb.setProcessore("intel i5");
		nb.setRamGB(8);
		nb.setStorageGB(500);
		((Notebook) nb).setBatteriaAH(4000);
		System.out.println(nb.getTotaleStorageGB());
		
		BaseExporter exporter = new ExcelExporter();
		lista.add(d);
		lista.add(n);
		lista.add(pc);
		lista.add(nb);
		
		exporter.export(lista);
		
	}

}
