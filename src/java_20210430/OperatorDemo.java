package java_20210430;

public class OperatorDemo {
	public static void main(String[] agrs) {
		int a = 10;
		int b = 20;
		int c = 0;
		double d = 0.0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);

		c = b / a;
		System.out.println(c);

		d = (double) b / a;
		System.out.println(d);

		c = b % a;
		System.out.println(c);

		if (a % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");

		}

		// 복합대입 연산자
		a += b; // a = a+b;
		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// sum = sum + i;
			sum += i;
			System.out.println(sum);

			// 증감연산자
			a++;
			++b;
			System.out.println(a);
			System.out.println(b);

			a = 10; // a를 10으로 초기화한다
			// 대입 후 증가
			c = a++;
			System.out.println(c);

			a = 10; // a를 10으로 초기화한다
			// 증가 후 대입
			c = ++a;
			System.out.println(c);

			// 비교연산자
			a = 10;
			b = 20;
			boolean isSuccess = a > b;
			System.out.println(isSuccess);

			if (a > b) {
				System.out.println("a가 b보다 크다.");

			} else {
				System.out.println("a가 b보다 작다.");
			}
			d = 10.0;
			isSuccess = a == d;
			System.out.println(isSuccess);

			// 논리연산자
			a = 10;
			b = 20;
			// A && B => A가 false이면 B를 연산하지 않음(short circuit 발생)
			// A || B => A가 ture이면 B를 연산하지 않음(short circuit 발생)
			isSuccess = (a == b) || (++a == b++);
			System.out.println(isSuccess);
			System.out.println(a);
			System.out.println(b);

		}

	}
}
