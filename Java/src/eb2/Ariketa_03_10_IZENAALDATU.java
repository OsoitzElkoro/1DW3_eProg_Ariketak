package eb2;

import java.util.Scanner;

public class Ariketa_03_10_IZENAALDATU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aldagaiak
		String katea;
		char[] karaktereak;
		Scanner teklatua = new Scanner(System.in);
		
		//Datuak jaso
		System.out.print("Sartu izena: ");
		katea = teklatua.nextLine();
		teklatua.close();
		
		//Datuak prozesatu
		karaktereak = new char[katea.length()];
		for (int i=0; i<katea.length(); i++) {
			karaktereak[i] = katea.charAt(katea.length()-i-1);
		}
		
		katea = new String(karaktereak);		
		System.out.println(katea);
		
	}

}
