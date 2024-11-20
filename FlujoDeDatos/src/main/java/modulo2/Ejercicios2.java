package modulo2;
import LecturaDatos.ReaderClass;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Arrays;

public class Ejercicios2 {
	static PrintStream ps = new PrintStream(System.out);
	static ReaderClass rc = new ReaderClass();
	
	
	public Ejercicios2() {
		
	}
	
	
	public void EjercicioA() {
		ps.println("Ingrese el primer apellido: ");
		String a1 = rc.Leer();
		ps.println("Ingrese el segundo apellido: ");
		String a2 = rc.Leer();
		ps.println("Ingrese el tercer apellido: ");
		String a3 = rc.Leer();
		String[] apellidos = {a1, a2, a3};
		Arrays.sort(apellidos);
		ps.println("Apellidos ordenados: ");
		for(String a : apellidos) {
			ps.println(a + " .");
		}
	}
	
	public void EjercicioB() {
		ps.println("Ingrese el primer número real: ");
		double n1 = Double.parseDouble(rc.Leer());
		ps.println("Ingrese el segundo número real: ");
		double n2 = Double.parseDouble(rc.Leer());
		ps.println("Ingrese el tercer número real: ");
		double n3 = Double.parseDouble(rc.Leer());
		ps.println("Ingrese el cuarto número real: ");
		double n4 = Double.parseDouble(rc.Leer());
		if(n1 > n2) {
			if(n2>n3) {
				if(n3>n4) {
					ps.println("El menor número es: " + n4);
				}
				else {
					ps.println("El menor número es: " + n3);
				}
			}
			else {
				if(n2>n4) {
					ps.println("El menor número es: " + n4);
				}
				else {
					ps.println("El menor número es: " + n2);
				}
			}
		}
		else {
			if(n1>n3) {
				if(n3> n4) {
					ps.println("El menor número es: " + n4);
				}
				else {
					ps.println("El menor número es: " + n3);
				}
			}else {
				if(n1> n4) {
					ps.println("El menor número es: " + n4);
				}
				else {
					ps.println("El menor número es: " + n1);
				}
			}
		}
	}
	
	public void EjercicioC() {
		ps.println("Ingrese un número: ");
		double n1 = Double.parseDouble(rc.Leer());
		if(n1 % 2 == 0) {
			ps.println("El número " + n1 + " es par.");
		}else {
			ps.println("El número " + n1 + " es impar.");
		}
	}
	
	public void EjercicioD() {
		ps.println("Ingrese el primer número: ");
		double n1 = Double.parseDouble(rc.Leer());

		ps.println("Ingrese el segundo número: ");
		double n2 = Double.parseDouble(rc.Leer());
		
		if(n1 > n2) {
			if(n1 % n2 == 0) {
				ps.println("El número mayor, " + n1 + ", es divisible por el número menor, " + n2 + ", porque da resto 0.");
			}else {
				ps.println("El número mayor, " + n1 + ", no es divisible por el número menor, " + n2 + ", porque no da resto 0.");
			}
		}else {
			if(n2 % n1 == 0) {
				ps.println("El número mayor, " + n2 + ", es divisible por el número menor, " + n1 + ", porque da resto 0.");
			}else {
				ps.println("El número mayor, " + n2 + ", no es divisible por el número menor, " + n1 + ", porque no da resto 0.");
			}
		}
	}
	
