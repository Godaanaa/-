public class AAA {
	public static void main(String[] args) {
		double a, b;
		Scanner in = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요: ");
		a = in.nextDouble();
		b = (a - 32) * 5 / 9;
		System.out.printf("섭씨 온도는 %.2f도 입니다.", b);
	}
}
