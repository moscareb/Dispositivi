package it.jac.corsojava.export;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONValue;

import it.jac.corsojava.bean.Dispositivo;

public class JsonExporter extends BaseExporter {
	
	@Override
	public void export(List<Dispositivo> arr) {
		
		  String jsonText = JSONValue.toJSONString(arr);  
		  System.out.print(jsonText);  
		
	}
	
}
