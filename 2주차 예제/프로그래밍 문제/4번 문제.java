public class AAA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.print("초 단위 정수를 입력하세요: ");
		a = in.nextInt();
		int hours = a / 3600;
		int minutes = a / 60;
		int seconds = a % 60;
		System.out.printf("%d시간 %d분 %d초", hours, minutes, seconds);
	}
}
