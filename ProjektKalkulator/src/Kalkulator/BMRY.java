package Kalkulator;

import Kalkulator.Trening.T;

public class BMRY {
	
	
	public static class BMR{
		private double masaCiala;
		private int wzrost;
		private int wiek;
		
		public static double wyliczBmr(BMR o) {
			return 9.99*o.getMasaCiala()+(6.25*o.getWzrost())-(4.92*o.getWiek())+5;
		}
		
		public static boolean podajMaseCiala(BMR o, boolean x1) {
			do{
				try{
					System.out.println("Podaj masê cia³a w kg.");
					double w = Double.parseDouble(Utils.readLine());
						if(w >= 20){
							x1=true;
							o.setMasaCiala(w);
						} else 
						System.out.println("WprowadŸ poprawn¹ wartoœæ.");
				} catch(Exception e){
					System.out.println("B³¹d. WprowadŸ cyfrê.");
				}				
			} while(x1!=true);
			return x1;			
		}
		
		public static boolean podajWzrost(BMR o, boolean x1) {
			do{
				try{
					System.out.println("Podaj wzrost w cm.");
					int w2 = Integer.parseInt(Utils.readLine());
					if(w2 >= 100 && w2 <= 250){
						x1=true;
						o.setWzrost(w2);
					} else
						System.out.println("WprowadŸ poprawn¹ wartoœæ.");
				} catch(Exception e){
					System.out.println("B³¹d. WprowadŸ cyfrê.");
				}
			} while(x1!=true);
			return x1;
		}
		
		public static boolean podajWiek(BMR o, boolean x1) {			
			do{
				try{
					System.out.println("Podaj wiek.");
					int w3 = Integer.parseInt(Utils.readLine());
					if(w3 > 5 && w3 < 130){
						x1=true;
						o.setWiek(w3);
					} else
						System.out.println("Podaj poprawn¹ wartoœæ.");
				} catch(Exception e){
					System.out.println("B³¹d. WprowadŸ cyfrê.");
				}
			} while(x1!=true);			
			return x1;
		}
		
		public double getMasaCiala() {
			return masaCiala;
		}
		public void setMasaCiala(double masaCiala) {
			this.masaCiala = masaCiala;
		}
		public int getWzrost() {
			return wzrost;
		}
		public void setWzrost(int wzrost) {
			this.wzrost = wzrost;
		}
		public int getWiek() {
			return wiek;
		}
		public void setWiek(int wiek) {
			this.wiek = wiek;
		}
	}
	
	public static class BMR2{
		private double sylwetka;
		private double bmr3;
		private double bmr2;
		private double trening;
		
		public static void wyliczBmr3(BMR2 p, T q) {
			p.setTrening((q.getDni()* q.getCzasT()* q.getIntensywnoscT() + q.getDni()* q.getCzasC()* q.getIntensywnoscC())/7);
			p.setBmr3((p.getBmr2()+p.getTrening())+((p.getBmr2()+p.getTrening())*0.1));
		}
		
		public static boolean okreslSylwetke(BMR2 p, boolean x1) {
			double zmienna2;
			do{
				System.out.println("Okreœl rodzaj swojej sylwetki i podaj liczbê (staraj siê wybraæ liczbê z podanego przedzia³u, aby otrzymaæ jak najdok³adniejszy wynik).");
				System.out.println("Ektomorfik = 700~900 kcal \n"
						+ "Endomorfik = 200~400 kcal \n"
						+ "Mezomorfik = 400~500 kcal");	
				try{				
					zmienna2 = Double.parseDouble( Utils.readLine());
					if(zmienna2 >= 200 && zmienna2 <= 900){
						x1 = true;
						p.setSylwetka(zmienna2);
					} else
						System.out.println("WprowadŸ poprawn¹ wartoœæ.");
				} catch(Exception e){
					System.out.println("B³¹d. WprowadŸ cyfrê.");
				}
			} while(x1!=true);			
			return x1;
		}
		
		public double getTrening() {
			return trening;
		}

		public void setTrening(double trening) {
			this.trening = trening;
		}

		public double getSylwetka() {
			return sylwetka;
		}

		public void setSylwetka(double sylwetka) {
			this.sylwetka = sylwetka;
		}

		public double getBmr2() {
			return bmr2;
		}

		public void setBmr2(double bmr2) {
			this.bmr2 = bmr2;
		}

		public double getBmr3() {
			return bmr3;
		}

		public void setBmr3(double bmr3) {
			this.bmr3 = bmr3;
		}
	}
		
	public static class BMR4 extends BMR2{
		private double bmr4;
		
		
		public double getBmr4() {
			return bmr4;
		}
		public void setBmr4(double bmr4) {
			this.bmr4 = bmr4;
		}
		public double zmniejsz(){
			bmr4 = getBmr3()-400;
			return bmr4;
		}
		public double zwieksz(){
			bmr4 = getBmr3()+400;
			return bmr4;
		}
	}
}


