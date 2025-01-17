package domaine;

public class Personne 
{
	private String nom;
	private String prenom;
	private int age;
	//private Operation uneOperation;

	public Personne(String _nom, String _prenom  )
	{
		System.out.println("Classe Personne");
		prenom = _prenom;
		nom = _nom;
	}
}
