package ro.ase.cts;

public class Banca {
	
	private String denumire;
	private static int NR_CONTURI = 0;
	
	private static Banca singleton = null;
	
	private Banca(String denumire){
		this.denumire = denumire;
	}
	
	public static Banca makeBanca(String denumire){
		//Banca banca = new Banca("BCR");
		if(singleton == null)
			singleton = new Banca(denumire);
		return singleton;	
	}
	
	public ContBancar makeCont(String tip) throws Exception{
		switch(tip){
		case "debit":
			return new ContDebit(
					this.denumire+(++NR_CONTURI));
		case "credit":
			return new ContCredit(
					this.denumire+(++NR_CONTURI), 
					4000);
		default:
				throw new Exception("tip gresit");
		}
	}
}
