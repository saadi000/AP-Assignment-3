package assignment3;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class vocabulary {
	public  void make_bst() {
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
	public  TreeSet<String> find_word() throws FileNotFoundException {
	
	
		TreeSet<String> ts1=new TreeSet<>();
		FileReader obj=new FileReader("vocabulary.txt");
		Scanner in=new Scanner(obj);
		while(in.hasNextLine()) {
			String data=in.nextLine();
			ts1.add(data);
		}
		in.close();
		
		return ts1;
	
	}
}