	public void EjercicioE() {
		ps.println("Ingrese el día de su fecha de nacimiento: ");
		int dia = Integer.parseInt(rc.Leer());
		ps.println("Ingrese el mes de su fecha de nacimiento: ");
		int mes = Integer.parseInt(rc.Leer());
		ps.println("Ingrese el año de su fecha de nacimiento: ");
		int anio = Integer.parseInt(rc.Leer());
		
		LocalDate nac = LocalDate.of(anio, mes, dia);
		LocalDate ariesI = LocalDate.of(anio, 3, 21);
		LocalDate ariesF = LocalDate.of(anio, 4, 20);
		LocalDate tauroI = LocalDate.of(anio, 4, 21);
		LocalDate tauroF = LocalDate.of(anio, 5, 20);
		LocalDate geminisI = LocalDate.of(anio, 5, 21);
		LocalDate geminisF = LocalDate.of(anio, 6, 20);
		LocalDate cancerI = LocalDate.of(anio, 6, 21);
		LocalDate cancerF = LocalDate.of(anio, 7, 20);
		LocalDate leoI = LocalDate.of(anio, 7, 21);
		LocalDate leoF = LocalDate.of(anio, 8, 20);
		LocalDate virgoI = LocalDate.of(anio, 8, 21);
		LocalDate virgoF = LocalDate.of(anio, 9, 20);
		LocalDate libraI = LocalDate.of(anio, 9, 21);
		LocalDate libraF = LocalDate.of(anio, 10, 20);
		LocalDate escorpioI = LocalDate.of(anio, 10, 21);
		LocalDate escorpioF = LocalDate.of(anio, 11, 20);
		LocalDate sagitarioI = LocalDate.of(anio, 11, 21);
		LocalDate sagitarioF = LocalDate.of(anio, 12, 20);
		LocalDate capriI = LocalDate.of(anio, 12, 21);
		LocalDate capriF = LocalDate.of(anio, 1, 20);
		LocalDate acuarioI = LocalDate.of(anio, 1, 21);
		LocalDate acuarioF = LocalDate.of(anio, 2, 20);
		LocalDate piscisI = LocalDate.of(anio, 2, 21);
		LocalDate piscisF = LocalDate.of(anio, 3, 20);
		
		if(nac.isAfter(ariesI) && nac.isBefore(ariesF)) {
			ps.println("Su signo zodiacal es Aries.");
		}
		else if(nac.isAfter(tauroI) && nac.isBefore(tauroF)) {
			ps.println("Su signo zodiacal es Tauro.");
		}
		else if(nac.isAfter(geminisI) && nac.isBefore(geminisF)) {
			ps.println("Su signo zodiacal es Géminis.");
		}
		else if(nac.isAfter(cancerI) && nac.isBefore(cancerF)) {
			ps.println("Su signo zodiacal es Cáncer.");
		}
		else if(nac.isAfter(leoI) && nac.isBefore(leoF)) {
			ps.println("Su signo zodiacal es Leo.");
		}
		else if(nac.isAfter(virgoI) && nac.isBefore(virgoF)) {
			ps.println("Su signo zodiacal es Virgo.");
		}
		else if(nac.isAfter(libraI) && nac.isBefore(libraF)) {
			ps.println("Su signo zodiacal es Libra.");
		}
		else if(nac.isAfter(escorpioI) && nac.isBefore(escorpioF)) {
			ps.println("Su signo zodiacal es Escorpio.");
		}
		else if(nac.isAfter(sagitarioI) && nac.isBefore(sagitarioF)) {
			ps.println("Su signo zodiacal es Sagitario.");
		}
		else if(nac.isAfter(capriI) && nac.isBefore(capriF)) {
			ps.println("Su signo zodiacal es Capricornio.");
		}
		else if(nac.isAfter(acuarioI) && nac.isBefore(acuarioF)) {
			ps.println("Su signo zodiacal es Acuario.");
		}
		else if(nac.isAfter(piscisI) && nac.isBefore(piscisF)) {
			ps.println("Su signo zodiacal es Piscis.");
		}
	}
	
	public void EjercicioF() {
		ps.println("Ingrese el nombre de la primera persona: ");
		String n1 = rc.Leer();
		ps.println("Ingrese el apellido de la primera persona: ");
		String a1 = rc.Leer();
		
		ps.println("Ingrese el nombre de la segunda persona: ");
		String n2 = rc.Leer();
		ps.println("Ingrese el apellido de la segunda persona: ");
		String a2 = rc.Leer();
		
		String nc1 = a1 + " " + n1;
		String nc2 = a2 + " " + n2;
		
		if(a1.length() > a2.length()) {
			ps.println("El apellido de " + nc1 + " es más largo que el de: " + nc2 + ".");
		}
		else if(a2.length() > a1.length()) {
			ps.println("El apellido de " + nc2 + " es más largo que el de: " + nc1 + ".");
		}else {
			ps.println("La longitud de los apellidos es la misma.");
		}
	}
	
	public void EjercicioG() {
		ps.println("Ingrese un número natural: ");
		int num = Integer.parseInt(rc.Leer());
		if(num > 0) {
			ps.println("---------- TABLA DE MULTIPLICAR DE " + num + " ----------");
			for(int i=1; i <= 10; i++) {
				ps.println(i + " x " + num + " = " + (i * num));
				ps.println("------------------------------");
			}
		}else {
			ps.println("Ese no es un número natural, inténtelo de nuevo.");
			EjercicioG();
		}
	}
	
	public void EjercicioH() {
		ps.println("Ingrese un número natural: ");
		int num = Integer.parseInt(rc.Leer());
		int contador = 0;
		if(num > 0) {
			if(num == 1) {
				ps.println("El número ingresado no es primo.");
			}
			else if(num == 2) {
				ps.println("El número " + num + " es un número primo.");
			}else {
				for(int i = 1; i <= num; i++) {
					if((num % i) == 0)  {
						contador++;
					}
				}
				
				if(contador <= 2) {
					ps.println("El número " + num + "es primo.");
				}else {
					ps.println("El número " + num + " no es primo.");
				}
			}
		}else {
			ps.println("Ese no es un número natural, inténtelo de nuevo.");
			EjercicioH();
		}
	}
}