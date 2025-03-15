package domaine;

public class Personne 
{
	private String nom;
	private String prenom;
	private int age;
	public Operation uneOperation;

	public Personne(String _nom, String _prenom,float _val1,float _val2 )
	{
		System.out.println("Classe Personne");
		prenom = _prenom;
		nom = _nom;
		uneOperation = new Operation(_val1,_val2);
	}
	private String get(Personne p){
		return p.nom+p.prenom;
	}
	private void set(Personne p, String new_n, String new_p){
		p.nom = new_n;
		p.prenom = new_p;
	}
	
	public double calculer(int type)
	{
		switch (type)
		{
			case 1 : uneOperation.additionner();break;
			case 2 : uneOperation.soustraire();break;
			case 3 : uneOperation.multiplier();break;
			case 4 : uneOperation.diviser();break;
		}
		double resultat = uneOperation.lireRes();
		return resultat;
	}
}
