package SearchRelated;

import java.util.Scanner;

public class LinearSearchUser {
	
	
	public static void main(String[] args) {
		int n, c, search ,arr[];

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no array's element:");
		n = sc.nextInt();
		arr = new int [n];
		
		System.out.println("Enter all "+ n+ " element:" );
		for (c = 0; c < n ; c++) 
			arr[c] = sc.nextInt();
		
		System.out.println(" The value to be searched :" );
		search = sc.nextInt();
		
		for (c=0; c<n ;c++) {
			if(arr[c] == search) 
			{
				System.out.println(search + " is available in position" + (c+1)+ " .");
				break ;
			}
			 
		}	
			
			if(c==n) {
			System.out.println( search +" is not present in this array" );


		}
		
	}

}
