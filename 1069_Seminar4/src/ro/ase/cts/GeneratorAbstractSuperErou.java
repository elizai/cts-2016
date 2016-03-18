package ro.ase.cts;

public class GeneratorAbstractSuperErou {
	InterfataGeneratorSuperErou gneratorConcret;
	
	public GeneratorAbstractSuperErou(
			InterfataGeneratorSuperErou generator){
		this.gneratorConcret = generator;
	}
	
	public void setGenerator(InterfataGeneratorSuperErou generator)
	{
		this.gneratorConcret = generator;
	}

}
