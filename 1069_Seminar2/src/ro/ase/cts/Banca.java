package ro.ase.cts;

public class Banca {
	final String denumire;
	private static int nrConturi = 0;
	
	private static Banca singleton = null;
	
	private Banca(String denumire){
		this.denumire = denumire;
	}
	
	public static Banca getBanca(
			String denumire){
		if(singleton == null)
			singleton = new Banca(denumire);
		
		return singleton;
	}
	
	public ContBancar getCont(String tipCont) throws Exception{
		switch(tipCont){
		case "debit":
			return new ContDebit(
					this.denumire+(++nrConturi));
		case "credit":
			return new ContCredit(
					this.denumire+(++nrConturi), 
					ContCredit.CREDIT_MAXIM);
		default:
			throw new Exception("Tip cont inexistent");
		}
	}
}
