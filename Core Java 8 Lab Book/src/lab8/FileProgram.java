package lab8;

import java.io.*;
import java.util.*;

public class FileProgram {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File inFile = new File("C:\\Files\\File.txt");
		File outFile = new File("C:\\Files\\File1.txt");
        FileInputStream fin = new FileInputStream(inFile);
        FileOutputStream fout = new FileOutputStream(outFile);
        CopyDataThread t1 = new CopyDataThread(fin, fout);
        t1.start();
	}

}
