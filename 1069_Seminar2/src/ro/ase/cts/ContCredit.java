package ro.ase.cts;

public class ContCredit extends ContBancar{

	public static final double CREDIT_MAXIM = 5000.0;
	
	private double plafonCreditare;
	
	public ContCredit(String iban, double valoareCredit) 
			throws Exception {
		super(iban);
		if(valoareCredit>CREDIT_MAXIM)
			throw new Exception("Operatie interzisa !");
		plafonCreditare = valoareCredit;
		balanta = valoareCredit;
	}

	@Override
	public void Depunere(double suma) {
		this.balanta+=suma;
	}

	@Override
	public void Extragere(double suma) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		
		if(suma<=0)
			throw new ExceptieTransferIlegal("");
		
		if(this.balanta-suma < 0)
			throw new ExceptieFonduriInsuficiente("");
		this.balanta-=suma;
	}

	@Override
	public void Transfer(Cont destinatie, double suma) throws ExceptieTransferIlegal, ExceptieFonduriInsuficiente {
		if(destinatie instanceof ContBancar){
			ContBancar contDestinatie =
					(ContBancar)destinatie;
			if(this.iban.equals(
					contDestinatie.iban))
				throw new ExceptieTransferIlegal("");
			if(destinatie instanceof ContCredit)
				throw new ExceptieTransferIlegal("");
			
			this.Extragere(suma);
			contDestinatie.Depunere(suma);
		}
	}

}
