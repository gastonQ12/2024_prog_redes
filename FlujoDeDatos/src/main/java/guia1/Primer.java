package guia1;

import java.io.IOException;
import java.io.PrintStream;

public class Primer {
	
public void menu(){
	PrintStream ps = new PrintStream(System.out);
	boolean i=false;		
	while (i==false) {
		ps.println("\n1) Sueldo Bruto \n2) calcular angulos \n3) calcular perimetro \n4) Calcular temperatura \n5) Calcular tiempo \n6) Planes de pago \n7) Zodiaco \n0) salir");
		int aux=Integer.parseInt(entradaDeDatosSTR());
		if(aux==1) {calcularSueldoBruto();}
		if(aux==2) {sumarAngulos();}
		if(aux==3) {calcularPerimetro();}
		if(aux==4) {calculartemperatura();}
		if(aux==5) {calcularTiempo();}
		if(aux==6) {planesPago();}
		if(aux==7) {caballerosDeZodiaco();}
		if(aux==0) {i=true;}			
	}
	
	
}
//1.A calcular sueldo
public void calcularSueldoBruto(){
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingrese las horas trabajadas :");
	Float h = Float.parseFloat(entradaDeDatosSTR());
	ps.println("Ingrese el ingreso x hora :");
	float p = Float.parseFloat(entradaDeDatosSTR());
	float sueldo=h*p;		
	ps.printf("El sueldo en bruto es: %.2f $", sueldo);
}
//1.B resto de angulo
public void sumarAngulos() {
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingrese el valor del primer angulo :");
	int a1 = Integer.parseInt(entradaDeDatosSTR());
	ps.println("Ingrese el valor del segundo angulo :");
	int a2 = Integer.parseInt(entradaDeDatosSTR());
	int resto=180 - (a1 + a2) ;		
	ps.printf("El resto es de: %d \n", resto);
}
//1.C calcular perimetro
public void calcularPerimetro() {
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingresar la superficie del cuadrado: ");
	float superficie = Float.parseFloat(entradaDeDatosSTR());
	float perimetro = superficie*4;
	ps.printf("El perimetro del cuadrado es %.2f \n",perimetro);
	
	
}
//1.D calcular temperatura (32 °F − 32) × 5/9 
public void calculartemperatura() {
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingrese la temperatura en fahrenheit: ");
	int gc = ((Integer.parseInt(entradaDeDatosSTR())-32)*5/9);
	ps.printf("En celsius es:%d \n", gc);
}
//1.E calcular tiempo
public void calcularTiempo() {
	
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingrese los segundos: ");
	int seg= Integer.parseInt(entradaDeDatosSTR());
	int minuto=0;
	int hora=0;
	int dia=0;
	boolean i=false;
	while(i==false) {
		if(seg>=60){
			minuto +=1;
			seg -= 60;
		}else {i = true;}
		if(minuto>=60){
			hora +=1;
			minuto -= 60;
		}
		if(hora>=24){
			dia +=1;
			hora -= 24;
		}
		
	}
	ps.printf("Dias:%d \nHoras:%d \nMnutos:%d \nSegundos:%d \n",dia, hora, minuto, seg);
}
//1.F planes de pago
public void planesPago() {
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingrese el precio del articulo: ");
	double precioA = Double.parseDouble(entradaDeDatosSTR());
	ps.println("que plan de pago se utiliza:");
	int aux=Integer.parseInt(entradaDeDatosSTR());
	ps.println("El precio final es de: ");
	if(aux==1) {ps.println(precioA*0.90);}
	if(aux==2) {ps.println(precioA*1.10);}
	if(aux==3) {ps.println(precioA*1.15);}
	if(aux==4) {ps.println(precioA*1.25);}
	else {ps.println("opcion no disponible");}
}
//1.G Zodiaco
public void caballerosDeZodiaco(){
	PrintStream ps = new PrintStream(System.out);
	ps.println("Ingrese su signo del zodiaco: ");
	String aux = entradaDeDatosSTR();		
	String signo = aux.substring(0, 1).toUpperCase().concat(aux.substring(1).toLowerCase());
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
//entrada de datos
public String entradaDeDatosSTR(){
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
}}