package week1.day1;

public class Programs {
	int i;
	int fact = 1;

	/// Factorial program
	public void fatorial() {
		int number = 5;

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	//// Sum of numbers///
	public void sumofnumbers() {
		int input = 234;
		int sum = 0;

		while (input > 0) {
			int rem = input % 10;
			sum = sum + rem;
			input = input / 10;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Programs obj = new Programs();
		obj.fatorial();
		obj.sumofnumbers();
	}
}
