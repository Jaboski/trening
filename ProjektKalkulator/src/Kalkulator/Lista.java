package Kalkulator;

import java.util.LinkedHashMap;
import java.util.Map;

import Kalkulator.Obliczenia.Wylicz;

	public class Lista{

		private Map<String, Integer> mapa = new LinkedHashMap<>();

		public static void dodajDoListy(Wylicz c, Lista b) {
			b.getMapa().put("Œrednie zapotrzebowanie kaloryczne wynosi: ", (int) c.getWynik());
			b.getMapa().put("Dzieñ treningowy    			  :  ", c.getdT());
			b.getMapa().put("Dzieñ nietreningowy 			  :        ", c.getdNT());
		}
		
		public static void wypiszListe(Lista b) {
			for(String key : b.getMapa().keySet()){
				System.out.printf(key+b.getMapa().get(key));
				System.out.println();
			}
		}
		
		public Map<String, Integer> getMapa() {
			return mapa;
		}

		public void setMapa(Map<String, Integer> mapa) {
			this.mapa = mapa;
		}

}
