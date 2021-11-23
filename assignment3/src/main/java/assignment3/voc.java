package assignment3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class voc extends Thread{
	synchronized public void run() {
		try {
			
			Set<String> ts1=new TreeSet<>();
			FileReader obj=new FileReader("vocabulary.txt");
			Scanner in=new Scanner(obj);
			while(in.hasNextLine()) {
				String data=in.nextLine();
				//System.out.println(data);
				ts1.add(data);
			}
			in.close();
			System.out.println("Enteries in bst are: ");
			System.out.println(ts1);
			}
			catch(FileNotFoundException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
	}
}
