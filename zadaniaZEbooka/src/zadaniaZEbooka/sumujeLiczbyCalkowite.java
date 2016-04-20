package zadaniaZEbooka;

public class sumujeLiczbyCalkowite {

	public static void main(String[] args) {
		int i, suma=0;
		
		System.out.println("Sumuje liczby od 1 do 100.");
		
		for(i=1; i<=100; i++){
			suma = suma+i;
		}
			System.out.println("Suma liczb od 1 do 100 wynosi: "+suma);
	}

}
