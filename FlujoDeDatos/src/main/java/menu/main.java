package menu;
import java.io.PrintStream;
import LecturaDatos.*;
import modulo1.Ejercicios1; 
import modulo2.Ejercicios2; 
import modulo3.Ejercicio3;
import modulo4.*;
import modulo5.EjerciciosExtra;

public class main {
	static PrintStream ps = new PrintStream(System.out);
	static SystemRead sr = new SystemRead();
	static ReaderClass rc = new ReaderClass();
	static Ejercicios1 e1 = new Ejercicios1();
	static Ejercicios2 e2 = new Ejercicios2();
	static Ejercicio3 e3 = new Ejercicio3();
	static Ejercicio4 e4 = new Ejercicio4();
	static EjerciciosExtra ee = new EjerciciosExtra();
	
	public static void main(String[] args) {
		Menu();
	}
	
	
	public static void Menu() {
		ps.println("Bienvenido, seleccione a qué módulo desea ingresar: ");
		ps.println("1 - Módulo 1.");
		ps.println("2 - Módulo 2.");
		ps.println("3 - Módulo 3.");
		ps.println("4 - Módulo 4.");
		ps.println("4 - Módulo 5 (Ejercicios extra).");
		ps.println("0 - Salir.");
		
		switch(Integer.parseInt(sr.Leer())) {
			case 1:
				ps.println("Seleccionaste el módulo 1.");
				MenuMod1();
				break;
			case 2:
				ps.println("Seleccionaste el módulo 2.");
				MenuMod2();
				break;
			case 3:
				ps.println("Seleccionaste el módulo 3.");
				MenuMod3();
				break;
			case 4:
				ps.println("Seleccionaste el módulo 4.");
				MenuMod4();
				break;
			case 5:
				ps.println("Seleccionaste el módulo 5 (Ejercicios extra).");
				MenuMod5();
				break;
			case 0:
				ps.println("Seleccionaste 0. Adiós!");
				break;
			default:
				ps.println("Usted no ha seleccionado un módulo válido. Prepárese para morir, o, intenarlo de nuevo, jeje.");
				Menu();
				break;
		}
	}
	
	public static void MenuMod1() {
		ps.println("Seleccione el ejercicio, escriba la letra en minúscula, por favor: ");
		ps.println("a- Calculadora de sueldo. ");
		ps.println("b- Calculadora de ángulos. ");
		ps.println("c- Calculadora de perímetro. ");
		ps.println("d- Conversor a grados centígrados. ");
		ps.println("e- Conversión a días/horas/minutos/segundos. ");
		ps.println("f- Calculadora de precios de planes. ");
		ps.println("g- Calculadora de mes de nacimiento. ");
		ps.println("z- Seleccionar otro módulo. ");
		switch(sr.Leer().charAt(0)) {
			case 'a':
				e1.EjercicioA();
				MenuMod1();
				break;
			case 'b':
				e1.EjercicioB();
				MenuMod1();
				break;
			case 'c':
				e1.EjercicioC();
				MenuMod1();
				break;
			case 'd':
				e1.EjercicioD();
				MenuMod1();
				break;
			case 'e':
				e1.EjercicioE();
				MenuMod1();
				break;
			case 'f':
				e1.EjercicioF();
				MenuMod1();
				break;
			case 'g':
				e1.EjercicioG();
				MenuMod1();
				break;
			case 'z':
				ps.println("Volverá al menú principal.");
				Menu();
				break;
			default:
				ps.println("Esa no es una opción válida, vuelva a intentarlo.");
				MenuMod1();
				break;
		}
	}
	
