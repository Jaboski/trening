package zadaniaZEbooka;

import java.io.IOException;

public class sumaRoznicaIloczynIloraz {

	public static void main(String[] args) throws IOException {
		
//		oblicza sume, ró¿nice, iloczyn i iloraz dla dwoch liczb x i y
		
		System.out.println("Podaj pierwsz¹ wartoœc:");
		String liczba1 = utils.readLine();
		float x = Float.parseFloat(liczba1);
		
		System.out.println("Podaj drug¹ wartoœc:");
		String liczba2 = utils.readLine();
		float y = Float.parseFloat(liczba2);
		
		float suma = x+y;
		float roznica = x-y;
		float iloczyn = x*y;
		float iloraz = x/y;
		
		System.out.printf("Dla liczb " + "%2.2f",x);
		System.out.printf(" i " + "%2.2f",y);
		System.out.printf(" otrzymujemy: \n");
		System.out.printf("Suma: " +"%2.2f\n",suma);
		System.out.printf("roznica: " +"%2.2f\n",roznica);
		System.out.printf("iloczyn: " +"%2.2f\n",iloczyn);
		System.out.printf("iloraz: " +"%2.2f",iloraz);

		
		
		
	}

}
