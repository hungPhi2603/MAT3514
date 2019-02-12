package PrimeNumberGUI;

public class PrimeNumbers {
	private int n;
	
	public PrimeNumbers() {
		n = 100;
	}
	
	public PrimeNumbers(int max) {
		this.n = max;
	}
	
	/**
	 * Tests whether an integer is primary
	 * @param k a positive integer 
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean isPrime(int k) {
		boolean prime = true;
		for (int i = 2; i <= k/2; i++)
			if (k % i == 0) {
				prime = false;
				break;
			}
		return prime;
	}
	
	/**
	 * Lists all prime numbers which less than <code>n</code>
	 */
	public void listPrimeNumbers() {
		for (int k = 2; k <= n; k++) {
			if (isPrime(k)) {
				System.out.print(k + ", ");
			}
		}
	}
	
	/**
	 * Returns all prime numbers less than a number.
	 * @param max a given positive integer.
	 * @return a string containing prime numbers.
	 */
	public String listPrimeNumbers(int max) {
		StringBuilder sb = new StringBuilder();
		for (int k = 2; k <= max; k++) {
			if (isPrime(k)) {
				sb.append(k);
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}
