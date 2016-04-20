package zadaniaZEbooka;

public class obliczaFunkcje {

	public static void main(String[] args) {
		
		int x,y;
		
		System.out.println("Oblicza wartosc funkcji y=3x, gdzie x jest w przedziale od 0 do 10.");
		for ( x=0; x<=10; x++){
		y=3*x;
		
		System.out.println("Dla x="+x +'\t' +"y= "+y );
		}
	}
}
