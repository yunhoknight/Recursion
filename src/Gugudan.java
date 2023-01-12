public class Gugudan {
    public static void main(String[] args) {
        Gugudan(5);

        Gugudan(3,1);
    }
    public static void Gugudan(int level) {
        for(int count = 1; count < 10; count++) {
            System.out.printf("%d * %d = %d\n", level, count, level*count);
        }
    }

    public static void Gugudan(int level, int count) {
        if (count > 9) return;
        System.out.printf("%d * %d = %d\n", level, count, level * count);
        Gugudan(level, ++count);
    }
}
