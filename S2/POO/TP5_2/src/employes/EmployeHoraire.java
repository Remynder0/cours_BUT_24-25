package employes;

public class EmployeHoraire extends Employe{

	 public EmployeHoraire(String nom) {
		 super(nom);
	 }

	 @Override
	 public double getSalaire() {
		 return 0;
	 }

	@Override
	public String toString() {
		return "EmployeHoraire, "+super.toString();
	}
}

