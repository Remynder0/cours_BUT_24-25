import exp_arithmetiques.*;

class RcnePoly2{

    static public Exp SqrtDelta (Exp a, Exp b, Exp c)  {
	Exp delta= new Soustraction(new Multiplication(b,b),
				    new Multiplication(new Constante(4), new Multiplication(a,c)));

	Exp sqrtDelta=new Sqrt(delta);
	return sqrtDelta;
    }

    public static void main(String arg[])   {
	Exp a=new Variable(1);
	Exp b=new Variable(2);
	Exp c=new Variable(1);
	
	System.out.println("Résolution de "+a.evaluer()+" x**2 + " + b.evaluer()+" x + " + c.evaluer());

	Exp moinsB= new Soustraction(new Constante (0),b);	
	Exp sqrtDelta=SqrtDelta (a, b, c);
	
	// premiere racine
	Exp r1= new Division(new Addition(moinsB,sqrtDelta), new Multiplication(new Constante(2),a));
	// deuxieme racine
	Exp r2= new Division(new Soustraction(moinsB,sqrtDelta), new Multiplication(new Constante(2),a));
	
	System.out.println("r1: " + r1.evaluer() );
	System.out.println("r2: " + r2.evaluer() );
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
	((Variable)b).setValeur(1);
	
	System.out.println("Résolution de "+a.evaluer()+" x**2 + " + b.evaluer()+" x + " + c.evaluer());
	
	System.out.println("r1: " + r1.evaluer() );
	System.out.println("r2: " + r2.evaluer() );

    }
}
