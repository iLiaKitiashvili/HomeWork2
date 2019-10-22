package HomeWork2;


public class TestClass implements TestClassInterface {
	int a = 12;
	int b = 779;
	
	@Override
	public void integersBetweenTwoNumbers() {
		System.out.println("Numbers between " + a + " and " + b + ":");
		
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}
	
	@Override
	public void divisorsOfNumber() {
		System.out.println("\nSeparators of " + a + ":");
		
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	public boolean isPrime(int num) {
		int numberOfDivisions = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				numberOfDivisions++;
			}
		}
		
		if (numberOfDivisions == 2) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public void primeDivisorsOfNumber() {
		System.out.println("\nPrime separators of " + b + ":");
		
		for (int i = 1; i <= b; i++) {
			if (b % i == 0 && isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	@Override
	public char commonDigitInNumber() {
		char digit = 0;
		int digitCount = 0;
		
		String s = Integer.toString(b);
		
		for (char c1 : s.toCharArray()) {
			int counter = 0;
			
			for (char c2 : s.toCharArray()) {
				if (c1 == c2) {
					counter++;
				}
			}
			
			if (digitCount <= counter) {
				digit = c1;
				digitCount = counter;
			}
		}
		
		return digit;
	}
}