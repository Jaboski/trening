package Kalkulator;

import java.io.IOException;

import Kalkulator.BMRY.BMR;
import Kalkulator.BMRY.BMR2;
import Kalkulator.BMRY.BMR4;
import Kalkulator.Obliczenia.Wylicz;
import Kalkulator.Trening.T;

public class Kalk {

	public static void main(String[] args) throws IOException {		
		
		BMR o = new BMR();

		boolean x1 = false;		
				x1 = BMR.podajMaseCiala(o, x1);
						
		x1 = false;
				x1 = BMR.podajWzrost(o, x1);
						
		x1 = false;			
				x1 = BMR.podajWiek(o, x1);
						
		double bmr =(9.99*o.getMasaCiala()+(6.25*o.getWzrost())-(4.92*o.getWiek())+5);
		//System.out.println(bmr);
		
		BMR2 p = new BMR2();		
				
		x1 = false; 
			x1 = BMR2.okreslSylwetke(p, x1);
			
		p.setBmr2(bmr + p.getSylwetka());
		//System.out.println(p.getBmr2());
		
		T q = new T();
				
		x1 = false;			
				x1 = T.okreslTreningiWTygodniu(q, x1);
					
			x1 = false;			
					x1 = T.okrelsCzasTreningu(q, x1);		
												
				x1 = false;	
						x1 = T.okreslIntensywnoscTreningu(q, x1);
			
		x1 = false;			
			T.okreslCardio(q, x1);
			
		p.setTrening((q.getDni()* q.getCzasT()* q.getIntensywnoscT() + q.getDni()* q.getCzasC()* q.getIntensywnoscC())/7);
		p.setBmr3((p.getBmr2()+p.getTrening())+((p.getBmr2()+p.getTrening())*0.1));	
		//System.out.println(p.getBmr3());
		
		BMR4 k = new BMR4();
								
		x1 = false;									
			x1 = T.okreslCel(p, k, x1); 
								
		System.out.println("\nObliczam zapotrzebowanie kaloryczne...\n");
			Wylicz c = new Wylicz();
				Wylicz.obliczWynik(p, k, c);
		
		Lista b = new Lista();
			Lista.dodajDoListy(c, b);		
				Lista.wypiszListe(b);
			
		System.out.println("\nCzy chcesz zakoñczyæ dzia³anie programu? (Podaj t):");
			x1 = false;
			Utils.zakonczProgram(x1);
			
		System.out.println("¯egnaj u¿ytkowniku.\n");
	
	}

	

	

	

				
}

