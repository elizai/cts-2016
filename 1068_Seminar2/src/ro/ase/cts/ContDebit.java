package ro.ase.cts;

public class ContDebit 
	extends ContBancar implements Profitabil{
	
	public static final double VALOARE_MINIMA = 100.0;
	
	public ContDebit(String iban){
		super(iban);
		this.balanta = VALOARE_MINIMA;
	}

	@Override
	public void Depune(double suma) {
		this.balanta += suma;
	}

	@Override
	public void Extrage(double suma) 
			throws Exception {
		if(this.balanta-suma < VALOARE_MINIMA)
			throw new ExceptieFonduriInsuficiente("");
		
		if(suma <= 0)
			throw new Exception("Valoare gresita");
		
		if(suma%10 != 0)
			throw new Exception(
					"Valoarea nu este multiplu de 10");
		
		this.balanta -= suma;
	}

	@Override
	public void Transfer(Cont destinatie, 
			double suma) throws Exception {
		if(destinatie instanceof ContBancar){
			ContBancar contDestinatie = 
					(ContBancar) destinatie;
			if(this.getIBAN().equals(
					contDestinatie.getIBAN()))
				throw new ExceptieTransferIlegal("");
		}
		else
			throw new Exception("Clasa gresita");
		
		this.Extrage(suma);
		destinatie.Depune(suma);
	}

	@Override
	public void adaugaDobanda(double dobanda) throws Exception {
		if(dobanda > 0 && dobanda <= 1){
			this.balanta *= (1+dobanda);
		}
		else
			throw new Exception("Dobanda gresita");
	}
}
