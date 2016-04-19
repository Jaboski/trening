package Kalkulator;

import java.io.IOException;

public class BMRY {
	
	
	public static class BMR{
		private double masaCiala;
		private int wzrost;
		private int wiek;
		
		public static boolean podajMaseCiala(BMR o, boolean x1) throws IOException {
			System.out.println("Podaj masê cia³a w kg.");
			double w = Double.parseDouble(Utils.readLine());
				if(w >= 20){
					x1=true;
					o.setMasaCiala(w);
				} else
				System.out.println("WprowadŸ poprawn¹ wartoœæ.");
			return x1;
		}
		
		public static boolean podajWzrost(BMR o, boolean x2) throws IOException {
			System.out.println("Podaj wzrost w cm.");
			int w2 = Integer.parseInt(Utils.readLine());
				if(w2 >= 100 && w2 <= 250){
					x2=true;
					o.setWzrost(w2);
				} else
					System.out.println("WprowadŸ poprawn¹ wartoœæ.");
			return x2;
		}
		
		public static boolean podajWiek(BMR o, boolean x3) throws IOException {
			System.out.println("Podaj wiek.");
			int w3 = Integer.parseInt(Utils.readLine());
				if(w3 > 5 && w3 < 130){
					x3=true;
					o.setWiek(w3);
				} else
					System.out.println("Podaj poprawn¹ wartoœæ.");
			return x3;
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
		
		public static boolean okreslSylwetke(BMR2 p, boolean x4) throws IOException {
			double zmienna2;
			zmienna2 = Double.parseDouble( Utils.readLine());
				if(zmienna2 >= 200 && zmienna2 <= 900){
					x4 = true;
					p.setSylwetka(zmienna2);
				} else
					System.out.println("WprowadŸ poprawn¹ wartoœæ.");
			return x4;
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


