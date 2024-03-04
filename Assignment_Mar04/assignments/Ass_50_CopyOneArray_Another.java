package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Ass_50_CopyOneArray_Another {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int a1[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of an array");
			a1[i] = sc.nextInt();
			
		}
		int a2[] = new int[a1.length];
		for(int i=0;i<n;i++) {
			a2[i]=a1[i];
		}
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));
		
		
				
		}

	}


