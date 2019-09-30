package fr.gtm.banque;

import java.math.BigInteger;

public class Utilitaire {

	public static char remplaceLettres(char lettre) {
		char c = Character.toUpperCase(lettre);
		if (c >= '0' && c <= '9') {
			return c;
		}
		if (c == 'A' || c == 'J') {
			return (char) (c - 'A' + '1');
		}
		if (c == 'B' || c == 'K' || c == 'S') {
			return (char) (c - 'B' + '2');
		}
		if (c == 'C' || c == 'L' || c == 'T') {
			return (char) (c - 'C' + '3');
		}
		if (c == 'D' || c == 'M' || c == 'U') {
			return (char) (c - 'D' + '4');
		}
		if (c == 'E' || c == 'N' || c == 'V') {
			return (char) (c - 'E' + '5');
		}
		if (c == 'F' || c == 'O' || c == 'W') {
			return (char) (c - 'F' + '6');
		}
		if (c == 'G' || c == 'P' || c == 'X') {
			return (char) (c - 'G' + '7');
		}
		if (c == 'H' || c == 'Q' || c == 'Y') {
			return (char) (c - 'H' + '8');
		}
		if (c == 'I' || c == 'R' || c == 'Z') {
			return (char) (c - 'I' + '9');
		}
		return 0;
	}
	public static String nCompteInsert(String nCompte) {
		StringBuilder sb = new StringBuilder(nCompte);
		for(int i = 0 ; i<11-sb.length(); i++)
			sb.insert(0, 0);
		
		for(int i = 0; i<sb.length();i++) {
				sb.setCharAt(i, remplaceLettres(sb.charAt(i)));
			}
		 return sb.toString();
	}
	public static boolean validation(String nComplet) {
		BigInteger numeroCompte = new BigInteger(nComplet);
		BigInteger _97 = new BigInteger("97");
		return numeroCompte.mod(_97).equals(BigInteger.ZERO);
	}

}
