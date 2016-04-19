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
	
	public static void zapiszDoPliku(File plik, Object obiekt) throws IOException{
		OutputStream out = new FileOutputStream(plik);
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		objectOut.writeObject(obiekt);
		
		objectOut.flush();
		objectOut.close();
		out.close();
	}
}
