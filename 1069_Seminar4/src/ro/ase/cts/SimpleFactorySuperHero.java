package ro.ase.cts;

public class SimpleFactorySuperHero {
	
	
	//metoda factory
	public static SuperErou getSuperErou(
			TipSuperErou tip,
			String nume,
			String superPutere) throws Exception{
		switch(tip){
		case MARVEL:
			return new SuperErouMarvel(
					nume,'M',0,true,superPutere,false, false);
		case FOLCLOR:
			return new SuperErouFolclorRomanesc(
					nume,'M',0,true,superPutere,false, false);
			default:
				throw new Exception("Tip netratat");
		}
	}
}
