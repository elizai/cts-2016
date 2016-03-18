package ro.ase.cts;

public class GeneratorSuperErouPlayStation 
	implements InterfataGeneratorSuperErou{

	@Override
	public InterfataSuperErou getSuperErou(TipErou tip, String nume, String superPutere) throws Exception {
System.out.println("Creare erou pentru PlayStation");
		
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
