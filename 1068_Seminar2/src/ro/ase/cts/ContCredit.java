package ro.ase.cts;

public class ContCredit extends ContBancar{

	private static final double CREDIT_MAXIM = 5000;
	private double creditInitial;
	
	public ContCredit(String iban, 
			double valoareCredit) throws Exception {
		super(iban);
		if(valoareCredit > CREDIT_MAXIM)
			throw new Exception("Credit prea mare");
		
		this.creditInitial = valoareCredit;
	}

	@Override
	public void Depune(double suma) {
		this.balanta+=suma;
	}

	@Override
	public void Extrage(double suma) throws ExceptieFonduriInsuficiente, Exception {
		if(this.balanta-suma < 0)
			throw new ExceptieFonduriInsuficiente("");
		
		if(suma <= 0)
			throw new Exception("Valoare gresita");
		
		if(suma%10 != 0)
			throw new Exception(
					"Valoarea nu este multiplu de 10");
		
		this.balanta -= suma;
	}

	@Override
	public void Transfer(Cont destinatie, double suma) throws ExceptieTransferIlegal, Exception {
		if(destinatie instanceof ContBancar){
			ContBancar contDestinatie = 
					(ContBancar) destinatie;
			if(this.getIBAN().equals(
					contDestinatie.getIBAN()))
				throw new ExceptieTransferIlegal("");
			
			if(destinatie instanceof ContCredit)
				throw new ExceptieTransferIlegal("");
		}
		else
			throw new Exception("Clasa gresita");
		
		this.Extrage(suma);
		destinatie.Depune(suma);
	}

}
