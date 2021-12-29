package week1.day1;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums = {10,60,30,40};

int[] nums1 = new int [3];
nums [0] = 10;
nums [1] = 20;
nums [2] = 30;

//System.out.println(nums.length);
//System.out.println(nums[2]);
int lastindex = nums.length -1;
//System.out.println(nums[lastindex]);

//System.out.println(lastindex);

Arrays.sort(nums);
System.out.println(nums[2]);

for (int i = 0; i < nums.length; i++) {
//System.out.println(nums[i]);
	
}

	
	//Initialize array   
	 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
     
	    System.out.println("Duplicate elements in given array: ");  
	    //Searches for duplicate element  
	    for(int i = 0; i < arr.length; i++) {  
	        for(int j = i + 1; j < arr.length; j++) {  
	            if(arr[i] == arr[j])  
	                System.out.println(arr[j]);  
	        }  
	    }  
   
}  }
  
	


