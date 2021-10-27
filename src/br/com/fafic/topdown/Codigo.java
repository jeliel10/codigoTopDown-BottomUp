package br.com.fafic.topdown;

public class Codigo {
	
	public static int fibTopDown(int n) {
		
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibTopDown(n-1) + fibTopDown(n-2);
	}
	
	
	// static int[] fib; 

	public static void fibBottomUp(int n, int[] fib) {
	    fib = new int[n+1];
	    fib[0] = 1; 
	    fib[1] = 1;
	    
	    for(int i = 2; i <= n; i++) {
	      
	      fib[i] = fib[i-1] + fib[i-2];
	    }
	    
	    for(int j = 0; j < n+1; j++) {
	    	System.out.println(fib[j]);
	    }
	  }
	  
	
	public static void main(String[] args) {
		
		
		int[] fib = null;
		
		System.out.println(fibTopDown(7));
		fibBottomUp(7, fib);
	}
}
