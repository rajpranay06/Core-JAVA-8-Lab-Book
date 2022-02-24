package lab8;

import java.io.*;
import java.util.*;

public class CopyDataThread extends Thread{
	
	FileInputStream fis;
	FileOutputStream fos;

	CopyDataThread(FileInputStream fis, FileOutputStream fos){
		this.fis = fis;
		this.fos = fos; 
	}
	public void run(){
		int c;
		int k = 0; // to calculate no of characters sent from file1 to file2
		try{
	        while((c=fis.read()) != -1){
	        	fos.write(c);
	        	k++;
	        	if(k == 10){
	        		k = 0;
	        		System.out.println("10 characters are copied");
	        		Thread.sleep(500);
	        	}
	        }
//			for(int i=0;i<5;i++){
//				Thread.sleep(500);
//				System.out.println(i);
//			}
			
		}
//		catch(InterruptedException e){
//			System.out.println(e);
//		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
		
}
