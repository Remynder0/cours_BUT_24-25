import exp_arithmetiques.*;


class TestExp2{
    public static void main(String arg[]){
	Constante a=new Constante(16);
	Variable  x=new Variable(4);
	
	Exp exp1= new Addition(x,a);
	Exp exp2= new Multiplication(x,x);
		
	System.out.println("e1 : " + exp1.evaluer() );
	System.out.println("e2 : " + exp2.evaluer() );

	x.setValeur(100.);
	System.out.println("e1 : " + exp1.evaluer() );
	System.out.println("e2 : " + exp2.evaluer() );
    }
}
