package java_20210506;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "네이마르";
		c1.age = 20;
		c1.email = "aaa@aaa.com";
		c1.phone = "010-0000-0000";
		c1.balance = 1_111_111;
		c1.released = false;
		// 클래스 변수(static 변수)는 클래스 이름으로 접근하는 것이 관례
		// 변수로도 접근 가능하나 권장하지 않음 예)c1.interestRate = 6.2;
		Customer.interestRate = 6.2;
		// final 변수는 값을 재할당 할 수 없음
		// Customer.BANKNAME = "국민은행";
		// Customer.BANKNAME = "국민은행";

		System.out.printf("%s,%d,%s,%s,%f,%s\n", c1.name, c1.age, c1.email, c1.phone, c1.balance, c1.released);

		Customer c2 = new Customer();
		c2.name = "메시";
		c2.age = 30;
		c2.email = "bbb@bbb.com";
		c2.phone = "010-1111-1111";
		c2.balance = 2_222_222_222l;
		c2.released = false;
		c2.interestRate = 8.2;

		System.out.printf("%s,%d,%s,%s,%f,%s\n", c2.name, c2.age, c2.email, c2.phone, c2.balance, c2.released);

		Customer c3 = c2;
		c3.name = "포그바";

		System.out.printf("%s,%s\n", c2.name, c3.name);
		System.out.printf("%f", c2.interestRate);

	}

}
