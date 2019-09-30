package fr.gtm.banque;

public class Bank {
	
	private String nBanque;
	private String codeEta;
	private String nCompte;
	private String rib;
	
	private String nComplet;
	
	public Bank(String nBanque, String codeEta, String nCompte, String rib) {
		
		this.nBanque = nBanque;
		this.codeEta = codeEta;
		this.nCompte = nCompte;
		this.rib = rib;	
	}
	private void creanCompte() {
		StringBuilder sb = new StringBuilder(nCompte);
		for(int i = 0 ; i<nCompte.length() ; i++) {
			sb.setCharAt(i, Utilitaire.remplaceLettres(sb.charAt(i)));
		}
		nComplet = Utilitaire.nCompteInsert(sb.toString());
	}
	public boolean valide() {
		return Utilitaire.validation(nBanque+codeEta+nCompte+rib);
	}
	public String getnBanque() {
		return nBanque;
	}
	public String getCodeEta() {
		return codeEta;
	}
	public String getnCompte() {
		return nCompte;
	}
	public String getRib() {
		return rib;
	}
	public String getnComplet() {
		return nComplet;
	}
	
}
