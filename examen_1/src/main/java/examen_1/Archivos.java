package examen_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
	private File archivo;
	private PrintStream ps;

	public Archivos(String rut) {
		String ruta = rut; 
		String nombre = "Inventario"; 
		String extension = ".dat"; 
		try {
			System.setErr(new PrintStream(new FileOutputStream(new File("Errores.log")), true));
		} catch (FileNotFoundException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
		}
		archivo = new File(ruta.concat(nombre.concat(extension)));
	}
	
	public Archivos() {
		
	}
	
	public File getArchivo() {
		return this.archivo;
	}
	
	public String leerConReader(File a) {
		FileReader fr = null;
		BufferedReader br = null;
		String texto = "";
		try {
			fr = new FileReader(a);
			br = new BufferedReader(fr);

			String linea = "";
			while ((linea = br.readLine()) != null) {
				texto += linea.concat("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return texto;
	}
	public void createFilePrintStream(File a) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(a, true);
			ps = new PrintStream(fos); 

		} catch (FileNotFoundException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
		} finally {
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
				}
		}
	}
	
}