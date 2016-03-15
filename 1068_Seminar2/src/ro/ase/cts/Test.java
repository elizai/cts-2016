package ro.ase.cts;

public class Test {

	public static void main(String[] args) {
		//Banca banca1 = new Banca();
		//Banca banca2 = new Banca();
		
		Banca banca1 = Banca.makeBanca("BCR");
		Banca banca2 = Banca.makeBanca("BCR");
		//Banca banca3 = Banca.makeBanca("BRD");
		
		if(banca1 == banca2)
			System.out.println(
					"Referinte identice");
		else
			System.out.println("Obiecte diferite");
		
	}

}
