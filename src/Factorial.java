public class Factorial {
    public static void main(String[] args) {
        int Num = 5;
        System.out.println("1부터 "+ Num + "까지의 곱은 " + Factorial(Num));
    }

    public static int Factorial(int num) {
        /*
         * 1부터 모든 숫자의 곱을 리턴
         * 숫자가 1이 되면 종료한다.
         * */

        // 2. 재귀의 종료조건 설정
        if (num <= 1) return 1;

        return num * Factorial(num - 1);
    }

}
