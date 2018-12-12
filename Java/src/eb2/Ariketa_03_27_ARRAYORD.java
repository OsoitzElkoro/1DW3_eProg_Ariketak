package eb2;

import java.util.Scanner;

public class Ariketa_03_27_ARRAYORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		ARRAYORD programa egin. Programa honek, zenbaki positiboak teklatutik 
		hartu eta array baten sartzen ditu era ordenatuan, zenbaki negatibo bat sartu arte
		*/
		int[] zenbakiak = new int[0];
		int zbk=0;
		//System.out.print(zenbakiak.length);
		
		//Datuak eskatu
		
		Scanner kb = new Scanner(System.in);
		do {
			System.out.print("Zenbakia: ");
			zbk = kb.nextInt();
			zenbakiak = datuaTxertatu(zenbakiak, zbk);
			for (int i = 0; i < zenbakiak.length; i++) {
				System.out.print(zenbakiak[i]+" ");
			}
			System.out.println();
		} while (zbk >= 0);
		kb.close();
		
		
		
		
	}
	
	public static int[] datuaTxertatu (int[] zenbakiak, int zbk) {
		int luzera = zenbakiak.length;
		int[] berria = new int[luzera+1];
		int d = 0; //desplazamendua
		if (luzera == 0) {berria[0] = zbk;}
		else {
			for (int i = 0; i < luzera ; i++) {
				System.out.println("i: "+i +" d: "+d +" z: "+ zenbakiak[i] + " b: "+ berria[i]);
				if (zenbakiak[i]<zbk) {berria[i]= zbk;}
				else if (d == 0) {berria[i] = zbk; d = 1;}
				else {berria[i+d] = zenbakiak[i];}
			}
		}
		return (berria);
	}


}
