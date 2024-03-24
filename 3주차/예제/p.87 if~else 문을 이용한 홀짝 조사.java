public class AAA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = in.nextInt();
		if (number % 2 == 0)
			System.out.print("짝수!\n");
		else
			System.out.print("홀수!\n");
		System.out.print("종료");
	}
}
