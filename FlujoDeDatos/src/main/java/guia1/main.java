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
		Segundo s = new Segundo();
		Primer p = new Primer();
		boolean i=false;		
		while (i==false) {
			ps.println("\n1) menu ejercicios primer punto \n2) calcular angulos \n3) calcular perimetro \n4) Calcular temperatura \n5) Calcular tiempo \n6) Planes de pago \n7) Zodiaco \n0) salir");
			int aux=Integer.parseInt(entradaDeDatosSTR());
			if(aux==1) {p.menu();}
			if(aux==2) {s.esPar();}
			if(aux==3) {p.calcularPerimetro();}
			if(aux==4) {p.calculartemperatura();}
			if(aux==5) {p.calcularTiempo();}
			if(aux==6) {p.planesPago();}
			if(aux==7) {p.caballerosDeZodiaco();}
			if(aux==0) {i=true;}			
		}
		
		
		
		
	}
	

	

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
