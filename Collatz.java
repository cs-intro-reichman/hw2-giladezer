// Demonstrates the Collatz conjecture.
public class Collatz {
	
	public static void printHailstone(int n) {
		int count = 1;
	    System.out.print(n);
		do{
			if (n % 2 == 0) {
	            n = n / 2;
	        } else {
	            n = 3 * n + 1;
	        }
	        System.out.print(" " + n);
			count++;
		}while(n != 1);
	    System.out.print(" (" + count + ")\n");
	}
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
	   for (int i = 1; i <= n; i++){
		   printHailstone(i);
	   }
	}
}
