package school.L8.L_8_8;

public class Main {
    public static void main(String[] args) {
        func(1, 2);
    }
    private static void func(int a, int b) {
        int c = a / 2 + b / 2;
        if (a + b != c) {
            c = a / 2 + b / 2;
            System.out.println("C " + c);
        } else {
            c = a % 2 + b % 2;
            System.out.println("C is " + c);
        }
    }
}
