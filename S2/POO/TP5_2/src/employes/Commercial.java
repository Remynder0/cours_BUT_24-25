package employes;

public class Commercial extends Employe{

	public Commercial(String nom) {
		super(nom);
	}

	@Override
	public double getSalaire() {
		return 0;
	}

	@Override
	public String toString() {
		return "Commercial, "+super.toString();
	}
}

