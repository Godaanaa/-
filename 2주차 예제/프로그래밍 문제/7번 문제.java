public class AAA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		boolean b, c, d;
		System.out.print("정수를 입력하세요: ");
		a = in.nextInt();
		b = (a % 4 == 0) && (a % 5 == 0);
		c = (a % 4 == 0) || (a % 5 == 0);
		d = ((a % 4 == 0) || (a % 5 == 0)) && !((a % 4 == 0) && (a % 5 == 0));
		System.out.println("4와 5로 나누어지나: " + b);
		System.out.println("4나 5로 나누어지나: " + c);
		System.out.println("4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지나: " + d);
	}
}
