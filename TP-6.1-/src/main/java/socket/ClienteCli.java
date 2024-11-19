package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteCli implements Runnable {
	
    String nickName = "";
    Socket sock;
    Thread hilo;
    
	final DataInputStream disCliente;
    final DataOutputStream dosCliente;
    boolean isConected;
    PrintStream ps;
    
    public ClienteCli(Socket sock, String nick, DataInputStream in, DataOutputStream out) {
        this.nickName = nick;
        this.sock = sock;
        this.disCliente = in;
        this.dosCliente = out;    
        
        ps = new PrintStream(System.out);
        this.isConected = true;
        this.hilo = new Thread(this, nickName);
    }

    
    
    
	@Override
	public void run() {
		String msgRecibido = "";
		String destino = "";
		
		while( this.sock.isConnected() && this.isConected )
		{
			try {
				//identificaos el mensaje
				// Recibir el mensaje
				msgRecibido = this.disCliente.readUTF().trim();

				// Comando: Mostrar clientes conectados
				if (msgRecibido.equalsIgnoreCase("/clientes")) {
				    StringBuilder clientes = new StringBuilder(Servidor.ANSI_GREEN + "Clientes conectados:\n" + Servidor.ANSI_RESET);
				    for (ClienteCli cli : Servidor.ClientesConectados) {
				        clientes.append(" - ").append(cli.getNickName()).append("\n");
				    }
				    this.dosCliente.writeUTF(clientes.toString());
				    continue; // No procesar más el mensaje, es un comando interno
				}

				// Procesar destino y mensaje
				if (msgRecibido.contains("#")) {
				    StringTokenizer token = new StringTokenizer(msgRecibido, "#");
				    destino = token.nextToken().trim().toLowerCase();
				    msgRecibido = token.nextToken().trim();
				} else {
				    destino = "";
				}

				
				ps.println("\n"
						+ Servidor.ANSI_PURPLE
						+ "El cliente " 
						+ Servidor.ANSI_GREEN 
						+ this.nickName 
						+ Servidor.ANSI_PURPLE
						+ " envia: "
						+ Servidor.ANSI_YELLOW
						+ msgRecibido + "\n\t"
						+ Servidor.ANSI_PURPLE
						+ " al cliente =>"
						+ Servidor.ANSI_CYAN
						+ (destino.equalsIgnoreCase("") ? " Todos" : " ".concat(destino.toUpperCase()))
						+ "\n"
						+ Servidor.ANSI_RESET
					);
				
				//filtro de comandos
				//  mensaje= /salir
							
				//enviar mensaje
				boolean clienteEncontrado = false;
				for (ClienteCli cli : Servidor.ClientesConectados) {
				    if (msgRecibido.equalsIgnoreCase("")) break;

				    if (cli.getNickName().equalsIgnoreCase(destino) && this.isConected) {
				        clienteEncontrado = true;
				        try {
				            cli.dosCliente.writeUTF(Servidor.ANSI_YELLOW
				                    + this.nickName
				                    + ": "
				                    + Servidor.ANSI_RESET
				                    + msgRecibido);
				        } catch (IOException ex) {
				            ps.println(Servidor.ANSI_RED + "<Cliente no disponible: " + destino.toUpperCase() + ">" + Servidor.ANSI_RESET);
				        }
				        break;
				    } else if (destino.equalsIgnoreCase("")
				            && this.isConected
				            && !cli.getNickName().equalsIgnoreCase(this.nickName)) {
				        try {
				            cli.dosCliente.writeUTF(Servidor.ANSI_YELLOW
				                    + this.nickName
				                    + ": "
				                    + Servidor.ANSI_RESET
				                    + msgRecibido);
				        } catch (IOException ex) {
				            ps.println(Servidor.ANSI_RED + "<Cliente no disponible: " + cli.getNickName().toUpperCase() + ">" + Servidor.ANSI_RESET);
				        }
				    }
				}

				if (!clienteEncontrado && !destino.equalsIgnoreCase("")) {
				    ps.println(Servidor.ANSI_RED + "<Cliente no encontrado: " + destino.toUpperCase() + ">" + Servidor.ANSI_RESET);
				}

			
			} catch (IOException ex) {
				Logger.getLogger(ClienteCli.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
	}
    
	
	
	void notificarClientes(boolean estado) {
		for( ClienteCli cli : Servidor.ClientesConectados )
		{
			if( !cli.getNickName().equals(this.nickName) && cli.isConected() )
			{
				try {
					if(estado)
					{
						cli.dosCliente.writeUTF(Servidor.ANSI_GREEN
								+ "\t---"
								+ this.getNickName()
								+ " se ah CONECTADO---"
								+ Servidor.ANSI_RESET
						);						
					}else {
						cli.dosCliente.writeUTF(Servidor.ANSI_RED
								+ "\t---"
								+ this.getNickName()
								+ " se ah DESCONECTADO---"
								+ Servidor.ANSI_RESET
						);
					}
				}catch(IOException ex) {
					Logger.getLogger(ClienteCli.class.getName()).log(Level.SEVERE,null,ex);
				}
			}
		}
	}
	
    public String getNickName() {
		return nickName;
	}

	public Socket getSock() {
		return sock;
	}

	public Thread getHilo() {
		return hilo;
	}

	public boolean isConected() {
		return isConected;
	}	
	
}
