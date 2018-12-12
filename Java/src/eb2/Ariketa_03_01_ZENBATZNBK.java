package eb2;

import java.util.Scanner;

public class Ariketa_03_01_ZENBATZNBK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua = new Scanner(System.in);
		int zbk = -1;
		int frekuentziak[];
		frekuentziak = new int[5];
		//Mugak arrayan minimo eta maximoaren posizioa eta balioa gordeko ditugu orden horretan, honela:
		//mugak[0][0] minimoa, zein den zenbakia
		//mugak[0][1] minimoa, zein den kopurua
		int mugak[][];
		mugak = new int[2][2];
			
		 do {
			System.out.print("Sartu 1 eta 5 arteko zenbakia (0 ateratzeko): ");
			zbk = teklatua.nextInt();
			//System.out.print(zbk);
			if (zbk>=1 && zbk <= 5) {
				frekuentziak[zbk-1]++;
			}
			else if (zbk!=0) {System.out.println("Erabiltzaile-errorea, aldatu erabiltzailea.");}
			
		}  while (zbk != 0);
		 
		teklatua.close();
		
		mugak[0][1]=frekuentziak[0]; 
		mugak[1][1]=frekuentziak[0];
		
		for (int i=0;i<5;i++) {
		System.out.printf("%d : %d\n", i+1, frekuentziak[i]);

			//System.out.printf("%d : %d\n", i+1, frekuentziak[i]);
			
			if (frekuentziak[i]==0) {
				System.out.printf("%d ez da sartu\n", i+1);
			}
			
			if (frekuentziak [i]<mugak[0][1]) {
				mugak[0][0]=i+1;
				mugak[0][1]=frekuentziak[i];
			}
			if (frekuentziak [i]> mugak[1][1]) {
				mugak[1][0]=i+1;
				mugak[1][1]=frekuentziak[i];
			}
		}
		
		System.out.printf("Minimoa: %d Kopurua:%d\n", mugak[0][0], mugak[0][1]);
		System.out.printf("Maximoa: %d Kopurua:%d\n", mugak[1][0], mugak[1][1]);
		
	}

}
