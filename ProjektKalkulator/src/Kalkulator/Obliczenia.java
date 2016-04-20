package Kalkulator;

import Kalkulator.BMRY.BMR2;
import Kalkulator.BMRY.BMR4;

public class Obliczenia {

	public static class Wylicz extends BMR4{
		private double kcal;
		private double x;
		private double wynik;
		private double y;
		private int dT;
		private int dNT;

		public static void obliczWynik(BMR2 p, BMR4 k, Wylicz c) {
			c.setX(k.getBmr4()-p.getTrening());
			c.setY((p.getTrening()*7)/3);
			c.setWynik(c.getX()+c.getY());			
			c.setdT((int) (c.getWynik()+300));
			c.setdNT((int) (c.getWynik()-300));
		}	
		
		public int getdT() {
			return dT;
		}

		public void setdT(int dT) {
			this.dT = dT;
		}

		public int getdNT() {
			return dNT;
		}

		public void setdNT(int dNT) {
			this.dNT = dNT;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public double getWynik() {
			return wynik;
		}

		public void setWynik(double wynik) {
			this.wynik = wynik;
		}

		public double getKcal() {
			return kcal;
		}
		public void setKcal(double kcal) {
			this.kcal = kcal;
		}
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		
	}
}