	public static void MenuMod2() {
		ps.println("Seleccione el ejercicio, escriba la letra en minúscula, por favor: ");
		ps.println("a - Ordenador de apellidos.");
		ps.println("b - Seleccionador del menor número.");
		ps.println("c - ¿Número par o impar?");
		ps.println("d - Divisor de números.");
		ps.println("e - Calculadora de signo zodiacal.");
		ps.println("f - ¿Qué apellido es más largo?");
		ps.println("g - Tabla de multiplicar de un número.");
		ps.println("h - ¿Es un número primo?");
		ps.println("z- Seleccionar otro módulo. ");
		switch(rc.Leer().charAt(0)) {
			case 'a':
				e2.EjercicioA();
				MenuMod2();
				break;
			case 'b':
				e2.EjercicioB();
				MenuMod2();
				break;
			case 'c':
				e2.EjercicioC();
				MenuMod2();
				break;
			case 'd':
				e2.EjercicioD();
				MenuMod2();
				break;
			case 'e':
				e2.EjercicioE();
				MenuMod2();
				break;
			case 'f':
				e2.EjercicioF();
				MenuMod2();
				break;
			case 'g':
				e2.EjercicioG();
				MenuMod2();
				break;
			case 'h':
				e2.EjercicioH();
				MenuMod2();
				break;
			case 'z':
				ps.println("Volverá al menú principal.");
				Menu();
				break;
			default:
				ps.println("Esa no es una opción válida, vuelva a intentarlo.");
				MenuMod2();
				break;
		}
		
	}
	
	public static void MenuMod3() {
		ps.println("Seleccione el ejercicio, escriba la letra en minúscula, por favor: ");
		ps.println("a - Guardar el último dato en consola.");
		ps.println("b - Guardar los números ingresados.");
		ps.println("c - Guardar todos los números pares del 1 al 1000");
		ps.println("d - Listar los números pares del 1 al 1000.");
		ps.println("e - Borrar datos con números impares.");
		ps.println("f - Guardar y Listar los números primos pares.");
		ps.println("g - Modificador de palabras con ñ.");
		ps.println("z- Seleccionar otro módulo. ");
		switch(rc.Leer().charAt(0)) {
		case 'a':
			e3.EjercicioA();
			MenuMod3();
			break;
		case 'b':
			e3.EjercicioB();
			MenuMod3();
			break;
		case 'c':
			e3.EjercicioC();
			MenuMod3();
			break;
		case 'd':
			e3.EjercicioD();
			MenuMod3();
			break;
		case 'e':
			e3.EjercicioE();
			MenuMod3();
			break;
		case 'f':
			e3.EjercicioF();
			MenuMod3();
			break;
		case 'g':
			e3.EjercicioG();
			MenuMod3();
			break;
		case 'z':
			ps.println("Volverá al menú principal.");
			Menu();
			break;
		default:
			ps.println("Esa no es una opción válida, vuelva a intentarlo.");
			MenuMod3();
			break;
		}
	}
	
	public static void MenuMod4() {
		ps.println("Seleccione el ejercicio, escriba la letra en minúscula, por favor: ");
		ps.println("a - Guardar datos numéricos.");
		ps.println("b - Manejo del colegio y alumnos.");
		ps.println("c - Listas y días de la semana.");
		ps.println("d - Listas y jugadores de futbol.");
		ps.println("e - Juego de bolas de colores.");
		ps.println("g - De listas a diccionarios.");
		ps.println("z- Seleccionar otro módulo. ");
		switch(rc.Leer().charAt(0)) {
		case 'a':
			e4.EjercicioA();
			MenuMod4();
			break;
		case 'b':
			e4.EjercicioB();
			MenuMod4();
			break;
		case 'c':
			e4.EjercicioC();
			MenuMod4();
			break;
		case 'd':
			e4.EjercicioD();
			MenuMod4();
			break;
		case 'e':
			e4.EjercicioE();
			MenuMod4();
			break;
		case 'g':
			e4.EjercicioG();
			MenuMod4();
			break;
		case 'z':
			ps.println("Volverá al menú principal.");
			Menu();
			break;
		default:
			ps.println("Esa no es una opción válida, vuelva a intentarlo.");
			MenuMod4();
			break;
		}
	}
	
	public static void MenuMod5() {
		ps.println("Seleccione el ejercicio, escriba la letra en minúscula, por favor: ");
		ps.println("a - Borrar Lorem Ipsum de un HTML.");
		ps.println("b - Manejo de las fechas y el clima.");
		ps.println("z- Seleccionar otro módulo. ");
		switch(rc.Leer().charAt(0)) {
		case 'a':
			ee.EE1();
			MenuMod5();
			break;
		case 'b':
			ee.EE2();
			MenuMod5();
			break;
		case 'z':
			ps.println("Volverá al menú principal.");
			Menu();
			break;
		default:
			ps.println("Esa no es una opción válida, vuelva a intentarlo.");
			MenuMod5();
			break;
		}
	}
}