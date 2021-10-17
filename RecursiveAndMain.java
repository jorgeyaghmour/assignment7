
public class RecursiveAndMain {

	public class fibonacci {
	}

	public static int fib(int m) { 
		/**
		 * to find the fibonacci series 
		 *  base
		 */
		if (m <= 1)
			return m;
		
		/** 
		 * recursive
		 */
		else
			return fib(m - 1) + fib(m - 2); 
		/**
		 *  fib formula to get the number
		 */
	}

	public static void main(String[] args) { 
		/**
		 * main method
		 */
		int n = 10; 
		/**
		 *  n starts from 0
		 */
		
		if (n < 0) 
			/**
			 * fibonacci is greater than Zero
			 */
			System.out.println("Fibonacci number is not defined");
		else
			System.out.println("The nth term of the fibonacci sequence is ");
		System.out.println(fib(n)); 
		/**
		 * to print fib method the N and M are different variables
		 */
	}
}
