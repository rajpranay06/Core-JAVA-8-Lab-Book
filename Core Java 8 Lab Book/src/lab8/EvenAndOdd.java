package lab8;

import java.util.Scanner;

public class EvenAndOdd  
{  
	// Starting the counter  
	int contr = 1;  
	static int num;  
	
	// Method for printing the odd numbers  
	public void displayOddNumber()  
	{  
		// note that synchronized blocks are necessary for the code for getting the desired   
		// output. If we remove the synchronized blocks, we will get an exception.  
		synchronized (this)  
		{  
			// Printing the numbers till NUM  
			while (contr < num)   
			{  
				// If the contr is even then display  
				while (contr % 2 == 0)   
				{  
					// handling the exception handle  
					try   
					{  
						wait(100);  
					}  
					catch (InterruptedException ex)   
					{  
						ex.printStackTrace();  
					}  
				}  
				 
				System.out.print(contr + " ");  
				// Incrementing the contr   
				contr = contr + 1;  
				// notifying the thread which is waiting for this lock   
				notify();  
			}  
		}  
	}
	
	// Method for printing the even numbers  
	public void displayEvenNumber()  
	{  
		synchronized (this)  
		{  
			while (contr < num)   
			{  
				// If the count is odd then display  
				while (contr % 2 == 1)   
				{  
					// handling the exception  
					try   
					{  
						wait(100);  
					}  
					catch (InterruptedException ex)   
					{  
						ex.printStackTrace();  
					}  
				}  
				 
				System.out.print(contr + " ");  
				// Incrementing the contr  
				contr = contr +1;  
				// Notifying to the 2nd thread  
				notify();  
			}  
		}  
	}
	
	// main method  
	public static void main(String[] argvs)  
	{  
		// The num is given 
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();  
		// creating an object of the class OddEvenExample  
		EvenAndOdd obj = new EvenAndOdd(); 
		
		// creating a thread th1  
		Thread th1 = new Thread()   
		{  
			public void run()  
			{  
				// invoking the method displayEvenNumber() using the thread th1  
				obj.displayEvenNumber();  
			}  
		};  
		
		// creating a thread th2  
		Thread th2 = new Thread()   
		{  
			public void run()  
			{  
				// invoking the method displayOddNumber() using the thread th2  
				obj.displayOddNumber();  
			}  
		};  
		
		// starting both of the threads  
		th1.start();  
		th2.start();  
	}  
}  