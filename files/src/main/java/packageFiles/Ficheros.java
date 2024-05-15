package packageFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ficheros {

	private File archivo;
	private PrintStream ps;
	public Ficheros() {
		
    archivo = new File("c:\\User\\mario.txt");
		
	}
	public void crearFilePrintStream(File a){
		
		FileOutputStream fos = null;
		ps = new PrintStream(fos, true);
		
		ps.println("Hello World!");
		ps.flush();
		try {
			fos = new FileOutputStream(a);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}
