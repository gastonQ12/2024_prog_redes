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
		Tercero t = new Tercero();
		boolean i=false;		
		while (i==false) {
			ps.println("\n1) menu ejercicios primer punto \n2) menu ejercicios segundo punto \n3) menu ejercicios tercer punto \n0) salir");
			int aux=Integer.parseInt(entradaDeDatosSTR());
			if(aux==1) {p.menu();}
			if(aux==2) {s.menu();}
			if(aux==3) {t.menu();}
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
