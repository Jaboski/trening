package zadaniaZEbooka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class utils {

	/**metoda czytaj¹ca z konsoli
	 * @return linia z konsoli
	 * @throws IOException
	 */
	public static String readLine() throws IOException {
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader bufor = new BufferedReader(reader);
	String linia = bufor.readLine();
	return linia;
	
	
	}
}
