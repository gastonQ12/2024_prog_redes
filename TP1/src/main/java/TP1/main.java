package TP1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		Archivo a = new Archivo("C:\\archJava\\","datos", ".txt");
		Archivo resultados = new Archivo("C:\\archJava\\","resultados", ".txt");
		Archivo error = new Archivo("C:\\archJava\\","error", ".txt");
		Ficheros f = new Ficheros();
		ArrayList<Double> array = new ArrayList(almacenarNumeros(f));
		almacenarNumerosFile(f, a ,array);
		cuenta(array, resultados, error, f);
	}

	
	public static ArrayList<Double> almacenarNumeros(Ficheros f) {
		ArrayList<Double> array = new ArrayList();
		Double aux;
		for(int i=0; i<=4;i++) {
			aux = Double.parseDouble(f.entradaDeDatos());
			array.add(aux);}
		for(int i=0; i<=4;i++){
			f.ps.println(array.get(i));}
		return array;
	}
	public static void almacenarNumerosFile(Ficheros f, Archivo a, ArrayList<Double> lista) {
		for( double i = 0; i>=lista.size();i++){
			int c = (int) i;
			a.guardar(a.getArchivo(), String.valueOf(lista.get(c)));
		}
	}
	public static void cuenta(ArrayList<Double> lista, Archivo resultados, Archivo error, Ficheros f) {
		double aux2 = 0;
		Iterator<Double> iter = lista.iterator();
				for( double i = 0; i<=lista.size();i++) {
				int c = (int) i;
				try{aux2 = lista.get(c)/(lista.get(c+1)-3);}
				 
				catch (IndexOutOfBoundsException e) {
		            error.guardar(error.getArchivo(), e.getMessage());
				}
				finally{
					i=lista.size();
				}
				String str = String.valueOf(lista.get(c)).concat(" / ").concat(String.valueOf(lista.get(c+1)-3)).concat("=").concat(String.valueOf(aux2));
				resultados.guardar(resultados.getArchivo(), str);
				iter.next();
			
		}
	     f.ps.print("falta un dato pibe");
		
	}


}
