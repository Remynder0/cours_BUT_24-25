import exp_arithmetiques.*;


class TestExp{
    public static void main(String arg[]){
	Constante a=new Constante(16);
	Variable x=new Variable(4);
	
	System.out.println("a = " + a + "  " + a.evaluer());
	System.out.println("x = " + x + "  " + x.evaluer());

	Addition e1=new Addition(x,a);
	Multiplication e2=new Multiplication(x,x);
	Exp e3=new Multiplication(e1,e2);
	
	System.out.println("e1 : " + e1.evaluer() );
	System.out.println("e2 : " + e2.evaluer() );
	System.out.println("e3 : " + e3.evaluer() );
	
	x.setValeur(100.);
	System.out.println("e1 : " + e1.evaluer() );
	System.out.println("e2 : " + e2.evaluer() );
	System.out.println("e3 : " + e3.evaluer() );
    }
}
