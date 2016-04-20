package zadaniaZEbooka;

import java.io.IOException;

public class trojkatProstokatny {

	public static void main(String[] args) throws IOException {
		
		int a, b, c;
		
		System.out.println("Podaj bok a.");
		String a1 = utils.readLine();
		
		System.out.println("Podaj bok b.");
		String b1 = utils.readLine();

		System.out.println("Podaj bok c.");
		String c1 = utils.readLine();

		a = Integer.parseInt(a1);
		b = Integer.parseInt(b1);
		c = Integer.parseInt(c1);

		if ((a*a+b*b) == c*c){
		System.out.println("Trójkat jest prostokatny.");
		} else {
			System.out.println("Trojkat nie jest prostokatny.");
		}
	}

}
