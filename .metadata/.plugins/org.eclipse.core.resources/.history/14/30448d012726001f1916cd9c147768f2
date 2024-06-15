package TP;
import java.io.IOException;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		Float aux2;
		int aux1;
		PrintStream ps = new PrintStream(System.out);	
		
		boolean i=false;		
		while (i==false) {
			ps.println("1)Es texto \n2)Añadir producto \n0) salir");
			int aux=Integer.parseInt(entradaDatos());
			if(aux==1) {ps.println(queEs());}
			if(aux==2) {CrearProducto();}
			if(aux==0) {i=true;}			
		}
	
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
	
	public static String queEs() {
		String valor = entradaDatos();
		if(esNumero(valor)){
			if(valor.contains(".")) {
			     Float aux= Float.parseFloat(valor);
			     return "Float";
			}
			else {
				 int aux2 = Integer.parseInt(valor);
			     return "Integer";
			}
		}
		else {
			return "no es un numero";
		}
		
	}
	public static Producto CrearProducto() {
		PrintStream ps = new PrintStream(System.out);
		ps.println("ingrese el nombre");
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
	
	private static boolean esNumero(String valor){
        return valor != null && valor.matches("[0-9.]+");
    }
}

