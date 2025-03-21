package etudiant;

import tests.TestCombat;
import tests.TestEquipe;
import tests.TestFinal;
import tests.TestPikachu;
import tests.TestRonflex;
import tests.TestTransport;

public class Tests {
	public static void main(String args[]) {
		TestRonflex.testConstructeur();
		System.out.println("Attendu: ");
		System.out.println("Test des constructeurs Ronflex\n"+"Ronflex : Ronflex de type Normal d’attaque 38 et 180/180 PV\n"
				+ "Ronflex petit, mais fort : Ronflex de type Normal d’attaque 50 et 120/120 PV");
		TestRonflex.testIsograisse();
		System.out.println("Attendu: ");
		System.out.println("Test de la protéction isograisse\n"+"Ronflex Ronflex attaqué par Rhinocorne : Rhinocorne de type Sol d’attaque 30 et 100/100 PV\n"
				+ "Ronflex : Ronflex de type Normal d’attaque 38 et 150/180 PV\n"
				+ "Ronflex Ronflex attaqué par Lokhlass : Lokhlass de type Glace d’attaque 42 et 159/159 PV\n"
				+ "Ronflex : Ronflex de type Normal d’attaque 38 et 159/180 PV");
		
		TestPikachu.testConstructeur();
		System.out.println("Attendu: ");
		System.out.println("Test des constructeurs Pikachu\n"+"Pikachu : Pikachu de type Electrique d’attaque 28 et 50/50 PV\n"
				+ "Pikachu faible : Pikachu de type Electrique d’attaque 10 et 50/50 PV");
		TestPikachu.testEclairage();
		System.out.println("Attendu: ");
		System.out.println("Test de l’implémentation de SourceLumineuse\n"
				+ "Pikachu génère un arc éléctrique qui éclaire les lieux.");
		
		TestEquipe.testEquipePrincipale();
		System.out.println("Attendu: ");
		System.out.println("Test du constructeur EquipePokemons, de la création de l’équipe principale\n"
				+ "et de la méthode toString()\n"
				+ "EquipePokemons [\nTortank : Tortank de type Eau d’attaque 42 et 112/112 PV\nRhinocorne: Rhinocorne de type Sol d’attaque 30 et 100/100 PV\nLokhlass : Lokhlass de type Glace d’attaque 42 et 159/159 PV\npsycho : Alakazam de type Psy d’attaque 48 et 85/85 PV\n]");
		/*TestEquipe.testDAjout();
		System.out.println("Attendu: ");
		System.out.println("Test de la méthode ajouter et du déclenchement de l’exception.\n"
				+ "[\nAlakazam : Alakazam de type Psy d’attaque 46 et 78/78 PV\nFlorizarre: Florizarre de type Plante d’attaque 45 et 110/110 PV\nLokhlass: Lokhlass de type Glace d’attaque 42 et 159/159 PV\nRhinocorne : Rhinocorne de type Sol d’attaque 30 et 100/100 PV\nTortank : Tortank de type Eau d’attaque 42 et 112/112 PV\npsycho : Alakazam de type Psy d’attaque 48 et 85/85 PV\n]\n"
				+ "Ça marche comme attendu.");*/
		/*TestEquipe.testTraverserGrotte();
		System.out.println("Attendu: ");
		System.out.println("L’équipe principale peut traverser une grotte sombre?\n"
				+ "Mon nom est psycho et je suis un Alakazam doté de pouvoirs psychiques, d’une simple pensée je dissipe les ténèbres : FLASH !\n"
				+ "Yes we can!\n\nMon nom est psycho et je suis un Alakazam doté de pouvoirs psychiques, d’une simple pensée je dissipe les ténèbres : FLASH !");*/
		
		
		
		/*TestCombat.testDuelArene();
		System.out.println("Attendu: ");
		System.out.println("Tests des duels d’arène.\n"
				+ "Alakazam challenges Tortank\n"
				+ "Alakazam loses\n"
				+ "Tortank challenges Alakazam\n"
				+ "Tortank wins");
		System.out.println("\nAlakazam challenges Rhinocorne\n"
				+ "Alakazam wins\n"
				+ "Rhinocorne challenges Alakazam\n"
				+ "Rhinocorne wins");*/
		/*TestCombat.testDuelAmical();
		System.out.println("Attendu: ");
		System.out.println("Tests des duels amicaux.\n"
				+ "Alakazam wins a friendly duel against a Rhinocorne.\n\n"
				+ "Lokhlass wins a friendly duel against a Florizarre\n\n"
				+ "Florizarre fort : Florizarre de type Plante d’attaque 85 et 159/159 PV wins a friendly duel against a Lokhlass");*/
		
		
		/*TestTransport.testEnum();
		System.out.println("Attendu: ");
		System.out.println("Tests de l’énumération EnumTransport.\n"
				+ "TERRESTRE peut traverser eau? false peut traverser terre? true\n"
				+ "MARITIME peut traverser eau? true peut traverser terre? false\n"
				+ "AERIEN peut traverser eau? true peut traverser terre? true");*/
		/*TestTransport.testDracaufeu();
		System.out.println("Attendu: ");
		System.out.println("Test du constructeur Dracaufeu + implémentation de l’interface\n"
				+ "Dracaufeu : Dracaufeu de type Feu d’attaque 48 et 105/105 PV\n"
				+ "Dracaufeu petit : Dracaufeu de type Feu d’attaque 48 et 10/10 PV\n\n"
				+ "Capacité du Dracaufeu: 2 Type de transport: AERIEN");*/
		
		/*TestFinal.testCopier();
		System.out.println("Attendu: ");
		System.out.println("Test des méthodes copier() des classes Ronflex et Pikachu.\n"
				+ "EquipePokemons [\nRonflex : Ronflex de type Normal d’attaque 38 et 180/180 PV\nPikachu: Pikachu de type Electrique d’attaque 28 et 50/50 PV\n]\n"
				+ "EquipePokemons [\nRonflex : Ronflex de type Normal d’attaque 38 et 180/180 PV\nPikachu: Pikachu de type Electrique d’attaque 28 et 50/50 PV\n]");*/
		/*TestFinal.testInscription();
		System.out.println("Attendu: ");
		System.out.println("Test inscrire.\n"
				+ "EquipePokemons [\nTortank : Tortank de type Eau d’attaque 42 et 112/112 PV\nRhinocorne: Rhinocorne de type Sol d’attaque 30 et 100/100 PV\nLokhlass : Lokhlass de type Glace d’attaque 42 et 159/159 PV\npsycho : Alakazam de type Psy d’attaque 48 et 85/85 PV\n]\n"
				+ "EquipePokemons [\nTortank : Tortank de type Eau d’attaque 42 et 112/112 PV\nRhinocorne: Rhinocorne de type Sol d’attaque 30 et 100/100 PV\nLokhlass : Lokhlass de type Glace d’attaque 42 et 159/159 PV\npsycho : Alakazam de type Psy d’attaque 48 et 85/85 PV\n]");*/
		/*TestFinal.testInscriptionValeursModifies();
		System.out.println("Attendu: ");
		System.out.println("Test inscrire après avoir attaqué.\n"
				+ "EquipePokemons [\nTortank : Tortank de type Eau d’attaque 42 et 66/112 PV\nRhinocorne: Rhinocorne de type Sol d’attaque 30 et 54/100 PV\nLokhlass : Lokhlass de type Glace d’attaque 42 et 113/159 PV\npsycho : Alakazam de type Psy d’attaque 48 et 62/85 PV\n]\n"
				+ "EquipePokemons [\nTortank : Tortank de type Eau d’attaque 42 et 66/112 PV\nRhinocorne: Rhinocorne de type Sol d’attaque 30 et 54/100 PV\nLokhlass : Lokhlass de type Glace d’attaque 42 et 113/159 PV\npsycho : Alakazam de type Psy d’attaque 48 et 62/85 PV\n]");*/
		/*TestFinal.thouShallNotPass();
		System.out.println("Attendu: ");
		System.out.println("Test atteindreLigue\n"
				+ "L'équipe EquipePokemons [\n"
				+ "Alakazam : Alakazam de type Psy d'attaque 46 et 78/78 PV\n"
				+ "Florizarre : Florizarre de type Plante d'attaque 45 et 110/110 PV\n"
				+ "Tortank : Tortank de type Eau d'attaque 42 et 112/112 PV\n"
				+ "] ne peut pas joindre la ligue\n"
				+ "\n"
				+ "L'équipe EquipePokemons [\n"
				+ "Lokhlass : Lokhlass de type Glace d'attaque 42 et 159/159 PV\n"
				+ "Florizarre : Florizarre de type Plante d'attaque 45 et 110/110 PV\n"
				+ "Tortank : Tortank de type Eau d'attaque 42 et 112/112 PV\n"
				+ "Rhinocorne : Rhinocorne de type Sol d'attaque 30 et 100/100 PV\n"
				+ "] ne peut pas joindre la ligue\n"
				+ "\n"
				+ "L'équipe EquipePokemons [\n"
				+ "Lokhlass : Lokhlass de type Glace d'attaque 42 et 159/159 PV\n"
				+ "Florizarre : Florizarre de type Plante d'attaque 45 et 110/110 PV\n"
				+ "Tortank : Tortank de type Eau d'attaque 42 et 112/112 PV\n"
				+ "Rhinocorne : Rhinocorne de type Sol d'attaque 30 et 100/100 PV\n"
				+ "Alakazam : Alakazam de type Psy d'attaque 46 et 78/78 PV\n"
				+ "] peut joindre la ligue parce que le gardien est un Alakazam\n"
				+ "\n"
				+ "L'équipe EquipePokemons [\n"
				+ "Lokhlass : Lokhlass de type Glace d'attaque 42 et 159/159 PV\n"
				+ "Florizarre : Florizarre de type Plante d'attaque 45 et 110/110 PV\n"
				+ "Tortank : Tortank de type Eau d'attaque 42 et 112/112 PV\n"
				+ "Rhinocorne : Rhinocorne de type Sol d'attaque 30 et 100/100 PV\n"
				+ "Alakazam : Alakazam de type Psy d'attaque 46 et 78/78 PV\n"
				+ "] ne peut pas joindre la ligue parce que le gardien est Gardien monstrueux : Pokemon de type Normal d'attaque 100 et 500/500 PV");*/
	}
}
