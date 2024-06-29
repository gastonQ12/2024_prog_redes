package guia1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Tercero {
public void menu() {
	Reader r = new Reader();
	PrintStream ps = new PrintStream(System.out);
	boolean i=false;		
	while (i==false) {
		ps.println("\n1) Escribir dato en .txt \n2) Escribir numeros en un .txt \n3) .txt del 0 al 1000 par \n4) mostrar nums por consola \n5) Borrar impares \n0) salir");
		int aux=Integer.parseInt(r.leer());
		if(aux==1) {ultimoDato();}
		if(aux==2) {ingresarNums();}
		if(aux==3) {ingresarNums2();}
		if(aux==4) {leerDatos(ingresarNums2());}
		if(aux==5) {borrarDatos(ingresarNums2());}
		
		if(aux==0) {i=true;}			
		}
}
//3.A Ingresar dato
public void ultimoDato() {
	Ficheros arch = new Ficheros("dato", ".txt");
	Reader r = new Reader();
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingrese algo: ");
	String aux = r.leer();
    try {PrintWriter pw = new PrintWriter(new FileWriter(arch.getArchivo(), true));
		pw.println(aux);
		pw.close();
	} catch (IOException e) {	e.printStackTrace();
	}}
//3.B Ingresar numeros
public void ingresarNums() {
	Ficheros arch = new Ficheros("datosNum", ".txt");
	Reader r = new Reader();
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingrese un numero: ");
	String aux = r.leer();
	if(esNumero(aux)== true) {
		try {PrintWriter pw = new PrintWriter(new FileWriter(arch.getArchivo(), true));
		pw.println(aux);
		pw.close();
	} catch (IOException e) {e.printStackTrace();}
	}
	else { ps.println("El valor ingresado no es un numero");}
    }
//3.C ingresar numeros 2 xD
public Ficheros ingresarNums2() {
	PrintStream ps = new PrintStream(System.out);
    Ficheros arch = new Ficheros("numeros", ".txt");
	int aux = 1000;
	int i = 0;
	while(i<=aux) {
		if((i%2)==0) {
			try {
				PrintWriter pw = new PrintWriter(new FileWriter(arch.getArchivo(), true));
				pw.println(i);
                pw.close();}
				catch (IOException e) {e.printStackTrace();}
				}i++;}
	return arch ;
	}
//3.D leer .txt
public void leerDatos(Ficheros numeros){
	PrintStream ps = new PrintStream(System.out);
	FileReader fr;
	String linea;
	try {
		fr = new FileReader(numeros.getArchivo());
		BufferedReader br = new BufferedReader(fr);
		try {
			while ((linea = br.readLine()) != null) {
			    ps.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
//3.E borrar impares
public void borrarDatos(Ficheros numeros) {
	Reader r = new Reader();
	PrintStream ps = new PrintStream(System.out);
	FileReader fr;
	String linea;
    List<String> lineas = new ArrayList<>();
	try {fr = new FileReader(numeros.getArchivo());
		BufferedReader br = new BufferedReader(fr);
		try {
			while ((linea = br.readLine()) != null) {
                int num = Integer.parseInt(linea.trim());
			    if(num%2 == 0) {lineas.add(linea);}}
			for (String lineaE : lineas) {
			    PrintWriter pw = new PrintWriter(new FileWriter(numeros.getArchivo(), true));
                pw.println(lineaE);
            }
			
			
			
		} catch (IOException e) {e.printStackTrace();}} catch (FileNotFoundException e) {e.printStackTrace();}
		

}


private static boolean esNumero(String valor){
    return valor != null && valor.matches("[0-9.]+");
     	
 }

}
