package Kalkulator;

import Kalkulator.BMRY.BMR4;

public class Obliczenia {

	public static class Wylicz extends BMR4{
		private double kcal;
		private double x;
		private double wynik;
		private double y;
		private int dT;
		private int dNT;

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
