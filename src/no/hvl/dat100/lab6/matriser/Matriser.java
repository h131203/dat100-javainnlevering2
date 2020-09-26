package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	/*
	 * Implementer en metode:
public static void skrivUtv1(int[][] matrise)
som kan skrive ut en matrise. Prøv å bruk to to (nøstede) utvidede for-løkker (se avsnitt 5.6 i boken for beskrivelse av utvidet for-løkke).
	 */
	public static void skrivUt(int[][] matrise) {
		
		for (int[] i: matrise) {
			for (int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}		
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	/*
	 * Implementer en metode

public static String tilStreng(int[][] matrise)
som returnerer en streng-representation av en matrise. Om matrisen er følgende:

{ {1,2,3}, {4,5,6}, {7,8,9} }
da skal strengen som returneres ha følgende innhold:

1 2 3 \n4 5 6 \n7 8 9 \n
	 */
	public static String tilStreng(int[][] matrise) {
		
		String matriseString = "";
		
		for (int[] i: matrise) {
			for (int j: i) {
				matriseString += j + " ";
			}
			matriseString += "\n";
		}	
		return matriseString;
		
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	/*
	 * Implementer en metode
public static int[][] skaler(int tall, int[][] matrise)
som returnerer en ny matrise der alle tall i matrisen er multiplisert med parameteren tall. 
Metoden må først opprette en matrise like stor som parameteren og så multiplisere alle elementer med tall.
	 */
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise.length];
		
		for(int i=0; i<matrise.length; i++) {
			for(int j=0; j<matrise.length; j++) {
					nyMatrise[i][j] += matrise[i][j] * tall;
			}
		}
		
		return nyMatrise;
		//throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	/*
	 * Implementer en metode
public static boolean erLik(int[][] mat1, int[][] mat2)
som avgjør om to matriser gitt ved parametrene a og b er like.
	 */
	
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean erLik = false;
		
		for (int i = 0; i<a.length; i++) {
			for (int j = 0; j<b.length; j++) {
				if (a[i][j] == b[i][j]) {
					erLik = true;
				}
			}
		}
		
		return erLik;

		//throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
