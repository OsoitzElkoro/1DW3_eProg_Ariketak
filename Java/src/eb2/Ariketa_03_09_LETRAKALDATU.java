package eb2;

import java.util.Scanner;

public class Ariketa_03_09_LETRAKALDATU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aldagaiak
		String katea;
		char karberria;
		char[] karaktereak;
		int posbatetik = 0;
		int muga;
		Scanner teklatua = new Scanner(System.in);
		
		//Datuak jaso
		System.out.print("Sartu izena: ");
		katea = teklatua.nextLine();
		muga = katea.length();
		
		do {
			System.out.printf("posbatetik( 1 - %d): ", muga);
			posbatetik = teklatua.nextInt();
		} while(posbatetik < 1 || posbatetik > muga);
			
		System.out.print("Letra berria: ");
		karberria = teklatua.next().charAt(0);
		teklatua.close();
		
		//Datuak prozesatu
		karaktereak = new char[katea.length()];
		//for (int i=0; i<katea.length(); i++) {karaktereak[i] = katea.charAt(i);}
		karaktereak = katea.toCharArray();
		
		karaktereak [posbatetik-1] = karberria; //
		katea = new String(karaktereak);		
		System.out.println(katea);
	}

}
