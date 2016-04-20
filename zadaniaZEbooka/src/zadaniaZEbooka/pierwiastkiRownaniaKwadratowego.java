package zadaniaZEbooka;

import java.io.IOException;

public class pierwiastkiRownaniaKwadratowego {

	public static void main(String[] args) throws IOException {
		//Program oblicza pierwiastki rownania kwadratowego, gdzie: D= { a>0, delta>0}
		
		
		System.out.println("Podaj warto�c a.");
		String a1 = utils.readLine();
		int a = Integer.parseInt(a1);
		if (a == 0){
			System.out.println("Wprowadzona liczba nie mo�e by� rowna 0.");
		} else { 
		System.out.println("Podaj warto�c b.");
		String b1 = utils.readLine();
		int b = Integer.parseInt(b1);

		System.out.println("Podaj warto�c b.");
		String c1 = utils.readLine();
		int c = Integer.parseInt(c1);
		
		int delta = b*b-4*a*c;
		if (delta<=0){
			System.out.println("Brak pierwiastk�w.");
		} else {
			double x1 = (-b+Math.sqrt(delta))/2*a;
			double x2 = (-b-Math.sqrt(delta))/2*a;
			
			System.out.println("Pierwiastki rzeczywiste z rownania "+a+"x^2+"+b+"x+"+c+" wynosz�: \n");
			System.out.printf("x1: "+"%2.2f",x1);
			System.out.println();
			System.out.printf("x2 : "+"%2.2f",x2);
			}
		}
			
		}
	}
