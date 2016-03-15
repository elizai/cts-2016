package ro.ase.cts;

public class Test {

	public static void main(String[] args) {
		//Banca bcr = new Banca("BCR");
		Banca bcr = Banca.getBanca("BCR");
		Banca banca2 = Banca.getBanca("BCR");
		
		if(bcr == banca2)
			System.out.println("Obiecte identice");
		else
			System.out.println("Obiecte diferite");
		
		
		try {
			ContCredit credit;
			credit = (ContCredit)
					bcr.getCont("credit");
			System.out.println(credit.iban);
			
			ContDebit debit = 
					(ContDebit)bcr.getCont("debit");
			System.out.println(debit.iban);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
