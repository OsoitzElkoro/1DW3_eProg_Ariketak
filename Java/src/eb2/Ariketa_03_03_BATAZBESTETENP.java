package eb2;

import java.util.Scanner;

public class Ariketa_03_03_BATAZBESTETENP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		3.
		BATAZBESTETENP Pantailatik 10 tenperatura eskatuko ditu
		Gero bataz bestekoa,  bataz bestekoa baino handiago, 
		txikiago eta berdinak diren tenperaturak aurkeztuko ditu.

		Zenbat  tenperaturak  daukate  batez  bestekotik  10�tako   diferentzia, 
		portzentaje eta zeintzuk 
		Zenbat tenperatura dira 0� azpikoak , portzentajea eta zeintzuk
		 */
		
		int kopurua = 10;
		int extremkopurua=0;
		int negatibokopurua=0;
		Double[] tenperaturak = new Double[kopurua];
		Double[] extremoak = new Double[kopurua];
		Double[] negatiboak = new Double[kopurua];
		Double porextrem = 0.0;
		Double pornegatiboak = 0.0;
		Double tenperatura;
		Double batura = 0.0;
		Scanner teklatua = new Scanner(System.in);
		Double batazbestekoa;
		
		for (int i=0; i<kopurua ; i++) {
			System.out.print("Tenperatura: ");
			tenperatura = teklatua.nextDouble();
			tenperaturak[i] = tenperatura;
			batura += tenperatura;
		}
		teklatua.close();
		batazbestekoa = batura/kopurua;
		System.out.printf("Batazbestekoa: %.1f\n", batazbestekoa);
		
		
		for (int i=0; i<kopurua ; i++) {
			if (tenperaturak[i] > batazbestekoa) {System.out.printf("%.1f goitik\n", tenperaturak[i]);}
			else if (tenperaturak[i] == batazbestekoa) {System.out.printf("%.1f batazbestean\n", tenperaturak[i]);}
			else {System.out.printf("%.1f behetik\n", tenperaturak[i]);}
			//System.out.println(tenperaturak[i]);
			
			if (Math.abs(tenperaturak[i]-batazbestekoa)>=10) {
				extremoak[extremkopurua] = tenperaturak[i];
				extremkopurua++;
				}
			
			if (tenperaturak[i]<0) {
				negatiboak[negatibokopurua] = tenperaturak[i];
				negatibokopurua++;
				}
			
			
		}
		
		porextrem = 100*(double)extremkopurua/kopurua;
		System.out.printf("\n%d tenperatura (% %.1f) batazbestekotik 10� edo gehiago haratago\n", extremkopurua, porextrem);	
		for (int x=0; x<=extremkopurua ; x++) {System.out.printf("%.1f | ", extremoak[x]);}
		
		pornegatiboak = 100*(double)negatibokopurua/kopurua;
		System.out.printf("\n%d tenperatura (% %.1f) negatibo\n", negatibokopurua, pornegatiboak);	
		for (int x=0; x<=negatibokopurua ; x++) {System.out.printf("%.1f | ", negatiboak[x]);}
		
	}

}
