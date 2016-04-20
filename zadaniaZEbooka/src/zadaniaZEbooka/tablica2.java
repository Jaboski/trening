package zadaniaZEbooka;

public class tablica2 {

	public static void main(String[] args) {
		
		int n=10, i, j, suma;
		
		int tab[][] = new int[n][n];
		
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				if(i==j)
					tab[i][j]=i;
				else
					tab[i][j]=0;
			}
		}	
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				System.out.print(tab[i][j]+" ");
			}
			System.out.println();
		}
		suma=0;
		for(i=0;i<n;i++){
			suma= suma+tab[i][i];
		}
		System.out.println("Suma wyró¿nionych elementów w tablicy wynosi "+suma+ ".");
	}
}
