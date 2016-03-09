package ro.ase.cts;

public class ContDebit extends ContBancar{
	
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
	public void Transfer(Cont destinatie, double suma) {
		// TODO Auto-generated method stub
		
	}
}
