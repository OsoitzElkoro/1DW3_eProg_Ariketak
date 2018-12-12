package eb2;

import java.util.Scanner;

public class Ariketa_03_18_BETEMATRIZEA01 {
	
	public static void main(String[] args) {
		
		//int kopurua = 12;
		int zbk;
		int lerroak;
		int zutabeak;
		boolean aurkituta= false;
		int[][] zenbakiak;
		Scanner kb = new Scanner(System.in);
		
		//Datu eskaria
		System.out.print("Lerro kopurua: ");
		lerroak = kb.nextInt();
		System.out.print("Zutabe kopurua: ");
		zutabeak = kb.nextInt();
		
		zenbakiak = new int[lerroak][zutabeak];
		
		for (int i=0; i < lerroak ; i++) {
			for (int j=0; j<zutabeak ; j++) {
				System.out.printf("Matrizea[%d][%d]: ", i, j);
				zenbakiak[i][j] = kb.nextInt();
			}
		}
		//kb.close();
		
		//Datuen prozesua
		
		for (int i=0; i < lerroak ; i++) {
			for (int j=0; j<zutabeak ; j++) {
				System.out.print(zenbakiak[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		//03_19 Ariketa
		
		System.out.print("\nBilatzeko zenbakia: ");
		zbk = kb.nextInt();
		kb.close();
		
		for (int i=0; i < lerroak ; i++) {
			for (int j=0; j< zutabeak ; j++) {
				
				if (zenbakiak[i][j] == zbk) {
					aurkituta = true;
					System.out.printf("%d zenbakia %d,%d posizioan dago", zbk, i, j);
				}
			}
			//System.out.print("\n");
		}
		if (!aurkituta) {System.out.println("Zenbaki hori ez dago matrizean");}
		
	
		//Ariketa 03_20
		
		System.out.println();
		for (int i=0; i < lerroak ; i++) {
			int batuketa = 0;
			for (int j=0; j<zutabeak ; j++) {
				System.out.print(zenbakiak[i][j]+"\t");
				batuketa += zenbakiak[i][j];
			}
			System.out.printf("batuketa: %d\n", batuketa);
		}
		
		
		
	}
	
}
