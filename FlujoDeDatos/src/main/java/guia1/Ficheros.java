package guia1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros {
	private File archivo = new File( "texto.txt" );
	private PrintStream ps;

	public Ficheros(String name, String ext) {
		String ruta = "C:\\archJava\\";
		String nombre = name;
		String extension = ext;
		try {
			System.setErr(new PrintStream(new FileOutputStream(new File("Errores.log")), true));
		} catch (FileNotFoundException e) {
			e.printStackTrace();}		
		archivo = new File(ruta.concat(nombre.concat(extension)));
	}

	public File getArchivo() {
		return this.archivo;
	}

}
