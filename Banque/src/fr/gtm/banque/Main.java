package fr.gtm.banque;

public class Main {

	public static void main(String[] args) {
		Banque c = new Banque();
//		compte.compte(12345, 56789, 22, "ldnckdzd");
		StringBuilder x = new StringBuilder();
		c.verifnBanque(12345);
		x.append("1234567");
		System.out.println(x);
		while (x.length()<11)
		x.insert(0, 0);
		System.out.println(x);
		
	}

}
