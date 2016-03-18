package ro.ase.cts;

public class SimpleFactoryXBox {
	//metoda factory
	public static InterfataSuperErou 
		getSuperErou(TipErou tip, String nume, String superPutere) throws Exception{
		
		switch(tip){
		case MARVEL:
			return new SuperErouMarvel(
					nume,
					superPutere,
					28,
					'M',
					true,
					true, 
					true);
		case FOLCLOR:
			return new SuperErouFolclorRomanesc(
					nume,
					superPutere,
					25,
					'M',
					false,
					false, 
					false);
		default:
			throw new Exception("Tip netratat");
		}
	}
}
