package lab8;

import java.util.*;

public class Task extends Thread{

	public void run() {
		while(true){
			try{
			sleep(10000);
		    System.out.println(new Date());
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
