package ro.ase.cts;

public class ContDebit extends ContBancar{
	
	public static final double VALOARE_MINIMA = 100.0;
	
	public ContDebit(String iban){
		super(iban);
		this.balanta = VALOARE_MINIMA;
	}

	@Override
	public void Depune(double suma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Extrage(double suma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Transfer(Cont destinatie, double suma) {
		// TODO Auto-generated method stub
		
	}
}
