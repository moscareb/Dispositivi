package it.jac.corsojava.export;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import it.jac.corsojava.bean.Dispositivo;

public class JsonExporter extends BaseExporter {
	
	@Override
	public void export(List<Dispositivo> arr) {
		
		  try {
			  Writer f = new FileWriter("C:\\Users\\rebecca marianna\\eclipse-workspace\\dispositivi\\prova.json");
			  Gson json = new Gson();
			  for(Dispositivo d : arr) {
				  json.toJson(d, f);
			  }
			  f.close();
		  } catch (IOException e) {
			  e.printStackTrace();
		  }
		
		  System.out.println("Done Json");
	}
	
}
