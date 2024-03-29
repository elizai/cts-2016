package ro.ase.cts;

public abstract class Cont {
	public abstract void Depunere(double suma);
	public abstract void Extragere(double suma) 
			throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
	public abstract void Transfer(
			Cont destinatie, double suma) throws ExceptieTransferIlegal, ExceptieFonduriInsuficiente;
	public abstract double getBalanta();
}
