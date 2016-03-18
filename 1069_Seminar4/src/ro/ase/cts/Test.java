package ro.ase.cts;

public class Test {

	public static void main(String[] args) {
		SuperErou superMan = 
				new SuperErou("Superman",
						'M',
						28, 
						true,
						"Invincibil",
						true,
						false);
		SuperErou superMan2 = new BuilderSuperErou(
						"Superman", "Invincibil")
				.poateZbura()
				.setGen('M')
				.setVarsta(28)
				.build();
		
		try {
			SuperErouMarvel ironMan = (SuperErouMarvel)
					SimpleFactorySuperHero.getSuperErou(
							TipSuperErou.MARVEL,
							"Ironman",
							"AI");
			
			//test pentru XBox
			GeneratorAbstractSuperErou generator = 
					new GeneratorAbstractSuperErou(
							new GeneratorSuperErouXBox());
			
			ironMan = (SuperErouMarvel)
					generator.gneratorConcret.buildSuperErou(
							TipSuperErou.MARVEL,
							"Ironman",
							"AI");
			
			generator.setGenerator(new GeneratorSuperErouPlayStation());
			
			ironMan = (SuperErouMarvel)
					generator.gneratorConcret.buildSuperErou(
							TipSuperErou.MARVEL,
							"Ironman",
							"AI");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}