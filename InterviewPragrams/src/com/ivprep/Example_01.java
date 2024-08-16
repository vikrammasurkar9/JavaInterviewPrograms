package com.ivprep;

public class Example_01 {
/*How to Generate Fibonacci Sequence 
	
	it is a series of numbers where each number is a sum of the two preceving once
	usually starting with o or 1
	ex: 
	0+1=1
	1+1=2
	1+2=3
	2+3=5
 0,1,1,2,3,5,8,13	
	
	
	*/
	public static void main(String[] args) {
		  int n=10;  //limit
		  
		  int firstNumber=0; // init
		  int secondNumber=1;//init
		  System.out.println("FIbonaci Series: till   "+n+" terms");
		 for(int i=1;i<=n;i++)
		 {
			 System.out.println(firstNumber+" ");
			 int nextTerm=firstNumber+secondNumber;   // nextTerm=1
			 firstNumber=secondNumber;					// firstNumber=1
			 secondNumber=nextTerm;						//secondNumber=1
			 
		 }
		
		
		
	}

}
