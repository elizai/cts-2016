package ro.ase.cts;

public class BuilderSuperErou {
	
	//referinta catre obiectul construit
	private SuperErou superErou = null;
	
	public BuilderSuperErou(
			String nume, String superPutere){
		this.superErou = 
				new SuperErou(nume, 
						'M', 
						0,
						true, 
						superPutere, 
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
		this.setGen(gen);
		return this;
	}
	
	public BuilderSuperErou poateZbura(){
		this.superErou.setPoateZbura(true);
		return this;
	}
	
	public BuilderSuperErou poateDeveniInvizibil(){
		this.superErou.setPoateDeveniInvizibil(true);
		return this;
	}
}
