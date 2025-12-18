public class PrintRecur {
    public static void print(int i, int j) {
        if (i > j)
            return;
        System.out.println(i);
        print(i + 1, j);
    }

    public static void main(String[] args) {
        print(1, 10);
    }
}
