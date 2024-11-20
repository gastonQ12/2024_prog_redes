package modulo4;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.io.PrintStream;
import java.util.ArrayList;

public class Colegio {
	static PrintStream ps = new PrintStream(System.out);
	Map<String, String> alumnos = new LinkedHashMap<String, String>();
	
	public Colegio() {
		
	}
	
	public void addAlumno(String apellido, String nacionalidad) {
		alumnos.put(apellido, nacionalidad);
		ps.println("Alumno insertado.");
	}
	
	public void showAll() {
		for(Map.Entry<String, String> item : alumnos.entrySet()) {
			ps.println("Nacionalidad: " + item.getValue() + " Apellido: " + item.getKey());
		}
	}
	
	public void showNacionalidad(String nacionalidad) {
		if(alumnos.containsValue(nacionalidad)) {
			Iterator element = alumnos.keySet().iterator();
			int contador = 0;
	        while( element.hasNext() )
	        {
	        	String key   = (String)element.next();    	
	        	String value = alumnos.get( key );
	        	if(value.equalsIgnoreCase(nacionalidad)) {
	        		contador++;
	        	}
	        }
	        ps.print("Nacionalidad: " + nacionalidad);
	        ps.println(" - Cantidad de alumnos: " + contador);
		}else {
			ps.println("La nacionalidad no existe.");
		}
	}
	
	public void cuantos() {
		Iterator element = alumnos.keySet().iterator();
		String valorAnterior = "";
		ArrayList<String> nacs = new ArrayList<String>();
        while( element.hasNext() )
        {
        	String key   = (String)element.next();    	
        	String value = alumnos.get( key );
        	if(!(value.equalsIgnoreCase(valorAnterior))) {
        		nacs.add(value);
        		valorAnterior = value;
        	}
        }
        
        ps.println("Nacionalidades distintas: " + nacs.size());
        for(String n : nacs) {
        	ps.println(n);
        }
	}
	
	public void borra() {
		alumnos.clear();
		ps.println("Se borraron todos los datos.");
	}
}
