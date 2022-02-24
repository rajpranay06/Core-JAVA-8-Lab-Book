package day3;

import java.io.*;

public class Exercise5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("F:\\File.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
  
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int linesCount = 0;
  
        while ((line = bufferedReader.readLine()) != null) {
        
            characterCount += line.length();
            String words[] = line.split("\\s+");
            wordCount += words.length;
            linesCount += 1;
        }
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of characters = "+ characterCount);
        System.out.println("Number of lines = "+linesCount);
    }
}


