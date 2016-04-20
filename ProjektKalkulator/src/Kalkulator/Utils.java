package Kalkulator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Utils {

	public static String readLine() throws IOException{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufor = new BufferedReader(reader);
		String linia = bufor.readLine();
		return linia;			
	}
	
	public static void zakonczProgram(boolean x1) throws IOException {
		do{										
			String zmienna3 = Utils.readLine();
			if("t".equals(zmienna3)){
				x1 = true;
			} else 
				System.out.println("Nie ma takiego polecenia.");
		} while(x1!=true);
	}
	
	public static void zapiszDoPliku(File plik, Object obiekt) throws IOException{
		OutputStream out = new FileOutputStream(plik);
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		objectOut.writeObject(obiekt);
		
		objectOut.flush();
		objectOut.close();
		out.close();
	}
}
