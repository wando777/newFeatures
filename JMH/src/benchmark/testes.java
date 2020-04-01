package benchmark;

public class testes {
	public static void main(String[] args) {

//		long start = System.nanoTime();

		int a = fib(52);
		System.out.println(a);

	}

	static int fib(int n) {
		if (n < 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
}
