package eb2;

import java.util.Scanner;

public class Ariketa_03_02_BATAZBESTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		int kopurua = 5; //Sartu daitekeen zenbaki kopurua
		int zbk;
		int batura = 0;
		double promedioa;
		int zenbakiak[];

		String katea;
		zenbakiak = new int[kopurua];

		for (int i = 0 ; i < kopurua ; i++) {
			System.out.print("Sartu zenbaki bat: ");
			zbk= teklatua.nextInt();
			zenbakiak[i]=zbk;
			batura = batura+zbk;
		}
		
		teklatua.close();
		
		promedioa=batura/kopurua;
		System.out.printf("Batezbestekoa: %.1f\n", promedioa);
		
		for (int i = 0; i < kopurua ; i++) {
			if (zenbakiak[i]<promedioa) {katea="azpitik";}
			else if (zenbakiak[i]>promedioa) {katea="gainetik";}
			else {katea = "berdina";}
			System.out.println(zenbakiak[i] + " " + katea);
		}
		
	}

}
