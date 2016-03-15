package ro.ase.cts;

public abstract class Cont {
	
	public abstract void Depune(double suma);
	public abstract void Extrage(double suma) throws ExceptieFonduriInsuficiente, Exception;
	public abstract void Transfer(
			Cont destinatie, double suma) throws ExceptieTransferIlegal, Exception;
	public abstract double getBalanta();
	
}
