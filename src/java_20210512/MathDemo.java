package java_20210512;

public class MathDemo {
	public static void main(String[] args) {

		double d = Math.ceil(4.3);
		System.out.println(d);

		d = Math.floor(4.3);
		System.out.println(d);

		int i = Math.round(2.6f);
		System.out.println(i);

		long l = Math.round(4.2);
		System.out.println(l);

		d = Math.abs(-4.2);
		System.out.println(d);

		d = Math.max(4.2, 5.3);
		System.out.println(d);

		d = Math.min(4.2, 5.3);
		System.out.println(d);

		d = Math.sqrt(5);
		System.out.println(d);

		l = (long) Math.pow(2.0, 3.0);
		System.out.println(l);
		
		d = Math.random();
		System.out.println(d);

	}

}
