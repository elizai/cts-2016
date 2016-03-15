package ro.ase.cts;

public class ContDebit 
	extends ContBancar implements Profitabil{
	
	private static final double BALANTA_MINIMA = 100.0;
	public ContDebit(String iban){
		super(iban);
		this.balanta = BALANTA_MINIMA;
	}
	@Override
	public void Depunere(double suma) {
		this.balanta+=suma;
	}
	@Override
	public void Extragere(double suma) 
			throws ExceptieFonduriInsuficiente {
		if(this.balanta-suma<BALANTA_MINIMA)
			throw new ExceptieFonduriInsuficiente(
					"Fonduri insuficiente");
		else
			this.balanta-=suma;
	}
	@Override
	public void Transfer(Cont destinatie, double suma) 
			throws ExceptieTransferIlegal, ExceptieFonduriInsuficiente {
		
		if(destinatie instanceof ContBancar)
			if(this.iban.equals(((
					ContBancar)destinatie).iban))
				throw new ExceptieTransferIlegal(
				"Destinatia este identica cu sursa");
		this.Extragere(suma);
		destinatie.Depunere(suma);
	}
	@Override
	public void adaugaDobanda(double dobanda) throws Exception {
		if(dobanda > 0 && dobanda<=1)
			this.balanta*=(1+dobanda);
		else
			throw new Exception("Valoare ilegala");
	}
}
