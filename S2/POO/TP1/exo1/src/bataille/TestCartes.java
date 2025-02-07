package bataille;

import fr.unicaen.iutgon.info.carte.Carte;
import fr.unicaen.iutgon.info.carte.PaquetCartes;

public class TestCartes {

	PaquetCartes pc;
	
	public TestCartes() {
		pc = new PaquetCartes();
	}
	
	public void testeCartes() {
		Carte c = new Carte(7, 0);
		pc.ajouter(c);
		c = new Carte(7, 1);
		pc.ajouter(c);
		c = new Carte(7, 2);
		pc.ajouter(c);
	}

	public void remplitPaquet(){
		for (int i = 0; i < 4 ; i++) {
			for (int j = 7; j <= 14; j++) {
				Carte c = new Carte(j,i);
				pc.ajouter(c);
			}
		}
	}

	public void testeTirer() {
		while(!pc.estPaquetVide()){
			Carte c = pc.tirerCarteDessus();
        	System.out.println("Carte tirée : " + c);
		}
		System.out.println("Paquet restant : " + pc);
	}
	
	public static void main(String[] args) {
		TestCartes tc = new TestCartes();

		tc.remplitPaquet();
		tc.pc.melanger();

		tc.testeTirer();
		
		System.out.println(tc.pc);
	}
}
