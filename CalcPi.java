// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
	    double piApprox = 0.0;
		int devider = 1;

		for (int k = 0; k < n; k++) {
			if(k % 2 == 1) {
				piApprox -= (1.0 / devider);
			} else {
				piApprox += (1.0 / devider);
			}
			devider += 2;
		}

		System.out.println("pi according to Java:" + Math.PI);
		System.out.println("pi, approximated: " + (piApprox * 4));
	}
}
