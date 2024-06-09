package guia1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Segundo {
	
public static void ordenarApellidos(){
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	String aux = "";
	String aux2 = "";
	List<String> apellidos = new LinkedList<String>();
	for(int i=0;i<=2;i++) {
		ps.println("Ingrese un apellido: ");
		aux = r.leer();
		apellidos.add(aux);
	}Collections.sort(apellidos);
	ps.println("Los apellidos se ordenan asi: ");
	for(String apellido:apellidos) {
		aux2 += apellido.concat(", ");}
	ps.println(aux2.substring(0, (aux2.length() - 2)));
}

//2.B sacar menor

public static void sacarMenor() {
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	List<String> numeros = new ArrayList<>();
	ps.println("Indique un numero: ");
	String aux = r.leer();
	numeros.add(aux);
	Collections.sort(numeros);
	String aux2 = "";
	Collection.sort(numeros);
	ps.println("Los numeros se ordenan asi: ");
	for(String numero:numeros) {
		aux2 += numeros.concat(", ");}
	ps.println(aux2.substring(0, (aux2.length() - 2)));
}
}
