public class AAA {
	public static void main(String[] args) {
		int a, b;
		double pi = 3.14;
		Scanner in = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? : ");
		a = in.nextInt();
		System.out.print("원기둥의 높이는? : ");
		b = in.nextInt();
		double volume = pi * a * a * b;
		System.out.printf("원기둥의 부피는 %.1f", volume);
	}
}
