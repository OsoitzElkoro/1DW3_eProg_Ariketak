package eb2;

import java.util.Arrays;
import java.util.Scanner;

public class Ariketa_03_12_IZENAORDENATU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aldagaiak
		int kopurua = 3;
		String[] izenak = new String[kopurua];
		Scanner teklatua = new Scanner(System.in);
		
		//Datuak jaso
		for (int i=0 ; i < kopurua; i++) {
			System.out.print("Sartu izena: ");
			izenak[i] = teklatua.nextLine();
		}
		teklatua.close();
		
		//Datuak prozesatu
		Arrays.sort(izenak);
		for (int i=0 ; i < kopurua; i++) {System.out.println(izenak[i]);}
	}

}
