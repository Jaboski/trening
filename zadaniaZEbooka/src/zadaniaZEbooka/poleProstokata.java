package zadaniaZEbooka;

import java.io.IOException;

public class poleProstokata {

	public static void main(String[] args) throws IOException{

	System.out.println("Podaj dlugosc pierwszego boku.");
		String bokA = utils.readLine();
		int bok1 = Integer.parseInt(bokA);

		System.out.println("Podaj dlugosc drugiego boku.");	
		String bokB = utils.readLine();
		int bok2 = Integer.parseInt(bokB);

		
		
		System.out.println("Pole Twojego prostokata wynosi " +(bok1*bok2));
	}
}
