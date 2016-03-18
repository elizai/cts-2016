package ro.ase.cts;

public class GeneratorSuperErouPlayStation 
	implements InterfataGeneratorSuperErou{

	@Override
	public SuperErou buildSuperErou(TipSuperErou tip, String nume, String superPutere) throws Exception {
		System.out.println("Generare caracter pentru PlayStation");
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
