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
		ps.println("\n1) Ordenar apellidos \n2) Sacar numero menor \n3) Par o impar \n4) division de dos numeros reales \n5) Calcular tiempo \n6) Planes de pago \n7) Zodiaco \n0) salir");
		int aux=Integer.parseInt(r.leer());
		if(aux==1) {ordenarApellidos();}
		if(aux==2) {sacarMenor();}
		if(aux==3) {esPar();}
		if(aux==4) {dividirXmenor();}
		if(aux==5) {();}
		if(aux==6) {();}
		if(aux==7) {();}
		if(aux==0) {i=true;}			
	}
	
	
}
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
public void caballerosDeZodiaco(){
	PrintStream ps = new PrintStream(System.out);
	Reader r = new Reader();
	ps.println("Ingrese el dia que nacio: ");
	String dia = r.leer();
	ps.println();
	String mes = r.leer();		
	String mesF = mes.substring(0, 1).toUpperCase().concat(mes.substring(1).toLowerCase());
	
	
	
	
	
	switch(signo){
	case "Aries":
		ps.println("Naciste entre el 21 de marzo y el 19 de abril, sos 'Mu de Aries'");
		break;
	case "Tauro":
		ps.println("Naciste entre el 20 de abril al 20 de mayo, sos 'Aldebarán de Tauro'");
		break;
	case "Geminis":
		ps.println("Naciste entre el 21 de mayo al 20 de junio, sos 'Saga de Géminis'");
		break;
	case "Cencer":
		ps.println("Naciste entre el 21 de junio al 22 de julio, sos 'Deathmask de Cáncer'");
		break;
	case "Leo":
		ps.println("Naciste entre el 23 de julio al 22 de agosto, sos 'Aioria de Leo'");
		break;
	case "Virgo":
		ps.println("Naciste entre el 23 de agosto al 22 de septiembre, sos 'Shaka de Virgo'");
		break;
	case "Libra":
		ps.println("Naciste entre el 23 de septiembre al 22 de octubre, sos 'Dohko de Libra'");
		break;
	case "Escorpio":
		ps.println("Naciste entre el 23 de octubre al 21 de noviembre, sos 'Milo de Escorpio'");
		break;
	case "Sagitario":
		ps.println("Naciste entre el 22 de noviembre al 21 de diciembre, sos 'Aioros de Sagitario'");
		break;
	case "Capricornio":
		ps.println("Naciste entre el 22 de diciembre al 19 de enero, sos 'Shura de Capricornio'");
		break;
	case "Acuario":
		ps.println("Naciste entre el 20 de enero al 18 de febrero, sos 'Camus de Acuario'");
		break;
	case "Piscis":
		ps.println("Naciste entre el 19 de febrero al 20 de marzo, sos 'Afrodita de Piscis'");
		break;
	}
}

}
