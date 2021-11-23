package assignment3;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;
public class inputFile2 {
		public void make_vec2() {
		try {
		Vector<String> vec = new Vector<String>(); 
		String words[] = null;
		FileReader fr=new FileReader("inputFile2.txt");
		Scanner in=new Scanner(fr);
		while(in.hasNextLine()) {
			String data=in.nextLine();
			words=data.split(" ");
		
		for(String w: words) {
			vec.addElement(w);
			//System.out.println(w);
		}
		}
		System.out.println("Elements  in vector created from file 2 are: "+vec);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
		public Vector<String> find2() throws FileNotFoundException {
			//try {
			Vector<String> vec = new Vector<String>(); 
			String words[] = null;
			FileReader fr=new FileReader("inputFile2.txt");
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
