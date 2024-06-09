package TP;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		PrintStream ps = new PrintStream(System.out);	
		ArrayList<Producto> listaProductos = new ArrayList();
		Fichero a = new Fichero("C:\\archJava\\","datos", ".txt");
		
		
		
		boolean i=false;		
		while (i==false) {
			ps.println("1)Es texto \n2)Añadir producto \n3)guardar productos \n4)Mostrar productos \n0) salir");
			int aux=Integer.parseInt(entradaDatos());
			if(aux==1) {ps.println(numSwitch(esNumero(entradaDatos())));}
			if(aux==2) {listaProductos.add(CrearProducto());}
			if(aux==3) {saveProductos(listaProductos, a);}
			if(aux==4) {MostrarProductos(a);}
			if(aux==0) {i=true;}		
			
		}
	
	}
		

	
	public static float numSwitch(String valor) {
			
			if(valor.contains(".")) {
			     Float aux= Float.parseFloat(valor);
			     System.out.println("float");
			     return aux;
			}/*
			if(valor.contains(",")) {
				 
			     Float aux= Float.parseFloat(valor);
			     return aux;
			}*/
			return 0;
		}/*
	public static int numSwitch(String valor, Fichero a) {
		
		     int aux= Integer.parseInt(valor);
		     System.out.println("int");
		     return aux;
		return 0;
	}*/


	public static void MostrarProductos(Fichero a) {
		PrintStream ps = new PrintStream(System.out);
		ps.println(a.leerArchivo(a.getArchivo()));
	}
	
	
	
	
	public static Producto CrearProducto() {
		PrintStream ps = new PrintStream(System.out);
		ps.println("ingrese el nombre \t");
		String nombre = entradaDatos();
		ps.println("ingrese el precio de compra");
		Double precio = Double.parseDouble(entradaDatos());
		ps.println("ingrese el precio de venta");
		double venta = Double.parseDouble(entradaDatos());
		ps.println("ingrese el stock");
		int stock = Integer.parseInt(entradaDatos());
		Producto p = new Producto(nombre, precio, venta, stock);
		return p;
	};
	
	public static void saveProductos(ArrayList<Producto> listaP, Fichero arch){
		
		for(Producto p:listaP) {
			arch.guardar(arch.getArchivo(), p);
		}		
	}
	
	private static String esNumero(String valor){
        if(valor != null && valor.matches("[0-9.]+")) {
        	return valor;}
        return "0";
    }

	
	public static String entradaDatos(){
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

