package examen_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros {
	PrintStream ps = new PrintStream(System.out);
	File arch = new File("C:\\archJava\\datos.dat");
	ArrayList a = new ArrayList();

	public File getArchivo() {

		return this.arch;

	}

	public void editarArchivo(File original) {

		File copia = new File("copia.tmp");
		FileReader Fr = null;
		BufferedReader Br = null;
		FileWriter Fw = null;
		PrintWriter Pw = null;

		try {
			if (!original.exists())
				this.createFilePrintStream(this.getArchivo());

			Fr = new FileReader(original);
			Br = new BufferedReader(Fr);

			if (!copia.exists()) {
				Fw = new FileWriter(copia, true);
				Pw = new PrintWriter(Fw);

				String renglon = "";
				while ((renglon = Br.readLine()) != null) {
					Pw.println(renglon.toUpperCase());
				}
				Pw.close();
				Fw.close();
			}
			Br.close();
			Fr.close();

			if (original.exists())
				original.delete();

			if (copia.exists())
				copia.renameTo(original);

		} catch (FileNotFoundException e) {
			Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING, null, e);
		} catch (IOException e) {
			Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING, null, e);
		} finally {

		}

	}

	public void createFilePrintStream(File a) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(a, true);
			ps = new PrintStream(fos); // mode append true = no sobreescribe

			ps.println("holaa mundo");
			ps.println("Chauu mundo");

			ps.flush();

		} catch (FileNotFoundException e) {
			Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING, null, e);
		} finally {
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING, null, e);
				}
		}
	}

	public ArrayList<String> leerArchivo(File arch) {
		try {
			FileReader frA = new FileReader(arch);
			BufferedReader br = new BufferedReader(frA);
			String linea = "";
			String texto = "";
			try {
				while ((linea = br.readLine()) != null) {
					a.add(linea);
					texto += linea.concat("\n");
				}
				br.close();
				frA.close();
				return a;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return a;

	}

	public String leer() {
		String cadena = "";
		try {
			int Byte = -1;
			while ((Byte = System.in.read()) != '\n') {
				if (Byte != 13)
					cadena += (char) Byte;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return cadena;
	}

	public void eliminarArchivo(File original) {

		File copia = new File("copia.dat");
		FileReader Fr = null;
		BufferedReader Br = null;
		FileWriter Fw = null;
		PrintWriter Pw = null;
		ArrayList<String> renglones = new ArrayList<>();

		try {
			Fr = new FileReader(original);
			Br = new BufferedReader(Fr);

			String renglon = "";
			while ((renglon = Br.readLine()) != null) {
				if (!renglon.contains("1"))
					renglones.add(renglon.toLowerCase());
			}
			Fr.close();
			Br.close();
			Fw = new FileWriter(copia, true);
			Pw = new PrintWriter(Fw);

			for (String r : renglones) {
				Pw.println(r);
			}
			Fw.close();
			Pw.close();

			if (original.exists())
				original.delete();

			if (copia.exists())
				copia.renameTo(original);

		} catch (FileNotFoundException e) {
			Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING, null, e);
		} catch (IOException e) {
			Logger.getLogger(Ficheros.class.getName()).log(Level.WARNING, null, e);
		} finally {

		}

	}

	public void guardar(File a, ArrayList datos) {
		FileOutputStream fosArch = null;
		try {
			if (!a.exists()) {
				try {
					a.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fosArch = new FileOutputStream(a, true);
			ps = new PrintStream(fosArch);
			for (int i = 0; i < datos.size(); i++) {
				ps.println(datos.get(i));
				ps.flush();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				fosArch.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}