package examen_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

	public static void main(String[] args) {
		Ejercicios ej = new Ejercicios();
		File arch = new File("C:\\\\archJava\\\\datos.dat");
		ej.arregloArchivo(arch);
		Menu(arch);
	
				Ficheros f = new Ficheros();
				
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
	
	private static void Menu(File archivo) {
		PrintStream ps = new PrintStream(System.out);
		Ejercicios Ej = new Ejercicios();

		int op = 1;
		String numeroCadena = null;
		String numCadenaVerificada = null;

		while (op != 0) {
			ps.println(Utils.ANSI_GREEN +"Opciones: " + Utils.ANSI_RESET);
			ps.println(Utils.ANSI_BLUE + "1"+ Utils.ANSI_RESET +"-Eliminar dato");
			ps.println(Utils.ANSI_BLUE + "2"+ Utils.ANSI_RESET +"-Mostrar Datos");
			ps.println(Utils.ANSI_BLUE + "3"+ Utils.ANSI_RESET +"-");
			ps.println(Utils.ANSI_BLUE + "4"+ Utils.ANSI_RESET +"-");
			ps.println(Utils.ANSI_BLUE + "0"+ Utils.ANSI_RESET +"-Salir");
			
			String leer = entradaDeDatos();

			op = Integer.parseInt(leer);
						
			switch (op) {
			case (1): Ej.borrarRegistro(archivo);
				break;
			case(2):
				Ej.mostrarDatos(archivo);
			}
			
		}
	}
	public static String entradaDeDatos() {
		String cadena = "";
		try {
			int Byte = -1;
			while ((Byte = System.in.read()) != '\n') {
				if (Byte != 13) {
					cadena += (char) Byte;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cadena;
	}

		
}
