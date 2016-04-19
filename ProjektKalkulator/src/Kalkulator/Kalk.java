package Kalkulator;

import java.io.IOException;

import Kalkulator.BMRY.BMR;
import Kalkulator.BMRY.BMR2;
import Kalkulator.BMRY.BMR4;
import Kalkulator.Obliczenia.Wylicz;
import Kalkulator.Trening.T;

public class Kalk {

	public static void main(String[] args) throws IOException {
		
		//TODO: wyj�tki
		
		BMR o = new BMR();

		boolean x1 = false;
			do{
				x1 = BMR.podajMaseCiala(o, x1);
			} while(x1!=true);
			
		boolean x2 = false;
			do{
				x2 = BMR.podajWzrost(o, x2);
			} while(x2!=true);
			
		boolean x3 = false;
			do{
				x3 = BMR.podajWiek(o, x3);
			}while(x3!=true);
			
		double bmr =(9.99*o.getMasaCiala()+(6.25*o.getWzrost())-(4.92*o.getWiek())+5);
		//System.out.println(bmr);
		
		BMR2 p = new BMR2();
		
		System.out.println("Okre�l rodzaj swojej sylwetki i podaj liczb� (staraj si� wybra� liczb� z podanego przedzia�u, aby otrzyma� jak najdok�adniejszy wynik).");
		System.out.println("Ektomorfik = 700~900 kcal \n"
				+ "Endomorfik = 200~400 kcal \n"
				+ "Mezomorfik = 400~500 kcal");		
		//try { /*} catch (NumberFormatException e) { System.out.println("Z�y format, podaj liczb�.");}*		
		//TODO: poprawi� exception
		boolean x4 = false;
			do{ 
			x4 = BMR2.okreslSylwetke(p, x4);
			}while(x4!=true);
		p.setBmr2(bmr + p.getSylwetka());
		//System.out.println(p.getBmr2());
		
		T q = new T();
		
		System.out.println("Ile razy w tygodniu wykonujesz trening? (podaj cyfr�)");
		boolean x5 = false;
			do{
				x5 = T.okreslTreningiWTygodniu(q, x5);
			} while(x5!=true);
			
		System.out.println("Ile czasu trwa Tw�j trening? (podaj liczb� w minutach)");
		boolean x6 = false;
			do{
				x6 = T.okrelsCzasTreningu(q, x6);		
			} while(x6!=true);
					
			
		boolean x7 = false;
			do{
				x7 = T.okreslIntensywnoscTreningu(q, x7);
			}while(x7!=true);
			
		System.out.println("Ile czasu trwa Twoje cardio? (Podaj liczb� w minutach. Je�eli nie wykonujesz cardio wpisz 0.)");	
			T.okreslCardio(q);
			
		p.setTrening((q.getDni()* q.getCzasT()* q.getIntensywnoscT() + q.getDni()* q.getCzasC()* q.getIntensywnoscC())/7);
		p.setBmr3((p.getBmr2()+p.getTrening())+((p.getBmr2()+p.getTrening())*0.1));	//sprawdzic to spalanie termiczne i w dol
		//System.out.println(p.getBmr3());
		
		BMR4 k = new BMR4();
		
		System.out.println("Okre�l sw�j cel:\n"+
				"Chc� straci� na wadze. (Wybierz cyfr� 1)\n"+
				"Chc� przybra� na wadze. (Wybierz cyfr� 2)");		
			String zmienna3;
			boolean x9 = false;
				do{										
					x9 = T.okreslCel(p, k, x9); 
				} while(x9!=true);
				
		//System.out.println(k.getBmr4()+"\n");
		System.out.println("\nObliczam zapotrzebowanie kaloryczne...\n");
			Wylicz c = new Wylicz();
			c.setX(k.getBmr4()-p.getTrening());
			c.setY((p.getTrening()*7)/3);
			c.setWynik(c.getX()+c.getY());			
			c.setdT((int) (c.getWynik()+200));
			c.setdNT((int) (c.getWynik()-200));

		//System.out.println("\n"+ c.getWynik());
		
		Lista b = new Lista();
		b.getMapa().put("�rednie zapotrzebowanie kaloryczne wynosi: ", (int) c.getWynik());
		b.getMapa().put("Poniedzia�ek:  ", c.getdT());
		b.getMapa().put("Wtorek:        ", c.getdNT());
		b.getMapa().put("�roda:         ", c.getdT());
		b.getMapa().put("Czwartek:      ", c.getdNT());
		b.getMapa().put("Pi�tek:        ", c.getdT());
		b.getMapa().put("Sobota:        ", c.getdNT());
		b.getMapa().put("Niedziela:     ", c.getdNT());
		
			for(String key : b.getMapa().keySet()){
				System.out.printf(key+b.getMapa().get(key));
				System.out.println();
			}
		//zapis
		System.out.println("\nCzy chcesz zako�czy� dzia�anie programu? (Podaj t):");
			boolean wyjscie = false;
			do{										
				zmienna3 = Utils.readLine();
				if("t".equals(zmienna3)){
					wyjscie = true;
				} else 
					System.out.println("Nie ma takiego polecenia.");
			} while(!wyjscie);
			
		System.out.println("�egnaj u�ytkowniku.\n");
	
	}				
}

