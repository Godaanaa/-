public class TernaryOperatorDemo {
    public static void main(String[] args) {
        double a;
        String b;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        a = in.nextDouble();
        b = (a % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("%s", b);
    }
}
