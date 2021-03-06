package lab9;

import java.util.*;

@FunctionalInterface
interface FormatString{
	public String stringFormat(String s);
}

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		
		// Lambda Expression for formatting string
		FormatString ans = (s) -> { 
			String res = "";
			for(int i=0;i<s.length();i++){
				res += s.charAt(i) + " ";
			}
			return res;
		};
		
		System.out.println(ans.stringFormat(x));

	}

}