package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
		// throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String utskrift = "";

		for (int i = 0; i < tabell.length; i++) {
			utskrift += tabell[i];
			if (i<tabell.length-1) {
				utskrift += ",";
			}
		}
		utskrift = "[" + utskrift + "]";
		return utskrift;
	}

	
	// c)
	public static int summer(int[] tabell) {

		int sumForLoop = 0; // for å vise hvilken sum som returneres fra for-løkken

		// med for-løkke
		for (int i = 0; i < tabell.length; i++) {
			sumForLoop += tabell[i];
		}

		// med while-løkke

		int i = 0;
		int sumWhileLoop = 0; // for å vise hvilken sum som returneres fra while-løkken.

		while (i < tabell.length) {
			sumWhileLoop += tabell[i];
			i++;
		}

		// med utvidet for-løkke
		int sumUtvidetForLoop = 0; // for å vise hvilken sum som returneres fra utvidet for-løkke
		for (int num : tabell) {
			sumUtvidetForLoop = sumUtvidetForLoop + num;
		}
		/*
		 * System.out.print("for loop:  " + sumForLoop);
		 * System.out.print("utvidet for loop: " + sumUtvidetForLoop);
		 * System.out.print("while gir lengde..:" + sumWhileLoop);
		 */

		return sumForLoop; //eller sumWhileLoop, eller sumUtvidetForLoop

	}

	// d)
	/*
	 * Implementer en metode: public static boolean finnesTall (int[] tabell, int
	 * tall) som gitt en tabell og et tall returnerer true om tabellen tabell
	 * innholder tallet tall og false ellers.
	 * 
	 * e)
	 */
	public static boolean finnesTall(int[] tabell, int tall) {

		int leterEtter = tall;
		boolean funnet = false;
		int i = 0;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == leterEtter) {
				funnet = true;
			}
			i++;
		}

		// throw new UnsupportedOperationException("finnesTall ikke implementert");
		return funnet;
	}

	// e)
	/*
	 * Implementer en metode public static int posisjonTall (int[] tabell, int tall)
	 * som returnerer det første index (posisjon) i tabell som inneholder tallet
	 * tall og -1 ellers.
	 */
	public static int posisjonTall(int[] tabell, int tall) {

		int leterEtter = tall;
		boolean funnet = false;
		int i = 0;
		int posisjon = 0;

		while (!funnet && i < tabell.length) {

			if (tabell[i] == leterEtter) {
				funnet = true;
				posisjon = i;
				return posisjon;
			}
			i++;
		}

		return -1;
		// throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	/*
	 * Implementer en metode public static int[] reverser(int[] tabell) som gitt en
	 * tabell av heltall returnerer en ny tabell som har de samme elementene som
	 * tabell men i modsatt rekkefølge.
	 */
	public static int[] reverser(int[] tabell) {
		
		int[] reversertTabell = new int[tabell.length];
	
		for (int i = 0; i < tabell.length; i++) {
			reversertTabell[i] = tabell[tabell.length - i - 1];
		}
		
		return reversertTabell;
		// throw new UnsupportedOperationException("reverser ikke implementert");

	}

	// g) 
	/*
	 * Implementer en metode:
	som kan avgjere om ein array (tabell) av heiltal er sortert stigande (dvs. at alle tal skal vere større enn det forrige)
	 */
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int i = 1;
		
		while (sortert && i < tabell.length) {
			if (tabell[i-1] <= tabell[i]) {
				i++;
			} else {
				sortert = false;
			}
		}
		return sortert;
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	/*
	 * Implementer en metode:
		som gitt to tabeller tabell1 og tabell2 som paramtere returnerer en ny tabell som er sammensetning av de to tabeller.
	 */
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length; //finner lengde totalt
		int[] nyTabell = new int[nyLengde]; //oppretter ny tab med lengden fra de 2 det gjelder
		for (int i = 0; i<tabell1.length; i++) {
			nyTabell[i] = tabell1[i]; // "flytter" tabell1 over til nyTabell
		}
		for (int j = 0; j<tabell2.length; j++) {
			nyTabell[tabell1.length+j] = tabell2[j]; //legger inn verdier fra tabell2 på første index ETTER LENGDEN på tabell 1.
		}
		return nyTabell;
		
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
