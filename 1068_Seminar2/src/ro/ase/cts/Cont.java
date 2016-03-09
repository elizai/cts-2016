package ro.ase.cts;

public abstract class Cont {
	
	public abstract void Depune(double suma);
	public abstract void Extrage(double suma);
	public abstract void Transfer(
			Cont destinatie, double suma);
	public abstract double getBalanta();
	
}
