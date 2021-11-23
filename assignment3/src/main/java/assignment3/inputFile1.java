package assignment3;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.*;
public class inputFile1 {
	public void make_vec1() {
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
	public Vector<String> find() throws FileNotFoundException {
		//try {
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
			return vec;
		//}
		/*catch(FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}*/
	}
}
