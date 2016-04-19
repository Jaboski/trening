package Kalkulator;

import java.util.LinkedHashMap;
import java.util.Map;

	public class Lista{

		private Map<String, Integer> mapa = new LinkedHashMap<>();

		public Map<String, Integer> getMapa() {
			return mapa;
		}

		public void setMapa(Map<String, Integer> mapa) {
			this.mapa = mapa;
		}

}
