package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] nums= {
				
				{1, 2, 3}, // 1st array
				{199, 300, 588, 700}, // 2nd array 
				{1900, 4578, 98787},// 3rd array
				
				
					
		};
		/*
		 *  i loop iterates over rows
		 *  nums.length gives # of arrays inside 2d array  = 3
		 */
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			
			System.out.println();
		}
		System.out.println("All values using enhanced for loop");
System.out.println("------------------------------");

for (int[] num:nums) {
	for (int n:num) {
		System.out.print(n+ " ");
		System.out.println();
	}
}
	}
	


}
