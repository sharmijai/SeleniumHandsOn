package week1.assignment1;

import java.util.Arrays;

public class MissingNumber {
	

		public static void main(String[] args) {
			
				// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
		     Arrays.sort(arr);
		     for (int i=0;i<arr.length;i++)
		     {
		    	 System.out.println(arr[i]);
		     }

				// loop through the array (start i from arr[0] till the length of the array)
				for (int i=0;i<arr.length;i++) {
					// check if the iterator variable is not equal to the array values respectively
					int sum=i+1;
					if(arr[i]==sum) 
					{
					System.out.println("not missed" +sum);// print the number
					}
					else
					{
						System.out.println("missed" +sum);
						
						}
					
					}
						// once printed break the iteration
			}	
						
			
			}

		