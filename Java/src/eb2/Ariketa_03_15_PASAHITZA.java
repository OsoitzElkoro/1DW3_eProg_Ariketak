package eb2;

import java.util.Scanner;

public class Ariketa_03_15_PASAHITZA {
	
	public static void main(String[] args) {	
		int kopurua = 10;
		String[][] datubasea = new String[kopurua][2];
		String erabiltzailea;
		String pasahitza;
		int saiakerak = 3;
		boolean sarbidea = false;
		Scanner teklatua = new Scanner(System.in);
		
		for (int i=0; i<kopurua; i++) {
			datubasea[i][0]= "era"+(i+1);
			datubasea[i][1]= "pas"+(i+1);
		}
		
		/*
		for (int i=0; i<kopurua; i++) {
			System.out.println(datubasea[i][0]);
			System.out.println(datubasea[i][1]);
		}
		*/
		
		do {
			System.out.print("Erabiltzailea: ");
			erabiltzailea = teklatua.next();
			System.out.print("Pasahitza: ");
			pasahitza = teklatua.next();
	
			for (int i=0; i<kopurua && !sarbidea; i++) {
				if (erabiltzailea.equals(datubasea[i][0]) && pasahitza.equals(datubasea[i][1])) {sarbidea = true;}
			}
			
			if (sarbidea) {System.out.println("Ongi etorri " + erabiltzailea);} else {saiakerak--;}
			
		} while (saiakerak > 0 && !sarbidea);
			
		teklatua.close();
		if (!sarbidea) {System.out.println("Jarri kontaktuan sistema-administratzailearekin");}
		
		
		


	}
}