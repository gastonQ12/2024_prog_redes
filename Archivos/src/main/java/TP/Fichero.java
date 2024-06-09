package TP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Fichero {

	private File archivo;
	private PrintStream ps;
	public Fichero (String ruta, String nombre, String extencion) {
		String datosArch = ruta.concat(nombre.concat(extencion));
		archivo = new File(datosArch);
		
	}

	public File getArchivo() {
		return archivo;
	}

	public void guardar(File a, Producto p) {
		
		try {
			if(!a.exists()) {
				try {
					a.createNewFile();
					FileOutputStream fosA = new FileOutputStream(a,true);
					ps = new PrintStream(fosA);
					ps.println(p.mostrarDatos());
					ps.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else {
			FileOutputStream fosA = new FileOutputStream(a,false);
			ps = new PrintStream(fosA);
			ps.println(p.mostrarDatos());
			ps.flush();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}
	
	
	
}
