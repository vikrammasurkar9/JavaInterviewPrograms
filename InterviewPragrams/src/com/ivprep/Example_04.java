package com.ivprep;

import java.util.Arrays;

public class Example_04 {

	//Find the Median of an Array
	// {10,20,30,40,50}   midian is 30
	//{10,20,30,40,50,60}   midian is 35: average of two middle numbers
	public static void main(String[] args) {
		 
		int array[]= {12,4,6,8,6,9};
		
		//{4,6,,6,8,9,12}
		double median=findMidian(array);
		System.out.println("Median = "+median);
		
	}

	
	public static double findMidian(int[] array)
	{
		Arrays.sort(array);
		int n=array.length;
		if(n%2==1)
		{
			return array[n/2];
		}
		else
		{
			return (array[n-1]/2+array[n/2] )/2.0;
		}
 
	}
}
