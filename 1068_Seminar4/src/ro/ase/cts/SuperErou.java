package ro.ase.cts;

public class SuperErou implements InterfataSuperErou{
	private String nume;
	private String superPutere;
	private int varsta;
	private char gen;
	private boolean poateZbura;
	private boolean esteErouPozitiv;
	private boolean areArmaLaser;
	
	public SuperErou(String nume,
			String superPutere,
			int varsta,
			char gen,
			boolean poateZbura,
			boolean esteErouPozitiv,
			boolean areArmaLaser){
		this.nume = nume;
		this.varsta = varsta;
		this.gen = gen;
		this.poateZbura = poateZbura;
		this.esteErouPozitiv = esteErouPozitiv;
		this.areArmaLaser = areArmaLaser;
	}

	public String getNume() {
		return nume;
	}

	public String getSuperPutere() {
		return superPutere;
	}

	public int getVarsta() {
		return varsta;
	}

	public char getGen() {
		return gen;
	}

	public boolean isPoateZbura() {
		return poateZbura;
	}

	public boolean isEsteErouPozitiv() {
		return esteErouPozitiv;
	}

	public boolean isAreArmaLaser() {
		return areArmaLaser;
	}

	void setNume(String nume) {
		this.nume = nume;
	}

	void setSuperPutere(String superPutere) {
		this.superPutere = superPutere;
	}

	void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	void setGen(char gen) {
		this.gen = gen;
	}

	void setPoateZbura(boolean poateZbura) {
		this.poateZbura = poateZbura;
	}

	void setEsteErouPozitiv(boolean esteErouPozitiv) {
		this.esteErouPozitiv = esteErouPozitiv;
	}

	void setAreArmaLaser(boolean areArmaLaser) {
		this.areArmaLaser = areArmaLaser;
	}

	@Override
	public void seLupta(String erouNegativ) {
		System.out.println(
				this.nume + 
				"l-a invins pe "+erouNegativ);
	}
	
	
}
