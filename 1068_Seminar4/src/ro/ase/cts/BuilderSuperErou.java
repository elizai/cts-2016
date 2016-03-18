package ro.ase.cts;

public class BuilderSuperErou {
	
	private SuperErou superErou;
	
	public BuilderSuperErou(String nume,
			String superPutere){
		this.superErou = 
				new SuperErou(nume,
						superPutere,
						0,
						'M',
						false,
						false,
						false);
	}
	
	public SuperErou build(){
		return this.superErou;
	}
	
	public BuilderSuperErou setVarsta(int varsta){
		this.superErou.setVarsta(varsta);
		return this;
	}
	
	public BuilderSuperErou setGen(char gen){
		this.superErou.setGen(gen);
		return this;
	}
	
	public BuilderSuperErou poateZbura(){
		this.superErou.setPoateZbura(true);
		return this;
	}
	
	public BuilderSuperErou areLaser(){
		this.superErou.setAreArmaLaser(true);
		return this;
	}
	
	public BuilderSuperErou esteErouPozitiv(){
		this.superErou.setEsteErouPozitiv(true);
		return this;
	}
}
