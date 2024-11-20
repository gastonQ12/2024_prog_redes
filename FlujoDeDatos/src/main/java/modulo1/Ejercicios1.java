package modulo1;
import java.io.PrintStream;
import LecturaDatos.SystemRead;

public class Ejercicios1 {
	static PrintStream ps = new PrintStream(System.out);
	static SystemRead sr = new SystemRead();
	
	public Ejercicios1() {
		
	}
	
	public void EjercicioA() {
		ps.println("Ingrese las horas que trabaja por semana: ");
		int horasTrabajadas = Integer.parseInt(sr.Leer());
		ps.println("Ingrese cuanto le pagan por hora de trabajo: ");
		float precioPorHora = Float.parseFloat(sr.Leer());
		
		float resultado = horasTrabajadas * precioPorHora * 4;
		ps.println("Su sueldo bruto es de: $" + resultado + " por mes, y $" + (resultado * 12) + "por año.");
	}
	
	public void EjercicioB() {
		ps.println("Ingrese el primer ángulo interior del triángulo: ");
		float a1 = Float.parseFloat(sr.Leer());
		ps.println("Ingrese el segundo ángulo interior del triángulo: ");
		float a2 = Float.parseFloat(sr.Leer());
		float a3 = 180 - (a1 + a2);
		ps.println("El tercer ángulo tiene un valor de: " + a3 + "°.");
	}
	
	public void EjercicioC() {
		ps.println("Introduzca la superficie del cuadrado: ");
		double s = Double.parseDouble(sr.Leer());
		double p = (Math.sqrt(s)) * 4;
		ps.println("El perímetro es de: " + p + " metros.");
	}
	
	public void EjercicioD() {
		ps.println("Ingrese una temperatura en grados Fahrenheit: ");
		double f = Double.parseDouble(sr.Leer());
		double c = ((f - 32) / 1.8);
		ps.println("La temperatura en grados celsius sería: " + c + "°.");
	}
	
	public void EjercicioE() {
		ps.println("Ingrese una cantidad de tiempo expresada en segundos: ");
		int segIn = Integer.parseInt(sr.Leer());
		int s;
		int m = segIn / 60;
		s = segIn % 60;
		int h = m / 60;
		m = m % 60;
		int d = h / 24;
		h = h % 60;
		ps.println("El tiempo expresado es equivalente a: " + d + " días, " + h + " horas, " + m + " minutos y" + s + " segundos.");
	}
	
	public void EjercicioF() {
		ps.println("Bienvenido a la tienda de porductos de hogar. Ingrese el precio del producto que desea comprar: ");
		double precioIn = Double.parseDouble(sr.Leer());
		double primerPrecio;
		double precioCuotas;
		ps.println("¿Cómo lo desea pagar? Revise y elija uno de nuestros siguientes planes: ");
		ps.println("1 - Pago 100% al contado. Se hace un descuento del 10% al precio original.");
		ps.println("2 - Pago 50% al contado y el resto en dos cuotas iguales. Se hace un incremento del 10% al precio original.");
		ps.println("3 - Pago 25% al contado y el resto en cinco cuotas iguales. Se hace un incremento del 15% al precio original.");
		ps.println("4 - Pago en 8 cuotas. El 60% del precio se paga en las primeras 4 cuotas y el resto se reparte en partes iguales. El precio se incrementa en un 25%.");
		switch(Integer.parseInt(sr.Leer())) {
			case 1:
				precioIn *= 0.9;
				ps.println("Usted seleccionó el primer plan. Usted pagó: $" + precioIn + " por el producto.");
				break;
			case 2:
				precioIn *= 1.1;
				primerPrecio = precioIn / 2;
				precioCuotas = (precioIn - primerPrecio) / 2;
				ps.println("Usted seleccionó el segundo plan. Usted pagó: $" + (precioIn / 2) + " por el producto en contado, y pagará dos cuotas de: $" + (precioIn / 4) + " c/u.");
				break;
			case 3:
				precioIn *= 1.15;
				primerPrecio = precioIn / 4;
				precioCuotas = (precioIn - primerPrecio) / 5;
				ps.println("Usted seleccionó el tercer plan. Usted pagó: $" + primerPrecio + " por el producto en contado, y pagará cinco cuotas de: $" + precioCuotas + " c/u.");
				break;
			case 4:
				precioIn *= 1.25;
				primerPrecio = (precioIn * 0.6) / 4;
				precioCuotas = (precioIn - (precioIn * 0.6)) / 4;
				ps.println("Usted seleccionó el cuarto plan. Usted pagó 4 cuotas de: $" + primerPrecio + " c/u, y otras 4 de: $" + precioCuotas + " c/u.");
				break;
			default:
				ps.println("Usted no ha seleccionado un plan de pago. Vuelva a intentarlo.");
				EjercicioF();
				break;
		}
		
	}
	
	public void EjercicioG() {
		ps.println("Ingrese su signo zodiacal: ");
		if(sr.Leer().equalsIgnoreCase("Aries")) {
			ps.println("Usted nació a fines de marzo o en abril.");
		}else if(sr.Leer().equalsIgnoreCase("Tauro")) {
			ps.println("Usted nació a fines de abril o en mayo.");
		}else if(sr.Leer().equalsIgnoreCase("Géminis")) {
			ps.println("Usted nació a fines de mayo o en junio.");
		}else if(sr.Leer().equalsIgnoreCase("Cáncer")) {
			ps.println("Usted nació a fines de junio o en julio.");
		}else if(sr.Leer().equalsIgnoreCase("Leo")) {
			ps.println("Usted nació a fines de julio o en agosto.");
		}else if(sr.Leer().equalsIgnoreCase("Virgo")) {
			ps.println("Usted nació a fines de agosto o en septiembre.");
		}else if(sr.Leer().equalsIgnoreCase("Libra")) {
			ps.println("Usted nació a fines de spetiembre o en octubre.");
		}else if(sr.Leer().equalsIgnoreCase("Escorpio")) {
			ps.println("Usted nació a fines de octubre o en noviembre.");
		}else if(sr.Leer().equalsIgnoreCase("Sagitario")) {
			ps.println("Usted nació a fines de noviembre o en diciembre.");
		}else if(sr.Leer().equalsIgnoreCase("Capricornio")) {
			ps.println("Usted nació a fines de diciembre o en enero.");
		}else if(sr.Leer().equalsIgnoreCase("Acuario")) {
			ps.println("Usted nació a fines de enero o en febrero.");
		}else if(sr.Leer().equalsIgnoreCase("Piscis")) {
			ps.println("Usted nació a fines de febrero o en marzo.");
		}else {
			ps.println("Usted no ha ingresado un signo Zodiacal válido. Inténtelo nuevamente. Pruebe utilizando mayúscula en la primer letra.");
			EjercicioG();
		}
			
	}
}
