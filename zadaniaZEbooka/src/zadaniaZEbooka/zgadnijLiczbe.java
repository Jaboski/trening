package zadaniaZEbooka;

import java.io.IOException;
import java.util.Random;

public class zgadnijLiczbe {

	public static void main(String[] args) throws IOException {
		
		Random liczbaLosowa = new Random();
		int los = liczbaLosowa.nextInt(10);
		
		while (true){
		System.out.println("Zgadnij liczbe z przedzia�u od 1 do 9.");	
		String podaj = utils.readLine();
		int A = Integer.parseInt(podaj);
		
		if (los == A){
			System.out.println("Brawo, zgad�e� liczbe!");
			break;
		} else {
			System.out.println("Pr�buj dalej.");
			}
		}		
	}
}
