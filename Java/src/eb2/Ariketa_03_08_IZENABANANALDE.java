package eb2;

import java.util.Scanner;

public class Ariketa_03_08_IZENABANANALDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String katea;
		Scanner teklatua = new Scanner(System.in);
		System.out.print("Idatzi zure izena: ");
		katea = teklatua.nextLine();
		teklatua.close();
		for (int i=0; i<katea.length(); i++) {
			System.out.println(katea.charAt(katea.length()-i-1));
		}
	}

}
