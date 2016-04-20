package Kalkulator;

import java.io.IOException;

import Kalkulator.BMRY.BMR2;
import Kalkulator.BMRY.BMR4;

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
		
		public static boolean okreslTreningiWTygodniu(T q, boolean x1) {
					
			do{
				System.out.println("Ile razy w tygodniu wykonujesz trening? (podaj cyfr�)");
				try{	
					byte dni = Byte.parseByte(Utils.readLine());	
					if(dni>=1 && dni <= 14){
						x1 = true;
						q.setDni(dni);
					} else
						System.out.println("Wprowad� poprawn� warto��.");
				} catch(Exception e){
					System.out.println("B��d. Wprowad� cyfr�.");
				}
			} while(x1!=true);					
			return x1;
		}
		
		public static boolean okrelsCzasTreningu(T q, boolean x1) {		
			do{
				System.out.println("Ile czasu trwa Tw�j trening? (podaj liczb� w minutach)");
				try{
					short czasT = Short.parseShort(Utils.readLine());
					if(czasT >= 5 && czasT <=500){
						x1=true;
						q.setCzasT(czasT);
					} else
						System.out.println("Wprowad� poprawn� warto��.");
				} catch(Exception e){
					System.out.println("B��d. Wprowad� cyfr�.");
				}
			} while(x1!=true);				
			return x1;
		}
		
		public static boolean okreslIntensywnoscTreningu(T q, boolean x1) {
			do{				
				System.out.println("\nJak intensywny jest Tw�j trening? (Wybierz cyfr� przyporz�dkowan� do intensywno�ci Twojego treningu.)");
				T.WypiszT();
				try{
					byte pytanie = Byte.parseByte(Utils.readLine());				
					switch(pytanie){
					case 1: pytanie = q.getA();
						q.setIntensywnoscT(pytanie);
						x1=true; break;
					case 2: pytanie = q.getB();
						q.setIntensywnoscT(pytanie); 
						x1=true; break;
					case 3: pytanie = q.getC();
						q.setIntensywnoscT(pytanie); 
						x1=true; break;
					}
				} catch(Exception e){
					System.out.println("B��d. Wprowad� cyfr�.");
				}
			} while(x1!=true);			
			return x1;
		}
		
		public static boolean okreslCardio(T q, boolean x1) {			
			int czasC1;
				do{
					System.out.println("Ile czasu trwa Twoje cardio? (Podaj liczb� w minutach. Je�eli nie wykonujesz cardio wpisz 0.)");	
					try{
						czasC1 = Integer.parseInt(Utils.readLine());
						if(czasC1 >= 0 && czasC1 <= 500){
							x1 = true;
							q.setCzasC(czasC1);
						} else if(czasC1 == 0){
							q.setIntensywnoscC(q.getZero());
						} else
							System.out.println("Wprowad� poprawn� warto��.");
					} catch(Exception e){
							System.out.println("B��d. Wprowad� cyfr�.");
						}
				}while(x1!=true);
				
				if(q.getCzasC() != 0){		//je�li czas trwania cardio = 0 tzn �e cardio w treningu nie wyst�puje i pomijamy pytanie o intensywno��
					x1 = false;
					do{
						try{
							T.WypiszC();
							byte pytanie2 = Byte.parseByte(Utils.readLine());
							switch(pytanie2){
							case 1: pytanie2 = (byte) q.getD();
								q.setIntensywnoscC(pytanie2); 
								x1=true; break;
							case 2: pytanie2 = (byte) q.getE();
								q.setIntensywnoscC(pytanie2); 
								x1=true; break;
							case 3: pytanie2 = (byte) q.getF();
							q.setIntensywnoscC(pytanie2); 
								x1=true; break;
							} 
						} catch(Exception e){
							System.out.println("B��d. Wprowad� cyfr�.");
						}
					}while(x1!=true);
				}
				return x1;
		}
		
		public static boolean okreslCel(BMR2 p, BMR4 k, boolean x1) throws IOException {
			String zmienna3;
			do{
				System.out.println("Okre�l sw�j cel:\n"+
						"Chc� straci� na wadze. (Wybierz cyfr� 1)\n"+
						"Chc� przybra� na wadze. (Wybierz cyfr� 2)");	
				try{
				zmienna3 = Utils.readLine();
				if("1".equals(zmienna3)){						
					k.setBmr4(p.getBmr3()-400);
					x1 = true;
				} else 
					if("2".equals(zmienna3)){
						k.setBmr4(p.getBmr3()+400);
						x1 = true;						
				} else
					System.out.println("Wprowadz w�a�ciw� cyfr�.");
				} catch(Exception e){
					System.out.println("B��d. Wprowad� cyfr�.");
				}
			} while(x1!=true);			
			return x1;
		}

		public static void WypiszT(){
		String tab[] = new String[3];
		tab[0]= "1. Umiarkowana intensywno�� ";
		tab[1]= "2. �rednia intensywno�� ";
		tab[2]= "3. Wysoka intensywno�� ";
		
			for(int i=0; i<3; i++){
				System.out.print(tab[i]);
			System.out.println();
			}
		}
		
		public static void WypiszC(){
			System.out.println("\n Wybierz cyfr� przyporz�dkowan� do intensywno�ci Twojego cardio.");
			String tab[] = new String[3];
			tab[0]= "1. Umiarkowana intensywno�� (T�tno do 120 uderze�/min) ";
			tab[1]= "2. �rednia intensywno�� (T�tno od 120 do 160 uderze�/min) ";
			tab[2]= "3. Wysoka intensywno�� (T�tno powy�ej 160 uderze�/min) ";
					
			for(int i=0; i<3; i++){				
				System.out.print(tab[i]);				
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
