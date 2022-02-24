package lab9;

@FunctionalInterface
interface GetFactorial{
	int fact(int num);
}

class Factorial{
	
	static int f = 1;
	static int factorial(int n){
		for(int i=1;i<=n;i++)
			f *= i;
		return f;
	}
	
}
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetFactorial f1 = Factorial :: factorial;
		System.out.println(f1.fact(5));

	}

}
