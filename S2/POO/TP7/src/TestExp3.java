import exp_arithmetiques.*;


class TestExp3{
    
    public static void main(String arg[]){
	Exp a=new Constante(16);
	Exp x=new Variable(4);
	
	Exp e1=new Addition(x,a);
	Exp e2=new Multiplication(x,x);
	Exp e3=new Multiplication(e1,e2);
	
	System.out.println("e3 : " + e2.evaluer() );
    }
}
