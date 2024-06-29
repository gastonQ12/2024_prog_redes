package guia1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Segundo {
	
	
public void menu() {
	Reader r = new Reader();
	PrintStream ps = new PrintStream(System.out);
	boolean i=false;		
	while (i==false) {
		ps.println("\n1) Ordenar apellidos \n2) Sacar numero menor \n3) Par o impar \n4) division de dos numeros reales \n5) calcular zodiaco \n6) Apeliido mas largo \n7) Tabla de mucltiplicar \n8) Saber si es primo \n0) salir");
		int aux=Integer.parseInt(r.leer());
		if(aux==1) {ordenarApellidos();}
		if(aux==2) {sacarMenor();}
		if(aux==3) {esPar();}
		if(aux==4) {dividirXmenor();}
		if(aux==5) {BuscarZodiaco();}
		if(aux==6) {bestoApellido();}
		if(aux==7) {tablaMultipicar();}
		if(aux==8) {ps.println(esPrimo());}
		if(aux==0) {i=true;}			
	}
	
	
}
// 2.A ordenar apellidos
public void ordenarApellidos(){
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
public void sacarMenor() {
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	List<String> numeros = new ArrayList<>();
	ps.println("Indique un numero: ");
	String aux = r.leer();
	numeros.add(aux);
	Collections.sort(numeros);
	String aux2 = "";
	Collections.sort(numeros);
	ps.println("Los numeros se ordenan asi: ");
	for(String numero:numeros) {
		aux2 += numero.concat(", ");}
	ps.println(aux2.substring(0, (aux2.length() - 2)));
}
//2.C par o impar
public void esPar(){
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	ps.println("Ingrese un numero: ");
	float aux = Float.parseFloat(r.leer());
	if( (aux%2)==0 ) {
		ps.println("es Par");
	}if( (aux%2)!=0 ) {
		ps.println("es impar");
	}
}
//2.D division
public void dividirXmenor() {
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	ps.println("Ingrese un numero: ");
	float aux = Float.parseFloat(r.leer());
	ps.println("Ingrese un numero: ");
	float aux2 = Float.parseFloat(r.leer());
	if(aux != 0 || aux2!=0) {
		if(aux>aux2 )
			ps.println(aux/aux2);
		if(aux<=aux2)
			ps.println(aux2/aux);
	}
	else{ps.println("No se puede dividir por 0");}
}
//2.E division
public void BuscarZodiaco(){
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	ps.println("Ingrese el mes que nacio: ");
	String mesN = r.leer();	
	ps.println("Ingrese el dia que nacio: ");
	int dia = Integer.parseInt(r.leer());	
	mesN = mesN.substring(0, 1).toUpperCase().concat(mesN.substring(1).toLowerCase());
	int aux = 0;
	for( int i=0; i<=11; i++) {
		if(meses[i]==mesN){
			aux = i + 1;
			}
		}
	if((dia >=21 && aux == 3) || (dia <= 19 && aux == 4)  ) 
		ps.println("Tu signo del zodiaco es Aries");
	if((dia >=20 && aux == 4) || (dia <= 20 && aux == 5)  ) 
		ps.println("Tu signo del zodiaco es Tauro");
	if((dia >=21 && aux == 5) || (dia <= 20 && aux == 6)  ) 
		ps.println("Tu signo del zodiaco es Geminis");
	if((dia >=21 && aux == 6) || (dia <= 22 && aux == 7)  ) 
		ps.println("Tu signo del zodiaco es Cancer");
	if((dia >=23 && aux == 7) || (dia <= 22 && aux == 8)  ) 
		ps.println("Tu signo del zodiaco es Leo");
	if((dia >=23 && aux == 8) || (dia <= 22 && aux == 9)  ) 
		ps.println("Tu signo del zodiaco es Virgo");
	if((dia >=23 && aux == 9) || (dia <= 22 && aux == 10)  ) 
		ps.println("Tu signo del zodiaco es Libra");
	if((dia >=23 && aux == 10) || (dia <= 21 && aux == 11)  ) 
		ps.println("Tu signo del zodiaco es Escorpio");
	if((dia >=23 && aux == 11) || (dia <= 21 && aux == 12)  ) 
		ps.println("Tu signo del zodiaco es Sagitario");
	if((dia >=22 && aux == 12) || (dia <= 19 && aux == 1)  ) 
		ps.println("Tu signo del zodiaco es Capricornio");
	if((dia >=20 && aux == 1) || (dia <= 18 && aux == 2)  ) 
		ps.println("Tu signo del zodiaco es Acuario");
	if((dia >=19 && aux == 2) || (dia <= 20 && aux == 3)  ) 
		ps.println("Tu signo del zodiaco es Piscis");
}
//2.F Apellido mas largo
public void bestoApellido(){
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	ps.println("Ingrese su nombre");
	String nombre1 = r.leer();
	ps.println("Ingrese su apellido");
	String apellido1 = r.leer();
	ps.println("Ingrese otro nombre");
	String nombre2 = r.leer();
	ps.println("Ingrese otro apellido");
	String apellido2 = r.leer();
	if(apellido1.length() > apellido2.length()) 
		ps.println("el apellido de " + nombre1 + " es el mas largo");	
	if(apellido1.length() < apellido2.length()) 
		ps.println("el apellido de " + nombre2 + " es el mas largo");
	if(apellido1.length() == apellido2.length()) 
		ps.println("Ambos apellidos tienen las misma longitud");	
}
//2.G Tablas de multiplicar
public void tablaMultipicar() {
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	ps.println("Ingrese el numero: ");
	int num= Integer.parseInt(r.leer());
	int aux = 0;
	for( int i=1; i<=10 ; i++ ) {
		aux = i*num;
		ps.println(num + "*" + i + "=" + aux);
	}
}
//2.H Numero es primo
public String esPrimo() {
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	ps.println("Ingrese un numero: ");
	int num = Integer.parseInt(r.leer()); 
	for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) 
        	return "el numero no es primo";  
    }
	return "el numero es primo";  	
}




}