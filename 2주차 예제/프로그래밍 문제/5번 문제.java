public class AAA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char a, b;
		System.out.print("소문자를 입력하세요: ");
		a = in.next().charAt(0);
		b = (char) (a - 32);
		System.out.println("대문자: " + b);
	}
}
