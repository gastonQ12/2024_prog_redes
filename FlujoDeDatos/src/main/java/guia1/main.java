package guia1;
import java.io.IOException;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		PrintStream ps = new PrintStream(System.out);
		Primer p = new Primer();
		boolean i=false;		
		while (i==false) {
			ps.println("\n1) Sueldo Bruto \n2) calcular angulos \n3) calcular perimetro \n4) Calcular temperatura \n5) Calcular tiempo \n6) Planes de pago \n7) Zodiaco \n0) salir");
			int aux=Integer.parseInt(entradaDeDatosSTR());
			if(aux==1) {ordenarApellidos();}
			if(aux==2) {p.sumarAngulos();}
			if(aux==3) {p.calcularPerimetro();}
			if(aux==4) {p.calculartemperatura();}
			if(aux==5) {p.calcularTiempo();}
			if(aux==6) {p.planesPago();}
			if(aux==7) {p.caballerosDeZodiaco();}
			if(aux==0) {i=true;}			
		}
		
		
		
		
	}
	
	//2.A ordenar apellidos

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
		List<Float> numeros = new ArrayList<>();
		ps.println("Indique un numero: ");
		float aux = Float.parseFloat(r.leer());
		numeros.add(aux);
		}
		Arrays.toString(numeros);
		String aux2 = "";
		Collection.sort(numeros);
		ps.println("Los numeros se ordenan asi: ");
		for(String apellido:apellidos) {
			aux2 += apellido.concat(", ");}
		ps.println(aux2.substring(0, (aux2.length() - 2)));
		}}}
	
	

	//entrada de datos
	public static String entradaDeDatosSTR(){
		String cadena = "";
		try {
			int Byte = -1;
			while(    (Byte = System.in.read())  != '\n'    ) 
			{
				if( Byte != 13 )
					cadena += (char)Byte;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return cadena;
	}
}
