package examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

	public static void main(String[] args) {

		// guardar archivos, falto la adaptacion al proyecto final 
		Ficheros f = new Ficheros();
		File arch = f.getArchivo();
		Ejercicios ej = new Ejercicios();
		ArrayList<String> r = new ArrayList<String>();
		
		
		ej.arregloArchivo(arch);
		r = ej.borrarRegistro(arch);
		f.ps.println(r);
		f.guardar(arch, r);
		f.leerArchivo(arch);
		try {
			FileReader fr = new FileReader(arch);
			BufferedReader br = new BufferedReader(fr);
			String cadena= "";
			
			try {
				cadena = br.readLine();
			} catch (IOException e) {
				Logger.getLogger( Ficheros.class.getName() ).log(Level.WARNING , null , e ) ;
			}
		} catch (FileNotFoundException e) {
			Logger.getLogger( Ficheros.class.getName() ).log(Level.WARNING , null , e ) ;
		}
		
		
		
	}
}
