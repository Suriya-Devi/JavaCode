package assignments;

import java.util.Scanner;

public class Ass_51_Arrays_IsSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the String");
		String name1=sc.nextLine();
		int Count_of_Space=0;
		char c[]=name1.toCharArray();
		for(int i=0;i<name1.length();i++) {
			boolean ans=Character.isSpaceChar(c[i]);
			
			if(ans==true) {
				System.out.println("There is a space in the given string and "
						+ "the index of space is " +i);
				Count_of_Space++;
			}
		}
		
		System.out.println("Number of space in the given string "+Count_of_Space);
		
		

	}

}
