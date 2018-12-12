package eb2;

import java.util.Scanner;

public class Ariketa_03_17_KONTABOK {

	public static void main(String[] args) {
		/*Egin KONTABOK klasea. Honek, karaktere kate bat eskatuko du. Programak
		zenbat bider sartu den bokal bakoitza esango du, ez ditu ezberdinduko larriak eta
		txikiak. Azkenean bokal bakoitza zenbat bider sartu den esango du.
		 */
		String katea;
		int[] bokalak = new int[5]; 
		char kar;
		int posizioa;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Sartu kate bat: ");
		katea = kb.nextLine();
		kb.close();
		
		for (int i = 0; i< katea.length(); i++) {
			kar = Character.toLowerCase(katea.charAt(i));
			posizioa = "aeiou".indexOf(kar);
			if (posizioa >= 0) {bokalak[posizioa]++;} 
		}
		
		for (int i=0 ; i<5 ; i++) {
			System.out.printf("%c : %d\n", "aeiou".charAt(i), bokalak[i]);		
		}

	}

}
