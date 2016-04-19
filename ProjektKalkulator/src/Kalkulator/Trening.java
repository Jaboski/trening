package Kalkulator;

import java.io.IOException;

import Kalkulator.BMRY.BMR2;
import Kalkulator.BMRY.BMR4;
import Kalkulator.Trening.T;

public class Trening {

	public static class T{
		private final byte a = 8;
		private final byte b = 10;
		private final byte c = 12;
		private final byte d = 5;
		private final byte e = 10;
		private final byte f = 12;
		
		private short czasT;
		private int czasC;
		private byte dni;
		private short intensywnoscC;
		private short intensywnoscT;
		public byte zero = 0;
		
		public static boolean okreslTreningiWTygodniu(T q, boolean x5) throws IOException {
			byte dni = Byte.parseByte(Utils.readLine());
				if(dni>=1 && dni <= 14){
					x5 = true;
					q.setDni(dni);
				} else
					System.out.println("WprowadŸ poprawn¹ wartoœæ.");
			return x5;
		}
		
		public static boolean okrelsCzasTreningu(T q, boolean x6) throws IOException {
			short czasT = Short.parseShort(Utils.readLine());
			if(czasT >= 5 && czasT <=500){
				x6=true;
				q.setCzasT(czasT);
			} else
				System.out.println("WprowadŸ poprawn¹ wartoœæ.");
			return x6;
		}
		
		public static boolean okreslIntensywnoscTreningu(T q, boolean x7) throws IOException {
			System.out.println("\nJak intensywny jest Twój trening? (Wybierz cyfrê przyporz¹dkowan¹ do intensywnoœci Twojego treningu.)");
			T.WypiszT();
			byte pytanie = Byte.parseByte(Utils.readLine());
			
			switch(pytanie){
			case 1: pytanie = q.getA();
				q.setIntensywnoscT(pytanie);
				x7=true; break;
			case 2: pytanie = q.getB();
				q.setIntensywnoscT(pytanie); 
				x7=true; break;
			case 3: pytanie = q.getC();
				q.setIntensywnoscT(pytanie); 
				x7=true; break;
			}
			return x7;
		}
		
		public static void okreslCardio(T q) throws IOException {
			boolean x8 = false;
			int czasC;
				do{
					czasC = Integer.parseInt(Utils.readLine());
					if(czasC >= 0 && czasC <= 500){
						x8 = true;
						q.setCzasC(czasC);
					} else if(czasC == 0){
						q.setIntensywnoscC(q.getZero());
					} else
						System.out.println("WprowadŸ poprawn¹ wartoœæ.");
				}while(x8!=true);
				
				if(czasC != 0){												//jeœli czas trwania cardio = 0 tzn ¿e cardio w treningu nie wystêpuje i pomijamy pytanie o intensywnoœæ
					boolean x = false;
					do{
					T.WypiszC();
					byte pytanie2 = Byte.parseByte(Utils.readLine());
					switch(pytanie2){
					case 1: pytanie2 = (byte) q.getD();
						q.setIntensywnoscC(pytanie2); 
						x=true; break;
					case 2: pytanie2 = (byte) q.getE();
						q.setIntensywnoscC(pytanie2); 
						x=true; break;
					case 3: pytanie2 = (byte) q.getF();
					q.setIntensywnoscC(pytanie2); 
						x=true; break;
					} 
					}while(x!=true);
				}
		}
		
		public static boolean okreslCel(BMR2 p, BMR4 k, boolean x9) throws IOException {
			String zmienna3;
			zmienna3 = Utils.readLine();
			if("1".equals(zmienna3)){						
				k.setBmr4(p.getBmr3()-400);
				x9 = true;
			} else 
				if("2".equals(zmienna3)){
					k.setBmr4(p.getBmr3()+400);
					x9 = true;						
			} else {
				System.out.println("Wprowadz w³aœciw¹ cyfrê.");
			}
			return x9;
		}

		public static void WypiszT(){
		String tab[] = new String[3];
		tab[0]= "1. Umiarkowana intensywnoœæ ";
		tab[1]= "2. Œrednia intensywnoœæ ";
		tab[2]= "3. Wysoka intensywnoœæ ";
		/*tab[0][1]= "8kcal/min";
		tab[1][1]= "    10kcal/min";
		tab[2][1]= "     12kcal/min";*/
		
			for(int i=0; i<3; i++){
				//for(int j=0; j<2; j++){
				System.out.print(tab[i]);
			System.out.println();
			}
		}
		
		public static void WypiszC(){
			System.out.println("\n Wybierz cyfrê przyporz¹dkowan¹ do intensywnoœci Twojego cardio.");
			String tab[][] = new String[3][2];
			tab[0][0]= "1. HR do 120/min ";
			tab[1][0]= "2. HR 120-160/min ";
			tab[2][0]= "3. HR >160/min ";
			tab[0][1]= "5kcal/min";
			tab[1][1]= "10kcal/min";
			tab[2][1]= "12kcal/min";
					
			for(int i=0; i<3; i++){
				for(int j=0; j<2; j++){
				System.out.print(tab[i][j]);
				}
			System.out.println();
			}
		}

	public byte getA() {
		return a;
	}

	public byte getB() {
		return b;
	}

	public byte getC() {
		return c;
	}

	public byte getD() {
		return d;
	}

	public byte getE() {
		return e;
	}

	public byte getF() {
		return f;
	}

	public short getCzasT() {
		return czasT;
	}

	public void setCzasT(short czasT) {
		this.czasT = czasT;
	}

	public int getCzasC() {
		return czasC;
	}

	public void setCzasC(int czasC) {
		this.czasC = czasC;
	}

	public byte getDni() {
		return dni;
	}

	public void setDni(byte dni) {
		this.dni = dni;
	}
	
	public byte getZero() {
		return zero;
	}

	public void setZero(byte zero) {
		this.zero = zero;
	}

	public short getIntensywnoscC() {
		return intensywnoscC;
	}

	public void setIntensywnoscC(short intensywnoscC) {
		this.intensywnoscC = intensywnoscC;
	}

	public short getIntensywnoscT() {
		return intensywnoscT;
	}

	public void setIntensywnoscT(short intensywnoscT) {
		this.intensywnoscT = intensywnoscT;
	}
		
	}
}
