public class AAA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.print("초 단위 정수를 입력하세요: ");
		a = in.nextInt();
		int b = a / 3600;
		int c = a / 60;
		int d = a % 60;
		System.out.printf("%d시간 %d분 %d초", b, c, d);
	}
}
