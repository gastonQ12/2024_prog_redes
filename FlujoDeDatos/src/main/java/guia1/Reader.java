package guia1;
	import java.util.logging.Logger;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.PrintStream;
	import java.util.logging.Level;
	
public class Reader {
		
		PrintStream ps;
		InputStreamReader isr;
		BufferedReader br;
		
		public Reader()
		{
			isr = new InputStreamReader( System.in );
			br = new BufferedReader( isr );
			ps = new PrintStream( System.out );
		}
		
		public String leer()
		{
			try {
				
				return br.readLine();	
			} catch (IOException e) {
				Logger.getLogger( Reader.class.getName() ).log(Level.WARNING , null , e ) ;
			}
			
			return null;
		}
		
	}

