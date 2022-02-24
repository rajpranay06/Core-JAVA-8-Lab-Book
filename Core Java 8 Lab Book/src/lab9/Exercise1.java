package lab9;

import java.util.*;

@FunctionalInterface
interface Pow{
	public double power(int a, int b);
}

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		
		// Lambda Expression for finding a power b
		Pow p = (a,b) -> Math.pow(a, b);
		
		System.out.println(p.power(x, y));

	}

}
