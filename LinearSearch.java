package SearchRelated;

public class LinearSearch {
	public static int linearSearch(int a[], int key) {
		for(int i= 0; i< a.length ; i++) 
		{
			if(a[i] == key) {
				return i;
			}
		}
		return -1 ;
	}
	
	public static void main(String args []) {
		int a1[] = {67,34,65,12,91,22};
		int key = 12;
		System.out.println("The number " + key + " is available at position " +linearSearch(a1,key));
	}

}
