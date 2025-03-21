import exp_arithmetiques.*;


class TestExp1{
    
    public static void main(String arg[]){
	Constante a=new Constante(16);
	Variable  x=new Variable(4);
	Exp tab [] = new Exp[2];

	tab[0]=a; 	tab[1]=x; 
	System.out.println("a = " + a.evaluer());
	System.out.println("x = " + x.evaluer());
	System.out.println("tab[0]="+tab[0].evaluer()+" tab[1]= "+tab[1].evaluer());

	x.setValeur(10.);
	System.out.println("x = " + x.evaluer());
	System.out.println("tab[0]="+tab[0].evaluer()+" tab[1]= "+tab[1].evaluer());

    }
}
