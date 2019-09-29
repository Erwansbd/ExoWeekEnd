package fr.gtm.banque;

import java.math.BigInteger;

public class Banque {

	public void verifnCompte(int nBanque, int codeEta, int rib, String numeroCompte) {
		
		int x = Integer.toString(nBanque).length();
		int y = Integer.toString(codeEta).length();
		int z = Integer.toString(rib).length();
		
		if(x==5 && y==5 && z==2) {
			String str1 = Integer.toString(nBanque);
			String str2 = Integer.toString(codeEta);
			String str3 = Integer.toString(rib);
			return; 
		}
	}
	
/*	public boolean verifcodeEta(int codeEta) {
		
		int x = Integer.toString(codeEta).length();
		
		if(x==5) {
			return true;
		} return false;
	}
	

	public void nCompteInsert(StringBuilder nCompte) {
		while (nCompte.length()<11) {
			
			nCompte.insert(0, 0);
			System.out.println(nCompte);
		} 
		
//		String s = new StringBuilder(nCompte).toString();
//		int x = Integer.parseInt(s);
			
		}
//		public boolean verifRib(int rib) {
//			
//		}
*/	
	}
