package collections;

public class Match {
	private final String equipeADomicile;
	private final String equipeALExterieur;
	private final int scoreEquipeAD;
	private final int scoreEquipeAE;
	public String getEquipeADomicile() {
		return equipeADomicile;
	}
	public String getEquipeALExterieur() {
		return equipeALExterieur;
	}
	public int getScoreEquipeAD() {
		return scoreEquipeAD;
	}
	public int getScoreEquipeAE() {
		return scoreEquipeAE;
	}
	public Match(String equipeADomicile, String equipeALExterieur, int scoreEquipeAD, int scoreEquipeAE) {
		
		this.equipeADomicile = equipeADomicile;
		this.equipeALExterieur = equipeALExterieur;
		this.scoreEquipeAD = scoreEquipeAD;
		this.scoreEquipeAE = scoreEquipeAE;
	}
	@Override
	public String toString() {
		String res = equipeALExterieur+" chez "+equipeADomicile+": "
				+ scoreEquipeAE + "-" + scoreEquipeAD;
		if(this.scoreEquipeAD > this.scoreEquipeAE) res += ", gagnant: "+this.equipeADomicile;
		else res += ", gagnant: "+this.equipeALExterieur;
		return res;
	}
	
	
}
