package benchmark;

import java.util.concurrent.TimeUnit;

public class Simple {

	public static void main(String[] args) {

		int n = 44;

		System.out.println("Fibonacci iteration:");

		//
		// Start, action and end
		//
		long start = System.nanoTime();

		int fibN = fib(n);
		System.out.printf("result = %d is: %d \n", n, fibN);

		long elapsedTime = System.nanoTime() - start;

		//
		// Output in different formats: ms, ns, seconds, minutes
		//

		double seconds = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
		double secondDecimalPrecision = (double) elapsedTime / 1000000000.0;
		double ms = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
		double minutes = TimeUnit.MINUTES.convert(elapsedTime, TimeUnit.NANOSECONDS);

		System.out.printf("Nanoseconds: %d ms\n", elapsedTime);
		System.out.printf("Miliseconds: %f ms\n", ms);
		System.out.printf("Seconds: %f ms\n", seconds);
		System.out.printf("Seconds2: %f ms\n", secondDecimalPrecision);
		System.out.printf("Minutes: %f ms\n", minutes);

	}

	static int fib(int n) {
		if (n < 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
}