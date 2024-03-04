package assignments;

public class Ass_48_Count_Numeric_Alpha {

	public static void main(String[] args) {
		String name = "mango56";
		char[] c1=name.toCharArray();
		int Count_of_Alpha=0;
		int Count_of_Numeric=0;
		for(int i=0;i<name.length();i++) {
			boolean ans = Character.isAlphabetic(c1[i]);
		
		if(ans==true) {
			Count_of_Alpha++;
		}
		else {
			Count_of_Numeric++;
		}
		}
		System.out.println("Count of Alphabets "+Count_of_Alpha);
		System.out.println("Count of Numeric "+Count_of_Numeric);
	}

}
