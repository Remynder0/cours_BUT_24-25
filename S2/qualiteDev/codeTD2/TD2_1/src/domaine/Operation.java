package domaine;

public class Operation 
{
	private double val1;
	private double val2;
	private double res;
	
	public Operation(float _val1,float _val2  )
	{
		System.out.println("Classe Operation");
		val1 = _val1;
		val2 = _val2;
		if (val1 < 0 )
			val1 = -val1;
		if (val2 < 0 )
			val2 = -val2;
	}
	public int additionner()
	{
		res = val1 + val2;
		return 0;
	}
	public int soustraire()
	{
		if (val1 < val2)
			return -1;
		res = val1 - val2;
		return 0;
	}
	public int multiplier()
	{
		for (int i=0;i<val2;i++)
			res = res + val1;
		return 0;
	}
	public int diviser()
	{
		if (val2 == 0)
			return -1;
		res = val1 / val2;
		return 0;
	}
	public double lireRes()
	{
		return res;
	}
}
