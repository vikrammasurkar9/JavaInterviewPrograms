package com.ivprep;

public class Example_02 {

	//fibonacci
 
	    // Recursive Approach
	    public static int fibonacciRecursive(int n) {
	        if (n <= 1) return n;
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }

	    // Dynamic Programming (Memoization) Approach
	    public static int fibonacciMemoization(int n) {
	        int[] memo = new int[n + 1];
	        return fibonacciMemoizationHelper(n, memo);
	    }

	    private static int fibonacciMemoizationHelper(int n, int[] memo) {
	        if (n <= 1) return n;
	        if (memo[n] != 0) return memo[n];
	        memo[n] = fibonacciMemoizationHelper(n - 1, memo) + fibonacciMemoizationHelper(n - 2, memo);
	        return memo[n];
	    }

	    // Iterative Approach
	    public static int fibonacciIterative(int n) {
	        if (n <= 1) return n;
	        int a = 0, b = 1;
	        for (int i = 2; i <= n; i++) {
	            int c = a + b;
	            a = b;
	            b = c;
	        }
	        return b;
	    }

	    // Matrix Exponentiation Approach
	    public static int fibonacciMatrix(int n) {
	        if (n <= 1) return n;
	        int[][] F = {{1, 1}, {1, 0}};
	        power(F, n - 1);
	        return F[0][0];
	    }

	    private static void power(int[][] F, int n) {
	        if (n == 0 || n == 1) return;
	        int[][] M = {{1, 1}, {1, 0}};
	        power(F, n / 2);
	        multiply(F, F);
	        if (n % 2 != 0) multiply(F, M);
	    }

	    private static void multiply(int[][] F, int[][] M) {
	        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
	        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
	        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
	        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

	        F[0][0] = x;
	        F[0][1] = y;
	        F[1][0] = z;
	        F[1][1] = w;
	    }

	    public static void main(String[] args) {
	        int n = 10; // Change this value to test different numbers

	        System.out.println("Recursive approach:");
	        for (int i = 0; i <= n; i++) {
	            System.out.print(fibonacciRecursive(i) + " ");
	        }
	        System.out.println();

	        System.out.println("Memoization approach:");
	        for (int i = 0; i <= n; i++) {
	            System.out.print(fibonacciMemoization(i) + " ");
	        }
	        System.out.println();

	        System.out.println("Iterative approach:");
	        for (int i = 0; i <= n; i++) {
	            System.out.print(fibonacciIterative(i) + " ");
	        }
	        System.out.println();

	        System.out.println("Matrix exponentiation approach:");
	        for (int i = 0; i <= n; i++) {
	            System.out.print(fibonacciMatrix(i) + " ");
	        }
	        System.out.println();
	    }
	}

 