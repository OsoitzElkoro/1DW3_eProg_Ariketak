package eb2;

import java.util.Scanner;

public class Ariketa_03_26_BIDERMAT {
	
	public static void main(String[] args) {
		/*
		 * IRAULI izeneko programa bat egin. Programa honek, matrize bat irauliko du. 
		3*4ko matrizeko elementu guztiak eskatu eta beste matrize bat egin. Matrize berria 
		aurrekoaren iraulia izan
		go da. Amaieran, pantailatik matrize biak atera.
		 */
		int err = 3;
		int zut =4;
		int[][] matrizea = new int[err][zut];
		int[][] matrizea2 = new int[zut][err];
		
		//Datuak eskatu
		Scanner kb = new Scanner(System.in);		
		for (int i = 0 ; i < err; i++) {
			for (int j = 0 ; j < zut ; j++) {
				System.out.printf("[%d][%d]: ", i,j);
				matrizea[i][j] = kb.nextInt();
			}
		}
		kb.close();
		//Irauli
		matrizea2 = irauliMatrizea(matrizea);
		
		
		//Emaitza erakutsi
		System.out.println("\nLehen Matrizea");
		inprimatuMatrizea(matrizea);
		System.out.println("\nBigarren Matrizea");
		inprimatuMatrizea(matrizea2);
	
	}
	
	//FUNTZIOAK
	
	public static void inprimatuMatrizea (int[][] mat) {
		for (int i = 0 ; i < mat.length; i++) {
			for (int j = 0 ; j < mat[0].length ; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
	public static int[][] irauliMatrizea (int[][] mat) {
		int err = mat.length;
		int zut = mat[0].length;
		int[][] mat2 = new int[zut][err];
		for (int i = 0 ; i < err; i++) {
			for (int j = 0 ; j < zut ; j++) {
				mat2[j][i] = mat[i][j];
			}
		}
		
		return(mat2);
	}
	
	
}
