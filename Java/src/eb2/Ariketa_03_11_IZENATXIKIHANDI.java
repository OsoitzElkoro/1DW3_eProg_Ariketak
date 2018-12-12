package eb2;

import java.util.Scanner;

public class Ariketa_03_11_IZENATXIKIHANDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aldagiak
		String katea;
		char mota;
		Scanner teklatua = new Scanner(System.in);
		
		//Jaso datuak
		System.out.print("Sartu izena: ");
		katea = teklatua.nextLine();
		System.out.print("Handiz edo txikiz(h/t): ");
		mota = teklatua.next().charAt(0);
		teklatua.close();
		
		//Prozesatu datuak
		if (Character.toLowerCase(mota)=='h') {System.out.println(katea.toUpperCase());}
		else {System.out.println(katea.toLowerCase());}
	}

}
