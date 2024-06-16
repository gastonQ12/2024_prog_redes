package TP1;

public class main {

	public static void main(String[] args) {
		Ficheros f = new Ficheros();
		almacenarNumeros(f);
		
		
		
	}

	
	public static void almacenarNumeros(Ficheros f) {
		int array[]= new int[5];
		int aux;
		for(int i=0; i<=4;i++) {
			aux = Integer.parseInt(f.entradaDeDatos());
			array[i]=aux;
		}
		for(int i=0; i<=4;i++){
			f.ps.println(array[i]);
		}
	}
	
	
}
