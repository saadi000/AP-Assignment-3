package assignment3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class menu {
	

	public static void main(String[] args) throws FileNotFoundException {
		voc l=new voc();
		l.start();
			
			input1 tr1=new input1();
			tr1.start();
			input2 tr2=new input2();
			tr2.start();
		int num;
		System.out.println("Press 1 to display bst");
		System.out.println("Press 2 to display vector");
		System.out.println("Press 3 to see matching words in the files");
		System.out.println("Press 4 to see matching word and frequency");
		System.out.println("Press 5 to exit");
		Scanner scan =new Scanner(System.in);
		num=scan.nextInt();
		
		if(num==1) {
		vocabulary a =new vocabulary();
		a.make_bst();
		}
		else if(num==2) {
			inputFile1 a =new inputFile1();
			a.make_vec1();
			inputFile2 b =new inputFile2();
			b.make_vec2();
			}
		else if(num==3) {
			vocabulary a=new vocabulary();
			TreeSet<String> obj=a.find_word();
			inputFile1 b =new inputFile1();
			Vector<String> obj2=b.find();
			String arr[]=obj2.toArray(new String[obj2.size()]);
			String arr2[]=obj.toArray(new String[obj.size()]);
			String[] match=new String [100];
			int k=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr[i].equals(arr2[j])) {
						match[k]=arr[i];
						k++;
					}
				}
			}
				for(int i=0;i<k;i++)
				System.out.println("Match words in file 1 are: "+match[i]);
	}
		else if(num==4) {
			int frequency=0;
			int freq=0;
			System.out.println("Enter word");
			Scanner scan1 =new Scanner(System.in);
			String word=scan1.nextLine();
			inputFile1 b =new inputFile1();
			Vector<String> obj2=b.find();
			String arr[]=obj2.toArray(new String[obj2.size()]);
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals(word)) {
					freq++;
				}
			}
			System.out.println("Frequency in input file 1 is:" +freq);
			
			inputFile2 c =new inputFile2();
			Vector<String> obj3=c.find2();
			String arr2[]=obj3.toArray(new String[obj3.size()]);
			for(int i=0;i<arr2.length;i++) {
				if(arr2[i].equals(word)) {
					frequency++;
				}
			}
			System.out.println("Frequency in input file 2 is:" +frequency);
			
		}
		else if(num==5) {
			System.exit(0);
		}
		
	}
}
