package Readers;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class Lectura {
		// Stream
		// Stream  IN
		// Stream  OUT
		// Stream  ERR
		
		
		PrintStream ps;
		
		public Lectura()
		{
			
			ps = new PrintStream( System.out);
			
			
			
			
			
			
			System.out.println("Byte:");
			//Scanner s = new Scanner(System.in);
			//System.err.println();
			

			System.err.println("EL QUE PUEDE, PUEDE");
			
			System.out.write(  13  );  // 
			System.out.write(  10  );  // enter 
			System.out.write(  5 );
			System.out.write(  27 );
			//System.out.println();
			
			byte[] array = { 21, 23, 75, 34, 64 };
			
			try {
				System.out.write( array );
			} catch (IOException e) {
				Logger.getLogger( Readers.Lectura.class.getName()).log(Level.SEVERE, null, e);
				
				// e.printStackTrace();
			}
			
			
			
			System.out.flush();
			ps.printf("Renzo es un %s con %d de iq ", "capo", 10000);
		}
		
		
	}
