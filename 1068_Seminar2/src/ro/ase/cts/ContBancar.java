package ro.ase.cts;

public abstract class ContBancar extends Cont{
	protected double balanta;
	private final String iban;
	
	public ContBancar(String iban){
		this.iban = iban;
	}
	
	@Override
	public double getBalanta(){
		return this.balanta;
	}
	
	public String getIBAN(){
		return this.iban;
	}
	
	
}
