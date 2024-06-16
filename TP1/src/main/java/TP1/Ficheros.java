package TP1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ficheros {


	File archivo;
	PrintStream ps = new PrintStream(System.out);
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	
	
	
public String entradaDeDatos(){
	
	String cadena="";
	
	int Byte = -1;
	try {
		while( (Byte = System.in.read())!= '\n') {
			
			if(Byte != 13)
				cadena +=(char)Byte;
			
			
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	return cadena;
}
public File getArchivo() {
	return archivo;
}
public String isrEntrada() {
	
	try {
		return br.readLine();
	} catch (IOException e) {

		e.printStackTrace();
	}
	
	return null;
}
	
}
