package ro.ase.cts;

public class SuperErou {
	private String nume;
	private char gen;
	private int varsta;
	private boolean esteErouPozitiv;
	private String superPutere;
	private boolean poateZbura;
	private boolean poateDeveniInvizibil;
	
	public SuperErou(String nume,
			char gen,
			int varsta,
			boolean estePozitiv,
			String superPutere,
			boolean poateZbura,
			boolean esteInvizibil){
		this.nume = nume;
		this.gen = gen;
		this.varsta = varsta;
		this.esteErouPozitiv = estePozitiv;
		this.superPutere = superPutere;
		this.poateZbura = poateZbura;
		this.poateDeveniInvizibil = esteInvizibil;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public boolean isEsteErouPozitiv() {
		return esteErouPozitiv;
	}

	public void setEsteErouPozitiv(boolean esteErouPozitiv) {
		this.esteErouPozitiv = esteErouPozitiv;
	}

	public String getSuperPutere() {
		return superPutere;
	}

	public void setSuperPutere(String superPutere) {
		this.superPutere = superPutere;
	}

	public boolean isPoateZbura() {
		return poateZbura;
	}

	public void setPoateZbura(boolean poateZbura) {
		this.poateZbura = poateZbura;
	}

	public boolean isPoateDeveniInvizibil() {
		return poateDeveniInvizibil;
	}

	public void setPoateDeveniInvizibil(boolean poateDeveniInvizibil) {
		this.poateDeveniInvizibil = poateDeveniInvizibil;
	}
	
}
