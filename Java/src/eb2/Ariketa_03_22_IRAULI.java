package eb2;

import java.util.Scanner;

public class Ariketa_03_22_IRAULI {
	
	public static void main(String[] args) {
		/*
		 * BIDERMAT izeneko programa bat egin. Programa honek, bi matrize es
		katuko ditu eta biderkatu egingo ditu. Horretarako lehenengoaren zutabe kopurua eta 
		bigarreneko errenkada kopurua berdina izango da. Biderketa egiteko honako 
		metodo hau erabili.
		 */
		int err1 = 0;
		int zut1 = 0;
		//int err2 = 0;
		int zut2 = 0;
		
		//Datuak eskatu
		Scanner kb = new Scanner(System.in);
		System.out.print("M1 errenkadak: ");
		err1 = kb.nextInt(); 
		System.out.print("M1 zutabeak: ");
		zut1 = kb.nextInt();
		System.out.print("M2 errenkadak <- M1 zutabeak\n");
		//err2 = zut1;
		System.out.print("M2 zutabeak: ");
		zut2 = kb.nextInt();
		
		int[][] mat1 = new int[err1][zut1];
		int[][] mat2 = new int[zut1][zut2];
		int[][] mat3 = new int[err1][zut2];
		
		System.out.print("\n1. Matrizea");
		mat1 = eskatuMatrizea (err1, zut1, kb);
		System.out.print("\n2. Matrizea");
		mat2 = eskatuMatrizea (zut1, zut2, kb);		
		kb.close();
		
		//Biderkatu
		mat3 = biderkatuMatrizeak(mat1,mat2);
		
		
		//Emaitza erakutsi
		System.out.println("\nLehen Matrizea");
		inprimatuMatrizea(mat1);
		System.out.println("\nBigarren Matrizea");
		inprimatuMatrizea(mat2);
		
		System.out.println("\nBiderketa");
		inprimatuMatrizea(mat3);
	
	
	}
	
	//FUNTZIOAK
	
	public static int[][] eskatuMatrizea (int err, int zut, Scanner kb){
		int[][] matrizea = new int[err][zut];
		for (int i = 0 ; i < err; i++) {
			for (int j = 0 ; j < zut ; j++) {
				System.out.printf("[%d][%d]: ", i,j);
				matrizea[i][j] = kb.nextInt();
			}
		}
		return(matrizea);
	}
	
	
	public static void inprimatuMatrizea (int[][] mat) {
		for (int i = 0 ; i < mat.length; i++) {
			for (int j = 0 ; j < mat[0].length ; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
	public static int[][] biderkatuMatrizeak (int[][] mat1, int[][]mat2) {
		int[][] mat3 = new int[mat1.length][mat2[0].length];
		//int batura=0;
		for (int i = 0 ; i < mat3.length; i++) {
			for (int j = 0 ; j < mat3[0].length ; j++) {
				for (int x = 0; x < mat1[0].length; x++) {
					mat3[i][j]+=mat1[i][x]*mat2[x][j];
					System.out.print(i+","+j+"\t");	
				}
				//System.out.print(mat[i][j]+"\n");
			}
			System.out.print("\n");
		}
		
		return(mat3);
	}
	
	
	
	
}
