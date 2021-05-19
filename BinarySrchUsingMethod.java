package SearchRelated;

import java.util.Arrays;

public class BinarySrchUsingMethod {
	
	    public static void main(String args[]){  
	        int arr[] = {40,21,68,38,43};  
	        int key = 38;  
	        int result = Arrays.binarySearch(arr,key);  
	        if (result <  0)  
	            System.out.println("Element is not found!");  
	        else  
	            System.out.println("Element is found at index: "+result);  
	    }  
	  

}
