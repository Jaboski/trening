package zadaniaZEbooka;

import java.io.IOException;

public class pierwiastkiRownaniaKwadratowego {

	public static void main(String[] args) throws IOException {
		//Program oblicza pierwiastki rownania kwadratowego, gdzie: D= { a>0, delta>0}
		
		
		System.out.println("Podaj wartoœc a.");
		String a1 = utils.readLine();
		int a = Integer.parseInt(a1);
		if (a == 0){
			System.out.println("Wprowadzona liczba nie mo¿e byæ rowna 0.");
		} else { 
		System.out.println("Podaj wartoœc b.");
		String b1 = utils.readLine();
		int b = Integer.parseInt(b1);

		System.out.println("Podaj wartoœc b.");
		String c1 = utils.readLine();
		int c = Integer.parseInt(c1);
		
		int delta = b*b-4*a*c;
		if (delta<=0){
			System.out.println("Brak pierwiastków.");
		} else {
			double x1 = (-b+Math.sqrt(delta))/2*a;
			double x2 = (-b-Math.sqrt(delta))/2*a;
			
			System.out.println("Pierwiastki rzeczywiste z rownania "+a+"x^2+"+b+"x+"+c+" wynosz¹: \n");
			System.out.printf("x1: "+"%2.2f",x1);
			System.out.println();
			System.out.printf("x2 : "+"%2.2f",x2);
			}
		}
			
		}
	}
