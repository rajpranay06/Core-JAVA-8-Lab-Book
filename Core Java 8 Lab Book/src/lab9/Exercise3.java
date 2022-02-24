package lab9;

import java.util.*;

@FunctionalInterface
interface Check{
	public boolean checkCredentials(String username, String password);
}

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String usr = sc.next();
		System.out.println("Enter password");
		String pass = sc.next();
		
		// Lambda Expression for validating user credentials
		Check chk = (username,password) -> (username.equals("Sachin@1010")) & (password.equals("123456"));
		
		if(chk.checkCredentials(usr, pass)){
			System.out.println("Credentials Match");
		}
		else{
			System.out.println("Invalid Credentials");
		}

	}

}