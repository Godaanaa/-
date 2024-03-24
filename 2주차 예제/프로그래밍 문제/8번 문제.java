public class AAA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b = 0;
		System.out.print("0~999 사이의 숫자를 입력하세요: ");
		a = in.nextInt();
		b += a % 10;
		a /= 10;
		b += a % 10;
		a /= 10;
		b += a % 10;
		System.out.println("각 자릿수의 합: " + b);
	}
}
