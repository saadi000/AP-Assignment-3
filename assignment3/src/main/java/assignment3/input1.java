package assignment3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class input1 extends Thread{
	synchronized public void run() {
		try {
			Vector<String> vec = new Vector<String>(); 
			String words[] = null;
			FileReader fr=new FileReader("inputFile1.txt");
			Scanner in=new Scanner(fr);
			while(in.hasNextLine()) {
				String data=in.nextLine();
				words=data.split(" ");
				
			for(String w: words) {
				vec.addElement(w);
				//System.out.println(w);
			}
			}
			System.out.println("Elements in vector created from file 1 are: "+vec);
			
		}
			catch(FileNotFoundException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
	}
}
