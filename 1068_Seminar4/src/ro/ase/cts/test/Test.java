package ro.ase.cts.test;

import ro.ase.cts.BuilderSuperErou;
import ro.ase.cts.GeneratorGeneric;
import ro.ase.cts.GeneratorSuperErouPlayStation;
import ro.ase.cts.GeneratorSuperErouXBox;
import ro.ase.cts.SimpleFactoryXBox;
import ro.ase.cts.SuperErou;
import ro.ase.cts.TipErou;

public class Test {

	public static void main(String[] args) {
		
		SuperErou superMan = 
				new SuperErou(
						"Superman",
						"Invincibil",
						28,
						'M',
						true,
						true, 
						true);
		SuperErou Superman = 
			new BuilderSuperErou("Superman", 
					"Invincibil")
			.setVarsta(28)
			.setGen('M')
			.esteErouPozitiv()
			.poateZbura()
			.areLaser()
			.build();
		
		SuperErou Batman = 
				new BuilderSuperErou("Batman", "Zboara")
				.esteErouPozitiv()
				.build();
		
		
		try {
			//test SimpleFactory
			SuperErou superman2 = 
					(SuperErou) SimpleFactoryXBox.getSuperErou(
					TipErou.MARVEL, 
					"Superman",
					"Invincibil");
			
			//test FactoryMethod
			GeneratorGeneric generator = 
					new GeneratorGeneric(
							new GeneratorSuperErouXBox());
			
			//test FactoryMethod
			SuperErou superman3 = 
					(SuperErou) generator.generator.getSuperErou(
					TipErou.MARVEL, 
					"Superman",
					"Invincibil");
			generator.setGenerator(new GeneratorSuperErouPlayStation());
			SuperErou superman4 = 
					(SuperErou) generator.generator.getSuperErou(
					TipErou.MARVEL, 
					"Superman",
					"Invincibil");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
