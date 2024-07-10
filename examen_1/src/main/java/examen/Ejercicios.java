package examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicios {
	static Ficheros f = new Ficheros();
	static ArrayList<String> registros = new ArrayList<String>();

	
	//Borra el registro y devuelve el ArrayList nuevo
public ArrayList borrarRegistro(File arch) {
	registros = f.leerArchivo(arch);
	f.ps.println(registros);
	f.ps.println("Ingrese el indice del elemento quiere eliminar: ");
	int aux = Integer.parseInt(f.leer());
	registros.remove(aux);
	return registros;
	
}

	public void arregloArchivo(File original)
	{
		Ficheros f = new Ficheros();
		File copia = new File("copia.tmp");
		FileReader Fr = null;
		BufferedReader Br = null;
		FileWriter Fw = null;
		PrintWriter Pw = null;
		
		try {
			if( !original.exists() )
				f.createFilePrintStream(f.getArchivo());
				
			Fr = new FileReader(original);
			Br = new BufferedReader(Fr);
			
			if( !copia.exists() )
			{
				Fw = new FileWriter(copia , true);
				Pw = new PrintWriter( Fw );
				
				int contador = 0;
				String renglon = "";
				while(   (renglon=Br.readLine()) != null   )
				{
					
					
					renglon = renglon.replace(".",";"); 
					Pw.println(renglon);
				}
				Pw.close();
				Fw.close();
			}
			Br.close();
			Fr.close();
			
			if( original.exists() )
				original.delete();
			
			if( copia.exists() )
				copia.renameTo( original );
			
		} catch(FileNotFoundException e){
			Logger.getLogger( Ficheros.class.getName() ).log(Level.WARNING , null , e ) ;
		} catch (IOException e) {
			Logger.getLogger( Ficheros.class.getName() ).log(Level.WARNING , null , e ) ;
		}finally {
			
		}
		
	}
		
	
}
