
public class Exp {
	
	static int m2(){
		throw new ArithmeticException("Hi");
	}
	
	static int m1(){
		return m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(m1());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
