package eb2;

import java.util.Scanner;

public class Ariketa_03_14_ALDAGAIAMOLDATU2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aldagaiak
		String katea;
		double zbk;
		Scanner teklatua = new Scanner(System.in);
		
		//Datuak jaso
		System.out.print("Sartu zenbakia: ");
		zbk = teklatua.nextDouble();
		teklatua.close();
		
		//Datuak prozesatu
		katea = String.valueOf(zbk);
		System.out.println(katea);	
	}

}
