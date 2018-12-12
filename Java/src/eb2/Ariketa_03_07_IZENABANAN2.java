package eb2;

import java.util.Scanner;

public class Ariketa_03_07_IZENABANAN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String katea;
		int luzera;
		char[] letrak;

		Scanner teklatua = new Scanner(System.in);
		
		System.out.print("Idatzi zure izena: ");
		katea = teklatua.nextLine();
		teklatua.close();
		
		luzera = katea.length();		
		letrak = new char[luzera];
		
		//for (int i=0; i<luzera; i++) {letrak[i] = katea.charAt(i);}
		letrak = katea.toCharArray();
		
		
		for (int i=0; i<luzera; i++) {
			System.out.println(letrak[i]);
		}
	}

}
