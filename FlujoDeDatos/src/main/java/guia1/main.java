package guia1;
import java.io.IOException;
import java.io.PrintStream;

public class main {
	public static void main(String[] args) {
		PrintStream ps = new PrintStream(System.out);
		boolean i=false;		
		while (i==false) {
			ps.println("1) Sueldo Bruto \n2) calcular angulos \n3) calcular temperatura \n4) Calcular tiempo \n5) salir");
			int aux=Integer.parseInt(entradaDeDatosSTR());
			if(aux==1) {calcularSueldoBruto();}
			if(aux==2) {sumarAngulos();}
			if(aux==3) {calcularSueldoBruto();}
			if(aux==4) {calcularSueldoBruto();}
			if(aux==5) {i=true;}			
		}
	}

	public static void calcularSueldoBruto(){
		PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese las horas trabajadas:");
		Float h = Float.parseFloat(entradaDeDatosSTR());
		ps.println("Ingrese el ingreso x hora:");
		float p = Float.parseFloat(entradaDeDatosSTR());
		float sueldo=h*p;		
		ps.printf("El sueldo en bruto es: %.2f $", sueldo);
	}

	public static void sumarAngulos() {
		PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese el valor del primer angulo:");
		int a1 = Integer.parseInt(entradaDeDatosSTR());
		ps.println("Ingrese el valor del segundo angulo:");
		int a2 = Integer.parseInt(entradaDeDatosSTR());
		int resto=180 - (a1 + a2) ;		
		ps.printf("El resto es de: %d� \n", resto);
	}
	public static void Calculartemperatura() {
		PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese el valor del primer angulo:");
		int gf = Integer.parseInt(entradaDeDatosSTR());
		int gc=
		ps.printf("El resto es de: %d� \n", resto);
	}
	
	
	
	
	
	
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
